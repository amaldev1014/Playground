import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
         Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int n = string.length(); 
        int alpha[] = new int[27];
      for(int b=0;b<26;b++)
      {
        alpha[b]=0;
      }
        for(int i=0;i<n;i++)
        {
          int offset=0;
          char ch = string.charAt(i);
          if(ch>='a' && ch<='z'){
         offset = ch-'a';
          }
          if(ch>='A' && ch<='Z'){
           offset = ch-'A';
          }
         alpha[offset]++;
      
          
        }
      for(int j=0;j<n;j++)
      {
        int key=0;
        char t = string.charAt(j);
        if(t>='a' && t<='z'){
         key = t-'a';
        }
       if(t>='A' && t<='Z'){
         key = t-'A';
        }
        if(alpha[key]!=0){
        int u= alpha[key];
        alpha[key]=0;
        
          int g ='a'+key;
          char d =(char)g;
          
          System.out.print( d+""+u+" ");
        }
        }
    }
}