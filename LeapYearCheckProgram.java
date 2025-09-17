package ifelseladderproblemsintermediate;

import java.util.Scanner;

public class LeapYearCheckProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Leap Year Check – Check whether a given year is a leap year.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check whether it is a leap year:");
		int year = sc.nextInt();
		
		//Logic if year is divisible by 400 then it is leap year
		//if year is divisible by 100 then no a leap year
		//if year is divisible by 4 then a leap year
		/*
		if(year % 400 == 0) {
			System.out.println("The entered year "+year+" is a leap year");
		} else if (year % 4 == 0) {
			System.out.println("The entered year "+year+" is a leap year");
		} else if (year % 100 == 0) {
			System.out.println("The entered year "+year+" is not a leap year");
		} else {
			System.out.println("The entered year "+year+" is not a leap year");
		}
		*/
		//The mistake in this above code is the sequence of conditions
		//first should be  year % 400 == 0 then leap year
		//second should be year % 100 == 0 then no leap year
		//third should be year % 4 == 0 then leap year
		
		if (year % 400 == 0) {
            System.out.println("The entered year " + year + " is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("The entered year " + year + " is NOT a leap year");
        } else if (year % 4 == 0) {
            System.out.println("The entered year " + year + " is a leap year");
        } else {
            System.out.println("The entered year " + year + " is NOT a leap year");
        }
		
		sc.close();
	}

}
