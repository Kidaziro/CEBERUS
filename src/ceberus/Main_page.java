package ceberus;

import Log_Reg.Login_or_Register;
import static Session.Compte.activated;
import java.awt.Image;
import java.awt.SystemTray;
import com.mongodb.*;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import pgbar.pgbar;

public class Main_page extends javax.swing.JFrame {

    int mose_x, mose_y;
    TrayIcon trayIcon;
    JMenuItem open;
    JPopupMenu popup;
    pgbar pgbar = new pgbar();
    Login_or_Register LR = new Login_or_Register();

    public Main_page() {

        this.setTitle("CEBERUS v1.0");
        try {
            Image img = ImageIO.read(getClass().getResource("/img/icons8_dog_paw_120px_2.png"));
//           

            this.setIconImage(img);

//             SystemTray.getSystemTray().add(trayIcon);
        } catch (Exception e) {
        }
//
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Image imgp = ImageIO.read(getClass().getResource("/img/icons8_dog_paw_19px.png"));
            popup = new JPopupMenu();
            trayIcon = new TrayIcon(imgp, "CEBERUS v1.0");
            JMenuItem miExit = new JMenuItem("Exit");
            JSeparator sp = new JSeparator();

            open = new JMenuItem("-");

            //-------------------------------
            ActionListener al2;
            al2 = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    vs();

                }
            };
            //----------------------------
            ActionListener al;
            al = new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    System.exit(0);
                }
            };
            miExit.addActionListener(al);
            open.addActionListener(al2);

            popup.add(open);
            popup.addSeparator();
            popup.add(miExit);
            popup.setPopupSize(200, 70);

            //---------------------m1-------------
            MouseListener ml;
            ml = new MouseListener() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getButton() == MouseEvent.BUTTON1) {
                        NORMAL();
                        open_min();

                    }

                    open_min();

                }

                public void mouseEntered(MouseEvent e) {

                }

                public void mouseExited(MouseEvent e) {

                }

                public void mousePressed(MouseEvent e) {

                }

                public void mouseReleased(MouseEvent e) {
                    if (e.isPopupTrigger()) {
                        popup.setLocation(e.getX(), e.getY() - 80);
                        popup.setInvoker(popup);
                        popup.setVisible(true);
                    }
                }
            };
            //---------------------m1-------------

            trayIcon.addMouseListener(ml);
