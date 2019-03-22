package work;
public class Animal{
    public void eat(){
        System.out.println("i can eat anything");
    }
    /**
     * eat method is overloaded here
     */
    public void eat(String food){
        System.out.println("i only eat"+food);
    }
    protected void eating(){
        System.out.println("am eating from animal class");
    }
}