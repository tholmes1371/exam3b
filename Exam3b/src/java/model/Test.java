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
public class Test {
    private int ID;
    private String name;

    public Test(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    public Test() {
        this.ID = 0;
        this.name = "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" + "ID=" + ID + ", name=" + name + '}';
    }
    
    
    
    
    
}
