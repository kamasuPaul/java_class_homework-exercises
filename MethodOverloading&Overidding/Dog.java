package work;

public class Dog extends Animal{
    /**
     * @Override this method overriding amethod 
     * in the animal class
     * it is also increasing the visibility from protected 
     * to public
     */
    public void eating(){
        System.out.print("am eating from the dog class");
    }
}