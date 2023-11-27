import java.util.Scanner;

public class MulMatrix {
    public static void inputMatrix(int[][] inMat){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<inMat.length;i++){
            for (int j=0;j< inMat[i].length;j++){
                System.out.print("Index of ("+i+","+j+") element: ");
                inMat[i][j]=sc.nextInt();
            }
        }
    }
    public static void displayMatrix(int[][] mat){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j< mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of square matrix: ");
        int m=sc.nextInt();
        int a[][]=new int[m][m];
        int b[][]=new int[m][m];
        //input of first matrix
        System.out.println("Enter the element of first matrix: ");
        inputMatrix(a);
        //input of second matrix
        System.out.println("Enter the element of second matrix: ");
        inputMatrix(b);
        //output of first matrix
        System.out.println("First Matrix:");
        displayMatrix(a);
        //output of second matrix
        System.out.println("Second Matrix:");
        displayMatrix(b);
        //Multiply of both matrix
        int mul[][]=new int[m][m];
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                for (int k=0;k<m;k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        //output of Multiplied matrices
        System.out.println("Multiplied Matrix: ");
        displayMatrix(mul);
    }

}
