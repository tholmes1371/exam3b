/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tholm
 */
public class Support {
    private int customerID;
    private String phone;
    private String email;
    private String firstName;
    private String lastName;
    private String why;
    private String posted;
    private String willhelp;
    private String support;
    private String comments;

    public Support() {
        this.customerID = 0;
        this.phone = "";
        this.email = "";
        this.firstName = "";
        this.lastName = "";
        this.why = "";
        this.posted = "";
        this.willhelp = "";
        this.support = "";
        this.comments = "";
    }
    
    public Support(int customerID, String phone, String email, String firstName, String lastName, String why, String posted, String willhelp, String support, String comments) {
        this.customerID = customerID;
        this.phone = phone;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.why = why;
        this.posted = posted;
        this.willhelp = willhelp;
        this.support = support;
        this.comments = comments;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    public String getWillhelp() {
        return willhelp;
    }

    public void setWillhelp(String willhelp) {
        this.willhelp = willhelp;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Support{" + "customerID=" + customerID + ", phone=" + phone + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", why=" + why + ", posted=" + posted + ", willhelp=" + willhelp + ", support=" + support + ", Comments=" + comments + '}';
    }

    
}