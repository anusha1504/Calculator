package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
        int x;
        x=disp();
		if(x==1)
        {
			BasicCalc1 calc=new BasicCalc1();
			calc.menu();
			calc.userInputs();
			calc.performOperation();
        }
        if(x==2)
        {
        	ScientificCalc scalc=new ScientificCalc();
			scalc.menu();
			scalc.userInputs();
			scalc.performOperation();
       	}
        	
        	if(x==3)
        	{
        		StatisticCalc scalc=new StatisticCalc();
    			scalc.menu();
    			scalc.userInputs();
    			scalc.performOperation();
        	}
 
    }
        
static int disp(){
	int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("**************** CALULATOR********************");
	System.out.println("**************** 1.BASIC CALULATOR********************");
	System.out.println("**************** 2.SCIENTIFIC CALULATOR********************");
	System.out.println("**************** 3.STATISTIC CALULATOR********************");
	System.out.println("**************** ********************");
	System.out.println("Enter your Choice");
	ch=sc.nextInt();
	
	return(ch);
	
}

}