package oop_lab5;


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
        for (int i = 0; i < num.length; i++) {



        }//j
    }//i
    return num;
}//inputData


                private static void showData (int[][] num){
                    System.out.println("Data in array");
                    for (int i=0;i<num.length;i++){
                        for (int j=0;j<num[i].length;j++){
                            System.out.println("num["+i+"]["+j+"] :" +num[i][j]);
                        }
                    }//i


    }//showdata
}//class

