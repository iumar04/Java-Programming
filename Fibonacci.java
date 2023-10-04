import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Term: ");
        int n=sc.nextInt();
        int next,f1=0,f2=1;
        for(int i=0;i<n;i++){
            if(i<=1)
                next=i;
            else {
                next = f1 + f2;
                f1 = f2;
                f2 = next;
            }
                System.out.println(next);
        }
    }
}
