/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import myapp.loginForm;

/**
 *
 * @author cedricjadee
 */
public class userPage extends javax.swing.JFrame {

    /**
     * Creates new form userPage
     */
    public userPage() {
        initComponents();
        id.setOpaque(false);
        id.setBackground(new Color(0,0,0,0));
        name.setOpaque(false);
        name.setBackground(new Color(0,0,0,0));
        email.setOpaque(false);
        email.setBackground(new Color(0,0,0,0));
        username.setOpaque(false);
        username.setBackground(new Color(0,0,0,0));
     
        
    }
    
        static String idd;
    
    
        Color hover = new Color(0,0,0);
        Color defbutton = new Color(0,51,51);
        
        
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        user_account = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        changePass = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        booking = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(838, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USER DASHBOARD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 260, 60));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_account.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        user_account.setForeground(new java.awt.Color(255, 255, 255));
        user_account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_account.setText("USER");
        jPanel2.add(user_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        close.setBackground(new java.awt.Color(255, 0, 0));
        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("Home");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 560, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 680, 60));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePass.setBackground(new java.awt.Color(0, 51, 51));
        changePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePassMouseExited(evt);
            }
        });
        changePass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CHANGE PASSWORD");
        changePass.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 28));

        jPanel5.add(changePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 50));

        booking.setBackground(new java.awt.Color(0, 51, 51));
        booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookingMouseExited(evt);
            }
        });
        booking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BOOKING");
        booking.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 28));

        jPanel5.add(booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 50));

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        username.setCaretColor(new java.awt.Color(255, 255, 255));
        username.setDoubleBuffered(true);
        username.setOpaque(false);
        jPanel5.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 280, 50));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        email.setCaretColor(new java.awt.Color(255, 255, 255));
        email.setDoubleBuffered(true);
        email.setOpaque(false);
        jPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 50));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        name.setCaretColor(new java.awt.Color(255, 255, 255));
        name.setDoubleBuffered(true);
        name.setOpaque(false);
        jPanel5.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 280, 50));

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        id.setCaretColor(new java.awt.Color(255, 255, 255));
        id.setDoubleBuffered(true);
        id.setEnabled(false);
        id.setOpaque(false);
        jPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 280, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 680, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        loginForm lf = new loginForm();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void changePassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassMouseExited
        changePass.setBackground(defbutton);
    }//GEN-LAST:event_changePassMouseExited

    private void changePassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassMouseEntered
        changePass.setBackground(hover);
    }//GEN-LAST:event_changePassMouseEntered

    private void changePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassMouseClicked
       dbConnector dbc = new dbConnector();
        try{
            String sql = "SELECT * FROM tbl_user WHERE u_id = '"+id.getText()+"'";
            ResultSet resultSet = dbc.getData(sql);
            if(resultSet.next()){
                idd = resultSet.getString("u_id");
            }
                changePassword cp = new changePassword();
                cp.id.setText(""+idd);
                cp.setVisible(true);
                this.dispose();
            
            
        }catch (SQLException ex) {
            
        }
        
        
    }//GEN-LAST:event_changePassMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getInstance();
        
        if(sess.getUid() == 0){
            JOptionPane.showMessageDialog(null,"Please Login First!");
            loginForm lf = new loginForm();
            lf.setVisible(true);
            this.dispose();
        }else{
            user_account.setText(""+sess.getFname());
        }
    }//GEN-LAST:event_formWindowActivated

    private void bookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingMouseClicked

    private void bookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingMouseEntered

    private void bookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingMouseExited

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
            java.util.logging.Logger.getLogger(userPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel booking;
    private javax.swing.JPanel changePass;
    private javax.swing.JLabel close;
    public javax.swing.JTextField email;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField name;
    public javax.swing.JLabel user_account;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
