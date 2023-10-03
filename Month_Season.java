import java.util.*;
public class Month_Season {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Month Number :");
        month=sc.nextInt();
        switch (month) {
            case 1 -> System.out.println("January - Winter");
            case 2 -> System.out.println("February - Spring");
            case 3 -> System.out.println("March - Spring");
            case 4 -> System.out.println("April - Summer");
            case 5 -> System.out.println("May - Summer");
            case 6 -> System.out.println("June - Summer");
            case 7 -> System.out.println("July - Mansoon");
            case 8 -> System.out.println("August - Mansoon");
            case 9 -> System.out.println("September - Autumn");
            case 10 -> System.out.println("October - Autumn");
            case 11 -> System.out.println("November - Winter");
            case 12 -> System.out.println("December - Winter");
            default -> System.out.println("Enter a valid Month Number");
        }
    }
}
