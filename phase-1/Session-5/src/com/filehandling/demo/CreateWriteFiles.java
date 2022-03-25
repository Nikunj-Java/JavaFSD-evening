package com.filehandling.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.xml.crypto.Data;

public class CreateWriteFiles {
	
	public static void createFileUsingFileClass() throws IOException {
				
		File file =new File("D:\\files\\testFiles1.txt");
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File is Already Exist");
		}
		///write data to that file
		FileWriter writer= new FileWriter(file,false);
		writer.write("Welcome......!");
		writer.close();	
	}
	public static void createFileUsingOutputStream() throws IOException{
		
		FileOutputStream out= new FileOutputStream("D:\\files\\testFiles2.txt",true);
		String input="Welcome to File Handling";
		byte array[]=input.getBytes();
		out.write(array);
		out.close();
		
	}
	//async method
	public static void createFileUsingNIO() throws IOException{
		
		Path path =Paths.get("D:\\files\\testFile3.txt");
		///write data using Files class
		String input= "Welcome to file handling";
		byte array[]= input.getBytes();
		
		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written");
		//write data of list to files directly
		
		Path path1= Paths.get("D:\\files\\testFile4.txt");
		//write data using Files class
		List<String> list =Arrays.asList("This is my first line","This is my second line");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written");
		
		
	}
	
	public static void main(String[] args) {
		
		try {
			//createFileUsingFileClass();
			//createFileUsingOutputStream();
			
			createFileUsingNIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
