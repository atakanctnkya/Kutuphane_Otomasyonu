/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atakancetinkaya.arayuz;

/**
 *
 * @author ataka
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        btn_uyeESG = new javax.swing.JButton();
        btn_kitapESG = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_uyeESG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_uyeESG.setIcon(new javax.swing.ImageIcon("C:\\Users\\ataka\\OneDrive\\Masaüstü\\KutuphaneOtomasyonu\\image\\users_30x30.jpg")); // NOI18N
        btn_uyeESG.setText("Üye Ekle/Sil/Güncelle");
        btn_uyeESG.setMaximumSize(new java.awt.Dimension(120, 40));
        btn_uyeESG.setMinimumSize(new java.awt.Dimension(120, 40));
        btn_uyeESG.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_uyeESG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uyeESGActionPerformed(evt);
            }
        });
        getContentPane().add(btn_uyeESG);
        btn_uyeESG.setBounds(40, 70, 200, 90);

        btn_kitapESG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_kitapESG.setIcon(new javax.swing.ImageIcon("C:\\Users\\ataka\\OneDrive\\Masaüstü\\KutuphaneOtomasyonu\\image\\books_30x30.jpg")); // NOI18N
        btn_kitapESG.setText("Kitap Ekle/Sil/Güncelle");
        btn_kitapESG.setMaximumSize(new java.awt.Dimension(120, 40));
        btn_kitapESG.setMinimumSize(new java.awt.Dimension(120, 40));
        btn_kitapESG.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_kitapESG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kitapESGActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kitapESG);
        btn_kitapESG.setBounds(290, 70, 210, 90);

        btn_cikis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cikis.setIcon(new javax.swing.ImageIcon("C:\\Users\\ataka\\OneDrive\\Masaüstü\\KutuphaneOtomasyonu\\image\\logout_30x30.jpg")); // NOI18N
        btn_cikis.setText("Çıkış");
        btn_cikis.setMaximumSize(new java.awt.Dimension(120, 40));
        btn_cikis.setMinimumSize(new java.awt.Dimension(120, 40));
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cikis);
        btn_cikis.setBounds(170, 180, 200, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atakancetinkaya/arayuz/background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_uyeESGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uyeESGActionPerformed
        setVisible(false);//formu kapat
        new uyeESG().setVisible(true);//uyeESG formunu aç
    }//GEN-LAST:event_btn_uyeESGActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
       setVisible(false);//formu kapat
       new giris().setVisible(true);//giris formunu aç
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_kitapESGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kitapESGActionPerformed
        setVisible(false);//formu kapat
        new kitapESG().setVisible(true);//kitapESG formunu aç
    }//GEN-LAST:event_btn_kitapESGActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_kitapESG;
    private javax.swing.JButton btn_uyeESG;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}