import java.util.Scanner;

public class Sales{
 String productName;
    int quantity;
    double price,totalAmout;
    public void captureSale(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter product name");
        productName = scanner.next();
        System.out.println("enter price");
        price = scanner.nextDouble();
        System.out.println("enter quantity");
        quantity = scanner.nextInt();
        totalAmout = price*quantity;
        System.out.print("total amout: ");
        System.out.println(totalAmout);

    }
    public static void main(String[] args){
        Sales msales = new Sales();
        msales.captureSale();
    }
}