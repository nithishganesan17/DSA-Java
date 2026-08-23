import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int[]n=new int[a];
      int target=sc.nextInt();
      for(int i=0;i<a;i++){
        n[i]=sc.nextInt();
      }
        for(int j=0;j<a;j++){
          if(target==n[j]){
            System.out.print("target found in "+j+" index");
          }
        }
    }
}
