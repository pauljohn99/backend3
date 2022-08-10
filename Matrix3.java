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
		int temp;
		if(col1==row2) {
		System.out.println("enter elements of matrix 1");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				m1[i][j]=read.nextInt();}}
		System.out.println("enter elements of matrix 2");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				m2[i][j]=read.nextInt();}}
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {	
			temp=temp+(m1[i][j]*m2[j][i])