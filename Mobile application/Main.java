class MyModel1 {
    int camera = 2;
    int display = 5;
  public MyModel1 ()
  {
    System.out.println("Features of MyModel 1");

    System.out.println("Camera mega pixels: "+camera);
  }
}
class MyModel2 extends MyModel1 {
     int camera =5;
  String lock = "Fingerprint";
  
   public MyModel2 ()
  {
    System.out.println("Features of MyModel 2");

    System.out.println("Camera mega pixels: "+camera);
     System.out.println("Lock mechanism: "+lock);
     System.out.println("Display size: "+display);
  }
}
class MyModel2T extends MyModel2 {
   int camera = 16;
  int display = 6;
  
  public MyModel2T ()
  {
    System.out.println("Features of MyModel 2T");

    System.out.println("Camera mega pixels: "+camera);
     System.out.println("Lock mechanism: "+lock);
     System.out.println("Display size: "+display);
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
           MyModel2T model = new  MyModel2T();
    }
}