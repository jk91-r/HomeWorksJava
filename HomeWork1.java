/*
* Java 1 Homework #1
*@ author Julia Kuznetsova
*@ version 11.12.2021
*/
class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    static void checkSumSign() {
        int a = 5;
        int b = 12;
        System.out.println ("Sum is " + (a + b >= 0 ? "positive" : "negative"));
    }

    static void printColor() {
        int value = 45;
        if (value <= 0) {
            System.out.println ("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println ("Yellow");
        } else {
            System.out.println ("Green");
        } 
    }

    static void compareNumbers() {
        int a = 5;
        int b = 25;
        System.out.println ( a >= b ?  "a >= b" : "a < b" );
    }
}