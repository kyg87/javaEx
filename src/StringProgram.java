import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("res/script.txt");

		Scanner scan = new Scanner(fis);

		Scanner scanInput = new Scanner(System.in);

		String line;

		String serchString = null;

		System.out.print("찾을 단어를 입력하세용 \n");
		serchString = scanInput.nextLine();
		int count = 0;
		
		while (scan.hasNext()) {

			line = scan.nextLine();

			count++;
			if (line.indexOf(serchString) > 0)
			{
				System.out.println(count + " " + line.replace(serchString, "[" + serchString +"]"));
				
			}
		}

	}

}
