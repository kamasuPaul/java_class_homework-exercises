package p1;
public class All{
    private String i = "am only accessible inside my class";
    String j = "am only accessible within my package";
    protected String k = "am accessible within all classess in my package and even outside subclasses";
    public String l = "am available to all classes unless am not imported in aclass";
    public static void main(String [] args){
      
        //******* i is only accessible in this class since its private */
        System.out.println(i);
        //******** also all the other variables are acccessible in here */
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);


    }
    
}