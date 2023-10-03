import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        long fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number (out of 20): ");
        n=sc.nextInt();
        if (n==0){
            System.out.println("Factorial of the Number: 1");
        }
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

        System.out.println("Factorial of the Number: "+fact);
        }
    }
}

