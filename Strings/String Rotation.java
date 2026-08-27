import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    if(a.length()==b.length() && (a+a).contains(b)){
      System.out.print("Rotation");
    }
    else{
      System.out.print("Not Rotation");
    }
  }
}
