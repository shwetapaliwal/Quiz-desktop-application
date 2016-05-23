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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

/**
 *
 * @author shweta
 */
public class Questions extends javax.swing.JFrame {
    
    
    
    public static ArrayList<Question> l1 = new ArrayList<Question>(20);
     static int count = 0;
     String answer;
     int marks;
    static
    {
        try
        {
            Connection con = DriverManager.getConnection(DBConnect.con, DBConnect.user,DBConnect.pass);
            Statement st = con.createStatement();
            String Query = "(select * from Questions where lev = 'easy' and sub = '"+SelectSub.subject+"' order by rand() limit 5)" +
                           "union (select * from Questions where lev = 'Medium' and sub = '"+SelectSub.subject+"' order by rand() limit 5)"+
                           "union(select * from Questions where lev = 'Hard' and sub = '"+SelectSub.subject+"' order by rand() limit 5) ";
            ResultSet rs = st.executeQuery(Query);
           
            while(rs.next())
            {
                Question Q = new Question();
                Q.setQues(rs.getString(2));
                Q.setOp1(rs.getString(3));
                Q.setOp2(rs.getString(4));
                Q.setOp3(rs.getString(5));
                Q.setOp4(rs.getString(6));
                Q.setCAnswer(rs.getString(7));
                Q.setmarks(rs.getInt(10));
               l1.add(Q);
               
            }   
               con.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }

    public Questions() {
        initComponents();
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        setSize(d.width, d.height);
//         ImageIcon img = new ImageIcon("E:/Quiz/qback.jpg");
//        rbtnOp1.setIcon(img);
//        ImageIcon img1 = new ImageIcon("E:/Quiz/qback.jpg");
//        rbtnOp2.setIcon(img1);
//        ImageIcon img2 = new ImageIcon("E:/Quiz/qback.jpg");
//        rbtnOp3.setIcon(img2);
//        ImageIcon img3 = new ImageIcon("E:/Quiz/qback.jpg");
//        rbtnOp4.setIcon(img3);
       
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbtnOp1);
        bg.add(rbtnOp2);
        bg.add(rbtnOp3);
        bg.add(rbtnOp4);
        Question qu = l1.get(count);
       String question = qu.getQues();
       taQ.setText(question);
       String opt1 = qu.getOp1();
       rbtnOp1.setText(opt1);
       String opt2 = qu.getOp2();
       rbtnOp2.setText(opt2);
       String opt3 = qu.getOp3();
       rbtnOp3.setText(opt3);
       String opt4 = qu.getOp4();
       rbtnOp4.setText(opt4);
       marks = qu.getmarks();
       
       answer = qu.getCAnswer();
// taa.setText(answer);
//        
       
       count++;
       String str = String.valueOf(count);
       tfCount.setText(str);
      
    }
   

    
    
    
         
                
            
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taQ = new javax.swing.JTextArea();
        rbtnOp1 = new javax.swing.JRadioButton();
        rbtnOp2 = new javax.swing.JRadioButton();
        rbtnOp3 = new javax.swing.JRadioButton();
        rbtnOp4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        lblOp1 = new javax.swing.JLabel();
        lblOp3 = new javax.swing.JLabel();
        lblOp4 = new javax.swing.JLabel();
        lblOp2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCount = new javax.swing.JTextField();
        btnFinish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        taQ.setEditable(false);
        taQ.setColumns(20);
        taQ.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        taQ.setRows(5);
        jScrollPane1.setViewportView(taQ);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(47, 11, 860, 210);

        rbtnOp1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbtnOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOp1ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnOp1);
        rbtnOp1.setBounds(50, 260, 390, 21);

        rbtnOp2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getContentPane().add(rbtnOp2);
        rbtnOp2.setBounds(50, 310, 390, 21);

        rbtnOp3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getContentPane().add(rbtnOp3);
        rbtnOp3.setBounds(50, 360, 390, 21);

        rbtnOp4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbtnOp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOp4ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnOp4);
        rbtnOp4.setBounds(50, 410, 390, 21);

        btnNext.setFont(new java.awt.Font("Snap ITC", 3, 36)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(110, 470, 200, 55);

        lblOp1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblOp1.setText("A.");
        getContentPane().add(lblOp1);
        lblOp1.setBounds(10, 252, 40, 40);

        lblOp3.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblOp3.setText("C.");
        getContentPane().add(lblOp3);
        lblOp3.setBounds(10, 350, 40, 40);

        lblOp4.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblOp4.setText("D.");
        getContentPane().add(lblOp4);
        lblOp4.setBounds(10, 400, 40, 40);

        lblOp2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblOp2.setText("B.");
        getContentPane().add(lblOp2);
        lblOp2.setBounds(10, 300, 40, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(809, 294, 0, 0);

        tfCount.setEditable(false);
        tfCount.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        getContentPane().add(tfCount);
        tfCount.setBounds(0, 11, 50, 50);

        btnFinish.setFont(new java.awt.Font("Snap ITC", 3, 36)); // NOI18N
        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinish);
        btnFinish.setBounds(450, 470, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/quesback1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, -2, 1366, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       String s1 = lblOp1.getText();
            String s2 = lblOp2.getText();
            String s3 = lblOp3.getText();
            String s4 = lblOp4.getText();
        if(rbtnOp1.isSelected() || answer.equals(s1))
        {
          ResultClass.score = ResultClass.score + marks;
//           
        }
        else if(rbtnOp2.isSelected() || answer.equals(s2))
        {
            
            ResultClass.score = ResultClass.score + marks;       
        }
        else if(rbtnOp3.isSelected()|| answer.endsWith(s3) )
        {

            ResultClass.score = ResultClass.score + marks;
        }
        else if(rbtnOp4.isSelected()|| answer.equals(s4) )
        {

            ResultClass.score = ResultClass.score + marks;
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Select one option");
            return;
        }
        
        this.dispose();
        
        new Questions().setVisible(true);

         
        
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
        
    }//GEN-LAST:event_formWindowActivated

    private void rbtnOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOp1ActionPerformed
        
           
    }//GEN-LAST:event_rbtnOp1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void rbtnOp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOp4ActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        this.dispose();
        new Result().setVisible(true);
    }//GEN-LAST:event_btnFinishActionPerformed

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
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOp1;
    private javax.swing.JLabel lblOp2;
    private javax.swing.JLabel lblOp3;
    private javax.swing.JLabel lblOp4;
    private javax.swing.JRadioButton rbtnOp1;
    private javax.swing.JRadioButton rbtnOp2;
    private javax.swing.JRadioButton rbtnOp3;
    private javax.swing.JRadioButton rbtnOp4;
    private javax.swing.JTextArea taQ;
    private javax.swing.JTextField tfCount;
    // End of variables declaration//GEN-END:variables
}
