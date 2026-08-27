import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    char[]n=a.toCharArray();
    char[]m=b.toCharArray();
    Arrays.sort(n);
    Arrays.sort(m);
    if(Arrays.equals(n,m)){
      System.out.print("Anagram");
    }
    else{
      System.out.print("Not anagram");
    }
  }
}
