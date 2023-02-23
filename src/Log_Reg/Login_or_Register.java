package Log_Reg;

import static Session.Compte.activated;
import static ceberus.Main_page.vis;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import java.awt.Image;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import message_gen.message;
import mongodb.mongoRobot;

public class Login_or_Register extends javax.swing.JFrame {

    private int mose_x;
    private int mose_y;

    public Login_or_Register() {
        initComponents();
        this.setTitle("CEBERUS v1.0");
        try {
            Image img = ImageIO.read(getClass().getResource("/img/icons8_dog_paw_120px_2.png"));
            this.setIconImage(img);

        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        act_login = new javax.swing.JButton();
        des_login = new javax.swing.JButton();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel7 = new javax.swing.JLabel();
        exit_btn5 = new javax.swing.JLabel();
        exit_btn4 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        worning = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User_pass = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        exit_btn = new javax.swing.JLabel();
        exit_btn1 = new javax.swing.JLabel();
        Inv_email = new javax.swing.JLabel();

        act_login.setText("jButton1");
        act_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                act_loginActionPerformed(evt);
            }
        });

        des_login.setText("jButton1");
        des_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                des_loginActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(0,0,0,0));
        kGradientPanel1.setForeground(new java.awt.Color(0,0,0,0));
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(47, 47, 47));
        kGradientPanel1.setkStartColor(new java.awt.Color(47, 47, 47));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setBackground(new java.awt.Color(0,0,0,0));
        kGradientPanel2.setForeground(new java.awt.Color(0,0,0,0));
        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(255,255,0,255)
        );
        kGradientPanel2.setkStartColor(new java.awt.Color(242, 210 ,57,255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome Back.");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 280, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Login With Your Personal Info");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 310, -1));

        kButton1.setText("Login");
        kButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(0, 0, 0));
        kButton1.setkBorderRadius(52);
        kButton1.setkEndColor(new java.awt.Color(0, 0, 0));
        kButton1.setkFillButton(false);
        kButton1.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverColor(new java.awt.Color(32, 55, 86));
        kButton1.setkHoverEndColor(new java.awt.Color(32, 55, 86));
        kButton1.setkHoverForeGround(new java.awt.Color(32, 55, 86));
        kButton1.setkHoverStartColor(new java.awt.Color(32, 55, 86));
        kButton1.setkSelectedColor(new java.awt.Color(0, 0, 0));
        kButton1.setkStartColor(new java.awt.Color(0, 0, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("To Be Able To Encrypt/Decrypt Your File");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 310, -1));

        exit_btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_minus_26px_2.png"))); // NOI18N
        exit_btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btn5MouseClicked(evt);
            }
        });
        exit_btn5.setVisible(false);
        kGradientPanel2.add(exit_btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, -1, -1));

        exit_btn4.setVisible(false);
        exit_btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_shutdown_26px_9.png"))); // NOI18N
        exit_btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btn4MouseClicked(evt);
            }
        });
        kGradientPanel2.add(exit_btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        ///*

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 508));
        //*/

        kGradientPanel3.setBackground(new java.awt.Color(0,0,0,0));
        kGradientPanel3.setForeground(new java.awt.Color(0,0,0,0));
        kGradientPanel3.setkBorderRadius(0);
        kGradientPanel3.setkEndColor(new java.awt.Color(47, 47, 47));
        kGradientPanel3.setkStartColor(new java.awt.Color(47, 47, 47));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        worning.setBackground(new java.awt.Color(0,0,0,0)
        );
        worning.setForeground(new java.awt.Color(0,0,0,0)
        );
        worning.setkBorderRadius(15);
        worning.setkEndColor(new java.awt.Color(221,36,118,150));
        worning.setkStartColor(new java.awt.Color(221,36,118,150));
        worning.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0,0,0,0)
        );
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel9");
        ///*
        worning.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));
        //*/

        ///*

        kGradientPanel3.add(worning, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1000, 10, 360, 30));
        //*/
        //worning.setVisible(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_gmail_30px.png"))); // NOI18N
        kGradientPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 210, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_password_30px.png"))); // NOI18N
        kGradientPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 268, -1, -1));

        User_pass.setBackground(new java.awt.Color(0,0,0,0)
        );
        User_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        User_pass.setForeground(new java.awt.Color(255, 255, 255));
        User_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        User_pass.setEchoChar('\u25cf');
        kGradientPanel3.add(User_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jTextField2.setBackground(new java.awt.Color(0,0,0,0)
        );
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setEnabled(false);
        kGradientPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 40, 30));
        jTextField2.getAccessibleContext().setAccessibleDescription("aazeaze");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 158, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ceate Account");
        kGradientPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 510, -1));

        User.setBackground(new java.awt.Color(0,0,0,0)
        );
        User.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        User.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserKeyReleased(evt);
            }
        });
        kGradientPanel3.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 220, 30));

        jTextField4.setBackground(new java.awt.Color(0,0,0,0)
        );
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setEnabled(false);
        kGradientPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 40, 30));

        kButton2.setText("Sign Up");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 158, 1));
        kButton2.setkBorderRadius(35);
        kButton2.setkEndColor(new java.awt.Color(255, 158, 1));
        kButton2.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverColor(new java.awt.Color(32, 55, 86));
        kButton2.setkHoverEndColor(new java.awt.Color(32, 55, 86));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(32, 55, 86));
        kButton2.setkSelectedColor(new java.awt.Color(0, 0, 0));
        kButton2.setkStartColor(new java.awt.Color(255, 158, 1));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 158, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("password ?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kGradientPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 90, -1));
        jLabel2.setVisible(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("forgot ");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kGradientPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 60, -1));
        jLabel8.setVisible(false);

        exit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_shutdown_26px.png"))); // NOI18N
        exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });
        kGradientPanel3.add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        exit_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_minus_26px_1.png"))); // NOI18N
        exit_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btn1MouseClicked(evt);
            }
        });
        kGradientPanel3.add(exit_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 15, -1, -1));

        Inv_email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Inv_email.setForeground(new java.awt.Color(255, 0, 0));
        Inv_email.setText("Invalid email, use a valid email.");
        Inv_email.setVisible(false);
        kGradientPanel3.add(Inv_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 260, -1));

        ///*

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 510, 508));
        //*/

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 823, 508));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);
        setBackground(new java.awt.Color(0, 0, 0, 0));
        on_off = !on_off;
        animate(on_off);
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                on_off = !on_off;
                animate(on_off);
                message_Gen(2, "Welcome to the app");
            }
        },
                1000
        );

    }//GEN-LAST:event_formWindowOpened


    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        on_off = !on_off;
        click++;
        animate(on_off);
        clean();

    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        if (kButton2.getText().equals("Sign Up")) {
            if (!User.getText().equals("") && !User_pass.getText().equals("")) {
                String[] keys = new String[1];
                keys[0] = "User_nam";
                String[] val = new String[1];
                val[0] = User.getText();
                if (!new mongodb.mongoRobot(1, null, null, "Users_data").mongo_check(keys, val, 0)) {

                    try {
                        InternetAddress emailAddr = new InternetAddress(User.getText());
                        emailAddr.validate();
                        Inv_email.setVisible(false);

                        mongo_send(User.getText(), md5_Gen(User_pass.getText()));

                        clean();
                    } catch (AddressException e) {
                        Inv_email.setVisible(true);

                    }
                } else {
                    clean();
                    message_Gen(1, "This email is already used");
                }
            } else {
                message_Gen(1, "Tray Again !");
            }
        }
        /////----->
        if (kButton2.getText().equals("Submit")) {
            if (!User.getText().equals("") && !User_pass.getText().equals("")) {

                mongo_ch(User.getText(), md5_Gen(User_pass.getText()));

                clean();
            } else {
                message_Gen(1, "Try Again !");

            }
        }


    }//GEN-LAST:event_kButton2ActionPerformed
    public void clean() {
        User.setText("");
        User_pass.setText("");
    }

    public String md5_Gen(String text) {
        String s = text;

        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login_or_Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.update(s.getBytes(), 0, s.length());
        return new BigInteger(1, m.digest()).toString(16);
    }

    private void mongo_ch(String User, String pss) {
        String[] key = new String[2];
        key[0] = "User_nam";
        key[1] = "User_pass";
        String[] val = new String[2];
        val[0] = User;
        val[1] = pss;
        if (new mongoRobot(1, null, null, null).mongo_check(key, val, 0)) {
            message_Gen(2, "You are seccessefily log in");
            activated = true;
            setVisible(false);
            vis.doClick();
        } else {
            message_Gen(1, "User Or Password Not Correct ... Tray Again");

        }

    }

    private void mongo_send(String User, String pss) {
        String[] val = new String[3];
        val[0] = User;
        val[1] = pss;
        val[2] = "0";
        String[] key = new String[3];
        key[0] = "User_nam";
        key[1] = "User_pass";
        key[2] = "Activation";
        new mongodb.mongoRobot(1, key, val, "Users_data");

        message_Gen(2, "Check Your Email To Activate Your Account");

        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                new pin_check.pin_check().setVisible(true);
                new pin_send.pin_gen(User, "Activate Your Account Now", "If you are having trouble with this pin please try again or contact the support."
                        + " <br> This Code Will Expire After 30 min.");
            }

        },
                3000
        );

        Session.Compte.User_name = User;

    }


    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        dispose();
