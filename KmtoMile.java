import java.util.Scanner;

public class KmtoMile{
  
  public static void main (String[] args){
    double num,convert;
    System.out.println("Convert Kilometer to Mile");
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Kilometer : ");
    num=sc.nextDouble();
    convert=num*0.6214;
    System.out.printf("Mile : %.5f%n",convert);
  }
}