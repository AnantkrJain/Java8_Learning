package org.imarticus.fsd.jun14;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:/Eclipse_workspace/Hello.txt");
		int i;
		while((i = fr.read()) != -1) {
			System.out.println((char)i);
		}
		fr.close();
	}
}
