import java.awt.*;
import java.applet.*;
public class ButtonTest extends Frame {
    Label lb1=new Label("button1");
    Button b1=new Button("OK");
    Label lb2=new Label("Button2");
    Button b2=new Button("Cancel");
public ButtonTest(){
    setLayout(null);
    setSize(200,300);
    lb1.setBounds(15,40,50,50);
    b1.setBounds(65,50,45,20);
    lb2.setBounds(15,100,50,50);
    b2.setBounds(65,110,45,20);
    add(lb1);
    add(b1);
    add(lb2);
    add(b2);
    setVisible(true);
    
}
public static void main(String[] args){
    ButtonTest b1=new ButtonTest();
}
}