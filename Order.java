package ecommercesystem;
public class Order {
    private int CustomerId;
    private int OrderID;
    private float Total ;
    private String CustomerName;
    private Product[] products;
    public Order(String CustomerName, int CustomerId,int OrderID,float Total,Product[] products){
        this.CustomerId=Math.abs(CustomerId);
        this.OrderID=Math.abs(OrderID);
        this.Total=Math.abs(Total);
        this.products=products;
        this.CustomerName=CustomerName;
    }
    // The PrintOrder Method Is Below 
    float total=0;
    public void PrintOrder(){
            System.out.println("Here's Your Order's summary:");  
            System.out.println("Order ID:"+OrderID);
            System.out.println("Customer Namee: "+ CustomerName );
            System.out.println("Customer ID:"+ CustomerId);
            System.out.println("Products:");
            for(int i=0;i<products.length;i++){
                if(products[i]!=null){
                    System.out.println(products[i].GetName()+"- $"+products[i].GetPrice());
                    total=total+products[i].GetPrice();
                }
            }
            System.out.println("total price: "+total);
   
    }
}