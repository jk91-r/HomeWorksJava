/*
* Java 1 Homework #3
*@ author Julia Kuznetsova
*@ version 15.12.2021
*/
import java.util.Arrays;

class HomeWork3 {
    public static void main(String[] args) {
        changeElements();

        fillArray();

        multiplyNumbers();

        fillOntheDiagonal();

        System.out.println(Arrays.toString(returnArray(5,6)));

        findMinandMax();

    }

    static void changeElements() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr [i] = arr [i] > 0 ? 0 : 1 ;
        }
        System.out.println(Arrays.toString(arr));
    }

     static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void multiplyNumbers() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {
            arr [i] = arr [i] * 2;}
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillOntheDiagonal() {
        int[][] arr= new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                arr[i][j]= i==j || i==arr.length-j-1 ? 1 : 0 ;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] returnArray(int len, int initialValue) {
        int[] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= initialValue;
        }
        return arr ;
    }

    static void findMinandMax() {
        int[] arr = { 1, 5, 20, 6, 1, 3, 45};
        int min = arr[0];
        int max = min;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                min = arr[i];
            }
            if(arr[i] > min) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

}