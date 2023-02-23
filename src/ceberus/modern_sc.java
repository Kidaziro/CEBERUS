
package ceberus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class modern_sc extends BasicScrollBarUI{
private final int TH=60;
    @Override
    protected Dimension getMaximumThumbSize() {
        if (scrollbar.getOrientation()==JScrollBar.VERTICAL) {
             return new Dimension(0,TH);
        }else{
             return new Dimension(TH,0);

        }
    }

    @Override
    protected Dimension getMinimumThumbSize() {

     if (scrollbar.getOrientation()==JScrollBar.VERTICAL) {
             return new Dimension(0,TH);
        }else{
             return new Dimension(TH,0);

        }

    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new ScrollBarButton();
    }

    
    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new ScrollBarButton();


    }



    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        
            Graphics2D g2 =(Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int orinetation=scrollbar.getOrientation();
            int size ;
            int x;
            int y;
            int w;
            int h;
            if (orinetation==JScrollBar.VERTICAL) {
                size = trackBounds.width / 2;
                x = trackBounds.x + ((trackBounds.width - size) / 2);
                y = trackBounds.y;
                w = size;
                h = trackBounds.height;
        }
            else{
                size = trackBounds.height / 2;
                y = trackBounds.y + ((trackBounds.height - size / 2));
                x = 0;
                w = trackBounds.width;
                h = size;
                
            }
            //this is >>>><
            g2.setColor(new Color(240,240,240,0));
            g2.fillRect(x, y, w, h);
    
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            Graphics2D g2 =(Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = thumbBounds.x;
        int y = thumbBounds.y;
        int w = thumbBounds.width;
        int h = thumbBounds.height;
        if (scrollbar.getOrientation()==JScrollBar.VERTICAL) {
            y += 8;
            h -= 16;
        } else {
            x += 8;
            w -= 16;
        }
        //custum color "scrollbar.getForeground()"
            g2.setColor(scrollbar.getForeground());
            g2.fillRoundRect(x, y, w, h, 10, 10);
    }
private class ScrollBarButton extends JButton{
    public  ScrollBarButton () {
        setBorder(BorderFactory.createEmptyBorder());
    }

        @Override
        public void paint(Graphics g) {
            
        }
    
}
    
    
}
