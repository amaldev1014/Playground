//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price )
  {
    this.price = price;
  }
  
  public int getPrice()
  {
    return this.price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product )
  {
    this.product = product;
  }
  
  public String getProduct()
  {
    return this.product;
  }
  
  public void setQuantity(int quantity )
  {
    this.quantity = quantity;
  }
  
  public int getQuantity()
  {
    return this.quantity;
  }
}

class Bill
{
  public void bill(int quantity, int price)
  {
    int result = quantity * price;
    System.out.println("Total Price is : "+result);
  }

}
class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String product = scan.next();
    int price = scan.nextInt();
    int quantity = scan.nextInt();
    
    Item i = new Item();
    i.setPrice(price);
    Customer c = new Customer();
    c.setProduct(product);
    c.setQuantity(quantity);
    Bill obj = new Bill();
    obj.bill(quantity, price);
    //write the logic here
  }
}