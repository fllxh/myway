package xsl;

import java.io.FileWriter;
import java.io.IOException;

public class filetet {
public void test(String s) {
	FileWriter fileWriter = null;
	try {
		fileWriter = new FileWriter("Result.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int [] a=new int[]{11112,222,333,444,555,666};
	
	try {
		fileWriter.write(s);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		fileWriter.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fileWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
}
