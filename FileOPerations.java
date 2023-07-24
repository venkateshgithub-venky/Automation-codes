package com.java.prac;

import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author venkatesh
 */
public class FileOPerations {

	public static void main(String[] args) throws IOException  {
		String sc="Hello venky Welcome";
		byte buf[]=sc.getBytes();
		System.out.println(System.getProperty("user.dir"));
		FileOutputStream fo=new FileOutputStream("file.txt");
		fo.write(buf);
		//fo.close();
		fo.write(buf);
	}

}
