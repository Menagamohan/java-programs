import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileIO {

	void writeData() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\s1.txt");
			String name="welcome";
			byte s[]=name.getBytes();
			fos.write(s);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException r)
		{
			
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("c:\\s1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void seqInputStream() throws IOException
	{
		try
		{
			FileInputStream fis1=new FileInputStream("c:\\menaga1.txt");
			FileInputStream fis2=new FileInputStream("c:\\menaga2.txt");
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			int i;
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void fileWriter() throws IOException
	{
		try
		{
			FileWriter fw=new FileWriter("c:\\s1.txt");
			fw.write("welcome");
			System.out.println("FileInserted");
			fw.close();
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void fileReader() throws IOException
	{
		try
		{
			FileReader fr=new FileReader("c:\\s1.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	//try with resource 
	
	void trywith() throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("c:\\s2.txt"))
		{
			String name="azar";
			byte s[]=name.getBytes();
			fos.write(s);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException t)
		{
			
		}
		
	}
	public static void main(String[] args) throws IOException {
	
		FileIO f1=new FileIO();
		//f1.writeData();
		f1.readData();
		//f1.seqInputStream();
	}

}
