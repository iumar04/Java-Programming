import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.print("Enter the size of an array: ");
        m=sc.nextInt();
        int a[]=new int[m];
        System.out.println("Enter the element of "+m+" size of array: ");
        for (int i=0;i<a.length;i++){
            System.out.print("Index of "+i+" element: ");
            a[i]=sc.nextInt();
        }
        System.out.println("");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        int temp=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(a[i]<a[j]) {
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\nSorted array ascending order: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }

    }
}
