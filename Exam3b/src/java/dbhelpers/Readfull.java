
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
import model.Support;




public class Readfull {
    private Connection conn;
    private ResultSet results;
    
    
    public Readfull(){
        
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
                Logger.getLogger(Readfull.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn = DriverManager.getConnection(url, username, passwd);
            } catch (SQLException ex) {
                Logger.getLogger(Readfull.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Readfull.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
    public void doRead(){
        
        try {
            String query = "Select * from customers ORDER BY custID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Readfull.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public String getHTMLtable(){
        
                  
        
            String table = "";
            
            table += "<table class=table1>";
            table += "<tr>";
            table += "<th>Customer ID</th>";
            table += "<th>First Name</th>";
            table += "<th>Last Name</th>";
            table += "<th>Email</th>";
            table += "<th>Phone</th>";
            table += "<th>Comments</th>";
            table += "<th>Will Help</th>";
            table += "<th>Support</th>";
            table += "<th>Why</th>";
            table += "<th></th>";
            table += "<th></th>";
            table += "</tr>";
            
            
            
        try {
            while(this.results.next()){
                
                
                Support visitor = new Support();
                visitor.setCustomerID(this.results.getInt("customerID"));
                visitor.setFirstName(this.results.getString("firstName"));
                visitor.setEmail(this.results.getString("email"));
                visitor.setPhone(this.results.getString("phone"));
                visitor.setPosted(this.results.getString("posted"));
                visitor.setWillhelp(this.results.getString("willhelp"));
                visitor.setSupport(this.results.getString("support"));
                visitor.setWhy(this.results.getString("why"));
                visitor.setLastName(this.results.getString("lastName"));
                visitor.setComments(this.results.getString("Comments"));
                            
                table += "<tr>";
                table += "<td>";
                table += visitor.getCustomerID();
                table += "</td>"; 
                
                table += "<td>";
                table += visitor.getFirstName();
                table += "</td>";
                
                table += "<td>";
                table += visitor.getLastName();
                table += "</td>";
                
                table += "<td>";
                table += visitor.getEmail();
                table += "</td>";
                
                table += "<td>";
                table += visitor.getPhone();
                table += "</td>";
                
                table += "<td>";
                table += visitor.getComments();
                table += "</td>";
                
                table += "<td>";
                table += visitor.getWillhelp();
                table += "</td>";
                
                table += "<td>";
                table += visitor.getSupport();
                table += "</td>";
                
                table += "<td>";
                table += visitor.getWhy();
                table += "</td>"; 
                
                table += "<td>";
                table += "<a href=update?CustomerID=" + visitor.getCustomerID() + "> Update </a>";
                table += "</td>";
                
                table += "<td>";
                table += "<a href=delete?CustomerID=" + visitor.getCustomerID() +"> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Readfull.class.getName()).log(Level.SEVERE, null, ex);
        }
 
            table += "</table>";
            
            return table; 
        }
        
    }
    

