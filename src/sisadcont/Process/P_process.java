/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisadcont.Process;
//holaaaaaaaaaaaaa
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JPanel;
import sisadcont.Forms.P_Principal;

import java.awt.Color;
import javax.swing.JOptionPane;
import static sisadcont.Forms.Login.idsave;

/**
 *
 * @author sisadcont
 */
public class P_process {
   
   
   
     public static void BtnColor(JPanel pane, int a)
    {
        
        if(a==1)
        {
           pane.setBackground(new Color(19,105,188)); 
            }else
        {
                 pane.setBackground(new Color(34,94,156));
         pane.setBorder(null);
        } 
        
        
    }
    
       //cambia el estado hover del boton
 public static void BtnColor2(JPanel pane, int a)
    {
        
        if(a==1)
        {
           pane.setBackground(new Color(145,164,191)); 
            }else
        {
                 pane.setBackground(new Color(116,156,197));
         pane.setBorder(null);
        } 
        
        
    }
        
        
        

      

    
        
    public static void ClosePanel()
    {
        P_Principal.Sec_panel.setVisible(false);
        
        
    }
   
    
    public static void SendMail(String Mesaje) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication("usuario", "contraseña");
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("usuario"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(""));
            message.setSubject("persona");
            message.setText(Mesaje);

            Transport.send(message);
            

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void LogUs(String Us_log) {
    try {
            String ruta = "c:/LogUs.txt";
            String contenido = Us_log;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    
    
      
    public static void cargarCompleter(TextAutoCompleter completador) {
 
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        
        
        String sql="SELECT * FROM USUARIO";
        try {
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
  
            while (rs.next()) {
                AutoCompletado usuario = new AutoCompletado(rs.getString("codigo_us"));
                completador.addItem(usuario);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar el AutoCompleter " + e);
        } finally {

        }
    }
    
  
    
    public static void CallPanels(JPanel Panel_Invocado,JPanel Panel_Invocador,int X,int Y ) {
    
        Panel_Invocado.setVisible(true);
        Panel_Invocado.setSize(X, Y);
        Panel_Invocado.setLocation (0,0);


        Panel_Invocador.removeAll();
        Panel_Invocador.add(Panel_Invocado,BorderLayout.CENTER);
        Panel_Invocador.revalidate();
        Panel_Invocador.repaint(); 
        


}
}
    
