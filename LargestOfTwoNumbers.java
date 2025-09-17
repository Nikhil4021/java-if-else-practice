package IfElseLadderProblems;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter the first number:");
         int number1 = sc.nextInt();
         System.out.println("Enter the Second number:");
         int number2 = sc.nextInt();
         
         if (number1 > number2) {
        	 System.out.println(number1+" Is greatest");
         } else {
        	 System.out.println(number2+" Is greatest");
         }
         
         sc.close();
	}

}
