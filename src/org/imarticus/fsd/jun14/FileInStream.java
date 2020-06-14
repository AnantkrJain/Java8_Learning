package org.imarticus.fsd.jun14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Byte Stream
public class FileInStream {
	public static void main(String[] args){
		
		System.out.println("Start");
		String file = "D:/Eclipse_workspace/Hello.txt";
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			while(fis.available() > 0) {
				System.out.println((char)fis.read());
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
