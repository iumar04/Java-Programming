import java.util.Arrays;
import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
//        check enterd character is upper case or not
        char alp;
        Scanner check=new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        alp=check.next().charAt(0);
        if(alp>64 && alp<91){
            System.out.println("Upper Case");
        }
        else if (alp>96 && alp<123) {
            System.out.println("Lower Case");
        }
        else System.out.println("It's not a Alphabet");
    }
}
