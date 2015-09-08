/**
* Methods for working with numbers that are evenly divisible into
* other numbers.  Not particularly useful, except as an illustration
* of how to define, populate, and return an array
*
* @version September 8, 2015
*/

public class Divisors {
    
    // test whether an int is evenly divisible by another
    public static boolean isDivisible(int value, int divisor) {
        return (value%divisor==0);
    }
    
    public static int[] getFirstXDivisors (int x, int start, int divisor){
        int[] results = new int[x];
        int numFound = 0;
        int currentValue = start;
        while (numFound<x) {
            if (isDivisible(currentValue, divisor)) {
                results[numFound] = currentValue;
                numFound++;
            }
            currentValue++;
        }
      return results;
    }

    // any class can declare a main method -- doesn't mean 'should', but 'can'
    public static void main(String[] args) {
        int[] first5SevensOver100 = getFirstXDivisors(5, 100, 7);
        for (int i: first5SevensOver100) {
            System.out.println(i);
        }
    }
}
