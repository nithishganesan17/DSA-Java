import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    for(int i=0;i<a.length();i++){
      char ch=a.charAt(i);
      int count=0;
      for(int j=0;j<a.length();j++){
        char chh=a.charAt(j);
      if(ch==chh){
        count++;
      }
    }
      System.out.println(count +"=" +ch);
    }
  }
}
