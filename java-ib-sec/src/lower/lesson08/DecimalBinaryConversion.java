package lower.lesson08;

import java.util.Scanner;

public class DecimalBinaryConversion {
    public static void main(String[] args) {
        // explain the user what to do
        System.out.println("Decimal to Binary Converter");
        System.out.println("Please enter a positive number greater than 0...");
        System.out.println("[ You may enter a positive number with a fractional part. ]");
        
        // input
        Scanner sc = new Scanner(System.in);
        String numberIn = sc.nextLine();
        sc.close();

        // process
        try {
            // the string input accepted is being converted to a double
            // using Java out of the box code... complexity is hidden, all I need to know
            // is that I need to pass in a string, and it gives me back a double
            // but be careful, things can go wrong!
            double number = Double.parseDouble(numberIn);
            if (number > 0) {
                String result = decimalToBinary(number, 5);
                // output
                System.out.println("The binary representation of " + number + " is: " + result);
            } else {
                System.out.println("We told you to put in a positive number. We don't support negative numbers.");
            } 
        } catch (NullPointerException e) { // catch exceptions that you can foresee
            System.out.println("You have entered nothing. Please try again.");
        } catch (NumberFormatException e) {
            System.out.println("We cannot perform the conversion. Please try again.");
        }
    }
    
    /**
     * This solution was extracted from https://www.geeksforgeeks.org/convert-decimal-fraction-binary-number/
     * @param num
     * @param k_prec
     * @return
     */
    private static String decimalToBinary(double num, int k_prec)
    {
        // Setting the *pre-condition* of this algorithm
        String binary = "";
 
        // Fetch the integral part of decimal number
        int integral = (int) num;
 
        // Fetch the fractional part decimal number
        double fractional = num - integral;
 
        // Conversion of integral part to
        // binary equivalent
        while (integral > 0) {
            int rem = integral % 2;
 
            // Append 0 in binary
            binary += ((char)(rem + '0'));
 
            integral /= 2;
        }
 
        // Reverse string to get original binary
        // equivalent
        binary = reverse(binary);
 
        // Conversion of fractional part to
        // binary equivalent
        if (fractional > 0) {
            // Append point before conversion of
            // fractional part
            binary += ('.');
            while (k_prec-- > 0) {
                // Find next bit in fraction
                fractional *= 2;
                int fract_bit = (int) fractional;
     
                if (fract_bit == 1) {
                    fractional -= fract_bit;
                    binary += (char)(1 + '0');
                }
                else {
                    binary += (char)(0 + '0');
                }
            } 
        }

        return binary;
    }
 
    private static String reverse(String input)
    {
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;
 
        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }
        return String.valueOf(temparray);
    }
}
