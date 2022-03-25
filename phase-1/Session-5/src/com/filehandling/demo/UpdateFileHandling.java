package com.filehandling.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFileHandling {
	
	public static void modifyFile(String file,String olddata, String newdata)
	{
		
		File filetobeModified= new File(file);
		String fileData="";
		BufferedReader reader =null;
		
		FileWriter writer =null;
		
		//read content of file
		try {
			reader =new BufferedReader(new FileReader(filetobeModified));
			String line =reader.readLine();
			while(line!=null) {
				fileData =fileData+line+System.lineSeparator();
				line=reader.readLine();
			} 
		//update the data
		String NewFileData= fileData.replaceAll(olddata, newdata);
		//write modified data to that file
		writer =new FileWriter(filetobeModified);
		writer.write(NewFileData);
		
		System.out.println("Data Updated Successfully");
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		modifyFile("D:\\files\\testFile4.txt", "This", "here");
	}

}
