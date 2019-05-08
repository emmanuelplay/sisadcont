/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisadcont.Panels;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sisadcont.Forms.P_Principal;
import sisadcont.Forms.Panels.V_Fact;

public class P_Fact extends javax.swing.JPanel {
      V_Fact Fact = new V_Fact();
  
    public P_Fact() {
        initComponents();
    }
    
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        BT_2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        BT_3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 52));

        BT_1.setBackground(new java.awt.Color(255, 255, 255));
        BT_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        BT_1.setForeground(new java.awt.Color(255, 204, 51));
        BT_1.setPreferredSize(new java.awt.Dimension(46, 40));
        BT_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_1MousePressed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell_stock_24px.png"))); // NOI18N

        javax.swing.GroupLayout BT_1Layout = new javax.swing.GroupLayout(BT_1);
        BT_1.setLayout(BT_1Layout);
        BT_1Layout.setHorizontalGroup(
            BT_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BT_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(10, 10, 10))
        );
        BT_1Layout.setVerticalGroup(
            BT_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BT_1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BT_2.setBackground(new java.awt.Color(255, 255, 255));
        BT_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        BT_2.setForeground(new java.awt.Color(255, 204, 51));
        BT_2.setPreferredSize(new java.awt.Dimension(46, 40));
        BT_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_2MousePressed(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell_stock_24px.png"))); // NOI18N

        javax.swing.GroupLayout BT_2Layout = new javax.swing.GroupLayout(BT_2);
        BT_2.setLayout(BT_2Layout);
        BT_2Layout.setHorizontalGroup(
            BT_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BT_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(10, 10, 10))
        );
        BT_2Layout.setVerticalGroup(
            BT_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BT_2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BT_3.setBackground(new java.awt.Color(255, 255, 255));
        BT_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        BT_3.setForeground(new java.awt.Color(255, 204, 51));
        BT_3.setPreferredSize(new java.awt.Dimension(46, 40));
        BT_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_3MousePressed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell_stock_24px.png"))); // NOI18N

        javax.swing.GroupLayout BT_3Layout = new javax.swing.GroupLayout(BT_3);
        BT_3.setLayout(BT_3Layout);
        BT_3Layout.setHorizontalGroup(
            BT_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BT_3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(10, 10, 10))
        );
        BT_3Layout.setVerticalGroup(
            BT_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BT_3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(866, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void BT_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_3MousePressed

    private void BT_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_3MouseExited

    private void BT_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_3MouseEntered

    private void BT_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_3MouseClicked

    private void BT_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_2MousePressed

    private void BT_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_2MouseExited

    private void BT_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_2MouseEntered

    private void BT_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_2MouseClicked

    private void BT_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_1MousePressed
        // TODO add your handling code here:


        
    }//GEN-LAST:event_BT_1MousePressed

    private void BT_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_1MouseExited
        // TODO add your handling code here:
        BT_1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_BT_1MouseExited

    private void BT_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_1MouseEntered
        // TODO add your handling code here:
        BT_1.setBackground(new Color(48,170,247));
    }//GEN-LAST:event_BT_1MouseEntered

    private void BT_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_1MouseClicked
        // TODO add your handling code here:
P_Principal.Paneles.setVisible(true);

Fact.setSize(1020, 600);
Fact.setLocation (0,0);

P_Principal.Paneles.removeAll();
P_Principal.Paneles.add(Fact,BorderLayout.CENTER);
P_Principal.Paneles.revalidate();
P_Principal.Paneles.repaint();

        
        
    }//GEN-LAST:event_BT_1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BT_1;
    private javax.swing.JPanel BT_2;
    private javax.swing.JPanel BT_3;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    // End of variables declaration//GEN-END:variables
}
