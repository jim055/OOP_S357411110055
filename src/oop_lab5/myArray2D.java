package oop_lab5;

import java.io.IOException;

public class myArray2D {
    public static void main (String[] args) throws IOException{
        //array 2D อาเรย์2มิติ
        int[][] num = new int[2][3];

        num[0][0] = 100;
        num[0][2] = 200;
        try {
            num = inputData(num);
        }catch (IOException(num));{
            e.printStackTrace();

        }
        shovData(num);



    }//main


    private static int[][] inputData (int[][] num){
       System.out.println("Enter an integer: ");
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.println("num["+i+"]["+j+"] :");
                        +num[i][j]= Integer.parseInt(reader.readLine());








    private static void showData (int[][] num){
        System.out.println("Data in array");
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.println("num["+i+"]["+j+"] :"
                        +num[i][j]);




            }


        }//i




    }//showdata
}//class