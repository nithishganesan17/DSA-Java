import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int temp=a;
      int count=0;
      while(temp>0){
        count++;
        temp=temp/10;
      }
      int[]arr=new int[count];
      for(int i=count-1;i>=0;i--){
        arr[i]=a%10;
        a=a/10;
      }
      for(int i=0;i<count;i++){
        int fact=0;
        for(int j=1;j<=arr[i];j++){
          if(arr[i]%j==0){
          fact++;
          }
        }
        if(fact==2){
          System.out.print(arr[i]);
        }
      }
    }
}
