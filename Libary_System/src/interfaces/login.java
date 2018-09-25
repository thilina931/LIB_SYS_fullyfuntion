package interfaces;

import codes.DBconnect;
import com.sun.xml.internal.ws.api.server.Adapter;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    int timeRun=0;
    
    public login() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        uuu = new javax.swing.JTextField();
        ppp = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showdate = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Change password");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 354, 160, 20);

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Are you not registered with LIBSYS ...?  Register here");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 410, 450, 30);

        uuu.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(uuu);
        uuu.setBounds(310, 220, 190, 30);

        ppp.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(ppp);
        ppp.setBounds(310, 270, 190, 30);

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 2, 24)); // NOI18N
        jLabel7.setText("Username");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 220, 110, 30);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 330, 73, 23);

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 2, 24)); // NOI18N
        jLabel8.setText("Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 280, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User-Black-Folder-icon.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(550, 270, 250, 220);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue_gray background.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 150, 590, 260);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 280, 90);

        showdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showdate.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(showdate);
        showdate.setBounds(720, 10, 140, 30);

        showtime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showtime.setForeground(new java.awt.Color(0, 51, 102));
        showtime.setText(" ");
        getContentPane().add(showtime);
        showtime.setBounds(720, 40, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginbanner.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 870, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginBKgnd.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 870, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // to display a hand cursor:
        jLabel10.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
           
            String sql="select * from staff where Username=? and ConfirmPassword=?";
            try {
            pst=con.prepareStatement(sql);
        
          
            pst.setString(1,uuu.getText() );
            pst.setString(2,ppp.getText() );
       
            rs=pst.executeQuery();
            if (rs.next()) {
         
            adminHome ad= new adminHome();
            librarianHome lib=new librarianHome(); 
            
            lib.user.setText(rs.getString(2));
            ad.user.setText(rs.getString(2));

            
                if ("Librarian".equals(rs.getString(3))) {
                    lib.setVisible(true);
                    this.dispose();                }
                else{
                    ad.setVisible(true);
                    this.dispose();
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "Username and password are not correct");
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            } 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //redirect to register page
        this.dispose();
        this.setVisible(false);
        staffReg s=new staffReg();
        s.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        forgotPwd fo=new forgotPwd();
        fo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField ppp;
    private javax.swing.JLabel showdate;
    private javax.swing.JLabel showtime;
    private javax.swing.JTextField uuu;
    // End of variables declaration//GEN-END:variables
}
