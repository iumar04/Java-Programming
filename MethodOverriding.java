class TV{
    public void switchON(){System.out.println("TV is switched ON");}
    public void changeChannel(){System.out.println("TV channel is Changed");}
}
class  SmartTV extends TV{
    @Override
    public void switchON(){System.out.println("SmartTV is switched ON");}
    @Override
    public void changeChannel(){System.out.println("SmartTV channel is Changed");}
    public void browse(){System.out.println("SmartTv is browsing");}
}
public class MethodOverriding {
    public static void main(String[] args){
        TV tv=new SmartTV();
        tv.switchON();
        tv.changeChannel();
//        SmartTV tb=new TV();  
/*  error-      incompatible types: TV cannot be converted to SmartTV */
//        TV sup=new TV();
//        sup.switchON();
//        sup.changeChannel();
//        SmartTV sub=new SmartTV();
//        sub.changeChannel();
//        sub.switchON();
//        sub.browse();
    }
}
