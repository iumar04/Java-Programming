import java.util.Scanner;
//Program to Calculate CGPA using mark of Subject
public class CalculateCGPA {
    public static void main(String[] args) {
        int marks,sub;
        double per, cgpa, sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Subjects: ");
        sub=sc.nextInt();
        for (int i=1;i<=sub;i++){
            System.out.printf("Enter Your Marks (out of 100) in %d Sub: ",i);
            marks=sc.nextInt();
            sum=sum+marks;
        }
        int g_total=0;
        for (int j=1; j<=sub;j++){
            g_total=j*100;
        }
        per = (sum /g_total ) *100;
        cgpa = (per / 9.5);
        System.out.println("Sum of Marks: "+sum);
        System.out.println("Percentage of Marks: "+per);
        System.out.printf("CGPA of Marks: %.2f%n", cgpa);
    }
}
