package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class logicaloprtr {
	boolean a,b;
	void userinputs() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextBoolean();
		System.out.println("enter second number");
		b=s.nextBoolean();
	}
	void display() {
		System.out.println("logicaland"+(a&&b));
		System.out.println("logicalor"+(a||b));
		System.out.println("logicalnot"+(a!=b));
	} 
	public static void main(String args[]) 
	{
		logicaloprtr s1=new logicaloprtr();
		s1.userinputs();
		s1.display();
	}

}
