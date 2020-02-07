package com.epam;

import java.util.Scanner;

public class GiftsForNewYear {
	private static Scanner sc;
	private static int ccan;
	private static int scan;

	public static void main(String []args) {
		int ch,sw;
		sc = new Scanner(System.in);
		System.out.print("Enter number of Chocolates :");
		ch=sc.nextInt();
		int choc[]=new int[ch];
		System.out.print("Enter the weights of each Chocolate :");
		for(int i=0;i<ch;i++) {
			choc[i]=sc.nextInt();
		}
		System.out.print("Enter number of Sweets :");
		sw=sc.nextInt();
		int swee[]=new int[sw];
		System.out.print("Enter the weights of each Sweet :");
		for(int j=0;j<sw;j++) {
			swee[j]=sc.nextInt();
		}
		Chocolate_Gift cg=new Chocolate_Gift();
		Chocolate_Gift.range();
		int cres=cg.No_Of_items(choc);
		ccan = cg.No_Of_candy(choc);
		Sweets s=new Sweets();
		int sres=s.No_Of_items(swee);
		scan = s.No_Of_candy(swee);
		System.out.print("\n");
		System.out.println("Weight of New Year Gift : "+(cres+sres));
		System.out.println("No of Candies : "+(ccan+scan));

	}
}
