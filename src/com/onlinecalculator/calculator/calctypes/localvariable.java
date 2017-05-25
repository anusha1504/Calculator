package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;
 class mno {
void display() {
	int x;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	x=sc.nextInt();
	System.out.println("local variable"+x);
}
}
public class localvariable{
public static void main(String args[])	{
	mno s=new mno();
	s.display();
}
}