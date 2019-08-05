import java.util.Scanner;
import java.util.Arrays;
class Main 
{
  public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       int array[] = new int[n+1];
    int odd[] = new int[n+1];
    int even[] = new int[n+1];
    int ocount=0;
    int ecount=0;
    for(int i=1;i<=n;i++)
        {
          array[i] = scan.nextInt();
    }
    int rotate = scan.nextInt();
   
         for(int i=1;i<=n;i++)
        {
          
           if(i%2==1)
           {
             odd[ocount]=array[i];
           ocount++;
           }
           else
           {
             even[ecount]=array[i];
             ecount++;
            
           }
           
         }
    
    
         even=rotateLeft(ecount,even,rotate);
         odd=rotateRight(ocount,odd,rotate);
    
    ecount=0;
    ocount=0;
        for(int k=1;k<=n;k++)
        {
          if(k%2==1)
          {
            
            array[k]=odd[ocount];
            ocount++;
          }
          else
          {
            array[k]=even[ecount];
            ecount++;
          }
        }
    
    for(int l=1;l<=n;l++)
    {
      System.out.print(array[l]+" ");
    }
    
    
    
  	}
  public static int[] rotateLeft(int n, int[] barray, int rotate)
  {
    for(int j=0;j<rotate;j++){
    int temp = barray[0];
    for(int i=1;i<=n;i++)
    {
      barray[i-1]=barray[i];
    }
    barray[n-1]=temp;
    }
    return barray;
  }
  
  public static int[] rotateRight(int n, int[] carray, int rotate)
  {
    for(int j=0;j<rotate;j++){
    int temp = carray[n-1];
    for(int i=n-2;i>=0;i--)
    {
      carray[i+1]=carray[i];
    }
    carray[0]=temp;
    }
    return carray;
  
  	}
}