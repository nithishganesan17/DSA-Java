import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String[] word=a.split(" ");
    for(int i=0;i<word.length;i++){
      for(int j=word[i].length()-1;j>=0;j--){
        char chh=word[i].charAt(j);
        System.out.print(chh);
      }
      
    System.out.print(" ");
    }
  }
}
