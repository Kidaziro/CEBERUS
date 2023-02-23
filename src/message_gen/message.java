package message_gen;

import static Log_Reg.Login_or_Register.act_login;
import static Log_Reg.Login_or_Register.des_login;

public class message extends javax.swing.JFrame {

    public message(int[] x_y, int[] color, String message_text, int[] xv_yv) {
        initComponents();

        this.setLocation(x_y[0], x_y[1]);

        kGradientPanel1.setkStartColor(new java.awt.Color(color[0], color[1], color[2], color[3]));
        kGradientPanel1.setkEndColor(new java.awt.Color(color[0], color[1], color[2], color[3]));
        message.setText(message_text);

        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = xv_yv[0] + 205;
                int y = xv_yv[1] + 254;

                while (true) {

                    y -= 10;
                    setLocation(x, y);

                    if (y - xv_yv[1] <= 20) {
                        break;

                    }
                    try {
                        Thread.sleep(25);
                    } catch (Exception e) {
                    }
                }

            }
        });
        animation.start();
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                setVisible(false);
            }
        },
                4000
        );

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setBackground(new java.awt.Color(0, 0, 0, 0));
        kGradientPanel1.setForeground(new java.awt.Color(0, 0, 0, 0));
        kGradientPanel1.setkBorderRadius(20);
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        message.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setText("jLabel1");
        message.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messageMouseClicked(evt);
            }
        });
        kGradientPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 1, 400, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
javax.swing.Timer t;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setBackground(new java.awt.Color(0, 0, 0, 0));
        this.setAlwaysOnTop(true);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified

    }//GEN-LAST:event_formWindowIconified

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_kGradientPanel1MouseClicked

    private void messageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messageMouseClicked
        this.dispose();
    }//GEN-LAST:event_messageMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new message(1,2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}
