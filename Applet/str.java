import java.applet.*;
import java.awt.*;

public class str extends Applet{

    public void paint(Graphics e){
        // e.drawString("Hello", 50, 20);
        e.drawLine(100,100,200,100);
        e.drawLine(100,100,100,200);
        e.drawLine(100,200,200,200);
        e.drawLine(100,100,200,100);

    }
}

/*<html>
  <head>
   </head>
   <body>
   <applet code="str.class" width="420" height="320"></applet>
   </body>
</html>
*/