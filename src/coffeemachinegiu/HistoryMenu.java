/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachinegiu;

import static coffeemachinegiu.MainCoffeeMachine.coffee;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class HistoryMenu extends javax.swing.JFrame {

    /**
     * Creates new form HistoryMenu
     */
    public HistoryMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        num = new javax.swing.JButton();
        numSE = new javax.swing.JButton();
        numDE = new javax.swing.JButton();
        numSA = new javax.swing.JButton();
        numDA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(71, 47, 35));

        num.setBackground(new java.awt.Color(211, 162, 113));
        num.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        num.setText(" Number of All cupes");
        num.setBorder(null);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });

        numSE.setBackground(new java.awt.Color(211, 162, 113));
        numSE.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        numSE.setText(" Number of cupes in single espresso");
        numSE.setBorder(null);
        numSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSEActionPerformed(evt);
            }
        });

        numDE.setBackground(new java.awt.Color(211, 162, 113));
        numDE.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        numDE.setText(" Number of cupes in double espresso");
        numDE.setBorder(null);
        numDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDEActionPerformed(evt);
            }
        });

        numSA.setBackground(new java.awt.Color(211, 162, 113));
        numSA.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        numSA.setText(" Number of cupes in single espresso");
        numSA.setBorder(null);
        numSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSAActionPerformed(evt);
            }
        });

        numDA.setBackground(new java.awt.Color(211, 162, 113));
        numDA.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        numDA.setText(" Number of cupes in double amricano");
        numDA.setBorder(null);
        numDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("the History");

        jButton1.setBackground(new java.awt.Color(71, 47, 35));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeemachinegiu/imeges/icons8_exit_40px_2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numSA, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numSE, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numDE, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(numDA, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numSE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numDE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numSA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(numDA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSEActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"- The number of cupes for single espresso today is: "
                                            + coffee.getWater().getCountSingleE());
    }//GEN-LAST:event_numSEActionPerformed

    private void numDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDEActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"- The number of cupes for double espresso today is: "
                                            + coffee.getWater().getCountDoubleE());
    }//GEN-LAST:event_numDEActionPerformed

    private void numSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSAActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"- The number of cupes for single amricano today is: "
                                            + coffee.getWater().getCountSingleA());
    }//GEN-LAST:event_numSAActionPerformed

    private void numDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDAActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"- The number of cupes for double amricano today is: "
                                            + coffee.getWater().getCountDoubleA());
    }//GEN-LAST:event_numDAActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"- The number of cupes today is: "
                                            + coffee.getWater().getCount());
    }//GEN-LAST:event_numActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HistoryMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton num;
    private javax.swing.JButton numDA;
    private javax.swing.JButton numDE;
    private javax.swing.JButton numSA;
    private javax.swing.JButton numSE;
    // End of variables declaration//GEN-END:variables
}
