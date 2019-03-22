package p2;
import p1.All;
public class D {
    public D (){
        /*********** i is not acccessible within this class */
    System.out.println("class D in the another package");

    System.out.println("i is not acccessible within this class since its private to its class");
    System.out.println("j is also not  accessible since its only accessible within the same package");
    /** all others are accesible */
    System.out.println("k is not accesible since its procted & this is not asublass of its parent");
    System.out.println("variable l is accessible throughout");
    System.out.println(All.l);


    }
    
    
}