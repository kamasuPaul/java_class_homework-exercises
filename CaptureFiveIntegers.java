import java.util.Scanner;
public class CaptureFiveIntegers {
   public static void main(String[] args){
    int[] values = new int[5];
    Scanner s = new Scanner(System.in);
    System.out.println("enter five integers");
    for(int i =0;i<5;i++){
        System.out.printf("enter %d integer: ",i+1);
        values[i] = s.nextInt();
    }

    for(int i = 0;i<values.length;i++){
        for(int j=i+1;j<values.length;j++){
            if(values[i] < values[j]){
                int temp = values[j];
                values[j] = values[i];
                values[i] = temp;
            }

        }
        
    }
    for(int i = values.length-1;i>0;i--){
        System.out.println(values[i]);
    }
   }
}