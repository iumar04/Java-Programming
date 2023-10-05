public class Arithmatic_Operator{
    static class Arithmatic{
    public static void main(String[] args) {
//        int a = 14, b = 5;
//        int c=a/b;  //result/quotient is 2
//        float c = (float) a / b; //result is 2.8 (type casting)
//        int r = a % b;  //result/remainder is 4
        float a=14.3f,b=3.2f;
        float r=a%b;    //remainder/result is 1.5
//        System.out.println(c);
        System.out.println(r);
//        System.out.println(10/2*5); //result is 25
        System.out.println(10/(2*5)); //result is 1
    }
    static class Arithmatic2{
        public static void main(String[] args) {
            short a=5;
            byte b=10;
//            byte/short c=a+b; //error
            int c=a+b;
            System.out.println(c);
            float d=12.5f;
            long e=123L;
//            long f=d+e; //error
            float f=d*e;
            System.out.println(f);
            //int and char
            char g=5;
            int h=6;
//            char i=g+h; //error
            int i=g+h; //result is 11
            System.out.println(i);
        }

    }
    }
}
