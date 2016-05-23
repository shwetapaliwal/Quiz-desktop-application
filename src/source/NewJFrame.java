/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author shweta
 */
public class NewJFrame extends javax.swing.JFrame {
   
    public NewJFrame() {
        initComponents();
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        setSize(d.width, d.height);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbtnUser);
        bg.add(rbtnAdmin);
       
        ImageIcon img = new ImageIcon("E:/Mtech project/Quiz/register2.jpg");
        signbtn.setIcon(img);
        ImageIcon img1 = new ImageIcon("E:/Mtech project/Quiz/loginbutton.png");
        btnOK.setIcon(img1);
        ImageIcon img2 = new ImageIcon("E:/Mtech project/Quiz/user.png");
        userlbl.setIcon(img2);

    }
    public Boolean checkLogin(String email,String pwd)
    {
        try
        {
            Connection con = DriverManager.getConnection(DBConnect.con,DBConnect.user,DBConnect.pass);
            PreparedStatement pst = con.prepareStatement("Select * from Registration1 where email=? and pwd=?;");
             pst.setString(1, email); //this replaces the 1st  "?" in the query for username
            pst.setString(2, pwd);    //this replaces the 2st  "?" in the query for password
            //executes the prepared statement
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                 return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
            return false;
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signbtn = new javax.swing.JButton();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnUser = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUName = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        pfPass = new javax.swing.JPasswordField();
        userlbl = new javax.swing.JLabel();
        backlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Quiz");
        setBackground(new java.awt.Color(0, 0, 255));
        setFont(new java.awt.Font("Andalus", 3, 24)); // NOI18N
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(null);

        signbtn.setBackground(new java.awt.Color(255, 255, 255));
        signbtn.setFont(new java.awt.Font("Freestyle Script", 1, 18)); // NOI18N
        signbtn.setText("Register here");
        signbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signbtnActionPerformed(evt);
            }
        });
        getContentPane().add(signbtn);
        signbtn.setBounds(422, 13, 217, 92);

        rbtnAdmin.setBackground(new java.awt.Color(255, 255, 255));
        rbtnAdmin.setFont(new java.awt.Font("Colonna MT", 3, 36)); // NOI18N
        rbtnAdmin.setForeground(new java.awt.Color(51, 0, 51));
        rbtnAdmin.setText("Admin");
        getContentPane().add(rbtnAdmin);
        rbtnAdmin.setBounds(83, 112, 206, 74);

        rbtnUser.setBackground(new java.awt.Color(255, 255, 255));
        rbtnUser.setFont(new java.awt.Font("Colonna MT", 3, 36)); // NOI18N
        rbtnUser.setForeground(new java.awt.Color(51, 0, 51));
        rbtnUser.setText("User");
        getContentPane().add(rbtnUser);
        rbtnUser.setBounds(422, 112, 125, 74);

        jLabel2.setBackground(new java.awt.Color(51, 0, 255));
        jLabel2.setFont(new java.awt.Font("Colonna MT", 3, 36)); // NOI18N
        jLabel2.setText("User Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(83, 224, 206, 52);

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setFont(new java.awt.Font("Colonna MT", 3, 36)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(83, 332, 206, 50);

        tfUName.setBackground(new java.awt.Color(204, 204, 255));
        tfUName.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        tfUName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfUNameMouseEntered(evt);
            }
        });
        getContentPane().add(tfUName);
        tfUName.setBounds(372, 220, 487, 65);

        btnOK.setBackground(new java.awt.Color(255, 255, 255));
        btnOK.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK);
        btnOK.setBounds(216, 454, 350, 110);

        pfPass.setBackground(new java.awt.Color(204, 204, 255));
        pfPass.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        getContentPane().add(pfPass);
        pfPass.setBounds(372, 333, 487, 72);

        userlbl.setFont(new java.awt.Font("Colonna MT", 3, 24)); // NOI18N
        userlbl.setText("New User :");
        getContentPane().add(userlbl);
        userlbl.setBounds(83, 16, 230, 87);

        backlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/quesback.jpg"))); // NOI18N
        backlbl.setText("backlbl");
        backlbl.setMaximumSize(new java.awt.Dimension(1366, 768));
        backlbl.setMinimumSize(new java.awt.Dimension(1366, 768));
        backlbl.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(backlbl);
        backlbl.setBounds(4, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signbtnActionPerformed
        new RegForm().setVisible(true);
    }//GEN-LAST:event_signbtnActionPerformed

    private void tfUNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUNameMouseEntered
         
    }//GEN-LAST:event_tfUNameMouseEntered

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
      try
      {
        if(tfUName.getText().equals("")||
                String.valueOf(pfPass.getPassword()).equals(""))
        {
          JOptionPane.showMessageDialog(rootPane, "Entries are not completed !!");
          return;
        }
        if(!(rbtnUser.isSelected()||
                rbtnAdmin.isSelected()))
        {
            JOptionPane.showMessageDialog(null, "select user or admin!!");
            return;
        }
        
            
       if(!(checkLogin(tfUName.getText(),String.valueOf(pfPass.getPassword()))))
//        {
//            JOptionPane.showMessageDialog(null, "You have logged in successfully");
//        }
//        else
        {
             JOptionPane.showMessageDialog(null, "Login failed!..You are not Regitered");
             return;
        }
          
        if(rbtnUser.isSelected())
        {
          
          new SelectSub().setVisible(true);
        }
        else if(tfUName.getText().equals("shwetap.1992@gmail.com")||String.valueOf(pfPass.getPassword()).equals("shweta"))
            {
               new AdminForm().setVisible(true);
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Login failed!.. You are not admin");
                return;
            }
          
          
        
        
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(rootPane, e.toString());
      }
    }//GEN-LAST:event_btnOKActionPerformed

   
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backlbl;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnUser;
    private javax.swing.JButton signbtn;
    private javax.swing.JTextField tfUName;
    private javax.swing.JLabel userlbl;
    // End of variables declaration//GEN-END:variables

    private void Visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
