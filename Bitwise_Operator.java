public class Bitwise_Operator {
    public static void main(String[] args) {
        int x=10, y=6, z;
//        z=x&y;  //2         //AND Operator
        z=x|y;  //14        //OR Operator
//        z=x^y;  //12        //XOR Operator
//        z=x<<1; //20        //Left-Shift Operator
        z=x>>1;   //5         //Right-Shift Operator
        z=~x;   //11          //NOT Operator
        System.out.println(z);
        rightshift();
    }
    static void rightshift(){
        int x= -10,z;
        z=x>>1; //-5
        z=x>>>1; //2147483643
        System.out.println(z);
    }
}
