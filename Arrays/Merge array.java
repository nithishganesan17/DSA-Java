import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int[]n=new int[a];
      int b=sc.nextInt();
      int[]m=new int[b];
      for(int i=0;i<a;i++){
        n[i]=sc.nextInt();
      }
      for(int i=0;i<b;i++){
        m[i]=sc.nextInt();
      }
      int[]result=new int[a+b];
      for(int i=0;i<a;i++){
        result[i]=n[i];
      }
      for(int i=0;i<b;i++){
        result[a+i]=m[i];
      }
      for(int i=0;i<result.length;i++){
      System.out.print(result[i]+" ");
      }
    }
}
