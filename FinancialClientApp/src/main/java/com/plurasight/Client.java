package com.plurasight;

public class Client {

    //Storing information like firstName, lastName, businessName, emailAddress
    private String firstName;
    private String lastName;
    private String businessName;
    private String emailAddress;
    private String phoneNumber;

    public Client(String firstName, String lastName, String businessName, String emailAddress, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setBusinessName(String businessName){
        this.businessName = businessName;
    }
    public String getBusinessName(){
        return businessName;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

}
