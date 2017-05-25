package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

	 class xyz {
		 int x;
		 void display() {
		 	int x;
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter a number");
		 	x=sc.nextInt();
		 	System.out.println("instance variable"+x);
		 }
		 }
		 public class instancevariable{
		 public static void main(String args[])	{
		 	xyz s=new xyz();
		 	s.display();
		 }
		 }


