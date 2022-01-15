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
        System.out.println(numberNegativeIsTrue(5));

        System.out.println(printWordTimes( "Java ", 15));
    }

    static boolean in10to20(int a, int b) {
        if (a+b >=10 && a+b <=20) {
            return true;
        }
        return false;
    }

    static void printPositiveOrNegative(int a) {
        if (a >=0) {
            System.out.println ("Number is positive");
        } else {
            System.out.println ("Number is negative");
        }
    }

    static boolean numberNegativeIsTrue(int b) {
        if (b < 0) {
            return true;
        }
        return false;
    }

    static String printWordTimes(String word, int times) {
        String result = " ";
        for (int i = 0 ; i < times; i++) {
            result = result + word;
        }
        return result;
    }
}