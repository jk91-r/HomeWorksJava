/*
* Java 1 Homework #2
*@ author Julia Kuznetsova
*@ version 13.12.2021
*/
class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(in10to20(10,5));
        System.out.println(in10to20(-10,5));
        System.out.println(in10to20(10,15));

        printPositiveOrNegative(-15);
        printPositiveOrNegative(0);
        printPositiveOrNegative(15);

        System.out.println(numberNegativeIsTrue(-5));
        System.out.println(numberNegativeIsTrue(0));
        System.out.println(numberNegativeIsTrue(15));

        printWordTimes( "Java", 15);
    }

    static boolean in10to20(int a, int b) {
        return  a+b >=10 && a+b <=20;
    }

    static void printPositiveOrNegative(int a) {
        System.out.println ("Number is " + (a >=0 ? "positive": "negative" ));
    }

    static boolean numberNegativeIsTrue(int b) {
        return b < 0;
    }

    static void printWordTimes(String word, int times) {
        for (int i = 0 ; i < times; i++) {
            System.out.println (word);
        }
    }
}