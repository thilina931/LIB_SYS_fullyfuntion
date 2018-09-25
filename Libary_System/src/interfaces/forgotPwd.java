/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author aa
 */
public class forgotPwd extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    int timeRun=0;
    
    /**
     * Creates new form forgotPwd
     */
    public forgotPwd() {
        initComponents();
        
        con=DBconnect.connect();
        
        //set the form center in the window
        setLocationRelativeTo(null);
        currentDate();
        
        new Thread()
        {
        public void run()
        {
        while(timeRun==0)
        {
            Calendar cal=new GregorianCalendar();
            
            int hour=cal.get(Calendar.HOUR);
            int minute=cal.get(Calendar.MINUTE);
            int second=cal.get(Calendar.SECOND);
            int AM_PM=cal.get(Calendar.AM_PM);
            String day_night=" ";
            
            if(AM_PM==1)
        {
            day_night="PM";
        }
            else
        {
            day_night="AM";
        }
            
            String time= hour+":"+minute+":"+second+" "+day_night;
            showtime.setText(time);
        }
        }
        
        }.start();  
            
       //Time setting ends here
    }

    //show date
    public void currentDate(){

                    Calendar cal=new GregorianCalendar();
                    int month=cal.get(Calendar.MONTH);
                    int year=cal.get(Calendar.YEAR);
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    showdate.setText(year+"-"+(month+1)+"-"+day);
               }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showdate = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        cpwd = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        npwd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        log = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        opwd = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        showdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showdate.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(showdate);
        showdate.setBounds(730, 40, 130, 20);

        showtime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showtime.setForeground(new java.awt.Color(0, 51, 102));
        showtime.setText(" ");
        getContentPane().add(showtime);
        showtime.setBounds(710, 60, 130, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 280, 90);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Change your password ....");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(630, 130, 210, 30);

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 2, 24)); // NOI18N
        jLabel7.setText("Username");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 230, 110, 30);

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 2, 24)); // NOI18N
        jLabel8.setText("Confirm Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 380, 190, 30);

        uname.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(uname);
        uname.setBounds(470, 230, 190, 30);

        cpwd.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(cpwd);
        cpwd.setBounds(470, 380, 190, 30);

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 2, 24)); // NOI18N
        jLabel9.setText("New Password");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 330, 150, 30);

        npwd.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(npwd);
        npwd.setBounds(470, 330, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 450, 200, 30);

        log.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        log.setForeground(new java.awt.Color(0, 51, 102));
        log.setText("LOGIN");
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
        });
        getContentPane().add(log);
        log.setBounds(770, 10, 70, 20);

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 2, 24)); // NOI18N
        jLabel10.setText("Old Password");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 280, 150, 30);

        opwd.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(opwd);
        opwd.setBounds(470, 280, 190, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fogot.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -40, 870, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginBKgnd.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 870, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
        login lo=new login();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String sql="select * from staff where Username=? and ConfirmPassword=?";
            try 
            {
                pst=con.prepareStatement(sql);
                pst.setString(1,uname.getText() );
                pst.setString(2,opwd.getText() );

                rs=pst.executeQuery();
                if (rs.next()) 
                {
                    //JOptionPane.showMessageDialog(null, "username and old password are  matching..");
                    
                    if(Arrays.equals(npwd.getPassword(), cpwd.getPassword()))
                    {
                        //JOptionPane.showMessageDialog(this, "new and confirm Passwords are matched");
                        
                        String unm=uname.getText();
                        String pw=cpwd.getText();
                        
                        String q="update staff set ConfirmPassword='"+ pw +"' where Username='"+ unm+"'";
                        try 
                        {    
                            pst=con.prepareStatement(q);
                            pst.execute();
                            JOptionPane.showMessageDialog(this, "Your password has beeen changed Successfully");
                            login lo=new login();
                            lo.setVisible(true);
                            this.dispose();
                        } 
                        catch (Exception e) {
                        }
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "new and confirm Passwords are not matched");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "username and old password are not matching..");
                }
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
                System.out.println(e);
            } 

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(forgotPwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotPwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotPwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotPwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPwd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel log;
    private javax.swing.JPasswordField npwd;
    private javax.swing.JPasswordField opwd;
    private javax.swing.JLabel showdate;
    private javax.swing.JLabel showtime;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
