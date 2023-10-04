import java.util.Scanner;

public class MathematicTable {
    public static void main(String[] args) {
        Scanner table=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=table.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
