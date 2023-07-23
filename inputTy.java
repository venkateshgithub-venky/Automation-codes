package com.java.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputTy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str;
		double i=0;
		System.out.println(i);
		double sum=0;
		System.out.println(br.ready());
		System.out.println("Enter numbers 0 to quit. ");
		do {
			str=br.readLine();
			try {
				i=Double.parseDouble(str);
			} catch(NumberFormatException e) {
					System.out.println("Invalid Formate");
					i=0;
			}
			sum +=i;
			System.out.println("Current sum is: "+sum);
		} while(i !=0);
	}

}
