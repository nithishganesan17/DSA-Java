import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int[]n=new int[a];
      for(int i=0;i<a;i++){
        n[i]=sc.nextInt();
      }
      int odd=0;
      int even=0;
      for(int i=0;i<a;i++){
         if(n[i]%2==0){
          even++;
         }
         else{
          odd++;
         }
      }
      System.out.println("Even numbers are "+even);
      System.out.print("Odd numbers are "+odd);
    }
}
