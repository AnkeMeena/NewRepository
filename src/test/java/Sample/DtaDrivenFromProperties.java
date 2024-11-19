package Sample;

import java.io.FileInputStream;
import java.util.Properties;

import genericUtility.IPathConstant;

public class DtaDrivenFromProperties {
	public static void main (String []args)throws Exception
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("UserName");
		System.out.println(value);
	
	}
}
