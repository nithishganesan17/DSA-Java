import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String rev="";
    for(int i=a.length()-1;i>=0;i--){
      rev=rev+a.charAt(i);
    }
    if(a.equals(rev)){
      System.out.print("Palindrome");
    }
    else{
      System.out.print("not palindrome");
    }
  }
}
