package org.imarticus.fsd.jun14;

import java.io.FileOutputStream;
import java.io.IOException;

//Byte Stream
public class FileOutStream {
	public static void main(String[] args) throws IOException {
		
		//try Header is used when we deal with external services. Eg - Scanner, FileOutputStream
		/*
		 * try(resource){
		 * 	execution code
		 * }
		 * 
		 * Now, you will need not close resources manually.
		 */
		try(FileOutputStream fos = new FileOutputStream("D:/Eclipse_workspace/ByteStreamFileCreate.txt")){
			String str = "some more text";
			byte[] b = str.getBytes();
			fos.write(b);
			System.out.println("Byte Stream - End");
			fos.close();
		};	
	}
}
