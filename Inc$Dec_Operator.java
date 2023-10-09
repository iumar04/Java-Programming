public class Inc$Dec_Operator {
    public static void main(String[] args) {
        int a=2,b=5,x=4,c;
//        c=a*++x+b; //15
        c=a*x+++b;  //13
        System.out.println(c);
    }
}
