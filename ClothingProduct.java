package ecommercesystem;
public class ClothingProduct extends Product{
    private String Size,Fabric ;
    // The Size Setter Method Is Below  
    public void SetSize( String S){
        Size = S;
    }
    // The Size Getter Method Is Below  
    public String GetSize(){
        return Size;
    } 
    // The Fabric Setter Method Is Below  
    public void SetFabric(String F){
        Fabric=F;
    }
    // The Fabric Getter Method Is Below  
    public String GetFabric(){
        return Fabric ;
    }
}