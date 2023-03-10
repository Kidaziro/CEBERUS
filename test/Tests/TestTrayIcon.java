package Tests;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestTrayIcon {

    protected void initUI() {

        TrayIcon trayIcon = new TrayIcon(new ImageIcon(
                "http://3.bp.blogspot.com/-nh7fv5FqpU4/TeUbTvAdSkI/AAAAAAAAAUo/Ig53KJGvzlk/s45/avatar.png").getImage());

        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem checkBox1 = new JMenuItem("Last checked...", new ImageIcon(new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB)));
        JMenuItem checkBox2 = new JMenuItem("Open...");

        popupMenu.add(checkBox1);
        popupMenu.addSeparator();
        popupMenu.add(checkBox2);

        trayIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.setLocation(e.getX(), e.getY());
                    popupMenu.setInvoker(popupMenu);
                    popupMenu.setVisible(true);
                }
            }
        });
        try {
            SystemTray.getSystemTray().add(trayIcon);
        } catch (AWTException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                new TestTrayIcon().initUI();
            }
        });
    }

}