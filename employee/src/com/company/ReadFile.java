package com.company;

/*
Read file using FileInputStream
This example shows how to read a file using Java FileInputStream class.
FileInputStream is used to read binary content of the file and
return bytes of data.
*/
import java.io.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;

public class ReadFile {
	static Logger log = Logger.getLogger(ReadFile.class);
public static void main(String[] args) {
	PropertyConfigurator.configure("emp-log4j.properties");
	//DOMConfigurator.configure("log4j.xml");
//create file object
File file = new File("P:/Documents/HBO/misc_hbo.txt");

int ch;
StringBuffer strContent = new StringBuffer("");
FileInputStream fin = null;

try
{
/*
* Create new FileInputStream object. Constructor of FileInputStream throws
* FileNotFoundException if the agrument File does not exist.
*/

fin = new FileInputStream(file);

/*
* To read bytes from stream use,
* int read() method of FileInputStream class.
*
* This method reads a byte from stream. This method returns next byte of data
* from file or -1 if the end of the file is reached.
*
* Read method throws IOException in case of any IO errors.
*/

while( (ch = fin.read()) != -1)
strContent.append((char)ch);

/*
* To close the FileInputStream, use
* void close() method of FileInputStream class.
*
* close method also throws IOException.
*/
fin.close();

}
catch(FileNotFoundException e)
{
System.out.println("File " + file.getAbsolutePath() +
" could not be found on filesystem");
}
catch(IOException ioe)
{
System.out.println("Exception while reading the file" + ioe);
}

System.out.println("File contents :");
//System.out.println(strContent);
log.debug("output from file: \n" +strContent );


/*
* Please note that, FileInputStream SHOULD NOT BE USED to read
* character data file.
* It is meant for reading binary data such as an image file.
*
* To read character data, FileReader should be used.
*/
}
}

/*
Output would be
File contents :
This file is a demonstration of how to read a file using Java FileInputStream.
*/
