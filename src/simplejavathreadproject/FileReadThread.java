package simplejavathreadproject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileReadThread {
	public static void main(String[] args) {
		String dir =System.getProperty("user.dir")+"/src/obd/";
		File file=new File("obdjson.txt");
		String path=dir+file;
		LineNumberReader lineReader=null;
		FileReader reader=null;
		
		try {
			
			
			reader = new FileReader(path);
			lineReader = new LineNumberReader(reader);
			
			String response = "";
			String currentLine;
			while((currentLine=lineReader.readLine())!=null) {
				if (currentLine.contains("\"dnis\"")) {
					long theRandomNum = (long) (Math.random() * Math.pow(10, 10));
					response += "\"dnis\":\"" + theRandomNum + "\",";
					System.out.println("the random numbe "+ theRandomNum   );
				} else {
					response += currentLine;
				}
			}
			
			System.out.println(response);
			}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
			if(lineReader!=null)
			lineReader.close();
			if(reader!=null)
				reader.close();
		} 
			catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		
	}
		
		
		System.out.println(Thread.currentThread().getName());
		Mythread mythread = new Mythread();
		mythread.start();
		Mythread mythread1 = new Mythread();
		mythread1.start();
		Mythread mythread2 = new Mythread();
		mythread2.start();
		
	}
	
	
	
}
class Mythread extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		String dir =System.getProperty("user.dir")+"/src/obd/";
		File file=new File("obdjson.txt");
		String path=dir+file;
		LineNumberReader lineReader=null;
		FileReader reader=null;
		
		try {
			
			
			reader = new FileReader(path);
			lineReader = new LineNumberReader(reader);
			
			String response = "";
			String currentLine;
			while((currentLine=lineReader.readLine())!=null) {
				if (currentLine.contains("\"dnis\"")) {
					long theRandomNum = (long) (Math.random() * Math.pow(10, 10));
					response += "\"dnis\":\"" + theRandomNum + "\",";
					System.out.println("the random numbe "+ theRandomNum   );
				} else {
					response += currentLine;
				}
			}
			
			System.out.println(response);
			}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
			if(lineReader!=null)
			lineReader.close();
			if(reader!=null)
				reader.close();
		} 
			catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
			
			
	}
	
	}
}
	class Mythread1 extends Thread{
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			String dir =System.getProperty("user.dir")+"/src/obd/";
			File file=new File("obdjson.txt");
			String path=dir+file;
			LineNumberReader lineReader=null;
			FileReader reader=null;
			
			try {
				
				
				reader = new FileReader(path);
				lineReader = new LineNumberReader(reader);
				
				String response = "";
				String currentLine;
				while((currentLine=lineReader.readLine())!=null) {
					if (currentLine.contains("\"dnis\"")) {
						long theRandomNum = (long) (Math.random() * Math.pow(10, 10));
						response += "\"dnis\":\"" + theRandomNum + "\",";
						System.out.println("the random numbe "+ theRandomNum   );
					} else {
						response += currentLine;
					}
				}
				
				System.out.println(response);
				}
			catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
			finally {
				try {
				if(lineReader!=null)
				lineReader.close();
				if(reader!=null)
					reader.close();
			} 
				catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
		}
	}
 }

	class Mythread2 extends Thread{
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			String dir =System.getProperty("user.dir")+"/src/obd/";
			File file=new File("obdjson.txt");
			String path=dir+file;
			LineNumberReader lineReader=null;
			FileReader reader=null;
			
			try {
				
				
				reader = new FileReader(path);
				lineReader = new LineNumberReader(reader);
				
				String response = "";
				String currentLine;
				while((currentLine=lineReader.readLine())!=null) {
					if (currentLine.contains("\"dnis\"")) {
						long theRandomNum = (long) (Math.random() * Math.pow(10, 10));
						response += "\"dnis\":\"" + theRandomNum + "\",";
						System.out.println("the random numbe "+ theRandomNum   );
					} else {
						response += currentLine;
					}
				}
				
				System.out.println(response);
				}
			catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
			finally {
				try {
				if(lineReader!=null)
				lineReader.close();
				if(reader!=null)
					reader.close();
			} 
				catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
		}
			
		}
	}
//	class FileRead implements Runnable{
//		LineNumberReader lineReader=null;
//		FileReader reader=null;
//		String dir =System.getProperty("user.dir")+"/src/io";
//		File file=new File("README.TXT");
//		String path=dir+file;
//		
//		public FileRead() throws java.io. FileNotFoundException{
//			reader = new FileReader(path);
//			lineReader = new LineNumberReader(reader);
//		}
//		void Read() throws IoException{
//			String str = "";
//			while((str=lineReader.readLine())!=null) {
//				System.out.println(str);
//		}
//		
//	}
//}
//}