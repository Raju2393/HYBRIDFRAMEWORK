package com.automation.tricentis.generic;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderClass implements Framework_Constants{
	@DataProvider(name= "logincred")
	public Object [] [] testData() throws IOException
	{
		Object [] [] value = ReadDataFromExcel.getMultipleData(SheetName);
		return value; 
	}

}
