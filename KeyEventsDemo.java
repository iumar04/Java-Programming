//Handling keyboard events
//Demonstrate some virtual key codes
import java.awt.*;
import java.awt.event.*;

class KeyEventsDemo extends Frame
        implements KeyListener
{
    String msg="";
    String KeyState="";
    public KeyEventsDemo()
    {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    //Handle a keyPress
    public void keyPressed(KeyEvent ke)

    {
        KeyState="Key Down";
        int key=ke.getKeyCode();
        switch (key)
        {
            case KeyEvent.VK_F1:
                msg+="<F1>";
                break;
            case KeyEvent.VK_F2:
                msg+="<F2>";
                break;
            case KeyEvent.VK_F3:
                msg+="<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg+="<Page Down>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg+="<PageUP>";
                break;
            case KeyEvent.VK_LEFT:
                msg+="<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                msg+="Right Arrow>";
                break;
            //We can Add More Keys..............

        }
        repaint();
    }
    //Handle a key release
    public void keyReleased(KeyEvent ke)
    {
        KeyState="Key UP";
        repaint();
    }
    //Handle key typed
    public void keyTyped(KeyEvent ke)
    {
        msg+=ke.getKeyChar();
        repaint();
    }
    //Display keyStroke
    public void paint(Graphics g)
    {
        g.drawString(msg,20,100);
        g.drawString(KeyState,20,50);
    }
    public static void main(String[] args)
    {
        KeyEventsDemo appwin=new KeyEventsDemo();
        appwin.setSize(new Dimension(200,150));
        appwin.setTitle("KeyEventsDemo");
        appwin.setVisible(true);
    }

}
//When the close box is clicked ,close program and exit
class MyWindowAdapter2 extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}