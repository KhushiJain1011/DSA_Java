// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

// Example 1:
// Input: num1 = "2", num2 = "3"
// Output: "6"

// Example 2:
// Input: num1 = "123", num2 = "456"
// Output: "56088"

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        String n1 = "2";
        String n2 = "3";
        System.out.println(multiply(n1, n2));

        String m1 = "123";
        String m2 = "456";
        System.out.println(multiply(m1, m2));
    }

    public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger res = n1.multiply(n2);
        return res.toString();
    }
}
