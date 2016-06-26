import java.math.BigInteger;
/**
 3 Find the sum of the digits in the number 100! (i.e. 100 factorial)
 {Correct answer: 648}

 */
public class SumOfDigits {
    static BigInteger s = new BigInteger("1");
    static int factorial = 0;
    public static void main(String[] args) {

        for (int i = 100; i > 1; i--) {
            s = s.multiply(new BigInteger(i+""));

        }
        String num = String.valueOf(s);// Convert a number to a string
        int result[] = new int[num.length()];// Create an array
        for (int i = 0; i < num.length(); i++) result[i] = num.charAt(i);// Fill the array
        for (int i = 0; i < num.length(); i++) {
            int i1 = Character.digit(result[i], 10);// We take the number of the array and add them
            factorial = factorial + i1;

        }
        System.out.println(factorial);

    }
}