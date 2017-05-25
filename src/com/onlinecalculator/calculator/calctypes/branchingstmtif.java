package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;
public class branchingstmtif {
	int a,b;
	void userinputs() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt(); 
		} 
	void display()
	{
	if(a>b) 
		System.out.println("a is big");
	else 
		System.out.println("b is big");
	} 
	public static void main(String args[]) 
	
	{
		branchingstmtif s1=new branchingstmtif();
		s1.userinputs();
		s1.display();
	}
	}




	


