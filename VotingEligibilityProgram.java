package IfElseLadderProblems;

import java.util.Scanner;

public class VotingEligibilityProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
        	System.out.println("Congrats!, You are Eligible to vote");
        } else {
        	System.out.println("You are not Eligible to vote");
        }
       
        sc.close();
	}

}
