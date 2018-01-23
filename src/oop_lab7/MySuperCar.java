package oop_lab7;

import java.util.Scanner;

public class MySuperCar {
    public static void main (String[] args){


        SuperCar superCar1 = new SuperCar();
        superCar1 = inputData(superCar1);
        System.out.print(superCar1.toString());



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
