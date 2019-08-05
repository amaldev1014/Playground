import java.util.Scanner;
class Main{
    public static void main(String args[]){
      
      Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int array[] = new int[size];
      for(int i=0;i<size;i++)
      {
        array[i]=scan.nextInt();
      }
      int largest = array[0];
      for(int i=1;i<size;i++)
      {
        if(array[i]>largest)
        {
          largest=array[i];
        }
      }
      System.out.println(largest);
    }
}