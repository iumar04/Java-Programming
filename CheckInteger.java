import java.util.Scanner;

class CheckInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        if(sc.hasNextInt()){
            int num=sc.nextInt();
            System.out.println(num+" is an Integer");
        }else {
            String input=sc.next();
            System.out.println(input+" is not an Integer");
        }
    }
}
