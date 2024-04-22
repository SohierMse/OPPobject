package ecommercesystem;
public class Cart {
    private int CustomerId;
    private int nProducts;
    private Product[] products;
    // The CustomerId Setter Method Is Below
    public void SetCustomerId(int ID) {
        if (ID > 0) {
            CustomerId = ID;
        } else if (ID < 0) {
            CustomerId = Math.abs(ID);
        }
    }
    //  The CustomerId Getter Method Is Below
    public int GetCustomerId() {
        return CustomerId;
    }
    // The nProducts Setter Method Is Below
    public void SetnProducts(int n) {
        if (n > 0) {
            nProducts = n;
        } else if (n < 0) {
            nProducts = Math.abs(n);
        }
        products = new Product[nProducts];
    }
    // The nProducts Getter Method Is Below 
    public int GetnProducts() {
        return nProducts;
    }
    // The AddProduct Method Is Below 
    public void AddProduct(Product product) {
        for (int i = 0; i < nProducts; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }
    // The RemoveProduct Method Is Below
    public void RemoveProduct(Product product) {
        for (int i = 0; i < nProducts; i++) {
            if (products[i] == product) {
                products[i] = null;
            }

        }
    }
    // The [] products Getter Method Is Below
    public Product[] GetProducts() {
        return products;
    }
    //The CalculatePrice Method Is Below
    public float CalculatePrice() {
        float total = 0;
        for (int i = 0; i < nProducts; i++) {
            if (products[i] != null) {
                total = total + products[i].GetPrice();
            }
        }
        return total;
    }
    // The PlaceOrder Method Is Below
    public void PlaceOrder() {
         System.out.println("Your total is $" + CalculatePrice() + ". Would you like to place the order? 1-yes 2-no");
    }
}