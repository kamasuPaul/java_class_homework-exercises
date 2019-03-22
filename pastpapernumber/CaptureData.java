import java.util.Scanner;

public class CaptureData{
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Sale s2 = new Sale();
      s2.name = s.next();
      s2.qty = s.nextDouble();
      s2.price = s.nextDouble();
      s2.printIncome();
  }
}
