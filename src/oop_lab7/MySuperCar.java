package oop_lab7;

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
        System.out.print("Carbrand");
        s.setName(scanner.nextLine());
        System.out.print("ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Major: ");
        s.setMajor(scanner.nextLine());
        System.out.print("Faculty: ");
        s.setFaculty(scanner.nextLine());

        return s;






    }




}//class
