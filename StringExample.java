public class StringExample {
    public static void main(String[] args) {
        // index 01234567890
        String s1= "Hello World" ;
        System.out.println(s1.length());
        System.out.println(s1.indexOf("r"));
        System.out.println(s1.charAt(1));
        System.out.println(s1.substring(3, 7));
        String s2=s1.substring (0, 5) ;
        System.out.println(s2.toLowerCase( ));
    }
}
