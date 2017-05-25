package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class arithmeticoprtr {
	
	
	
	int a,b;
	void userinputs() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
	}
	void display() {
		System.out.println("addition"+(a+b));
		System.out.println("subtaction"+(a-b));
		System.out.println("multiplication"+(a*b));
		System.out.println("division"+(a/b));
		System.out.println("modulo division"+(a%b));
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmeticoprtr s1=new arithmeticoprtr();
		s1.userinputs();
		s1.display();
	}

}
