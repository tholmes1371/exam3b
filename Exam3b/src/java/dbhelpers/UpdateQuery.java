
package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;



public class UpdateQuery {
    
    private Connection conn;
    
    public UpdateQuery(){
    
    try {
            Properties props = new Properties();
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            props.load(instr);
            instr.close();
            
            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn = DriverManager.getConnection(url, username, passwd);
            } catch (SQLException ex) {
                Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    
    
    }
    
    public void doUpdate (Customers cust){
    
        try {
            String query = "UPDATE customers SET FirstName = ?, LastName = ?, emailaddr = ?, addrone = ?, addrtwo = ?, city = ?, state = ?, zip = ? WHERE custID = ? ";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, cust.getFirstName());
            ps.setString(2, cust.getLastName());
            ps.setString(3, cust.getEmailaddr());
            ps.setString(4, cust.getAddr1());
            ps.setString(5, cust.getAddr2());
            ps.setString(6, cust.getCity());
            ps.setString(7, cust.getState());
            ps.setString(8, cust.getZip());           
            ps.setInt(9, cust.getCustID());            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
    
}
