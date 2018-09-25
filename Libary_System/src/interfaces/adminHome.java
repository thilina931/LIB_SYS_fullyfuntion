package interfaces;

import javax.swing.ImageIcon;
import AppPackage.AnimationClass;

public class adminHome extends javax.swing.JFrame {
    AnimationClass AC=new AnimationClass();
    public adminHome() {
        initComponents();
        SlideShow();
        
        //set the form center in the window
        setLocationRelativeTo(null);
        
        jPanel1.setVisible(true);
    }
    
    //Animation Slide show is done here
       private void SlideShow(){
       new Thread(){
       int count;
     
       
       public void run(){
       
           try{
           while(true){
           switch(count){
               case 0:
                   ImageIcon II0=new ImageIcon(getClass().getResource("/images/image4.jpg"));
                   image1.setIcon(II0);
                   Thread.sleep(3000);
                   AC.jLabelXLeft(0, -900, 10, 9, image1);
                   AC.jLabelXLeft(900, 0, 10, 9, image2);
                   count= 1;
                   break;
                   
               case 1:
                   ImageIcon II1=new ImageIcon(getClass().getResource("/images/image2.jpg"));
                   image2.setIcon(II1);
                   Thread.sleep(3000);
                   AC.jLabelXRight(-900, 0, 10, 9, image1);
                   AC.jLabelXRight(0, 900, 10, 9, image2);
                   count= 2;
                   break;
                   
                case 2:
                   ImageIcon II2=new ImageIcon(getClass().getResource("/images/image5.jpg"));
                   image1.setIcon(II2);
                   Thread.sleep(3000);
                   AC.jLabelXLeft(0, -900, 10, 9, image1);
                   AC.jLabelXLeft(900, 0, 10, 9, image2);
                   count=3;
                   break;
                       
                case 3:
                   ImageIcon II3=new ImageIcon(getClass().getResource("/images/image6.jpg"));
                   image2.setIcon(II3); 
                   Thread.sleep(3000);
                   AC.jLabelXRight(-900, 0, 10, 9, image1);
                   AC.jLabelXRight(0, 900, 10, 9, image2);
                   count=0;
                   break;

                                       
           }
          }
           
           }
           
           catch(Exception e){}
       }
        }.start();
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        showdate = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        image1 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 695));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 280, 100);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Welcome to LIBSYS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 60, 390, 60);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setText("Logged in as");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(723, 10, 87, 20);

        user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(user);
        user.setBounds(820, 10, 110, 20);

        showdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showdate.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(showdate);
        showdate.setBounds(760, 60, 140, 20);

        showtime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showtime.setForeground(new java.awt.Color(0, 51, 102));
        showtime.setText(" ");
        getContentPane().add(showtime);
        showtime.setBounds(760, 80, 100, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("LOGOUT");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(770, 34, 80, 20);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Book Registration");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 610, 180, 40);

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setText("Staff registration");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(380, 610, 180, 40);

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 102));
        jButton5.setText("Search information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(600, 610, 180, 40);

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 440));
        jPanel1.setLayout(null);

        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image2.jpg"))); // NOI18N
        image1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        image1.setOpaque(true);
        jPanel1.add(image1);
        image1.setBounds(0, 0, 900, 440);

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image4.jpg"))); // NOI18N
        image2.setToolTipText("");
        jPanel1.add(image2);
        image2.setBounds(900, 0, 900, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 140, 900, 440);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bkground.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        bookReg bo=new bookReg();
        bo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        login log=new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        staff st=new staff();
        st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        searchBookad se=new searchBookad();
        se.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel showdate;
    private javax.swing.JLabel showtime;
    public javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}