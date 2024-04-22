package ecommercesystem;
public class Customer {
    private int CustomerId;
    private String Name;
    private String Address;
    // The CustomerId Setter Method Is Below
    public void SetCustomerId(int ID){
        if(ID>0){
         CustomerId=ID;   
        }
        else if (ID<0){
            CustomerId=Math.abs(ID);
        }
    }
    // The CustomerId Getter Method Is Below
    public int GetCustomerId(){
        return CustomerId;
    }
    // The Name Setter Method Is Below
    public void SetName( String n){
        Name = n ;
    }
    // The Name Getter Method Is Below
    public String GetName(){
        return Name;
    }
    // The Address Setter Method Is Below
    public void SetAddress( String Ad){
        Address= Ad;
    }
    // The Address Getter Method Is Below
    public String GetAddress(){
        return Address;
    }   
}