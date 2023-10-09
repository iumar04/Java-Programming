import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Range ");
        int start= sc.nextInt();
        int end=sc.nextInt();

        for(int i=start;i<=end;i++){
            if(checkArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean checkArmstrong(int num){
        int remainder,result=0;
        int originalNum=num;
        int numberOfDigit=(int) Math.log10(num)+1;

        while(num>0){
            remainder=num%10;
            result+= (int) Math.pow(remainder,numberOfDigit);
            num/=10;
        }
        return result==originalNum;
    }
}
