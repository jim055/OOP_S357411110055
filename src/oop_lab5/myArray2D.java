package oop_lab5;


import java.util.Scanner;

public class myArray2D {
    private static final int Max = 10;

    public static void main(String[] args) {
        int num[] = new int[Max];
        num = inputData(num);
        // showData (num);


    }//main


    private static void summation (int[] num) {
        System.out.println("to array");
        int total = 0;
        for (int i = 0;i<num.length; i++)
            total += num[i];

            System.out.print("The summation of " + "value in array is: "+total);
        System.out.print("The average value " + "in array is: "+total/Max);


        }

                private static int[] inputData (int[] num){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Pless enter data to array: ");
                    for (int i= 0;i<num.length;i++){
                            System.out.print("num[" + i + "]:");
                            num[i] = scanner.nextInt();


                        }
                   return num;



    }


}//class

