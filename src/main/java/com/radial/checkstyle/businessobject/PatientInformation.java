package com.radial.checkstyle.businessobject;

public class PatientInformation {
    private String name;
    private String mobileNo;
    private String id;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PatientInformation() {

    }

    public PatientInformation(String name, String mobileNo, String id, String address) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.id = id;
        this.address = address;
    }
}
