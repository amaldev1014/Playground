import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner scan = new Scanner(System.in);
      String string = scan.nextLine();
      String replace = scan.nextLine();
      String add = scan.nextLine();
      String out =string.replace(replace,add);
      System.out.println(out);
    }
}