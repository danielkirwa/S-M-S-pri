/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author owner
 */
public final class LoginAccounts extends javax.swing.JFrame {

    /**
     * Creates new form LoginAccounts
     */
    
    
    Statement st;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    String username = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/schoolmanagement";
    
    
    public LoginAccounts() {
        initComponents();
        hidepanel();
    }
    public void hidepanel(){
        jpcreateaccount.setVisible(false);
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
        jplogin = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtrequestusername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrequestpassword = new javax.swing.JPasswordField();
        btnshowpassword = new javax.swing.JCheckBox();
        btnforgotpassword = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnlogincreate = new javax.swing.JButton();
        jpcreateaccount = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtfirstnamerequest = new javax.swing.JTextField();
        txtmiddlenamerequest = new javax.swing.JTextField();
        txtlastnamerequest = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtusernamerequest = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnctreataccountrequest = new javax.swing.JButton();
        txtidnumberrequest = new javax.swing.JTextField();
        txtregistrationpassword2 = new javax.swing.JPasswordField();
        txtregistrationpassword1 = new javax.swing.JPasswordField();
        btnshowregistrationpassword = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Management System");
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(1055, 534));
        jPanel1.setLayout(null);

        jplogin.setBackground(new java.awt.Color(255, 255, 255));
        jplogin.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account", "Admin", "Exams", "Finance", "Library", "Games" }));
        jplogin.add(jComboBox1);
        jComboBox1.setBounds(80, 40, 220, 20);
        jplogin.add(txtrequestusername);
        txtrequestusername.setBounds(80, 100, 220, 20);

        jLabel1.setText("Usrename");
        jplogin.add(jLabel1);
        jLabel1.setBounds(150, 80, 80, 14);

        jLabel2.setText("Password");
        jplogin.add(jLabel2);
        jLabel2.setBounds(160, 130, 60, 14);
        jplogin.add(txtrequestpassword);
        txtrequestpassword.setBounds(80, 160, 220, 20);

