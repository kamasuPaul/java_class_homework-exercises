import java.util.Scanner;

public class Matrix{
    public static void main(String[] args){
        double [][] matrix = new double[2][2];
        // matrix[0][0] =3;
        // matrix[0][1] =5;
        // matrix[1][0] =3;
        // matrix[1][1] =4;
        //get the values from the keyboard
        Scanner s = new Scanner(System.in);
        for(int i =0;i<2;i++){
            System.out.printf("%d row values:",i+1);
            System.out.println();
            for(int j=0;j<2;j++){
                matrix[i][j]=s.nextInt();
                
            }
            System.out.println();
        }
        
        System.out.println("............................");
        System.out.println(" matrix values");
        System.out.println("............................");
        for(int i =0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.printf("%.2f ",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("............................");
        System.out.println("determinant");
        System.out.println("............................");
        System.out.println(getDeterminant(matrix));
        System.out.println("............................");
        System.out.println("inverse of the matrix");
        System.out.println("............................");
        makeInverse(matrix);
    }
    public static double getDeterminant(double[][]array){
        double det = array[0][0]*array[1][1] - array[0][1]*array[1][0];
        return det;
    }
    public static void makeInverse(double[][]array){
        //first swap the 00 and 11 indecies
        double det =getDeterminant(array);
        if(det==0){
            System.out.println("the matrix has no inverse since the determinant is 0");
            return;
        }
        double temp = array[1][1];
        array[1][1] =array[0][0];
        array[0][0] = temp;
        // then make 01 and 10 negative
        array[0][1] = array[0][1]*-1;
        array[1][0] = array[1][0]*-1;
        //divide everything with the determinant ie multipy everything by one over the determinant
        for(int i =0;i<2;i++){
            for(int j=0;j<2;j++){
                array[i][j] = array[i][j]/det;
            }
        }
        for(int i =0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.printf("%.2f ",array[i][j]);
            }
            System.out.println();
        }
        // return array;
    }
}