//Demonstrate the key events handlers
import java.awt.*;
        import java.awt.event.KeyEvent;
        import java.awt.event.KeyListener;
        import java.awt.event.WindowAdapter;
        import java.awt.event.WindowEvent;

class SimpleKey extends Frame
        implements KeyListener
{
    String msg="";
    String keyState="";
    //Constructor
    public SimpleKey()
    {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    //Handle a key press
    public void keyPressed(KeyEvent ke)
    {
        keyState="Key Down";
        repaint();
    }
    //Handle a key release
    public void keyReleased(KeyEvent ke)
    {
        keyState="Key up";
        repaint();
    }
    //Handle key typed
    public void keyTyped(KeyEvent ke)
    {
        msg+=ke.getKeyChar();
        repaint();
    }
    //Display keystrokes
    public void paint(Graphics g)
    {
        g.drawString(msg,20,100);
        g.drawString(keyState,20,50);
    }
    //Main method
    public static void main(String[] args)
    {
        SimpleKey appwin=new SimpleKey();
        appwin.setSize(new Dimension(200,150));
        appwin.setTitle("Simple key");
        appwin.setVisible(true);
    }

}
//When the close box in the frame is clicked,close the window and exit the program
class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}