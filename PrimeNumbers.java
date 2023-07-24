package com.java.prac;

import java.util.Scanner;

/**
 * @author Venkatesh
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		int i, j, chk;
		System.out.println("Please enter num to prime numbers :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Please enter num to print Prime numbers");
		for(i=2;i<num;i++) {
			chk=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					chk++;
					break;
				}
			}
			if(chk==0) {
				System.out.print(i+" ");
			}
		}
	}
}
