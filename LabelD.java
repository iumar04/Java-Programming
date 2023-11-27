import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelD extends Frame {
    public LabelD(){
        setLayout(new FlowLayout());
        Label one=new Label("One");
        Label two=new Label("Two");
        Label three=new Label("Three");
        add(one);
        add(two);
        add(three);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        LabelD appwin=new LabelD();
        appwin.setSize(new Dimension(300,100));
        appwin.setTitle("Label Demo");
        appwin.setVisible(true);
    }
}
