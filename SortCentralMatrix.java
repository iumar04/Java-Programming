/*Program to Sort Non boundaries element of square matrix and
* display the original matrix,rearranged matrix and diagonal element with their sum*/
import java.util.*;
public class SortCentralMatrix {
    public static void displayMatrix(int[][] mat){
//        for (int[] x : mat) {
        for(int i=0;i<mat.length;i++){
            for (int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
//              System.out.print(x[j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       int c,m,temp;
       Scanner sc=new Scanner(System.in);
       //Enter size of square matrix
       System.out.print("Enter the size of Square matrix m>3 and m<10: ");
       m=sc.nextInt();
       //condition for entered wrong size of matrix
       if((m<=3)||(m>=10)){
           System.out.println("You enter wrong size of matrix");
           System.exit(0);
       }
       int[][] a=new int[m][m];
       //Enter the element of m size of matrix
       System.out.print("\nEnter the element of "+m+"x"+m+" Matrix: ");
             for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++){
               a[i][j]=sc.nextInt();
               
           }
       }
      //Print the entered element
       System.out.println("Original Matrix");
       displayMatrix(a);
       //Counting Non-Boundaries Element
        int h=0;
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               if((i!=0)&&(i!=m-1)&&(j!=0)&&(j!=m-1))
               {
              h++;
               }
           }
       }
       int[] b=new int[h];
       c=0;
       //Collect non-boundaries element and store in 1d array
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               if((i!=0)&&(i!=m-1)&&(j!=0)&&(j!=m-1))
               {
              b[c++]=a[i][j];
               }
           }
       }
       //Sorting the element of array
       Arrays.sort(b);
       for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]>b[j])
                {
                temp=b[i];
                b[i]=b[j];
                b[j]=temp;
                }
            }
        }
        //Store the sorted element in 2d array
        c=0;
        for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               if((i!=0)&&(i!=m-1)&&(j!=0)&&(j!=m-1))
               {
              a[i][j]=b[c++];
               }
           }
       }
        //Print the sorted matrix
        System.out.println("Rearranged Matrix");
        displayMatrix(a);
        //Sum of diagonal element
        int sumd1=0;
        int sumd2=0;
        for (int i = 0; i < a.length; i++) {
            sumd1 += a[i][i];
            sumd2 += a[i][m-1-i];
        }
        System.out.println("Sum of diagonal element:"+(sumd1+sumd2));
    }
}