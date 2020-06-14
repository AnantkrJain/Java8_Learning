package org.imarticus.fsd.jun14;

import java.io.FileWriter;
import java.io.IOException;

//Character Stream
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:/Eclipse_workspace/CharacterStreamFileCreate.txt");
		fw.write("Hi there, Anant this side");
		fw.close();
		System.out.println("File Stream - End");
	}
}
