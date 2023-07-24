package com.java.prac;

import java.util.Scanner;
/**
 * @author Venkatesh
 */
public class primeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter number to check Prime or not :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		int itr=num/2;
		if(num==0||num==1) {
			System.out.println(num+" Entered number is not valid prime number");
		}else {
			for(int i=2;i<itr;i++) {
				if(num%i==0) {
					System.out.println("Entered number "+num+" is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Entered number "+num+" is a prime number");
			}
			
		}
		sc.close();
	}

}
