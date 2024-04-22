package ecommercesystem;
import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ElectronicProduct Ep = new ElectronicProduct();
        Ep.SetName("Smart Phone");
        Ep.SetProductID(1);
        Ep.SetPrice(599.99f);
        Ep.SetBrand("Samsung");
        Ep.SetWarrantyPeriod(1);
        ClothingProduct Cp = new ClothingProduct();
        Cp.SetName("T-shirt");
        Cp.SetProductID(2);
        Cp.SetPrice(19.99f);
        Cp.SetSize("Medium");
        Cp.SetFabric("Cotton");
        BookProduct Bp = new BookProduct();
        Bp.SetName("oop");
        Bp.SetProductID(3);
        Bp.SetPrice(39.99f);
        Bp.SetAuthor("O' Reilly");
        Bp.SetPublisher("X Publications");
        Customer c = new Customer();
        int MakeOtherOrder = 0;
        int OrderCount = 1;
        do {
            MakeOtherOrder = 0;
            System.out.println("Welcome to the E-Commerce System!");
            System.out.println("Please enter your id ");
            int x = input.nextInt();
            input.nextLine();
            System.out.println("Please enter your name");
            String n = input.nextLine();
            System.out.println("Please enter your address");
            String A = input.nextLine();
            c.SetCustomerId(x);
            c.SetName(n);
            c.SetAddress(A);
            System.out.println("How many products you want to add to your cart ?");
            int y = input.nextInt();
            Cart c1 = new Cart();
            c1.SetnProducts(y);
            c1.SetCustomerId(x);
            input.nextLine();
     for (int i = 0; i < y; i++) {
    System.out.println("Which product would you like to add? 1-SmartPhone 2- T-shirt  3- oop");
    int z = input.nextInt();
    switch (z) {
        case 1:
           c1.AddProduct(Ep);
           break;
        case 2:
            c1.AddProduct(Cp);
             break;
        case 3:
             c1.AddProduct(Bp);
             break;
            default:
               break;
        }
    }
    c1.PlaceOrder();
      int r = input.nextInt();
       if (r == 1) {   
        Order O = new Order(c.GetName(), c.GetCustomerId(), OrderCount, c1.CalculatePrice(), c1.GetProducts());
            O.PrintOrder();
            } 
       else if (r == 2) {
    System.out.println("Do you want to remove a products from the cart or make another order ? 1- remove  2-make another order");
         int choice = input.nextInt();
         switch (choice) {
        case 1:
            System.out.println("What product you want to remove ? 1-SmartPhone 2- T-shirt  3- oop");
       int RemovedProduct = input.nextInt();
            switch (RemovedProduct) {
            case 1:
              c1.RemoveProduct(Ep);
          break;
            case 2:
         c1.RemoveProduct(Cp);
          break;
            case 3:
          c1.RemoveProduct(Bp);
                }
        Order O2 = new Order(c.GetName(), c.GetCustomerId(), OrderCount, c1.CalculatePrice(), c1.GetProducts());    
        O2.PrintOrder();
        break ;
        case 2:
        MakeOtherOrder = 1;
        OrderCount = OrderCount + 1;
        break;
                }
            }
        } while (MakeOtherOrder == 1);
    }
}