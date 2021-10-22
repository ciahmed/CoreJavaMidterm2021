package math;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //Factorial

        try {
            Assert.assertEquals(Factorial.factorial(5), 120);
            System.out.println("Unit Testing has Passed for Factorial");
        } catch (AssertionError ar) {
            System.out.println("Unit testing has Failed for Factorial");
        }

        //Fibonacci
        //Find missing number

        try {
            int[] array = new int[]{10, 2, 1, 4, 5};
            int n = 6;
            Assert.assertEquals(FindMissingNumber.missingNumber(array, n), 5);
            System.out.println("Unit Testing has Passed for FindMissingNumber");
        } catch (AssertionError as) {
            System.out.println("Unit Testing has Failed for FindMissingNumber");
        }

        //Lowest number
        //Pyramid
        //Pattern
        //Prime number


    }
}
