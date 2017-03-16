import java.util.Scanner;

class Hello {
	public static void main(String[] args) {
		int kor = 0;
		int math = 0;
		int eng = 0;

		int total = kor + math + eng;

		float avg = total / 3;

		int menu = 0;

		Scanner scan = new Scanner(System.in);

		 최성환 :while (true) {
			System.out.println(
					" ┌────────────────────────────────────────────────────────────────────────────────────────────────────");
			System.out.println(
					" │                                                                                                   │");
			System.out.println(
					" │                                           메인 메뉴                                                                                       │");
			System.out.println(
					" │                                                                                                   │");
			System.out.println(
					" └────────────────────────────────────────────────────────────────────────────────────────────────────");

			System.out.printf("1.성적 입력 \n");
			System.out.printf("2.성적 출력 \n");
			System.out.printf("3.종료 \n");
			System.out.print("선택 > :");
			menu = scan.nextInt();

			switch (menu) {

				
				case 1: {
					System.out.println(
							" ┌────────────────────────────────────────────────────────────────────────────────────────────────────");
					System.out.println(
							" │                                                                                                   │");
					System.out.println(
							" │                                                                                                   │");
					System.out.println(
							" │                                           성적 입력                                                                                       │");
					System.out.println(
							" │                                                                                                   │");
					System.out.println(
							" └────────────────────────────────────────────────────────────────────────────────────────────────────");
	
					// System.out.println("한줄 띄운다\n");
					System.out.printf(" 국어 : ");
					kor = scan.nextInt();
	
					do
					{
						System.out.printf(" 국어 : ");
						kor = scan.nextInt();
						if(kor > 100 || kor < 0)
						System.out.println("유효범위내에 점수를 입력하세요 0~100");
					}
					while (kor > 100 || kor < 0);
	
					System.out.printf(" 수학 : ");
					math = scan.nextInt();
					System.out.printf(" 영어 : ");
					eng = scan.nextInt();
					
					break;
				}
				case 2: {
					total = kor + math + eng;
	
					avg = total / 3;
	
					System.out.println(
							" ┌────────────────────────────────────────────────────────────────────────────────────────────────────");
					System.out.println(
							" │                                                                                                   │");
					System.out.println(
							" │                                                                                                   │");
					System.out.println(
							" │                                           성적 출력                                                                                       │");
					System.out.println(
							" │                                                                                                   │");
					System.out.println(
							" └────────────────────────────────────────────────────────────────────────────────────────────────────");
					
					for(int i = 0; i < 3; i++)
					{
						System.out.printf(" 국어 : %d\n", kor);
						System.out.printf(" 수학 : %d\n", math);
						System.out.printf(" 영어 : %d\n", eng);
						System.out.printf(" 총점 : %d\n", total);
						System.out.printf(" 평균 : %f\n", avg);
					}
					break;
				}
				case 3:
				{
					System.out.println("bye~");
					break 최성환;
				}
				default:
					
					System.out.println("빠져나가냐?");
				
				
					
				
			}

		}

	}

}