package data_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadCSVdoc 
{
	String File_Path = "D:\\Eclipse_Practiee\\Eclipse WorkSpace\\Explore_Data\\src\\main\\java\\Data_Source\\usr.csv";
	String line = "";  
	String splitBy = ",";  
	
	@Test
	public void getcsvdata() throws FileNotFoundException
	{
		try   
		{  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader(File_Path));  
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				String[] employee = line.split(splitBy);    // use comma as separator  
				for(int i =0 ; i<=1 ; i++)
				{
					System.out.println(employee[i]); 
				}
			}  
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();  
		}  	
	}
}
