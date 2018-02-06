package oop_lab9;

public class myCarApp {
    public static void main (String[] args) {

        //engine

        Engine engine = new Engine(size: "1500 cc", type: "V-TEC V4");



        Car car = new Car(brand: "Honda", color: "Black", engine);

        //car

       System.out.println(car.toString());

       Car car1 = new Car(brand: "Honda", color: "Red", engine);
       System.out.println(car1.toString());




    }//main
}//class
