import java.awt.*;
import java.applet.*;
public class shapes extends Applet{
    public void paint(Graphics g){
      g.setColor(Color.yellow);
      g.fillRect(50,50,100,60);
      
      g.setColor(Color.red);
      g.fillOval(200,50,80,80);
      
      g.setColor(Color.pink);
      g.drawLine(50,150,200,150);
    }
 }
 /* <applet code=shapes width=400 height=400>
   </applet>
  */
