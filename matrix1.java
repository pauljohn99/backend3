package com.orthofx;
import java.util.Scanner;
public class Matrix1 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("number of rows");
		int row=read.nextInt();
		System.out.println("number of columns");
		int col=read.nextInt();
		int m1[][]=new int[100][100];
		int m2[][]=new int[100][100];
		int sum[][]=new int[100][100];
		System.out.println("enter elements of matrix 1");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				m1[i][j]=read.nextInt();}}
		System.out.println("enter elements of matrix 2");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				m2[i][j]=read.nextInt();}}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum[i][j]=m1[i][j]+m2[i][j];}}
		System.out.println("sum matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(sum[i][j]+ "    ");}
			System.out.println();}
		
		}

}
