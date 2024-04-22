package ecommercesystem;
public class Product {
    protected int ProductID;
    protected String Name;
    protected float Price;
    // The Id Setter Method Is Below  
    public void SetProductID(int id){
        if(id>0){
        ProductID=id;}
        else if (id<0){
            ProductID=Math.abs(id);
        }
    }
    // The Id Getter Method Is Below  
    public int GetProductID(){
        return ProductID;
    }
    //  The Name Setter Method Is Below  
    public void SetName(String n){
        Name=n;
    }
    //  The Name Getter Method Is Below  
    public String GetName(){
        return Name;
    }
    // The Price Setter Method Is Below  
    public void SetPrice(float p){
        if(p>0){
        Price=p;}
        else if (p<0){
            Price=Math.abs(p);
        }
    }
    // The Price Getter Method Is Below  
    public float GetPrice(){
        return Price;
    }   
}