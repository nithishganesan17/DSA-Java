import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int[]n=new int[a];
      for(int i=0;i<a;i++){
        n[i]=sc.nextInt();
      }
      int small=n[0];
      for(int i=1;i<a;i++){
      if(n[i]<small){
        small=n[i];
      }
    }
      System.out.print(small);
  }
}
