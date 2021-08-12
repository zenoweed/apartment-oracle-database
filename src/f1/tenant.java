/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f1;

/**
 *
 * @author User
 */
public class tenant {
    //data memebers
    private String customerid;
    private String firstname;
    private String surname;
    private Double phone_no;
    private String address;
    private Double aadhaar;
    private String emergency_contact;
    private String work_add;
    private Double work_no;

    //accessory function
    
    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Double phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(Double aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getEmergency_contact() {
        return emergency_contact;
    }

    public void setEmergency_contact(String emergency_contact) {
        this.emergency_contact = emergency_contact;
    }

    public String getWork_add() {
        return work_add;
    }

    public void setWork_add(String work_add) {
        this.work_add = work_add;
    }

    public Double getWork_no() {
        return work_no;
    }

    public void setWork_no(Double work_no) {
        this.work_no = work_no;
    }
    
}

