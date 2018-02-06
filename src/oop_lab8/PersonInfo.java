package oop_lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student("1800900157292",
                " thasawan",
                "Gril",
                23,
                "357411110055",
                "IS :Management Technoloay");
        System.out.println(student.toString());
        System.out.println(student.getName());

        Employee employee = new Employee("1800900157292",
                "Jim","Gril"
                ,23,
                "1121",
                "PC",
                "15000");
        System.out.println(employee.toString());
        System.out.println(employee.getName());







    }//main
}//class


