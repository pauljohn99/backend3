package com.orthofx;
import java.util.Scanner;
public class RomanToInteger {
	
	static int value(char p)
    {
   	 switch(p) {
   		 case 'I':
   		     return 1;
   		 case 'V':
   			 return 5;
   		 case 'X':
   			 return 10;
   		 case 'L':
   			 return 50;
   		 case 'C':
   			 return 100;
   		 case 'D':
   			 return 500;
   		 case 'M':
   			 return 1000;
   		default:
   			return -1;
   		 }
    }
	
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter roman numeral");
		String roman=read.nextLine();
		int n=roman.length();
		int a,b,sum=0;
		for(int i=0;i<n-1;i++) {
			a=value(roman.charAt(i));
			b=value(roman.charAt(i+1));
			if(a>=b) {
				sum=sum+a;
			}
			else {
				sum=sum-a;
			 }
		}
		sum=sum+value(roman.charAt(n-1));
		System.out.println(sum);
		   }
	    }  

		

