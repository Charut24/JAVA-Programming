interface Product
{
    String pname="Reynolds";
    int pcost =10;
}

interface Proddetail extends Product
{
      void showdetails();
}

class Customer implements Proddetail
{
    public void showdetails()
    {
        System.out.println("Product name: "+pname);
        System.out.println("Product cost: "+pcost);
    }
}
public class pro7
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer();
        c1.showdetails();
    }
}
