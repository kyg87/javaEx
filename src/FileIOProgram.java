import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIOProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis = new FileInputStream("res/khw.khw");
		
		Scanner scan = new Scanner(fis);

		int num;
		
		int sum  = 0;
		
		int count = 0;
		while(scan.hasNext())
		{
			num = scan.nextInt();
			
			if(count < 3)
			{
				sum += num;
				count ++;
			}
			
			System.out.printf("num : %d \n", num);
			
		}
		
		num = 0;
		for(int i = 0 ; i < 3 ;i++)
		{
			sum += num;
		}
		
		System.out.printf("รัวี : %d " ,sum);

		fis.close();
		scan.close();

		
	}

}
