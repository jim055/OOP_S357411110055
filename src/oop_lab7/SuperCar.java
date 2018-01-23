package oop_lab7;
//Talking about SuperCar?
// 1.Car brand
// 2.Car color
// 3.Car engine size
// 4.Max speed
// 5.Country of origin

public class SuperCar {



    private String Carbrand;
    private String Carcolor;
    private String Carenginesize;
    private String Maxspeed;
    private String Countryoforigin;
    //Constructor
    //Default contructor

public SuperCar () {}
    //create constructor by owner
    //create constructor by owner
    public SuperCar (String b,String a,String e,String m,String c) {
        //assign data to class properties
        this.Carbrand = b;
        this.Carcolor = a;
        this.Carenginesize = e;
        this.Maxspeed = m;
        this.Countryoforigin = c;
    }


    //getter and setter methods


    public String getCarbrand() {
        return Carbrand;
    }

    public void setCarbrand(String carbrand) {
        Carbrand = carbrand;
    }

    public String getCarcolor() {
        return Carcolor;
    }

    public void setCarcolor(String carcolor) {
        Carcolor = carcolor;
    }

    public String getCarenginesize() {
        return Carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        Carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return Maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        Maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return Countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        Countryoforigin = countryoforigin;
    }
}//class
