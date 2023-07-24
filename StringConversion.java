package com.java.prac;
/**
 * @author Venkatesh
 * Convert integer to HEXADECIMAL, OCTAL, BINARY Representation
 */
public class StringConversion {

	public static void main(String[] args) {
		int num=5602;
		System.out.println(num + " in binary "+ Integer.toBinaryString(num));
		System.out.println(num +" in OCTAL "+Integer.toOctalString(num));
		System.out.println(num +" in HEXADECIMAL "+ Integer.toHexString(num));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
	}

}