//        System.exit(0);
    }//GEN-LAST:event_exit_btnMouseClicked

    private void exit_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btn1MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_exit_btn1MouseClicked

    private void exit_btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btn4MouseClicked
        dispose();
//        System.exit(0);
    }//GEN-LAST:event_exit_btn4MouseClicked

    private void exit_btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btn5MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_exit_btn5MouseClicked

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        mose_x = evt.getX();
        mose_y = evt.getY();
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        int kordonateX = evt.getXOnScreen();
        int kordonateY = evt.getYOnScreen();
        this.setLocation(kordonateX - mose_x, kordonateY - mose_y);
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void UserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserKeyPressed

    }//GEN-LAST:event_UserKeyPressed

    private void UserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserKeyReleased

    }//GEN-LAST:event_UserKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ++click;
        message_Gen(1, "Pleas Tray again");

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        ++click;
        message_Gen(2, "Welcome to the app");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void act_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_act_loginActionPerformed
        this.setEnabled(true);
        this.setAlwaysOnTop(true);
        this.setAlwaysOnTop(false);
    }//GEN-LAST:event_act_loginActionPerformed

    private void des_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_des_loginActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_des_loginActionPerformed
    int click = 0;

    public void message_Gen(int option, String message) {

        int[] color = new int[4];

        //worning message
        if (option == 1) {
            color[0] = 254;
            color[1] = 9;
            color[2] = 68;
            color[3] = 150;
        }
        //seccess message
        if (option == 2) {
            color[0] = 16;
            color[1] = 87;
            color[2] = 31;
            color[3] = 150;
        }
        int x = this.getX() + 205;
        int y = this.getY() + 254;
        int xv = this.getX();
        int yv = this.getY();
        int x_y[] = {x, y};
        int xv_yv[] = {xv, yv};

//      new message_gen.message(x_y,color,message).setVisible(true);
        new message(x_y, color, message, xv_yv).setVisible(true);

    }

    boolean on_off = false;

    void animate(boolean on) {
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 0;
                int y = 0;
                int x1 = kGradientPanel3.getX();
                int y1 = kGradientPanel3.getY();
                int xt1 = jLabel3.getX();
                int xt2 = jLabel7.getX();
                int xt3 = jLabel6.getX();
                int xt4 = kButton1.getX();
                if (on) {

                    while (true) {

                        kGradientPanel2.setLocation(x, y);
                        kGradientPanel2.setVisible(true);
                        kGradientPanel3.setLocation(x1, y1);
                        jLabel3.setLocation(xt1, 160);
                        jLabel7.setLocation(xt2, 200);
                        jLabel6.setLocation(xt3, 230);
                        kButton1.setLocation(xt4, 270);

                        if (xt1 >= -300) {
                            xt1 -= 10;
                        }
                        if (xt2 >= -300) {
                            xt2 -= 10;
                        }
                        if (xt3 >= -300) {
                            xt3 -= 10;
                        }
                        if (xt4 >= -300) {
                            xt4 -= 10;
                        }

                        if (x == 200) {

                            jLabel1.setText("Login");
                            kButton2.setText("Submit");
                            jLabel3.setText("Register Now");
                            jLabel7.setText("Create Your Account Now For Free");
                            jLabel6.setText("And Secure Your File");
                            kButton1.setText("Sign Up");
                            exit_btn.setVisible(false);
                            exit_btn1.setVisible(false);
                            exit_btn4.setVisible(true);
                            exit_btn5.setVisible(true);
                        }

                        if (x1 >= 10) {
                            x1 -= 10;
                        }
                        x += 10;

                        if (x >= 513) {

                            jLabel3.setLocation(20, 160);
                            jLabel7.setLocation(0, 200);
                            jLabel6.setLocation(0, 230);
                            kButton1.setLocation(60, 270);

                            break;

                        }
                        try {
                            Thread.sleep(3);
                        } catch (Exception e) {
                        }
                    }
                } else {
                    x = 550;
                    while (true) {

                        kGradientPanel2.setLocation(x, y);
                        kGradientPanel2.setVisible(true);
                        kGradientPanel3.setLocation(x1, y1);
                        jLabel3.setLocation(xt1, 160);
                        jLabel7.setLocation(xt2, 200);
                        jLabel6.setLocation(xt3, 230);
                        kButton1.setLocation(xt4, 270);

                        if (xt1 >= 0) {
                            xt1 += 10;
                        }
                        if (xt2 >= 0) {
                            xt2 += 10;
                        }
                        if (xt3 >= 0) {
                            xt3 += 10;
                        }
                        if (xt4 >= 0) {
                            xt4 += 10;
                        }

                        if (x == 300) {
                            jLabel1.setText("Ceate Account");
                            kButton2.setText("Sign Up");
                            jLabel3.setText("Welcome Back.");
                            jLabel7.setText("To Be Able To Encrypt/Decrypt Your File");
                            jLabel6.setText("Login With Your Personal Info");
                            kButton1.setText("Login");
                            exit_btn.setVisible(true);
                            exit_btn1.setVisible(true);
                            exit_btn4.setVisible(false);
                            exit_btn5.setVisible(false);
                        }
                        if (x1 <= 300) {
                            x1 += 10;
                        }

                        x -= 10;

                        if (x <= -1) {

                            jLabel3.setLocation(20, 160);
                            jLabel7.setLocation(0, 200);
                            jLabel6.setLocation(0, 230);
                            kButton1.setLocation(60, 270);

                            break;

                        }
                        try {
                            Thread.sleep(3);
                        } catch (Exception e) {
                        }
                    }
                }

            }
        });
        animation.start();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_or_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_or_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_or_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_or_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_or_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Inv_email;
    private javax.swing.JTextField User;
    private javax.swing.JPasswordField User_pass;
    public static javax.swing.JButton act_login;
    public static javax.swing.JButton des_login;
    private javax.swing.JLabel exit_btn;
    private javax.swing.JLabel exit_btn1;
    private javax.swing.JLabel exit_btn4;
    private javax.swing.JLabel exit_btn5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel worning;
    // End of variables declaration//GEN-END:variables

}
