package com.orthofx;
import java.util.Scanner;
public class Matrix3 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("number of rows in 1st matrix");
		int row1=read.nextInt();
		System.out.println("number of columns in 1st matrix");
		int col1=read.nextInt();
		System.out.println("number of rows in 2nd matrix");
		int row2=read.nextInt();
		System.out.println("number of columns in 2nd matrix");
		int col2=read.nextInt();
		int m1[][]=new int[100][100];
		int m2[][]=new int[100][100];
		int multi[][]=new int[100][100];
		int temp[]=new int[100];
		int t=0,r=0;
		if(col1==row2) {
		System.out.println("enter elements of matrix 1");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				m1[i][j]=read.nextInt();}}
		System.out.println("enter elements of matrix 2");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				m2[i][j]=read.nextInt();}}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				multi[i][j]=0;
		     for(int k=0;k<col1;k++) {
		    	multi[i][j]=multi[i][j]+(m1[i][k]*m2[k][j]);}
		     temp[t]=multi[i][j];
		     t=t+1;}}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				multi[i][j]=temp[r];
				r++;
				System.out.print(multi[i][j]+ "   ");}
			System.out.println();}}
		else 
			System.out.println("invalid matrix");}}
		
		
		
		