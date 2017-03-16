import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int[] nums = new int[6];

		System.out.println();
		// 로드
		for (int i = 0; i < 6; i++) {

			nums[i] = rand.nextInt(6) + 1;

			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					System.out.printf("중복  %d %d \n" ,i ,nums[i]);
					
					while(true)
					{
						nums[i] = rand.nextInt(6) + 1;
						
						if (nums[i] != nums[j])
						{
							i--;
							break;
						}
					}
				}
			}
		}
		// 출력
		for (int i = 0; i < nums.length; i++) {
			System.out.printf(" %d", nums[i]);
		}


	}

}
