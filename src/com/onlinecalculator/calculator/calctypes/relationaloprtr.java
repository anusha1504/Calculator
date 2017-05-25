package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class relationaloprtr {
	int a,b;
	void userinputs() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
	}
	void display() {

		System.out.println("a>=b"+(a>=b));
		System.out.println("a<=b"+(a<=b));
		System.out.println("a==b"+(a==b));
		System.out.println("a>b"+(a>b));
		System.out.println("a<b"+(a<b));
		System.out.println("a!=b"+(a!=b));
	} 
	public static void main(String args[]) 
	{
		relationaloprtr s1=new relationaloprtr();
		s1.userinputs();
		s1.display();
	}
	}


