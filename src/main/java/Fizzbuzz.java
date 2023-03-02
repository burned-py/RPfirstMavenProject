public class Fizzbuzz {
    public static String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "fizzbuzz";
        } else if (i % 5 == 0) {
            return "buzz";
        } else if (i % 3 == 0) {
            return "fizz";
        } else {
            String numString = Integer.toString(i);
            return numString;
        }
    }

    public static boolean smallerThanZero(int i) {
        return i < 0; //same as "if (i<0) {return true;}; else  {return false;}"
    }


    public static int sumSquareTest(int a, int b) {
        if (a > b) {
            return a + b;
        } else {
            return a*b;
        }
    }
}