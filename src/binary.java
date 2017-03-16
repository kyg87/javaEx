import java.util.Scanner;

public class binary {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int ipt_num = 0, cnt = 0;
      int[] binary = new int[99];
      String res ="";
      
      ipt_num = scan.nextInt();
      
      while(ipt_num != 1){
         binary[cnt] = ipt_num % 2;
         ipt_num /= 2;
         cnt++;
      }
      
      res = change(ipt_num);
      for(int i = cnt-1; i >= 0; i--){
         res += binary[i];
      }
      
      System.out.println(res);
   }
   
   public static String change(int num){
      
      return num+"";
   }
}