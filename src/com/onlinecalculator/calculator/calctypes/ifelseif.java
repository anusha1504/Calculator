package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class ifelseif { 
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
	if(choice==1) 
		System.out.println("addition"+(a+b));
	else  if(choice==2)
		System.out.println("subtraction"+(a-b));
	else   	if(choice==3) 
		System.out.println("multiply"+(a*b));
	else  if(choice==4)
		System.out.println("divide"+(a/b));
		} 
	public static void main(String args[]) 
	
	{
		ifelseif s1=new ifelseif();
		s1.userinputs();
		s1.display();
	}
	}











