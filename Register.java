/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package katasmain;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
        
        Clear.setOpaque(false);
        //Clear.setContentAreaFilled(false);
        //Clear.setBorderPainted(false);
        
        registerButton.setOpaque(false);
        //registerButton.setContentAreaFilled(false);
        //registerButton.setBorderPainted(false);
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    PreparedStatement Pst = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/userpass", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product123.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Product123.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        emailText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailBox = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        Password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Username1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(207, 255, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(200, 234, 211));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/katasmain/droplet_export.png"))); // NOI18N

        Back.setBackground(new java.awt.Color(200, 234, 211));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/katasmain/back.png"))); // NOI18N
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 870, 60);

        emailText.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        emailText.setText("EMAIL ADDRESS");
        jPanel1.add(emailText);
        emailText.setBounds(30, 200, 160, 40);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 260, 130, 40);

        emailBox.setToolTipText("");
        emailBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailBoxActionPerformed(evt);
            }
        });
        jPanel1.add(emailBox);
        emailBox.setBounds(200, 200, 200, 42);

        registerButton.setBackground(new java.awt.Color(200, 234, 211));
        registerButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/katasmain/register-export.png"))); // NOI18N
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton);
        registerButton.setBounds(50, 340, 160, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/katasmain/water splash11.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(1280, 800));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 60, 316, 410);

        Clear.setBackground(new java.awt.Color(200, 234, 211));
        Clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/katasmain/clear-export.png"))); // NOI18N
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(230, 340, 160, 50);

        showPassword.setBackground(new java.awt.Color(207, 255, 229));
        showPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        showPassword.setText("Show Password");
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
        });
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(showPassword);
        showPassword.setBounds(250, 310, 110, 19);

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password);
        Password.setBounds(200, 260, 200, 40);

        jLabel6.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel6.setText("CREATE AN ACCOUNT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 90, 360, 39);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setText("USERNAME");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 140, 130, 40);

        Username1.setToolTipText("");
        Username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username1ActionPerformed(evt);
            }
        });
        jPanel1.add(Username1);
        Username1.setBounds(200, 140, 200, 42);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailBoxActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        /*
            String firstName = firstname.getText();
            String lastName = lastname.getText();
            String emailId = email.getText();
            String userName = username.getText();
            String mobileNumber = mob.getText();
            int len = mobileNumber.length();
            String password = passwordField.getText();        
        */
        String userName = Username1.getText();
        if(Username1.getText().isEmpty()||emailBox.getText().isEmpty()||Password.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            
        try {
            /*Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/userpass", "root", "");
            String query = "insert into userpass1 values ('" + Username + "','" + emailBox + "','" + Password + "')";

            
            Statement sta = connection.createStatement();
            int x = sta.executeUpdate(query);
            
            if(x == 0) {
                JOptionPane.showMessageDialog(this, "Username already exists");    
            } else {
                JOptionPane.showMessageDialog(this, "Welcome " + msg + "Your account is successfully created" + "\nYou may login");
            }
            connection.close();
            new Login().setVisible(true);
            this.dispose();
            */
            Connection Con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/userpass", "root", "");
            java.sql.PreparedStatement add = Con.prepareStatement("insert into userpass1 values (?, ?, ?)");
            
            add.setString(1, Username1.getText());
            add.setString(2, emailBox.getText());
            add.setString(3, Password.getText());

            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Welcome " + userName + "\nYour account is successfully created" + "\nYou may login");
            Con.close();
            new Login().setVisible(true);
            this.dispose();
        }
            catch(Exception e) 
            {
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_registerButtonMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        Username1.setText("");
        emailBox.setText("");
        Password.setText("");
    }//GEN-LAST:event_ClearMouseClicked

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        if (evt.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                Password.setEchoChar((char) 0);
            }
            else {
                Password.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_showPasswordMouseClicked

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPasswordActionPerformed

    private void Username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username1ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username1;
    private javax.swing.JTextField emailBox;
    private javax.swing.JLabel emailText;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton registerButton;
    private javax.swing.JCheckBox showPassword;
    // End of variables declaration//GEN-END:variables

    private static class DriverManager {

        public DriverManager() {
        }
    }
}
