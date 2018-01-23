package oop_lab7;

import java.util.Scanner;

public class MySuperCar {
    public static void main (String[] args){
        //create Objects as SuperCar
        SuperCar SuperCar1 = new SuperCar();

        SuperCar1.setCarbrand("ee");
        SuperCar1.setCarcolor("gray");
        SuperCar1.setCarenginesize("");
        SuperCar1.setCountryoforigin("");
        SuperCar1.setMaxspeed("200");



    }//main

    private static SuperCar inputData(SuperCar s ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your student data: ");
        System.out.print("Carbrand: ");
        s.setCarbrand(scanner.nextLine());
        System.out.print("Carcolor: ");
        s.setCarcolor(scanner.nextLine());
        System.out.print("Carenginesize: ");
        s.setCarenginesize(scanner.nextLine());
        System.out.print("Countryoforigin: ");
        s.setCountryoforigin(scanner.nextLine());
        System.out.print("Maxspeed: ");
        s.setMaxspeed(scanner.nextLine());




        return s;






    }




}//class
