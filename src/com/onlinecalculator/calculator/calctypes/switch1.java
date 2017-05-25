package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class switch1 { 
	int a,b,choice;
	void userinputs() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt(); 
		System.out.println("enter your choice");
		choice=s.nextInt(); 
		} 
	void display()
	{
	switch(choice)  {
	case 1:
	
		System.out.println("addition"+(a+b));
		break;
	case 2:
		System.out.println("subtraction"+(a-b));
		break;
	case 3:
		System.out.println("multiply"+(a*b));
		break;
	case 4:
		System.out.println("divide"+(a/b));
		break;
		default:
			System.out.println("invalid choice");
	}} 
	public static void main(String args[]) 
	
	{
		switch1 s1=new switch1();
		s1.userinputs();
		s1.display();
	}
	}


