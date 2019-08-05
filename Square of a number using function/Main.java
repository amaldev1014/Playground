import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner scan = new Scanner(System.in);
     int n=scan.nextInt();
      int square_of_number = square(n);
      System.out.println(square_of_number);
	} 
 static int square(int n)
  {
    int do_square = n*n;
    return do_square;
  }
}