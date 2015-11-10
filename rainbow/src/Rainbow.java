// Chapter 5 Question 27
//trevor johnson
// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  // ________________________________________________
  Color skyColor = Color.CYAN;
  
  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    int xCenter =
          width/2;
    int yCenter = 
          3*height/4;

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
 
    // Declare and initialize the radius of the large semicircle:
    // ________________________________________________

    g.setColor(Color.RED);
      int largeRadius = 
                 width/4;
   
    g.fillArc(xCenter-largeRadius/2,
        yCenter-largeRadius/2, largeRadius,
       largeRadius, 0, 180);
    
    g.setColor(Color.green);
    int mediumRadius =
                width/6;
    
    g.fillArc(xCenter-mediumRadius/2,
       yCenter-mediumRadius/2, mediumRadius,
       mediumRadius, 0, 180);
   
    g.setColor(Color.magenta);
     int smallRadius =
                 width/8;
     
    g.fillArc(xCenter-smallRadius/2,
        yCenter-smallRadius/2, smallRadius,
        smallRadius, 0, 180);

    g.setColor(skyColor);
    int skyRadius =
                width/10;
    
   g.fillArc(xCenter-skyRadius/2,
       yCenter-skyRadius/2, skyRadius,
       skyRadius, 0, 180);
   
    // Draw the large semicircle:
    // g.fillArc( ______________ );

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }
  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
