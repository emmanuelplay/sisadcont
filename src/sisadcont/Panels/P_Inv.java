/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisadcont.Panels;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class P_Inv extends javax.swing.JPanel {

  
    public P_Inv() {
        initComponents();
    }
    
    
 private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(48,157,247));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_6 = new javax.swing.JPanel();
        BT_1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        BT_2 = new javax.swing.JPanel();
        BT_3 = new javax.swing.JPanel();

        btn_6.setBackground(new java.awt.Color(255, 255, 255));
        btn_6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        btn_6.setForeground(new java.awt.Color(255, 204, 0));
        btn_6.setToolTipText("");
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_6MouseReleased(evt);
            }
        });

        BT_1.setBackground(new java.awt.Color(255, 255, 255));
        BT_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        BT_1.setForeground(new java.awt.Color(255, 204, 51));
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

        javax.swing.GroupLayout BT_2Layout = new javax.swing.GroupLayout(BT_2);
        BT_2.setLayout(BT_2Layout);
        BT_2Layout.setHorizontalGroup(
            BT_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        BT_2Layout.setVerticalGroup(
            BT_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        BT_3.setBackground(new java.awt.Color(255, 255, 255));
        BT_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        BT_3.setForeground(new java.awt.Color(255, 204, 51));
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

        javax.swing.GroupLayout BT_3Layout = new javax.swing.GroupLayout(BT_3);
        BT_3.setLayout(BT_3Layout);
        BT_3Layout.setHorizontalGroup(
            BT_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        BT_3Layout.setVerticalGroup(
            BT_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(913, Short.MAX_VALUE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_6MouseReleased

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_6MousePressed

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_6MouseClicked

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
        JOptionPane.showMessageDialog(null, "prueba");
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
    }//GEN-LAST:event_BT_1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BT_1;
    private javax.swing.JPanel BT_2;
    private javax.swing.JPanel BT_3;
    private javax.swing.JPanel btn_6;
    private javax.swing.JLabel jLabel19;
    // End of variables declaration//GEN-END:variables
}
