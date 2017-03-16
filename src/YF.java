
public class YF {

	public static void main(String[] args)
	{
		int a = setValue();

		int b = setValue();
		
		int sum = numSum(a , b);
		
		printNum(sum);
	}
	
	public static int setValue(){
		
		return 3;
	}
	public static int numSum(int a, int b){
		
		return a+b;
		
	}
	
	public static void printNum (int sum){
		
		System.out.printf("%d", sum);
	}
	
}
