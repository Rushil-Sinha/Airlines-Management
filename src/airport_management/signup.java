/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_management;

import java.awt.Color;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    PreparedStatement ps;
    ResultSet rs ;
    Statement stm;
    
    public signup() {
        initComponents();
        this.setBounds(1,1,jLabel9.getWidth(),jLabel9.getHeight());
        String driver="jdbc:mysql://localhost/airport";
        String user="root";
        String pw="rushil";
       
        try{
            //Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection(driver,user,pw);
            stm = con.createStatement();            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFUserID = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(141, 26, 151, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(42, 61, 50, 23);

        jTFUserID.setBackground(new java.awt.Color(0, 0, 0));
        jTFUserID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTFUserID);
        jTFUserID.setBounds(182, 62, 135, 20);

        t2.setBackground(new java.awt.Color(0, 0, 0));
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(182, 90, 135, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(42, 90, 130, 23);

        t3.setBackground(new java.awt.Color(0, 0, 0));
        t3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(t3);
        t3.setBounds(182, 119, 135, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Re-enter Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 120, 130, 23);

        t4.setBackground(new java.awt.Color(0, 0, 0));
        t4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(t4);
        t4.setBounds(182, 148, 135, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(42, 148, 50, 23);

        t5.setBackground(new java.awt.Color(0, 0, 0));
        t5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(t5);
        t5.setBounds(182, 177, 135, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(42, 177, 50, 23);

        t6.setBackground(new java.awt.Color(0, 0, 0));
        t6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(t6);
        t6.setBounds(182, 206, 135, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("D.O.B");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(42, 206, 50, 23);

        t7.setBackground(new java.awt.Color(0, 0, 0));
        t7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(t7);
        t7.setBounds(182, 235, 135, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone No.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(42, 235, 98, 23);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 80, 47, 23);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 130, 70, 23);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(450, 230, 51, 23);

        jButton4.setText("Log In");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(450, 180, 70, 23);

        jButton5.setText("Check");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(327, 61, 78, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airport_management/CHUB1820.JPEG"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 590, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new loginform().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTFUserID.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String uid =  jTFUserID.getText();
        String q = "Select * from users where user_id ="  + '"' +uid+ '"'; 
        try{
        rs = stm.executeQuery(q);
        
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Choose another id");
            }
            else{
                jTFUserID.setForeground(Color.GREEN);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String driver="jdbc:mysql://localhost/airport";
        String user="root";
        String pw="rushil";
        
        try{
            Connection con= DriverManager.getConnection(driver,user,pw);
        stm = con.createStatement();
        String a=jTFUserID.getText();
        String b=t2.getText();
        String c=t3.getText();
        String d=t4.getText();
        String e=t5.getText();
        String f=t6.getText();
        String g=t7.getText();
        String query="Insert into users values(?,?,?,?,?,?)" ;
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, a);
            ps.setString(2, b);
            ps.setString(3, d);
            ps.setString(4, e);
            ps.setString(5, f);
            ps.setString(6, g);
            
            
            if (b.equals(c)){
                ps.execute();
            JOptionPane.showMessageDialog(null,"Successfully Registered");
            }
            else{
                t3.setForeground(Color.red);
                JOptionPane.showMessageDialog(null,"Password Field doesn't match");
            }
            ps.close();
            con.close();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTFUserID;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}
