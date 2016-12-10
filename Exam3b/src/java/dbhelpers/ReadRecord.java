package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;

public class ReadRecord {

    private Connection conn;
    private ResultSet results;

    private Customers cust = new Customers();
    private int CustomerID;

    public ReadRecord(int CustomerID) {

        try {
            Properties props = new Properties();
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            props.load(instr);
            instr.close();

            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");

            this.CustomerID = CustomerID;

            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn = DriverManager.getConnection(url, username, passwd);
            } catch (SQLException ex) {
                Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void doRead() {

        try {
            String query = "Select * from customers WHERE custID = ?";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, CustomerID);

            this.results = ps.executeQuery();

            this.results.next();

            
            cust.setCustID(this.results.getInt("custID"));
            cust.setFirstName(this.results.getString("firstName"));
            cust.setLastName(this.results.getString("lastName"));
            cust.setAddr1(this.results.getString("addrone"));
            cust.setAddr2(this.results.getString("addrtwo"));
            cust.setCity(this.results.getString("city"));
            cust.setState(this.results.getString("state"));
            cust.setZip(this.results.getString("zip"));
            cust.setEmailaddr(this.results.getString("emailaddr"));

        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Customers getCustomers() {

        return this.cust;

    }

}
