 class Sale{
    String name;
    double qty;
    double price;
    public final int TAX = 350;
    
    public void printIncome(){
        double income = (price*qty)-TAX;
        System.out.println(income);
    }
}