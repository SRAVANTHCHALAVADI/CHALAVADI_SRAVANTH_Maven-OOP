package com.epam;

import java.util.Scanner;

public class Chocolate_Gift implements Gifts {
	int n,candy=0,sum=0;
	static Scanner sc=new Scanner(System.in);
	public static int low;
	public static int high;
	static void range() {
		System.out.print("Enter the Lower limit range  for candy detection : ");
		low = sc.nextInt();
		System.out.print("Enter the Higher limit range  for candy detection : ");
		high = sc.nextInt();
	}

	public int No_Of_items(int n[]) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<n.length;i++) {
			
				sum+=n[i];
		}
		
		return sum;
	}
	public int No_Of_candy(int b[]) {
		for(int i=0;i<b.length;i++) {
			if(b[i]>low&&b[i]<=high) {
				candy++;
			}
		}
		
		return candy;
	}

}