//            trayIcon.addFocusListener(F);
            trayIcon.displayMessage("CEBERUS v1.0", "Welcom To Ceberus project.", MessageType.INFO);

            SystemTray.getSystemTray().add(trayIcon);

        } catch (Exception e) {

        }

        initComponents();
        check();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vis = new javax.swing.JButton();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        worning = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu_m = new com.k33ptoo.components.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        net_m = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        login_m = new com.k33ptoo.components.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        crypto_m = new com.k33ptoo.components.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        sm_logo = new javax.swing.JLabel();
        info = new com.k33ptoo.components.KGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        check_on_off = new javax.swing.JLabel();
        menu_bar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit_btn1 = new javax.swing.JLabel();
        exit_btn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        vis.setText("jButton1");
        vis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(963, 528));
        setMinimumSize(new java.awt.Dimension(963, 528));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setBackground(new java.awt.Color(0,0,0,0)
        );
        kGradientPanel1.setForeground(new java.awt.Color(0,0,0,0)
        );
        kGradientPanel1.setkBorderRadius(51);
        kGradientPanel1.setkEndColor(new java.awt.Color(47, 47, 47));
        kGradientPanel1.setkStartColor(new java.awt.Color(47, 47, 47));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setMaximumSize(new java.awt.Dimension(963, 535));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(963, 535));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(963, 535));
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        worning.setBackground(new java.awt.Color(0,0,0,0));
        worning.setForeground(new java.awt.Color(0,0,0,0)
        );
        worning.setkBorderRadius(15);
        worning.setVisible(false);
        worning.setkEndColor(new java.awt.Color(221,36,118,150));
        worning.setkStartColor(new java.awt.Color(255,81,47,150));
        worning.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_20px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        worning.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 5, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Warning you are not connected");
        worning.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 340, -1));

        /*

        kGradientPanel1.add(worning, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 340, 30));
        */

        menu_m.setBackground(new java.awt.Color(0,0,0,0));
        menu_m.setForeground(new java.awt.Color(0,0,0,0));
        menu_m.setkEndColor(new java.awt.Color(255,255,0,255));
        menu_m.setkStartColor(new java.awt.Color(255,255,0,150));
        menu_m.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Menu");
        menu_m.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 4, -1, -1));

        kGradientPanel1.add(menu_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 115, 200, 30));
        menu_m.setVisible(false);

        net_m.setBackground(new java.awt.Color(0,0,0,0));
        net_m.setForeground(new java.awt.Color(0,0,0,0));
        net_m.setkEndColor(new java.awt.Color(255,255,0,255
        ));
        net_m.setkStartColor(new java.awt.Color(255,255,0,150));
        net_m.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("You are not connected");
        net_m.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 200, -1));

        kGradientPanel1.add(net_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 175, 200, 30));
        net_m.setVisible(false);

        login_m.setBackground(new java.awt.Color(0,0,0,0));
        login_m.setForeground(new java.awt.Color(0,0,0,0));
        login_m.setkEndColor(new java.awt.Color(255,255,0,255
        ));
        login_m.setkStartColor(new java.awt.Color(255,255,0,150));
        login_m.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Login/Register");
        login_m.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 200, -1));

        kGradientPanel1.add(login_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 235, 200, 30));
        login_m.setVisible(false);

        crypto_m.setBackground(new java.awt.Color(0,0,0,0));
        crypto_m.setForeground(new java.awt.Color(0,0,0,0));
        crypto_m.setkEndColor(new java.awt.Color(255,255,0,255
        ));
        crypto_m.setkStartColor(new java.awt.Color(255,255,0,150));
        crypto_m.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Encrypted Data");
        crypto_m.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, -1, -1));

        kGradientPanel1.add(crypto_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 200, 30));
        crypto_m.setVisible(false);

        sm_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/green 1.png"))); // NOI18N
        sm_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sm_logoMouseClicked(evt);
            }
        });
        kGradientPanel1.add(sm_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, -1, -1));

        info.setBackground(new java.awt.Color(0,0,0,0));
        info.setForeground(new java.awt.Color(0,0,0,0));
        info.setkEndColor(new java.awt.Color(255,255,0,255
        ));
        info.setkStartColor(new java.awt.Color(255,255,0,150));
        info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("About The App");
        info.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, -1, -1));

        kGradientPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 485, 200, 30));
        info.setVisible(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_info_35px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 480, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/npp.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 290, -1, -1));

        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_active_directory_35px_1.png"))); // NOI18N
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        kGradientPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 57, -1));

        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_login_35px.png"))); // NOI18N
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        kGradientPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 57, -1));

        check_on_off.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check_on_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/on.png"))); // NOI18N
        check_on_off.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_on_offMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                check_on_offMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                check_on_offMouseExited(evt);
            }
        });
        kGradientPanel1.add(check_on_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 170, 57, -1));

        menu_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 1.png"))); // NOI18N
        kGradientPanel1.add(menu_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("CONNECTED");
        /*
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 35, -1, -1));
        */

        exit_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_minus_26px_1.png"))); // NOI18N
        exit_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btn1MouseClicked(evt);
            }
        });
        kGradientPanel1.add(exit_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 10, -1, -1));

        exit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_shutdown_26px.png"))); // NOI18N
        exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 5, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 4.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 5_1.png"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    boolean chk;
    boolean check() {
        MongoClientOptions.Builder builder = MongoClientOptions.builder();
        ServerAddress ServerAddress = new ServerAddress("localhost", 27017);
        MongoClient mongoClient = new MongoClient(ServerAddress, builder.build());
        try {
            mongoClient.getAddress();
            mongoClient.getConnectPoint();
            jLabel2.setText("CONNECTED");
            kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 35, -1, -1));
            kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));
            kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, 520));
            jLabel2.setLocation(451, 35);
            check_on_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/on.png")));
            chk=true;
            return true;
        } catch (Exception e) {
            jLabel2.setText("DISCONNECTED");
            check_on_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/off.png")));
            kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 35, -1, -1));
            kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));
            kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, 520));

            jLabel2.setLocation(441, 35);
            chk=false;
            return false;
        } finally {
            mongoClient.close();
        }
    }

    class Helpe extends TimerTask {

        public static int i = 1;

        @Override
        public void run() {

            check();

        }

    }
    int click = 0, hover = 0;

    void animat(int option, String message) {

        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {

                if (option == 1) {
                    int x = 330;
                    int y = 240;

                    while (true) {
                        jLabel5.setText(message);
                        kGradientPanel1.add(worning, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 340, 30));
                        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, 520));
                        worning.setLocation(x, y);
                        worning.setVisible(true);

                        y -= 10;
                        if (y == 90) {
                            new java.util.Timer().schedule(
                                    new java.util.TimerTask() {
                                @Override
                                public void run() {
                                    worning.setVisible(false);
                                    click = 0;
                                }
                            },
                                    2000
                            );
                            break;

                        }
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                        }
                    }
                }

            }
        });
        if (click == 1) {
            animation.start();
        }

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);
        this.setBackground(new java.awt.Color(0, 0, 0, 0));
        Timer timer = new Timer();
        TimerTask task = new Helpe();
        timer.schedule(task, 2000, 2000);
        notification("Welcom To Ceberus project.");


    }//GEN-LAST:event_formWindowOpened
    void notification(String message) {

        trayIcon.displayMessage("CEBERUS v1.0", message, MessageType.INFO);

    }


    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
