// create data entry window that will calculate missing values for interest rate calculations 

import java.awt.*
import java.awt.event.*

public class Interest extends Frame {
  
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
      
      }
    });
  }  
}  
