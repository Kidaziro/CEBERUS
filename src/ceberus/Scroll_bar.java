package ceberus;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;

public class Scroll_bar extends javax.swing.JFrame {

    public Scroll_bar() {
        initComponents();
        getContentPane().setBackground(Color.white);

        jScrollPane2.setVerticalScrollBar(new sc_b());
        jScrollPane2.setHorizontalScrollBar(sc_b1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sc_b1 = new ceberus.sc_b();
        jScrollPane2 = new javax.swing.JScrollPane();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        sc_b1.setForeground(new java.awt.Color(255, 255, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(0,0,0,0));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(0,0,0,0));

        kGradientPanel1.setBackground(new java.awt.Color(0,0,0,0));
        kGradientPanel1.setForeground(new java.awt.Color(0,0,0,0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_image_200px.png"))); // NOI18N
        jLabel2.setText("<html><br/>blahblahblah</html>");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 40, 280, 190));

        jScrollPane2.setViewportView(kGradientPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 500, 330));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened
    void add() {
        // [498, 328]
        int pax = 0, pay = 0;
        JLabel[] label = new JLabel[100];
        for (int i = 0; i < 100; i++) {
            label[i] = new JLabel();
            label[i].setText("label" + i);
            label[i].setName("Fl" + i);
            System.out.println(label[i].getName());

            label[i].setCursor(new Cursor(Cursor.HAND_CURSOR));

            if (pax <= 400) {
                pax += 50;
                kGradientPanel1.add(label[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(10 + pax, 50+pay, -1, -1));
            }
            if (pax >= 400) {
                pay += 20;
                pax=0;
            }

//    if (pax<=400) {
//            pax+=50;
//            kGradientPanel1.add(label[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(10+pax, 50, -1, -1));
//    }
//    if (pax >= 400) {
//        pay+=30;
//        kGradientPanel1.add(label[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(10+pax , 50+pay, -1, -1));
//
//    }
            kGradientPanel1.repaint();
            kGradientPanel1.revalidate();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add();
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Scroll_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scroll_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scroll_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scroll_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scroll_bar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private ceberus.sc_b sc_b1;
    // End of variables declaration//GEN-END:variables
}
