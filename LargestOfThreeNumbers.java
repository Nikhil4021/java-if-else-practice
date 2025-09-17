package ifelseladderproblemsintermediate;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        
        if (a == b && b == c) {
            System.out.println("All three numbers are equal: " + a);
        } else if (a == b) {
            System.out.println("The first and second numbers are equal: " + a);
            System.out.println("The greatest number is: " + Math.max(a, c));
        } else if (b == c) {
            System.out.println("The second and third numbers are equal: " + b);
            System.out.println("The greatest number is: " + Math.max(b, a));
        } else if (c == a) {
            System.out.println("The first and third numbers are equal: " + a);
            System.out.println("The greatest number is: " + Math.max(c, b));
        } else {
            // All numbers are distinct
            if (a > b && a > c) {
                System.out.println("The first number " + a + " is the greatest");
            } else if (b > a && b > c) {
                System.out.println("The second number " + b + " is the greatest");
            } else {
                System.out.println("The third number " + c + " is the greatest");
            }
        }
        
        //Chatgpt suggested to add >= conditions in comparison
        //Solution given by chatgpt for simplification
        /*
         * if (a == b && b == c) {
            System.out.println("All three numbers are equal: " + a);
        } else {
            // Find the greatest number
            int max = Math.max(a, Math.max(b, c));
            System.out.println("The greatest number is: " + max);

            // Check for equality between any two numbers
            if (a == b) {
                System.out.println("First and second numbers are equal: " + a);
            } 
            if (b == c) {
                System.out.println("Second and third numbers are equal: " + b);
            }
            if (a == c) {
                System.out.println("First and third numbers are equal: " + a);
            }
        }
         */
        sc.close();
	}

}
