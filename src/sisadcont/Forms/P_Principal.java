/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisadcont.Forms;


import diu.swe.habib.JPanelSlider.JPanelSlider;
import sisadcont.Process.P_process;
import java.awt.Color;

import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import sisadcont.Panels.P_Menu;
import sisadcont.Panels.P_Mod;

import static sisadcont.Process.P_process.CallPanels;




public class P_Principal extends javax.swing.JFrame {

         P_Menu P_Menu = new P_Menu();  
         int OpenClose=1; 
         
        

    public P_Principal() {
        initComponents();
 
       setLocationRelativeTo(null);
       // this.setExtendedState(NORMAL);
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sec_panel = new javax.swing.JPanel();
        Ter_panel = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanelSlider1 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        jPanel6 = new javax.swing.JPanel();
        btn_3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_27 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btn_24 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_25 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_26 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Paneles = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        Back_C_Panel = new javax.swing.JPanel();
        Mini_Panel = new javax.swing.JPanel();
        btn_10 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1150, 864));
        setPreferredSize(new java.awt.Dimension(1150, 864));
        setResizable(false);
        setSize(new java.awt.Dimension(1150, 864));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sec_panel.setBackground(new java.awt.Color(255, 255, 255));
        Sec_panel.setPreferredSize(new java.awt.Dimension(146, 592));

        javax.swing.GroupLayout Sec_panelLayout = new javax.swing.GroupLayout(Sec_panel);
        Sec_panel.setLayout(Sec_panelLayout);
        Sec_panelLayout.setHorizontalGroup(
            Sec_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        Sec_panelLayout.setVerticalGroup(
            Sec_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );

        getContentPane().add(Sec_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 146, 592));

        Ter_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Ter_panelLayout = new javax.swing.GroupLayout(Ter_panel);
        Ter_panel.setLayout(Ter_panelLayout);
        Ter_panelLayout.setHorizontalGroup(
            Ter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        Ter_panelLayout.setVerticalGroup(
            Ter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        getContentPane().add(Ter_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 900, 52));

        btn_1.setBackground(new java.awt.Color(34, 94, 156));
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setToolTipText("");
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_1MouseReleased(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu_24px.png"))); // NOI18N

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addGap(20, 20, 20))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        getContentPane().add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 65));

        btn_4.setBackground(new java.awt.Color(34, 94, 156));
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setToolTipText("");
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_4MouseReleased(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/message_32px.png"))); // NOI18N

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel19)
                .addContainerGap())
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        getContentPane().add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 60, 65));

        btn_2.setBackground(new java.awt.Color(250, 106, 18));
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setToolTipText("");
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_2MouseReleased(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_24px.png"))); // NOI18N

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_2Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel36)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel36)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        getContentPane().add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 65));

        jPanelSlider1.setBackground(new java.awt.Color(167, 0, 20));
        jPanelSlider1.setBorder(null);

        jPanel6.setBackground(new java.awt.Color(34, 94, 156));
        jPanel6.setToolTipText("");
        jPanel6.setMinimumSize(new java.awt.Dimension(920, 72));
        jPanel6.setName(""); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(920, 72));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_3.setBackground(new java.awt.Color(34, 94, 156));
        btn_3.setForeground(new java.awt.Color(34, 94, 156));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("PROCESOS");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/process_24px.png"))); // NOI18N

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel6.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_6.setBackground(new java.awt.Color(34, 94, 156));
        btn_6.setForeground(new java.awt.Color(34, 94, 156));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("CONSULTAS");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/process_24px.png"))); // NOI18N

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel6.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        btn_7.setBackground(new java.awt.Color(34, 94, 156));
        btn_7.setForeground(new java.awt.Color(34, 94, 156));
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_7MousePressed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("MANTENIMIENTO");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/process_24px.png"))); // NOI18N

        javax.swing.GroupLayout btn_7Layout = new javax.swing.GroupLayout(btn_7);
        btn_7.setLayout(btn_7Layout);
        btn_7Layout.setHorizontalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        btn_7Layout.setVerticalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel6.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 140, -1));

        jPanelSlider1.add(jPanel6, "card5");

        jPanel4.setBackground(new java.awt.Color(34, 94, 156));
        jPanel4.setMinimumSize(new java.awt.Dimension(920, 72));
        jPanel4.setName(""); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(920, 72));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_27.setBackground(new java.awt.Color(34, 94, 156));
        btn_27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_27MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_27MousePressed(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(48, 157, 247));
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sort_left_36px.png"))); // NOI18N

        javax.swing.GroupLayout btn_27Layout = new javax.swing.GroupLayout(btn_27);
        btn_27.setLayout(btn_27Layout);
        btn_27Layout.setHorizontalGroup(
            btn_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_27Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_27Layout.setVerticalGroup(
            btn_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_27Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel4.add(btn_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 65));

        btn_24.setBackground(new java.awt.Color(34, 94, 156));
        btn_24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_24MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_24MousePressed(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell_stock_24px_B.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        String t = "<html><body>Inventario de<br>Productos<br>otros elementos</body></html>";
        jLabel9.setText(t);

        javax.swing.GroupLayout btn_24Layout = new javax.swing.GroupLayout(btn_24);
        btn_24.setLayout(btn_24Layout);
        btn_24Layout.setHorizontalGroup(
            btn_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_24Layout.createSequentialGroup()
                .addGroup(btn_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_24Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel27))
                    .addGroup(btn_24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_24Layout.setVerticalGroup(
            btn_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_24Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel27)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel4.add(btn_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 65));

        btn_25.setBackground(new java.awt.Color(34, 94, 156));
        btn_25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_25MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_25MousePressed(evt);
            }
        });

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell_stock_24px_B.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(t);

        javax.swing.GroupLayout btn_25Layout = new javax.swing.GroupLayout(btn_25);
        btn_25.setLayout(btn_25Layout);
        btn_25Layout.setHorizontalGroup(
            btn_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_25Layout.createSequentialGroup()
                .addGroup(btn_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_25Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel28))
                    .addGroup(btn_25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_25Layout.setVerticalGroup(
            btn_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_25Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel28)
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel4.add(btn_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 65));

        btn_26.setBackground(new java.awt.Color(34, 94, 156));
        btn_26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_26MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_26MousePressed(evt);
            }
        });

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell_stock_24px_B.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(t);

        javax.swing.GroupLayout btn_26Layout = new javax.swing.GroupLayout(btn_26);
        btn_26.setLayout(btn_26Layout);
        btn_26Layout.setHorizontalGroup(
            btn_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_26Layout.createSequentialGroup()
                .addGroup(btn_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_26Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel29))
                    .addGroup(btn_26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_26Layout.setVerticalGroup(
            btn_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_26Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel29)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel4.add(btn_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 65));

        jPanelSlider1.add(jPanel4, "card5");

        getContentPane().add(jPanelSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 890, 65));

        Paneles.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_vmas.png"))); // NOI18N

        javax.swing.GroupLayout PanelesLayout = new javax.swing.GroupLayout(Paneles);
        Paneles.setLayout(PanelesLayout);
        PanelesLayout.setHorizontalGroup(
            PanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelesLayout.createSequentialGroup()
                .addContainerGap(717, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(100, 100, 100))
        );
        PanelesLayout.setVerticalGroup(
            PanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelesLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        getContentPane().add(Paneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1150, 740));
        Paneles.getAccessibleContext().setAccessibleName("");

        Back_C_Panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Back_C_PanelLayout = new javax.swing.GroupLayout(Back_C_Panel);
        Back_C_Panel.setLayout(Back_C_PanelLayout);
        Back_C_PanelLayout.setHorizontalGroup(
            Back_C_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        Back_C_PanelLayout.setVerticalGroup(
            Back_C_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        getContentPane().add(Back_C_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 1150, 760));

        Mini_Panel.setBackground(new java.awt.Color(255, 255, 255));

        btn_10.setBackground(new java.awt.Color(250, 106, 18));
        btn_10.setForeground(new java.awt.Color(255, 255, 255));
        btn_10.setToolTipText("");
        btn_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_10MouseReleased(evt);
            }
        });
        btn_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_10KeyPressed(evt);
            }
        });

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_24px.png"))); // NOI18N

        javax.swing.GroupLayout btn_10Layout = new javax.swing.GroupLayout(btn_10);
        btn_10.setLayout(btn_10Layout);
        btn_10Layout.setHorizontalGroup(
            btn_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel40)
                .addGap(10, 10, 10))
        );
        btn_10Layout.setVerticalGroup(
            btn_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel40))
        );

        javax.swing.GroupLayout Mini_PanelLayout = new javax.swing.GroupLayout(Mini_Panel);
        Mini_Panel.setLayout(Mini_PanelLayout);
        Mini_PanelLayout.setHorizontalGroup(
            Mini_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Mini_PanelLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Mini_PanelLayout.setVerticalGroup(
            Mini_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mini_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(Mini_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 66, 250, 42));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx,xy;
    private void btn_27MouseClicked(MouseEvent evt) {//GEN-FIRST:event_btn_27MouseClicked
       
        jPanelSlider1.nextPanel(10,jPanel6,JPanelSlider.left);
    }//GEN-LAST:event_btn_27MouseClicked

    private void btn_27MousePressed(MouseEvent evt) {//GEN-FIRST:event_btn_27MousePressed
   
    }//GEN-LAST:event_btn_27MousePressed

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
     
     
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseReleased
  
        
    }//GEN-LAST:event_btn_1MouseReleased

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        Sec_panel.setVisible(true); 
        if (OpenClose == 1) {

            CallPanels(P_Menu, Sec_panel, 146, 592);

       OpenClose=2;   
       } else {

            P_Principal.Sec_panel.setVisible(false);  
         OpenClose=1;
         
  
 }


    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
      
        MsgUs MsgUs=new MsgUs();
        MsgUs.setVisible(true);

        
    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4MousePressed

    private void btn_4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4MouseReleased

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        // TODO add your handling code here:
        jPanelSlider1.nextPanel(10,jPanel4,JPanelSlider.right);
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseEntered
        // TODO add your handling code here:
        P_process.BtnColor(btn_3, 1);
    }//GEN-LAST:event_btn_3MouseEntered

    private void btn_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseExited
        // TODO add your handling code here:
         P_process.BtnColor(btn_3, 0);
    }//GEN-LAST:event_btn_3MouseExited

    private void btn_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseEntered
        // TODO add your handling code here:
        P_process.BtnColor(btn_4, 1);
        
    }//GEN-LAST:event_btn_4MouseEntered

    private void btn_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseExited
        // TODO add your handling code here:
        P_process.BtnColor(btn_4, 0);
    }//GEN-LAST:event_btn_4MouseExited

    private void btn_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseEntered
        // TODO add your handling code here:
        P_process.BtnColor(btn_1, 1);
    }//GEN-LAST:event_btn_1MouseEntered

    private void btn_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseExited
        // TODO add your handling code here:
        P_process.BtnColor(btn_1, 0);
    }//GEN-LAST:event_btn_1MouseExited

    private void btn_27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_27MouseEntered
        // TODO add your handling code here:
        P_process.BtnColor(btn_27, 1);
    }//GEN-LAST:event_btn_27MouseEntered

    private void btn_27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_27MouseExited
        // TODO add your handling code here:
        P_process.BtnColor(btn_27, 0);
    }//GEN-LAST:event_btn_27MouseExited

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked

    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseEntered
        // TODO add your handling code here:
        
        btn_2.setBackground(new Color(250,70,18));
        
    }//GEN-LAST:event_btn_2MouseEntered

    private void btn_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseExited
        // TODO add your handling code here:
        btn_2.setBackground(new Color(250,106,18));
    }//GEN-LAST:event_btn_2MouseExited

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_2MousePressed

    private void btn_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_2MouseReleased

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseEntered
        // TODO add your handling code here:
         P_process.BtnColor(btn_6, 1);
    }//GEN-LAST:event_btn_6MouseEntered

    private void btn_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseExited
        // TODO add your handling code here:
         P_process.BtnColor(btn_6, 0);
    }//GEN-LAST:event_btn_6MouseExited

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_6MousePressed

    private void btn_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_7MouseClicked

    private void btn_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseEntered
        // TODO add your handling code here:
         P_process.BtnColor(btn_7, 1);
    }//GEN-LAST:event_btn_7MouseEntered

    private void btn_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseExited
        // TODO add your handling code here:
         P_process.BtnColor(btn_7, 0);
    }//GEN-LAST:event_btn_7MouseExited

    private void btn_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_7MousePressed

    private void btn_24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_24MouseClicked

    private void btn_24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_24MouseEntered

    private void btn_24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_24MouseExited

    private void btn_24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_24MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_24MousePressed

    private void btn_25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_25MouseClicked

    private void btn_25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_25MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_25MouseEntered

    private void btn_25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_25MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_25MouseExited

    private void btn_25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_25MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_25MousePressed

    private void btn_26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_26MouseClicked

    private void btn_26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_26MouseEntered

    private void btn_26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_26MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_26MouseExited

    private void btn_26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_26MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_26MousePressed

    private void btn_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MouseClicked
        // TODO add your handling code here:
         CallPanels(P_Mod.MiniPanel,P_Principal.Mini_Panel,256, 38);

        
    }//GEN-LAST:event_btn_10MouseClicked

    private void btn_10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_10MouseEntered

    private void btn_10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_10MouseExited

    private void btn_10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_10MousePressed

    private void btn_10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_10MouseReleased

    private void btn_10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_10KeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new P_Principal().setVisible(true);
            }
        });
    }
    
    
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
             for (JPanel pane1 : pane) {
                 pane1.setBackground(new Color(23,35,51));
             }
             for (JPanel indicator : indicators) {
                 indicator.setOpaque(false);
             }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Back_C_Panel;
    public static javax.swing.JPanel Mini_Panel;
    public static javax.swing.JPanel Paneles;
    public static javax.swing.JPanel Sec_panel;
    public static javax.swing.JPanel Ter_panel;
    public static javax.swing.JPanel btn_1;
    public static javax.swing.JPanel btn_10;
    public static javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_24;
    private javax.swing.JPanel btn_25;
    private javax.swing.JPanel btn_26;
    private javax.swing.JPanel btn_27;
    public static javax.swing.JPanel btn_3;
    public static javax.swing.JPanel btn_4;
    public static javax.swing.JPanel btn_6;
    public static javax.swing.JPanel btn_7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel6;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider1;
    // End of variables declaration//GEN-END:variables
}
