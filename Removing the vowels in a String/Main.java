import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
   String string = scan.nextLine();
   int n = string.length();
    StringBuilder builder = new StringBuilder("");
    for(int i=0;i<n;i++)
   {
      char ch = string.charAt(i);
     if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
     {
       builder.append(ch);
     } 
   }
    System.out.println(builder);
  }
}