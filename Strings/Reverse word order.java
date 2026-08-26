import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String[] n=a.split(" ");
      for(int i=0;i<n.length;i++){
          for(int j=i+1;j<n.length;j++){
            if(n[i].length()>n[j].length()){
              String temp=n[j];
              n[j]=n[i];
              n[i]=temp;
            }
          }
      }
          for(int i=0;i<n.length;i++){
            System.out.print(n[i] +" ");
          }
    }
}
