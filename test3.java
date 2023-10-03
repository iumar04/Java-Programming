public class Test3 {
    public static void main(String[] arg){
        int num[]={2,9,1,4,25,50};
        int s=4,found = 0;
        for(int c=0;c< num.length;c++){
            if (num[c]==s) {
                found = num[c];
                break;
            }
                
        }
		System.out.println("Data is Found "+found);
    }
}