//System.exit(0);        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exit_btnMouseClicked
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    void NORMAL() {
        if (this.isVisible()) {
            dispose();
        } else {
            this.setVisible(true);
        }

//        this.setState(this.NORMAL);
    }

    void vs() {
        if (this.isShowing()) {
            this.setVisible(false);

        } else {
            this.setVisible(true);
            this.setState(this.NORMAL);
        }
    }

    void open_min() {

        if (this.isShowing()) {
            open.setLabel("Minimize to Tray");
            popup.revalidate();
            popup.repaint();

        } else {
            open.setLabel("Open Ceberus");
            popup.revalidate();
            popup.repaint();

        }

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    private void exit_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btn1MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_exit_btn1MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        mose_x = evt.getX();
        mose_y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int kordonateX = evt.getXOnScreen();
        int kordonateY = evt.getYOnScreen();
        this.setLocation(kordonateX - mose_x, kordonateY - mose_y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        if (activated) {

        } else {
            ++click;
            animat(1, "Please Create An Account Or Login");
        }

    }//GEN-LAST:event_menuMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        if (activated) {
            new User.User_info().setVisible(true);

        } else {
            pgbar.setVisible(true);
            setEnabled(false);
            check();
            if (check()) {
                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                    @Override
                    public void run() {
                        pgbar.setVisible(false);
                        setEnabled(true);
                        setAlwaysOnTop(true);
                        setAlwaysOnTop(false);
                        LR.setVisible(true);
                        setVisible(false);
                    }
                },
                        4000
                );
            } else {
                pgbar.setVisible(false);
            }

        }


    }//GEN-LAST:event_loginMouseClicked


    private void check_on_offMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_on_offMouseClicked

        kGradientPanel1.add(worning, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 340, 30));

    }//GEN-LAST:event_check_on_offMouseClicked

    private void sm_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sm_logoMouseClicked
        String currDir = System.getProperty("user.dir");
    }//GEN-LAST:event_sm_logoMouseClicked

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        menu_m.setVisible(true);
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        menu_m.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMouseExited

    private void check_on_offMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_on_offMouseEntered
        net_m.setVisible(true);
        if (chk==true) {
            jLabel9.setText("You are connected");
        } else {
            jLabel9.setText("You are not connected");

        }

// TODO add your handling code here:
    }//GEN-LAST:event_check_on_offMouseEntered

    private void check_on_offMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_on_offMouseExited
        net_m.setVisible(false);        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_check_on_offMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login_m.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login_m.setVisible(false);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_loginMouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        crypto_m.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        crypto_m.setVisible(false);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        info.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        info.setVisible(false);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        worning.setVisible(false);
        click = 0;
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked


    }//GEN-LAST:event_kGradientPanel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (activated) {

        } else {
            ++click;
            animat(1, "Please Create An Account Or Login");

        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void visActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visActionPerformed
        if (activated) {
            login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png")));
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pp.png")));
            jLabel10.setText("User Information");
        }
        this.setVisible(true);
    }//GEN-LAST:event_visActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel check_on_off;
    private com.k33ptoo.components.KGradientPanel crypto_m;
    private javax.swing.JLabel exit_btn;
    private javax.swing.JLabel exit_btn1;
    private com.k33ptoo.components.KGradientPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel login;
    private com.k33ptoo.components.KGradientPanel login_m;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel menu_bar;
    private com.k33ptoo.components.KGradientPanel menu_m;
    private com.k33ptoo.components.KGradientPanel net_m;
    private javax.swing.JLabel sm_logo;
    public static javax.swing.JButton vis;
    private com.k33ptoo.components.KGradientPanel worning;
    // End of variables declaration//GEN-END:variables
}
