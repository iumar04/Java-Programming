import java.util.Scanner;

public class AreaOf_Cuboid {
    public static void main(String[] args) {
        Scanner cube=new Scanner(System.in);
        int breadth,length,height;
        int area,volume;
        System.out.print("Enter length breadth height of a Cuboid: ");
        length= cube.nextInt();
        breadth= cube.nextInt();
        height= cube.nextInt();

        area=2*(length*breadth+breadth*height+height*length);
        volume=length*breadth*height;

        System.out.println("Area of Cuboid: "+area);
        System.out.println("Volume of Cuboid: "+volume);

    }
}
