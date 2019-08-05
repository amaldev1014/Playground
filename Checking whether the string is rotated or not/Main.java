import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner scan = new Scanner(System.in);
       String string1 = scan.nextLine();
       String string2 = scan.nextLine();
       String string3 = string1.concat(string1);
    
      if(string3.contains(string2))
      {
        System.out.println("Yes");
      }
      else{System.out.println("No");}
       
    }
}