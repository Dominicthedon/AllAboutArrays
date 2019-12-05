package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);

        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();
        Pattern5();
        System.out.println("The sum of the array is"+ sum(array));
    System.out.println("The minnimum of the array is " + minnimum(array));
//System.out.println("The maximum of the array is "+maximum(array));
    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];
        //would take half of a man hour
        //fill with random values//
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1() {
        for (int i = 0; i < 6; i++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void Pattern2() {
        for (int e = 1; e < 7; e++) {

            for (int row = 1; row < 8; row++) {
                System.out.print(e);
            }
            System.out.println();
        }

    }

    public static void Pattern3() {
        for (int e = 1; e < 7; e++) {
            for (int row = 1; row < 7; row++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static int Pattern4() {
        for (int coluumn = 1; coluumn < 8; coluumn++) {
            for (int row = 1; row < coluumn; row++) {

                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static int Pattern5() {
        for (int coluumn = 1; coluumn < 8; coluumn++) {
            for (int row = 1; row < coluumn; row++) {

                System.out.print(row);
            }
            System.out.println();
        }
        return 0;
    }
public static int sum(int[]array){
int sum = 0;
for (int i = 0 ; i<array.length; i++){
    sum += array[i];


}








        return sum;

    }
public static int minnimum(int[]array){
       int minnimum= array[0] ;
    for (int i = 1 ; i<array.length; i++){
       if (minnimum>array[i]) {
           minnimum = array[i];
       }
    }
    return minnimum;
}

}















}