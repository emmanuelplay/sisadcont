/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisadcont.Forms;


import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import static sisadcont.Forms.Login.idsave;
import sisadcont.Process.P_process;
import sisadcont.Process.conectar;

/**
 *
 * @author sisadcont
 */
public class MsgUs extends javax.swing.JFrame {

    /**
     * Creates new form MsgUs
     */
    String msg_rec;
    String Nom_R;
    String Nom_E;
    String Fechahora;
    String SecMsg;
    String sec;
    String msg_env;
    String id_env;
    
    
    
  
    DefaultListModel List_us = new DefaultListModel();
    DefaultListModel List_us_r = new DefaultListModel();
    String[] sec_lista = new String[55];
    String[] id_us_lista = new String[55];
    String[] Sec_msg = new String[55];
    String[] Sec_msg2 = new String[55];
    String[] Sec_sg = new String[55];
    String[] MSG_Choice = new String[3];
   //"No Leidos", "Leidos","Todos"
    
    public MsgUs() {
        initComponents();
       
           
            
       
        choice2.hide();
        this.getContentPane().setBackground(new Color(0,102,204));
        jLabel1.setText("Mensajes Recibidos");
        jPanel2.setVisible(false);
        UsLista();
        UsMsg();
       
        
       
        
           setLocationRelativeTo(null);

    }
    
    void color_btn(JPanel panel, int a){
       if(a == 1){
        panel.setBackground(new Color(0,102,235));
       }else{ 
            panel.setBackground(new Color(0,102,204));    
         
        }
    }
    
