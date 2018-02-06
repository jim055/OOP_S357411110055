package oop_lab9;

public class Address {
    public String homeNo;
    public String province;
    public String postCode;

    //constructor

    public Address(String homeNo, String province, String postCode) {
        this.homeNo = homeNo;
        this.province = province;
        this.postCode = postCode;
    }

    //toString

    @Override
    public String toString() {
        return "Address{" +
                "homeNo='" + homeNo + '\'' +
                ", province='" + province + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }


    //getter and setter methods

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }




}//class
