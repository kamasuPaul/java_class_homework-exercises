package p1;
public class B {
    /*********** i is not acccessible within this class */
    System.out.println("class B within the same package");

    System.out.println("i is not acccessible within this class since its private to its class");
    /** all others are accesible */
    System.out.println("");
    System.out.println(j);
    System.out.println();
    System.out.println(k);
    System.out.println();
    System.out.println(l);



}