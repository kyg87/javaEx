package struct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BmpProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("res/dogbird.bmp"); 

		
		byte[] fileHeader = new byte[14];
		
		fis.read(fileHeader);
		
		byte[] bmpHeader = new byte[92];
		
		fis.read(bmpHeader);
		

		
		int fileSize;
		
		fileSize = getFileSize(fileHeader);
		
		System.out.printf( "%d", fileSize);
		
		int fileWidth;
		
		fileWidth = (((int)bmpHeader[7]) ) << 24 & 0xff000000
				| (((int)bmpHeader[6]) << 16 & 0x00ff0000
				| (((int)bmpHeader[5])  << 8 & 0x0000ff00
				| (((int)bmpHeader[4])  << 0 & 0x000000ff))); 
		
		System.out.println();
		System.out.printf( "%d", fileWidth);
		
//		System.out.println(fis);

	}

	public static int getFileSize(byte[] fileHeader) {
		// TODO Auto-generated method stub
		
		int fileSize;
		
		fileSize = (((int)fileHeader[5]) ) << 24 & 0xff000000
				| (((int)fileHeader[4]) << 16 & 0x00ff0000
				| (((int)fileHeader[3])  << 8 & 0x0000ff00
				| (((int)fileHeader[2])  << 0 & 0x000000ff))); 
		
		return fileSize;
	}

}
