import java.applet.Applet;
import java.applet.*;
import java.awt.*;
public class setcolor extends Applet
{
    Font obj=new Font("Times New Roman",Font.BOLD,20);
    public void paint(Graphics g)
    {
        g.setFont(obj);
        g.drawString("Abhishek", 100, 80);
    }
    
}
