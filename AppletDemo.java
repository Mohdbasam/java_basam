import java.awt.*;
import java.applet.*;

public class AppletDemo extends Applet{

	Image myImage;
	public void init()
	{
		setBackground(Color.black);
		myImage = getImage(getDocumentBase(),"/home/student/s2mca/basam/suni(1).jpg");
		
	}
	
	public void paint(Graphics g){
	g.setColor(Color.yellow);
	Font largeFont = new Font("Ariel",Font.BOLD,80);
	g.setFont(largeFont);
	g.drawString("kunnummal traders",200,200);
	g.drawRect(170,120,950,100);
	g.drawImage(myImage,350,230,this);
	
	
	}
}

/* <applet code=AppletDemo width=200 height=300></applet> */

