package ecommercesystem;
public class BookProduct extends Product{
    private String Author,Publisher;
    // The Author Setter Method Is Below 
    public void SetAuthor(String A){
        Author = A;
    }
    // The Author Getter Method Is Below 
    public String GetAuthor(){
        return Author;
    }
    // The Publisher Setter Method Is Below 
    public void SetPublisher( String P){
        Publisher=P;
    }
    // The Publisher Getter Method Is Below 
    public String GetPublisher(){
        return Publisher;
    }
}