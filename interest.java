// create data entry window that will calculate missing values for interest rate calculations 

import java.awt.*
import java.awt.event.*

public class Interest extends Frame {
  final int inc = 25;
  int max = 500;
  int min = 200;
  Dimension d;
  
  public Interest() {
    //Anonymous inner class to handle window close events
    addWindowListener(new WindowAdapter() {
      public void WindowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
    
    //Anonymous inner class to handle mouse click events
    addMouseListener(new MouseAdapter() {
      public void MouseClicked(me) {
        int w = (d.width + inc) > max ? min : (d.width + inc);
        int h = (d.height + inc) > max ? min : (d.height + inc);
        setSize(new Dimension (w,h));
      }
    });
  }
  
  public void paint(Graphics g) {
    Insets i = getInsets();
    d = getSize();
    
    g.drawLine(i.left, i.top, d.width-i.right, d.height-i.bottom);
    g.drawLine(i.left, d.height-i.bottom, d.width-i.right, i.top);
  }
  
  public static void main(String[] args {
    Interest appwin = new Interest();
    appwin.setSize (new Dimension(200,200));
    appwin.setTitle ("Interest");
    appwin.setVisible (true);
  }  
}  
