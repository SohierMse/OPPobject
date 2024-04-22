package ecommercesystem;
public class ElectronicProduct extends Product {
    private String Brand;
    private int WarrantyPeriod ;
    //The Brand Setter Method Is Below  
    public void SetBrand( String B){
        Brand = B;
    }
    // The Brand Getter Method Is Below  
    public String GetBrand(){
        return Brand;
    }
    //  The WarrantyPeriod Setter Method Is Below  
    public void SetWarrantyPeriod(int WP){
        if(WP>0){
            WarrantyPeriod=WP;
        }
        else if (WP<0){
            WarrantyPeriod=Math.abs(WP);
        }    
    }
    // The WarrantyPeriod Getter Method Is Below    
    public int GetWarrantyPeriod(){
        return WarrantyPeriod;
    } 
}