        btnshowpassword.setText("Show Password");
        btnshowpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowpasswordActionPerformed(evt);
            }
        });
        jplogin.add(btnshowpassword);
        btnshowpassword.setBounds(120, 190, 140, 23);

        btnforgotpassword.setText("Forgot  Password");
        btnforgotpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnforgotpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforgotpasswordActionPerformed(evt);
            }
        });
        jplogin.add(btnforgotpassword);
        btnforgotpassword.setBounds(80, 290, 230, 23);

        btnlogin.setText("Login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jplogin.add(btnlogin);
        btnlogin.setBounds(80, 223, 230, 40);

        jPanel1.add(jplogin);
        jplogin.setBounds(330, 100, 390, 320);

        btnlogincreate.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnlogincreate.setForeground(new java.awt.Color(51, 102, 255));
        btnlogincreate.setText("CREATE AN ACCOUNT");
        btnlogincreate.setBorder(null);
        btnlogincreate.setBorderPainted(false);
        btnlogincreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogincreate.setFocusPainted(false);
        btnlogincreate.setOpaque(false);
        btnlogincreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogincreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogincreate);
        btnlogincreate.setBounds(670, 471, 370, 40);

        jpcreateaccount.setBackground(new java.awt.Color(255, 255, 255));
        jpcreateaccount.setLayout(null);

        jLabel3.setText("Full Name :");
        jpcreateaccount.add(jLabel3);
        jLabel3.setBounds(10, 20, 80, 14);
        jpcreateaccount.add(txtfirstnamerequest);
        txtfirstnamerequest.setBounds(110, 20, 140, 20);
        jpcreateaccount.add(txtmiddlenamerequest);
        txtmiddlenamerequest.setBounds(280, 20, 170, 20);
        jpcreateaccount.add(txtlastnamerequest);
        txtlastnamerequest.setBounds(470, 20, 160, 20);

        jLabel4.setText("ID   Number  :");
        jpcreateaccount.add(jLabel4);
        jLabel4.setBounds(170, 60, 90, 14);
        jpcreateaccount.add(txtusernamerequest);
        txtusernamerequest.setBounds(280, 90, 170, 20);

        jLabel5.setText("Confirm Password :");
        jpcreateaccount.add(jLabel5);
        jLabel5.setBounds(140, 180, 120, 14);

        jLabel6.setText("Username :");
        jpcreateaccount.add(jLabel6);
        jLabel6.setBounds(180, 100, 80, 14);

        jLabel7.setText("Password :");
        jpcreateaccount.add(jLabel7);
        jLabel7.setBounds(180, 140, 80, 14);

        btnctreataccountrequest.setText("Create Account");
        btnctreataccountrequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnctreataccountrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctreataccountrequestActionPerformed(evt);
            }
        });
        jpcreateaccount.add(btnctreataccountrequest);
        btnctreataccountrequest.setBounds(90, 270, 470, 40);
        jpcreateaccount.add(txtidnumberrequest);
        txtidnumberrequest.setBounds(280, 60, 170, 20);
        jpcreateaccount.add(txtregistrationpassword2);
        txtregistrationpassword2.setBounds(280, 180, 170, 20);
        jpcreateaccount.add(txtregistrationpassword1);
        txtregistrationpassword1.setBounds(280, 140, 170, 20);

        btnshowregistrationpassword.setText("Show Password");
        btnshowregistrationpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshowregistrationpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowregistrationpasswordActionPerformed(evt);
            }
        });
        jpcreateaccount.add(btnshowregistrationpassword);
        btnshowregistrationpassword.setBounds(250, 230, 150, 23);

        jPanel1.add(jpcreateaccount);
        jpcreateaccount.setBounds(200, 100, 650, 320);

        jButton1.setText("admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 30, 100, 23);

        jButton5.setText("Exams");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(210, 30, 120, 23);

        jButton6.setText("library");
        jPanel1.add(jButton6);
        jButton6.setBounds(360, 30, 140, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnforgotpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforgotpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnforgotpasswordActionPerformed

    private void btnshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowpasswordActionPerformed
        // TODO add your handling code here:
        
        // toggle showpassword 
        
         btnshowpassword.addItemListener((ItemEvent e) ->{
         if(e.getStateChange() == ItemEvent.SELECTED){
             txtrequestpassword.setEchoChar((char) 0); 
           
         }else{
            txtrequestpassword.setEchoChar('\u25cf'); 
            
         }
        });
    }//GEN-LAST:event_btnshowpasswordActionPerformed

    private void btnlogincreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogincreateActionPerformed
        // TODO add your handling code here:
        if(jpcreateaccount.isVisible()){
            btnlogincreate.setText("Create an account");
            jplogin.setVisible(true);
            jpcreateaccount.setVisible(false);
        }else{
            btnlogincreate.setText("Login Instead");
            jpcreateaccount.setVisible(true);
            jplogin.setVisible(false);
        }
    }//GEN-LAST:event_btnlogincreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
       new StudentDetails().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
       new ExamDepartment().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnshowregistrationpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowregistrationpasswordActionPerformed
        // TODO add your handling code here:
        btnshowregistrationpassword.addItemListener((ItemEvent e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                txtregistrationpassword1.setEchoChar((char) 0);
                txtregistrationpassword2.setEchoChar((char) 0);
                
            }else{
                txtregistrationpassword1.setEchoChar('\u25cf');
                 txtregistrationpassword2.setEchoChar('\u25cf');
                
            }
        });
    }//GEN-LAST:event_btnshowregistrationpasswordActionPerformed

    private void btnctreataccountrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctreataccountrequestActionPerformed
        // TODO add your handling code here:
        
        // check first account aleady exist 
        
       try{
            // check account if it exists in the databasa
             con = DriverManager.getConnection(url,username,password);
                       st = con.createStatement();
                       String selectcheckid = "SELECT * FROM tblteacheraccount WHERE STAFFID = ?";
                       pst = con.prepareStatement(selectcheckid);
                       pst.setString(1, (String) txtidnumberrequest.getText());
                       rs = pst.executeQuery();
                       if(rs.next()){
                 
            
              String checkid = rs.getString("STAFFID");
              // now the account exist in the database direct to login page
                           if(checkid == null ? txtidnumberrequest.getText() == null : checkid.equals(txtidnumberrequest.getText())){
                               JOptionPane.showMessageDialog(null, "You Already have account Login Instead","School",JOptionPane.WARNING_MESSAGE);
                               // clear all the field and direct to log in
                               txtidnumberrequest.setText("");
                               txtfirstnamerequest.setText("");
                               txtusernamerequest.setText("");
                               txtregistrationpassword2.setText("");
                               txtregistrationpassword1.setText("");
                               txtmiddlenamerequest.setText("");
                               txtlastnamerequest.setText("");
                                jplogin.setVisible(true);
                                jpcreateaccount.setVisible(false);
                           }
                       }else{
                           // account not found in the database proceed to account creation
                           
                           if(!"".equals(txtfirstnamerequest.getText()) && !"".equals(txtidnumberrequest.getText()) && !"".equals(txtusernamerequest.getText())){
               if( txtregistrationpassword1.getText().equals(txtregistrationpassword2.getText())) {
            
                   try{
                       con = DriverManager.getConnection(url,username,password);
                       st = con.createStatement();
                       String selectstaffid = "SELECT * FROM tblteacherdetails WHERE STAFFID = ?";
                       pst = con.prepareStatement(selectstaffid);
                       pst.setString(1, (String) txtidnumberrequest.getText());
                       rs = pst.executeQuery();
                       if(rs.next()){
                           String Accountallowed = rs.getString("ACCOUNTCREATABLE");
                         
                            String sqlupdateteacher = "UPDATE tblteacherdetails set FIRSTNAME ='"+txtfirstnamerequest.getText()+"',"
                                    + "MIDDLENAME='"+txtmiddlenamerequest.getText()+"',"
                    + "LASTNAME='"+txtlastnamerequest.getText()+"' WHERE STAFFID = ?";
             pst = con.prepareStatement(sqlupdateteacher);
            pst.setString(1, txtidnumberrequest.getText());
              pst.executeUpdate();
            
            // insert login credentials
            
                
               JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: green; font-size: 12px;\">Welcoame to the ERP </i></HTML>","School",JOptionPane.WARNING_MESSAGE); 
   
            String insertteacheraccount= "INSERT into tblteacheraccount (STAFFID,USERNAME,PASSWORD,FIRSTNAME) VALUES ('"+txtidnumberrequest.getText()+"',"
                    + "'"+txtusernamerequest.getText()+"','"+txtregistrationpassword1.getText()+"','"+txtfirstnamerequest.getText()+"')";
           st.execute(insertteacheraccount);
                   JOptionPane.showConfirmDialog(null, "New " + Accountallowed + " Account created View it ?","School",JOptionPane.YES_NO_OPTION); 
                     // clear the form and direct to account
                               txtidnumberrequest.setText("");
                               txtfirstnamerequest.setText("");
                               txtusernamerequest.setText("");
                               txtregistrationpassword2.setText("");
                               txtregistrationpassword1.setText("");
                               txtmiddlenamerequest.setText("");
                               txtlastnamerequest.setText("");
                               // call respective account 
                     
                       
                       }else{
               JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: red; font-size: 12px;\">Not allowed to create account Contact Admin</i></HTML>","School",JOptionPane.WARNING_MESSAGE); 
  
                       }
                       
                       
                   }catch( HeadlessException | SQLException ex){
               JOptionPane.showMessageDialog(null, ex,"School",JOptionPane.WARNING_MESSAGE); 

                   }
         }else{
              JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: red; font-size: 12px;\">Password do not match</i></HTML>","School",JOptionPane.WARNING_MESSAGE); 
         }
        
        }else{
             JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: red; font-size: 12px;\">Fill required details</i></HTML>","School",JOptionPane.WARNING_MESSAGE); 
        }
                               
                           }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"error " + ex , "School",JOptionPane.WARNING_MESSAGE); 
        }
       
        
       /*
        
        if(!"".equals(txtfirstnamerequest.getText()) && !"".equals(txtidnumberrequest.getText()) && !"".equals(txtusernamerequest.getText())){
               if( txtregistrationpassword1.getText().equals(txtregistrationpassword2.getText())) {
            
                   try{
                       con = DriverManager.getConnection(url,username,password);
                       st = con.createStatement();
                       String selectstaffid = "SELECT * FROM tblteacherdetails WHERE STAFFID = ?";
                       pst = con.prepareStatement(selectstaffid);
                       pst.setString(1, (String) txtidnumberrequest.getText());
                       rs = pst.executeQuery();
                       if(rs.next()){
                           String Accountallowed = rs.getString("ACCOUNTCREATABLE");
                         
                            String sqlupdateteacher = "UPDATE tblteacherdetails set FIRSTNAME ='"+txtfirstnamerequest.getText()+"',"
                                    + "MIDDLENAME='"+txtmiddlenamerequest.getText()+"',"
                    + "LASTNAME='"+txtlastnamerequest.getText()+"' WHERE STAFFID = ?";
             pst = con.prepareStatement(sqlupdateteacher);
            pst.setString(1, txtidnumberrequest.getText());
            //pst.executeUpdate();
            
            // insert login credentials
            
                
               JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: green; font-size: 12px;\">Welcoame to the ERP </i></HTML>","School",JOptionPane.WARNING_MESSAGE); 
   
            String insertteacheraccount= "INSERT into tblteacheraccount (STAFFID,USERNAME,PASSWORD,FIRSTNAME) VALUES ('"+txtidnumberrequest.getText()+"',"
                    + "'"+txtusernamerequest.getText()+"','"+txtregistrationpassword1.getText()+"','"+txtfirstnamerequest.getText()+"')";
           // st.execute(insertteacheraccount);
                   JOptionPane.showConfirmDialog(null, "New " + Accountallowed + " Account created View it ?","School",JOptionPane.YES_NO_OPTION); 
                     
                       
                       }else{
               JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: red; font-size: 12px;\">Not allowed to create account Contact Admin</i></HTML>","School",JOptionPane.WARNING_MESSAGE); 
  
                       }
                       
                       
                   }catch( HeadlessException | SQLException ex){
               JOptionPane.showMessageDialog(null, ex,"School",JOptionPane.WARNING_MESSAGE); 

                   }
         }else{
              JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: red; font-size: 12px;\">Password do not match</i></HTML>","School",JOptionPane.WARNING_MESSAGE); 
         }
        
        }else{
             JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: red; font-size: 12px;\">Fill required details</i></HTML>","School",JOptionPane.WARNING_MESSAGE); 
        }
        */
      
    }//GEN-LAST:event_btnctreataccountrequestActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnctreataccountrequest;
    private javax.swing.JButton btnforgotpassword;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogincreate;
    private javax.swing.JCheckBox btnshowpassword;
    private javax.swing.JCheckBox btnshowregistrationpassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpcreateaccount;
    private javax.swing.JPanel jplogin;
    private javax.swing.JTextField txtfirstnamerequest;
    private javax.swing.JTextField txtidnumberrequest;
    private javax.swing.JTextField txtlastnamerequest;
    private javax.swing.JTextField txtmiddlenamerequest;
    private javax.swing.JPasswordField txtregistrationpassword1;
    private javax.swing.JPasswordField txtregistrationpassword2;
    private javax.swing.JPasswordField txtrequestpassword;
    private javax.swing.JTextField txtrequestusername;
    private javax.swing.JTextField txtusernamerequest;
    // End of variables declaration//GEN-END:variables
}
