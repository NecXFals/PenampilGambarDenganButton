/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;

/**
 *
 * @author Naufal
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        gambar1BT = new javax.swing.JButton();
        gambar2BT = new javax.swing.JButton();
        gambar3BT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        gambar1LB = new javax.swing.JLabel();
        gambar2LB = new javax.swing.JLabel();
        gambar3LB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gambar1BT.setText("Gambar 1");
        gambar1BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambar1BTActionPerformed(evt);
            }
        });
        buttonPanel.add(gambar1BT);

        gambar2BT.setText("Gambar 2");
        gambar2BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambar2BTActionPerformed(evt);
            }
        });
        buttonPanel.add(gambar2BT);

        gambar3BT.setText("Gambar 3");
        gambar3BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambar3BTActionPerformed(evt);
            }
        });
        buttonPanel.add(gambar3BT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(exitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        gambar1LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar1LB.setIcon(new javax.swing.ImageIcon("E:\\logo uniska.png")); // NOI18N
        imagePanel.add(gambar1LB, "0");

        gambar2LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar2LB.setIcon(new javax.swing.ImageIcon("E:\\Tes.png")); // NOI18N
        imagePanel.add(gambar2LB, "1");

        gambar3LB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar3LB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Naufal\\Downloads\\c824ebb56dc5d2485c5d28d444893908.jpg")); // NOI18N
        imagePanel.add(gambar3LB, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gambar1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambar1BTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
       cl.show(imagePanel, "0") ;
    }//GEN-LAST:event_gambar1BTActionPerformed

    private void gambar2BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambar2BTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
       cl.show(imagePanel, "1") ;
    }//GEN-LAST:event_gambar2BTActionPerformed

    private void gambar3BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambar3BTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
       cl.show(imagePanel, "2") ;
    }//GEN-LAST:event_gambar3BTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitBT;
    private javax.swing.JButton gambar1BT;
    private javax.swing.JLabel gambar1LB;
    private javax.swing.JButton gambar2BT;
    private javax.swing.JLabel gambar2LB;
    private javax.swing.JButton gambar3BT;
    private javax.swing.JLabel gambar3LB;
    private javax.swing.JPanel imagePanel;
    // End of variables declaration//GEN-END:variables
}
