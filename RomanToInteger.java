package com.orthofx;
import java.util.Scanner;
public class RomanToInteger {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter roman numeral");
		String roman=read.nextLine();
		int n=roman.length();
		int sum=0,i=0;
		while(i<n) {
			if(roman.charAt(i)=='I'){
				if(roman.charAt(i+1)=='V') {
					sum=sum+4;
					i=i+2;
				}
				else if(roman.charAt(i+1)=='X') {
					sum=sum+9;
					i=i+2;
				}
				else {
					sum=sum+1;
					i=i+1;
				}
			}
			else if(roman.charAt(i)=='V') {
				sum=sum+5;
				i=i+1;
			}
			else if(roman.charAt(i)=='X'){
				if(roman.charAt(i+1)=='L') {
					sum=sum+40;
					i=i+2;
				}
				else if(roman.charAt(i+1)=='C') {
					sum=sum+90;
					i=i+2;
				}
				else {
					sum=sum+10;
					i=i+1;
				}
					}
			else if(roman.charAt(i)=='L') {
				sum=sum+50;
				i=i+1;
			}
			else if(roman.charAt(i)=='C'){
				if(roman.charAt(i+1)=='D') {
					sum=sum+400;
					i=i+2;
				}
				else if(roman.charAt(i+1)=='M') {
					sum=sum+900;
					i=i+2;
				}
				else {
					sum=sum+100;
					i=i+1;
				}
					}
			else if(roman.charAt(i)=='D') {
				sum=sum+500;
				i=i+1;
			}
			else if(roman.charAt(i)=='M') {
				sum=sum+1000;
				i=i+1;
			}
			else
				System.out.println("invalid roman numeral");
			
			
				
				
			}
		 System.out.println(sum);
				
			}
		}
		

