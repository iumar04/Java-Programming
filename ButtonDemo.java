import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame implements ActionListener {
    String msg="";
    Button yes, no, maybe;
    public ButtonDemo(){
        //use FlowLayout
        setLayout(new FlowLayout());

        //create some button
        yes=new Button("Yes");
        no=new Button("No");
        maybe=new Button("Undecided");

        //add button to frame
        add(yes);
        add(no);
        add(maybe);

        //add actionlistener to buttons
        yes.addActionListener((ActionListener) this);
        no.addActionListener((ActionListener) this);
        maybe.addActionListener((ActionListener) this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    //handle button action event
    public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        if(str.equals("Yes")){
            msg="You Pressed Yes";
        } else if (str.equals("No")) {
            msg="You Pressed No";
        }
        else {
            msg="You Pressed Undecided";
        }
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg,20,100);
    }

    public static void main(String[] args) {
        ButtonDemo appwin=new ButtonDemo();
        appwin.setSize(new Dimension(300,300));
        appwin.setTitle("Button Demo");
        appwin.setVisible(true);
    }
}
