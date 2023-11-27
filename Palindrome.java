import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number:");
        long num=sc.nextInt();
        long  rem,sum=0;
        long temp=num;
        while(num>0){
            rem=(long)num%10;
            sum=(long)(sum*10)+rem;
            num/=10;
        }
        if(temp==sum){
            System.out.println("Paindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}