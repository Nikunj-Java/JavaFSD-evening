package com.filehandling.demo;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileHandling {
	
	public static void main(String[] args) {
		
		Path path = Paths.get("D:\\files\\testFile1.txt");
		
		try {
			if(Files.deleteIfExists(path))
					System.out.println("File Deleted");
			else 
				System.out.println("File not detected");
			
		}
		
		catch (NoSuchFileException e) {
			System.out.println("No such file exist: "+e);
		}
		catch (DirectoryNotEmptyException e) {
			
			System.out.println("Directory is not empty :" +e);
		}
		
		///use this at last
		catch (IOException e) {
			// TODO Auto-generated catch block
			 
			System.out.println("Invalid Permission :" +e);
		}
	}

}
