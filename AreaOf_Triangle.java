import java.util.Scanner;

public class AreaOf_Triangle {
    public static void main(String[] args) {
        float base,height,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Base and Height: ");
        base=sc.nextFloat();
        height=sc.nextFloat();

        area=base*height*1/2;
        System.out.println("Area of Triangle: "+area);
        area();
    }
    static void area(){
        float S;
        double area;
        System.out.print("Enter the sides of triangle: ");
        Scanner side=new Scanner(System.in);
        int a=side.nextInt();
        int b=side.nextInt();
        int c=side.nextInt();

        S=(a+b+c)/2f;
        area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Area is: "+area);
    }
}
