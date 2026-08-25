import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String n=a.toUpperCase();
      int vowels=0;
      int cons=0;
      for(int i=0;i<n.length();i++){
       char ch=n.charAt(i);
       if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
        vowels++;
       }
       else{
        cons++;
       }
      }
      System.out.println("Vowels: "+vowels);
       System.out.print("Cons: "+cons);
    }
}
