package oop_lab9;

public class Job {
    public String position;
    public double salary;

    //constructor


    public Job(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }



    //toString

    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }


    //getter and setter methods


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}//class
