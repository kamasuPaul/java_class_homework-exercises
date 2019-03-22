package p1;
import p2.*;
public class All{
    private static String i = "am only accessible inside my class";
    static String j = "am only accessible within my package";
    static protected String k = "am accessible within all classess in my package and even outside subclasses";
    static public String l = "am available to all classes unless am not imported in aclass";
    public static void main(String [] args){
      
        //******* i is only accessible in this class since its private */
        System.out.println(i);
        //******** also all the other variables are acccessible in here */
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
       B b = new B();
       C c = new C();
       D d = new D();
       E e = new E();


    }
    
}