package com.theironyard.contactsandroid;

/**
 * Created by souporman on 2/21/17.
 */

public class Contacts {
    String fullName;
    String fullPhoneNumber;


//    @Override
//    public String toString(){
//        fullPhoneNumber="("+fullPhoneNumber.substring(0,2)+")"+fullPhoneNumber.substring(3,6)+"-"+fullPhoneNumber.substring(7,10);
//        return String.format(fullName+" "+fullPhoneNumber);
//    }

    public Contacts() {
    }

    public Contacts(String fullName, String fullPhoneNumber) {
        this.fullName = fullName;
        this.fullPhoneNumber = fullPhoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullPhoneNumber() {
        return fullPhoneNumber;
    }

    public void setFullPhoneNumber(String fullPhoneNumber) {
        this.fullPhoneNumber = fullPhoneNumber;
    }
}
