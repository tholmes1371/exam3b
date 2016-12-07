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
public class Customers {
    private int custID;
    private String firstName, lastName, addrOne, addrTwo, city;
    private String state, zip, emailaddr;

    public Customers() {
        this.custID = 0;
        this.firstName = "";
        this.lastName = "";
        this.addrOne = "";
        this.addrTwo = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.emailaddr = "";
    }
    
    public Customers(int custID, String firstName, String lastName, String addrOne, String addrTwo, String city, String state, String zip, String emailaddr) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addrOne = addrOne;
        this.addrTwo = addrTwo;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.emailaddr = emailaddr;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
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

    public String getAddr1() {
        return addrOne;
    }

    public void setAddr1(String addrOne) {
        this.addrOne = addrOne;
    }

    public String getAddr2() {
        return addrTwo;
    }

    public void setAddr2(String addrTwo) {
        this.addrTwo = addrTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmailaddr() {
        return emailaddr;
    }

    public void setEmailaddr(String emailaddr) {
        this.emailaddr = emailaddr;
    }

    @Override
    public String toString() {
        return "Customers{" + "custID=" + custID + ", firstName=" + firstName + ", lastName=" + lastName + ", addrOne=" + addrOne + ", addrTwo=" + addrTwo + ", city=" + city + ", state=" + state + ", zip=" + zip + ", emailaddr=" + emailaddr + '}';
    }
    
    
      
    
    
    
}
