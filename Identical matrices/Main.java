import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int col = scan.nextInt();
    int arr[][] = new int[row][col];
    
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j] = scan.nextInt();
      }
    }
    
     int arr1[][] = new int[row][col];
    
    for(int k=0;k<row;k++)
    {
      for(int l=0;l<col;l++)
      {
        arr1[k][l] = scan.nextInt();
       
      }
    }
    
    boolean is_ide = true;
    
      for(int a=0;a<row;a++)
    {
      for(int b=0;b<col;b++)
      {
        if(arr[a][b] != arr1[a][b])
        {
          
          is_ide = false;
        
        }
      }
    }
    if(is_ide)
    {
      System.out.println("Yes");
     
    }
    else{ System.out.println("No");
    }
    
  }
}