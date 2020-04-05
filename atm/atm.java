/*
 *StudentName: Yash Djson Dookun
 *Task: Write a Java Program to implement the ATM machine. Your program should display messages as per the flow of events
 */

import java.util.Scanner;
public class atm {
	public static void main(String[]args){
		int amount, quotient, remainder; //quotient is 200 and remainder is 100 (notes)
		Scanner input = new Scanner(System.in);
		//welcome Message
		System.out.println("Welcome to MyBank - Cash Withdrawal");
		do {
			System.out.println("Please enter withdrawn amount");
			amount = input.nextInt();
			if ((amount % 100) != 0){
				System.out.println("The amount to be withdrawn must be a multiple of Rs 100 e.g Rs 100, Rs 200, Rs300, Rs400. . .Rs1000.");
			}
		}
		while((amount % 100) != 0);
		do {
			if((amount < 100) || (amount > 1000) || (amount < 0)) {
				System.out.println("You can only withdraw between Rs100 and Rs 1000");
				break;
			}
			else {
				quotient = amount / 200; //DIV
				remainder = (amount % 200)/100; //MOD
				System.out.println("Please collect your money");
				System.out.println("Number of Rs200 bank notes: " + quotient);
				System.out.println("Number of Rs100 bank notes: " + remainder);
				System.out.println("Thank you for using MyBank");
				System.out.println("GoodBye");
			}
		}
		while(((amount < 100) || (amount > 1000)) || (amount < 0));
	}
}
