/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author canti
 */
public class Admin implements Account{
    private String name;
    private byte roleID; 
    private String myDB;
    //getter setter for db
    public String getMyDB() {
        return myDB;
    }

    public void setMyDB(String myDB) {
        this.myDB = myDB;
    }
    
    // interface methods 
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public byte getRoleID() {
        return roleID;
    }

    @Override
    public void setRoleID(byte roleID) {
        this.roleID = roleID;
    }
    //Admin only methods
    public void getSchoolDonations(String school){
        // db something query to get num of school donations
    }
    
    public void getProgramDonations(String program){
        // db something query to get num of program donations
    }
    
    public void getSectionDonations(String section){
        // db something query to get num of section donations
    }
    
    public void getCategoryDonations(String category){
        // db something query to get num of category donations
    }
    
    public void getTotalDonations(){
        // db something query to get num of total donations
    }
}
