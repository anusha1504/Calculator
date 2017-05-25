package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
	 class abc {
		static int x;
		static void display() {
		 	int x;
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter a number");
		 	x=sc.nextInt();
		 	System.out.println("staticvariable "+x);
		 }
		 }
		 public class staticvariable{
		 public static void main(String args[])	{
		 	abc s=new abc();
		 	s.display();
		 }
		 }


