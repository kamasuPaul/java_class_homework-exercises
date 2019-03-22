package p2;
import p1.All;
public class C extends All {
    public C (){
        /*********** i is not acccessible within this class */
    System.out.println("class c in the another package");

    System.out.println("i is not acccessible within this class since its private to its class");
    System.out.println("j is also not  accessible since its only accessible within the same package");
    /** all others are accesible */
    System.out.println("k is accesible since its procted :. accessible to sublcasses even outside the package");
    System.out.println(k);
    System.out.println("variable l is accessible throughout");
    System.out.println(l);


    }
    
}