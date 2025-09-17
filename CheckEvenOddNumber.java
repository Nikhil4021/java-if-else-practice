package IfElseLadderProblems;

import java.util.Scanner;

public class CheckEvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);//Creating Scanner object
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();//Read User Input
        
        //using modulo operator
        /*
        if (number%2 == 0) {
        	System.out.println(number +"is Even");
        } else {
        	System.out.println(number +"is Odd");
        }
        */
        
        //using ternary operator
        //String result = (number % 2 == 0) ? "The number is Even":"The number is Odd";
		//System.out.print(result);
        
        //Uses XOR to toggle and Compare
        /* Logic
         * as the numbers are stored in the form of binary digits
         * using the LSB(Least Significant Bit) will help
         * Even numbers means LSB=0
         * Odd numbers means LSB=1
         * XOR operator compares bits and return 1 if bits are different, 0 if they are same
         * XOR means if the A and B are 1 and 1 then it will be 0
         * A    B   A XOR B
         * 0    0    0
         * 0    1    1
         * 1    0    1
         * 1    1    1 
         * For Odd Numbers
         * e.g. number = 7 (0111)
         * 7 ^ 1 --> 0111 ^ 0001 = 0110 which is 6
         * Since 7 ^ 1 = 6 and 6 == 7 - 1 then 7 is odd
         * For Even Numbers
         * e.g. number = 8 (1000)
         * 8 ^ 1 --> 1000 ^ 0001 = 1001 which is 9
         * Since 10 ^ 1 = 9 and 9 == 8 + 1 then 8 is even
         * Logic: n ^ 1 = n + 1 then the number is even
         *        n ^ 1 = n - 1 then the number is odd
         * 
        
        if ((number ^ 1) == number + 1) {
        	System.out.print(number +" is Even");
        } else {
        	System.out.print(number +" is Odd");
        } */
        
        
        //Using Bitwise AND operator
        if ((number & 1) == 0) {
        	System.out.print(number +" is Even");
        }else {
        	System.out.print(number +" is Odd");
        } 
        
        scanner.close();
	}

}
