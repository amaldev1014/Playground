import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
	String string = scan.nextLine();
	int n = string.length();
	int alpha[] = new int[27];
	for(int i=0;i<n;i++)
	{
	    int offset = 26;
	    char ch = string.charAt(i);
	  
	    if(ch>='a' && ch<='z' ){
	     offset = ch-'a';
	    }
	    if(ch>='A' && ch<='Z')
	    {
	        offset = ch - 'A';
	    }
	    
	    alpha[offset]=1;
	   
	}
	
	
	 int l = 0;
	    int k = 0; 
	    for(int j=0;j<26;j++)
	    {
	        
	        l=alpha[j];
	        
	        if(l==0)
	        {
	            k= 97+j; 
	            char m = (char)k;
	            System.out.print(m+" ");
	        }
	        
	    }
    }
}