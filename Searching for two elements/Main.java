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
      while(scan.hasNext())
      {
        boolean is = false;
        int search_key=scan.nextInt();
        for(int i=0;i<size;i++)
        {
          if(array[i]==search_key)
          {
            System.out.println(i);
            is = true;
            break;
          }
         
        }
        if(!is)
        {
        System.out.println(-1);}
      }
      
    }
}