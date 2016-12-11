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

public class UserSearchQuery {

    private Connection conn;
    private ResultSet results;

    public UserSearchQuery() {

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
                Logger.getLogger(UserSearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn = DriverManager.getConnection(url, username, passwd);
            } catch (SQLException ex) {
                Logger.getLogger(UserSearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(UserSearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void doSearch(String firstName, String lastName) {
        if (firstName.equals(lastName)) {
            try {

                String qfirst = "SELECT * from customers WHERE UPPER(firstName) LIKE ? or UPPER(lastName) LIKE ? ORDER BY custID ASC";

                PreparedStatement ps = conn.prepareStatement(qfirst);
                ps.setString(1, "%" + firstName.toUpperCase() + "%");
                ps.setString(2, "%" + lastName.toUpperCase() + "%");

                this.results = ps.executeQuery();

            } catch (SQLException ex) {
                Logger.getLogger(UserSearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{

        try {

            String query = "SELECT * from customers WHERE UPPER(firstName) LIKE ? AND UPPER(lastName) LIKE ? ORDER BY custID ASC";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + firstName.toUpperCase() + "%");
            ps.setString(2, "%" + lastName.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UserSearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

     public String getHTMLtable() {

        String table = "";

        table += "<tr>";
       
        table += "<th>First Name</th>";
        table += "<th>Last Name</th>";
        table += "<th>Addr1</th>";
        table += "<th>Addr2</th>";
        table += "<th>City</th>";
        table += "<th>State</th>";
        table += "<th>Zip</th>";
        table += "<th>Email Address</th>";
        
        table += "</tr>";

        try {
            if (!this.results.isBeforeFirst()) {

                table += "<tr>";
                table += "<td colspan='11'><center>Sorry, this person does not exist in the database</center></td>";
                table += "</tr>";
            } else {
            while (this.results.next()) {

                Customers cust = new Customers();
                cust.setCustID(this.results.getInt("custID"));
                cust.setFirstName(this.results.getString("firstName"));
                cust.setLastName(this.results.getString("lastName"));
                cust.setAddr1(this.results.getString("addrone"));
                cust.setAddr2(this.results.getString("addrtwo"));
                cust.setCity(this.results.getString("city"));
                cust.setState(this.results.getString("state"));
                cust.setZip(this.results.getString("zip"));
                cust.setEmailaddr(this.results.getString("emailaddr"));

                

                table += "<td>";
                table += cust.getFirstName();
                table += "</td>";

                table += "<td>";
                table += cust.getLastName();
                table += "</td>";

                table += "<td>";
                table += cust.getAddr1();
                table += "</td>";

                table += "<td>";
                table += cust.getAddr2();
                table += "</td>";

                table += "<td>";
                table += cust.getCity();
                table += "</td>";

                table += "<td>";
                table += cust.getState();
                table += "</td>";

                table += "<td>";
                table += cust.getZip();
                table += "</td>";

                table += "<td>";
                table += cust.getEmailaddr();
                table += "</td>";
                table += "</tr>";

                

            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return table;
    }

    public String getFirst(String name) {
        String fullName = name;
        String[] tokens = fullName.split(" ");
        String firstName = "";
        String middleName = "";
        String lastName = "";
        if (tokens.length > 0) {
            firstName = tokens[0];
            middleName = tokens.length > 2 ? getMiddleName(tokens) : "";
            lastName = tokens[tokens.length - 1];
        }
        return firstName;
    }

    public String getLast(String name) {
        String fullName = name;
        String[] tokens = fullName.split(" ");
        String firstName = "";
        String middleName = "";
        String lastName = "";
        if (tokens.length > 0) {
            firstName = tokens[0];
            middleName = tokens.length > 2 ? getMiddleName(tokens) : "";
            lastName = tokens[tokens.length - 1];
        }
        return lastName;
    }

    public String getMiddle(String name) {
        String fullName = name;
        String[] tokens = fullName.split(" ");
        String firstName = "";
        String middleName = "";
        String lastName = "";
        if (tokens.length > 0) {
            firstName = tokens[0];
            middleName = tokens.length > 2 ? getMiddleName(tokens) : "";
            lastName = tokens[tokens.length - 1];
        }
        return middleName;
    }

    public String getMiddleName(String[] middleName) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < middleName.length - 1; i++) {
            builder.append(middleName[i] + " ");
        }

        return builder.toString();
    }

}
