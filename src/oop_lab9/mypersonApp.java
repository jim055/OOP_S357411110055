package oop_lab9;

public class mypersonApp {
    public static void main (String[] args){

        Person person = new Person(personID: "1111111111111",
                    name: "Thasawan Sungngam",
                new Address(homeNo: "133 M.1",
                        province: "Nakornsithammarat",
                        postCode: "80110"),
                new Job(position: "Student", salary: 5000));

        System.out.println(person.toString());

        person.getJob().setSalary(7000);

        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostCode());





    }//main





}//class
