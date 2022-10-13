import java.applet.Applet;
import java.awt.Graphics;
public class demod extends Applet
{
public void paint(Graphics g)
{
g.drawString("Welcome to human face applet",100,50);
g.drawOval(100,60,180,180);
g.fillOval(220,100,30,20);
g.fillOval(139,100,30,20);
g.drawRect(190,130,1,45);
g.drawArc(130,80,120,130,200,140);

}
}