    void UsMsgRm(String sql_C)
    {
        
        
        
          
       for(int l=0;l<55;l++){
        Sec_msg2 [l]=null;
        }
       List_us_r.clear();
   
       String sql="SELECT a.nombre_us, b.secuencia, SUBSTRING(b.fechahora,1,16) AS fechahora, b.mensaje FROM usuario a, mensajes b WHERE  b.codigo_us = a.codigo_us  AND  b.codigo_us_r = '"+idsave+"' AND b.estatus = 1 AND b.estado = 0 GROUP BY b.secuencia;";
       
       if (sql_C != null) {
            
            sql=sql_C;
        }
       int a = 0;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            
            while(rs.next())
            {
               
                String Nombre_R=rs.getString("nombre_us");
                Fechahora=rs.getString("fechahora");
                Sec_msg2[a] = rs.getString("secuencia");
                List_us_r.addElement(Nombre_R+" "+Fechahora);  
                
              
            }
           jList1.setModel(List_us_r);
            
             
           
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            P_process.SendMail(ex.getMessage());
        }
       
   
    
     
        }    
    
    
    
    void UsMsg()
    {
        for(int l=0;l<55;l++){
        Sec_msg [l]=null;
        }  
        List_us.clear();
          
       String sql="SELECT a.nombre_us, b.fechahora , secuencia  FROM usuario a, mensajes b WHERE b.codigo_us ='"+idsave+"' AND  b.codigo_us ='"+idsave+"' AND b.estado = 0 AND b.estatus = 1 GROUP BY b.secuencia";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int a=0;
            while(rs.next())
            {
                Nom_R=rs.getString("nombre_us");
                Fechahora=rs.getString("fechahora");
                SecMsg = rs.getString("secuencia");
                List_us.addElement(Nom_R+"  "+Fechahora);
                //List_us.addElement(Nom_R+"  "+Fechahora +"  "+ "("+ SecMsg + ")");
                Sec_msg[a] = SecMsg;
               // JOptionPane.showMessageDialog(null, Sec_msg[a]);
               a++;
              
            }
           jList1.setModel(List_us);
            
             
           
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            P_process.SendMail(ex.getMessage());
        }
       
   
    
     
        }    
    

    
    
     void UsLista()
    {
        choice1.removeAll();
          
       String sql="SELECT codigo_us, nombre_us FROM usuario where codigo_us <> '"+idsave+"';";
      
       
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int a=0;
            while(rs.next())
            {
                Nom_E=rs.getString("nombre_us");
                id_env=rs.getString("codigo_us");
               
                choice1.addItem(Nom_E);
                id_us_lista[a] = id_env ;
                
                a++;

            }
          

             
           
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            P_process.SendMail(ex.getMessage());
        }
       
   
    
     
        }  
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jList1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_27 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        btn_30 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        btn_31 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_28 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        choice1 = new java.awt.Choice();
        btn_29 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        btn_32 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        btn_34 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();

        setBackground(new java.awt.Color(0, 102, 204));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 94, 156)));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jList1.setToolTipText("");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 280));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_27.setBackground(new java.awt.Color(0, 102, 204));
        btn_27.setBorder(javax.swing.BorderFactory.createCompoundBorder());
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

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_message_32px.png"))); // NOI18N

        javax.swing.GroupLayout btn_27Layout = new javax.swing.GroupLayout(btn_27);
        btn_27.setLayout(btn_27Layout);
        btn_27Layout.setHorizontalGroup(
            btn_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_27Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_27Layout.setVerticalGroup(
            btn_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_27Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel36))
        );

        jPanel1.add(btn_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 60, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextArea1MouseEntered(evt);
            }
        });
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 185));

        btn_30.setBackground(new java.awt.Color(0, 102, 204));
        btn_30.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_30MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_30MousePressed(evt);
            }
        });

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel_32px.png"))); // NOI18N

        javax.swing.GroupLayout btn_30Layout = new javax.swing.GroupLayout(btn_30);
        btn_30.setLayout(btn_30Layout);
        btn_30Layout.setHorizontalGroup(
            btn_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_30Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_30Layout.setVerticalGroup(
            btn_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_30Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel37))
        );

        jPanel1.add(btn_30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 60, 40));

        btn_31.setBackground(new java.awt.Color(0, 102, 204));
        btn_31.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_31MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_31MousePressed(evt);
            }
        });

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_32px.png"))); // NOI18N

        javax.swing.GroupLayout btn_31Layout = new javax.swing.GroupLayout(btn_31);
        btn_31.setLayout(btn_31Layout);
        btn_31Layout.setHorizontalGroup(
            btn_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_31Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel38)
                .addGap(5, 5, 5))
        );
        btn_31Layout.setVerticalGroup(
            btn_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_31Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel38))
        );

        jPanel1.add(btn_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 40, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(390, 280));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_28.setBackground(new java.awt.Color(0, 102, 204));
        btn_28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_28MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_28MousePressed(evt);
            }
        });

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/send_32px.png"))); // NOI18N

        javax.swing.GroupLayout btn_28Layout = new javax.swing.GroupLayout(btn_28);
        btn_28.setLayout(btn_28Layout);
        btn_28Layout.setHorizontalGroup(
            btn_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_28Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel39)
                .addGap(10, 10, 10))
        );
        btn_28Layout.setVerticalGroup(
            btn_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_28Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel39))
        );

        jPanel2.add(btn_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 50, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 185));

        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });
        jPanel2.add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 180, -1));

        btn_29.setBackground(new java.awt.Color(0, 102, 204));
        btn_29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_29MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_29MousePressed(evt);
            }
        });

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_32px.png"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_29Layout = new javax.swing.GroupLayout(btn_29);
        btn_29.setLayout(btn_29Layout);
        btn_29Layout.setHorizontalGroup(
            btn_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_29Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel40)
                .addGap(5, 5, 5))
        );
        btn_29Layout.setVerticalGroup(
            btn_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_29Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel40))
        );

        jPanel2.add(btn_29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 40, 40));

        btn_32.setBackground(new java.awt.Color(0, 102, 204));
        btn_32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_32MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_32MousePressed(evt);
            }
        });

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/erase_32px.png"))); // NOI18N

        javax.swing.GroupLayout btn_32Layout = new javax.swing.GroupLayout(btn_32);
        btn_32.setLayout(btn_32Layout);
        btn_32Layout.setHorizontalGroup(
            btn_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_32Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel41)
                .addGap(10, 10, 10))
        );
        btn_32Layout.setVerticalGroup(
            btn_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_32Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel41))
        );

        jPanel2.add(btn_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 50, 40));

        btn_34.setBackground(new java.awt.Color(0, 102, 204));
        btn_34.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_34MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_34MousePressed(evt);
            }
        });

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_chevron_left_round_32px.png"))); // NOI18N

        javax.swing.GroupLayout btn_34Layout = new javax.swing.GroupLayout(btn_34);
        btn_34.setLayout(btn_34Layout);
        btn_34Layout.setHorizontalGroup(
            btn_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_34Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel43)
                .addGap(5, 5, 5))
        );
        btn_34Layout.setVerticalGroup(
            btn_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_34Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel43))
        );

        jPanel2.add(btn_34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 40, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 280));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        choice2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        choice2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jList1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jList1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_27MouseClicked
        // TODO add your handling code here:
        choice2.setVisible(true);
        jLabel1.setText("Mensajes Enviados");
        jPanel2.setVisible(true);
        jPanel1.setVisible(false);
        UsMsgRm(null);
        jTextArea2.setText("");
        
            choice2.removeAll();
        
            MSG_Choice[0]="No Leidos";
            MSG_Choice[1]="Leidos";
            MSG_Choice[2]="Todos";
            
            for (int i = 0; i < 3; i++) {
            choice2.addItem(MSG_Choice[i]);
        }
        
    }//GEN-LAST:event_btn_27MouseClicked

    private void btn_27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_27MouseEntered
        // TODO add your handling code here:
             color_btn(btn_27,1);
    }//GEN-LAST:event_btn_27MouseEntered

    private void btn_27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_27MouseExited
        // TODO add your handling code here:
               color_btn(btn_27,0);
    }//GEN-LAST:event_btn_27MouseExited

    private void btn_27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_27MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_27MousePressed

    private void btn_28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_28MouseClicked
        // TODO add your handling code here:
        choice2.setVisible(false);
        jLabel1.setText("Mensajes Recibidos"); 
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);  
       // UsMsg();
        StringBuffer LU = new StringBuffer();
        LU = LU.append(id_us_lista[choice1.getSelectedIndex()]);
        msg_env = jTextArea2.getText();
   
   if (jTextArea2.getText().length() == 0 ){ 
        
            
          } else { 
        try {
            Statement st = cn.createStatement();
            st.executeUpdate("INSERT INTO mensajes (codigo_us,mensaje,codigo_us_r) VALUES ('"+LU+"','"+msg_env+"','"+idsave+"')");
            jPanel1.setVisible(true);
            jPanel2.setVisible(false);
      
            //List_us.removeAllElements();
           
            
            
  } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
          }
     
      UsLista();
        UsMsg();
       
        jTextArea2.setText("");
      
  

        
    }//GEN-LAST:event_btn_28MouseClicked

    private void btn_28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_28MouseEntered
        // TODO add your handling code here:
       color_btn(btn_28,1);
    }//GEN-LAST:event_btn_28MouseEntered

    private void btn_28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_28MouseExited
        // TODO add your handling code here:
      color_btn(btn_28,0);
    }//GEN-LAST:event_btn_28MouseExited

    private void btn_28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_28MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_28MousePressed

    private void jTextArea1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseEntered
        // TODO add your handling code here:
 // JOptionPane.showMessageDialog(null, jList1.getSelectedIndex());
    }//GEN-LAST:event_jTextArea1MouseEntered

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
    
  
  
    }//GEN-LAST:event_jList1ValueChanged

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_choice1ItemStateChanged

    private void btn_30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_30MouseClicked

    private void btn_30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_30MouseEntered
        // TODO add your handling code here:
       color_btn(btn_30,1);
    }//GEN-LAST:event_btn_30MouseEntered

    private void btn_30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_30MouseExited
        // TODO add your handling code here:
        color_btn(btn_30,0);
    }//GEN-LAST:event_btn_30MouseExited

    private void btn_30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_30MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_30MousePressed

    private void btn_31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_31MouseClicked

    private void btn_31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_31MouseEntered
        // TODO add your handling code here:
        color_btn(btn_31,1);
    }//GEN-LAST:event_btn_31MouseEntered

    private void btn_31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_31MouseExited
        // TODO add your handling code here:
        color_btn(btn_31,0);
    }//GEN-LAST:event_btn_31MouseExited

    private void btn_31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_31MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_31MousePressed

    private void btn_29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_29MouseClicked

    private void btn_29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_29MouseEntered
        // TODO add your handling code here:
        color_btn(btn_29, 1);
    }//GEN-LAST:event_btn_29MouseEntered

    private void btn_29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_29MouseExited
        // TODO add your handling code here:
        color_btn(btn_29, 0);
    }//GEN-LAST:event_btn_29MouseExited

    private void btn_29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_29MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_29MousePressed

    private void btn_32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_32MouseClicked
        // TODO add your handling code here:
      jTextArea2.setText(" ");
    }//GEN-LAST:event_btn_32MouseClicked

    private void btn_32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_32MouseEntered
        // TODO add your handling code here:
        color_btn(btn_32, 1);
    }//GEN-LAST:event_btn_32MouseEntered

    private void btn_32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_32MouseExited
        // TODO add your handling code here:
        color_btn(btn_32, 0);
    }//GEN-LAST:event_btn_32MouseExited

    private void btn_32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_32MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_32MousePressed

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        // TODO add your handling code here:
         color_btn(btn_29, 1);
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        // TODO add your handling code here:
         color_btn(btn_29, 0);
    }//GEN-LAST:event_jLabel40MouseExited

    private void btn_34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_34MouseClicked
        // TODO add your handling code here:
        choice2.setVisible(false);
        jLabel1.setText("Mensajes Recibidos"); 
        jPanel1.setVisible(true);
        jPanel2.setVisible(false); 
    }//GEN-LAST:event_btn_34MouseClicked

    private void btn_34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_34MouseEntered
        // TODO add your handling code here:
       color_btn(btn_34, 1);
    }//GEN-LAST:event_btn_34MouseEntered

    private void btn_34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_34MouseExited
        // TODO add your handling code here:
        color_btn(btn_34, 0);
    }//GEN-LAST:event_btn_34MouseExited

    private void btn_34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_34MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_34MousePressed
 
    private void choice2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice2ItemStateChanged
         
            
        switch(choice2.getSelectedItem()){
             
            case "No Leidos":
               UsMsgRm("SELECT a.nombre_us, b.secuencia, SUBSTRING(b.fechahora,1,16) AS fechahora, b.mensaje FROM usuario a, mensajes b WHERE b.codigo_us = a.codigo_us AND  b.codigo_us_r = '"+idsave+"' AND  b.estado = 0 AND b.estatus = 1  GROUP BY b.secuencia;");
               break;
            
            case "Leidos":
               UsMsgRm("SELECT a.nombre_us, b.secuencia, SUBSTRING(b.fechahora,1,16) AS fechahora, b.mensaje FROM usuario a, mensajes b WHERE b.codigo_us = a.codigo_us AND b.codigo_us_r = '"+idsave+"' AND b.estado = 0 AND b.estatus = 0  GROUP BY b.secuencia;");
               break;
            
            case "Todos":
               UsMsgRm("SELECT a.nombre_us,  b.secuencia, SUBSTRING(b.fechahora,1,16) AS fechahora, b.mensaje FROM usuario a, mensajes b WHERE  b.codigo_us = a.codigo_us AND b.codigo_us_r = '"+idsave+"' AND b.estado = 0 GROUP BY b.secuencia;");
               break;
                
        } 
        
        
    }//GEN-LAST:event_choice2ItemStateChanged

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
         
         if(jPanel1.isVisible() == true){
    
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT  mensaje FROM mensajes  WHERE codigo_us = '"+idsave+"' AND secuencia =  "+Sec_msg[jList1.getSelectedIndex()]+" AND estatus = 1 AND estado = 0 GROUP BY secuencia");
            while(rs.next())
            {
                
                msg_rec = rs.getString("mensaje");
                 JOptionPane.showMessageDialog(null, msg_rec);
                
            }
            
  
  } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            P_process.SendMail(ex.getMessage());
        }
        
        jTextArea1.setText("");
        jTextArea1.setText(msg_rec);
     }
         int b = 0;
         if(jPanel2.isVisible() == true){
             UsMsgRm(null);
       

        try {
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT  mensaje FROM mensajes  WHERE codigo_us_r = '"+idsave+"' AND secuencia =  "+Sec_msg2[jList1.getSelectedIndex()]+" AND estatus = 1 AND estado = 0 GROUP BY secuencia");
            while(rs.next())
            {
                
                msg_rec = rs.getString("mensaje");
                JOptionPane.showMessageDialog(null, msg_rec);
            }
            
  
  } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            P_process.SendMail(ex.getMessage());
        }
            
            jTextArea2.setText("");
            jTextArea2.setText(msg_rec);
     }
        
    }//GEN-LAST:event_jList1MouseClicked

        
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
            java.util.logging.Logger.getLogger(MsgUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MsgUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MsgUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MsgUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MsgUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_27;
    private javax.swing.JPanel btn_28;
    private javax.swing.JPanel btn_29;
    private javax.swing.JPanel btn_30;
    private javax.swing.JPanel btn_31;
    private javax.swing.JPanel btn_32;
    private javax.swing.JPanel btn_34;
    private java.awt.Choice choice1;
    private java.awt.Choice choice2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();

}
