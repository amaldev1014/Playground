import java.util.Scanner;
class Main{
  public static void main(String args[]){
    
    
     Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int col = scan.nextInt();
    int mat1[][] = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        mat1[i][j] = scan.nextInt();
      }
    }
    
    int tra[][] = new int[col][row];
    for(int a=0;a<row;a++)
    {
      for(int b=0;b<col;b++)
      {
        tra[b][a] = mat1[a][b];
      }
    }
    
     for(int t=0;t<row;t++)
    {
      for(int h=0;h<col;h++)
      {
       System.out.print(tra[t][h]+" ");
      }
       System.out.println();
    }
  }
}