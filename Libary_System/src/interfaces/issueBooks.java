package interfaces;

import codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

public class issueBooks extends javax.swing.JFrame {
    int timeRun=0;
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public issueBooks() {
        initComponents();
    
        con=DBconnect.connect();
        
        tableload();
        
        //set the form center in the window
        setLocationRelativeTo(null);
        
        //set table transparancy
        jTable1.setOpaque(false);
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jTable1.setShowGrid(false);
        
       
        currentDate();
        
        //Time Setting done here
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
    
    public void tableload(){
        try {
            String sql="select MemberID,MemberName,BookID,BookName,Author,IssueDate,DueDate from borrowbooks";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
    }
    
    //show date
    public void currentDate(){

                    Calendar cal=new GregorianCalendar();
                    int month=cal.get(Calendar.MONTH);
                    int year=cal.get(Calendar.YEAR);
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    showdate.setText(year+"-"+(month+1)+"-"+day);
                    idate.setText(year+"-"+(month+1)+"-"+day);
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
        showtime = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idate = new javax.swing.JTextField();
        auth = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        bid = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        showdate = new javax.swing.JLabel();
        ddate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 695));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 280, 100);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Issue Books");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 40, 330, 70);

        showtime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showtime.setForeground(new java.awt.Color(0, 51, 102));
        showtime.setText(" ");
        getContentPane().add(showtime);
        showtime.setBounds(800, 30, 100, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.setText("Issue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 360, 120, 31);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "Member name", "book ID", "book name", "author", "issue date", "due date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 430, 820, 220);
        getContentPane().add(idate);
        idate.setBounds(600, 160, 160, 30);
        getContentPane().add(auth);
        auth.setBounds(200, 360, 160, 30);
        getContentPane().add(bname);
        bname.setBounds(200, 310, 160, 30);
        getContentPane().add(bid);
        bid.setBounds(200, 260, 160, 30);
        getContentPane().add(sname);
        sname.setBounds(200, 210, 160, 30);

        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });
        sid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sidKeyReleased(evt);
            }
        });
        getContentPane().add(sid);
        sid.setBounds(200, 160, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Member ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 160, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Member name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 210, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Book ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 260, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Book name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 310, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Author");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 360, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Due date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 210, 90, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Issue date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(450, 160, 90, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeButton.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(850, 580, 70, 80);

        showdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showdate.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(showdate);
        showdate.setBounds(800, 10, 140, 20);
        getContentPane().add(ddate);
        ddate.setBounds(600, 210, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bkground.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void sidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sidKeyReleased
        //search for student by id
        String id=sid.getText();
        
        String sql="select MemberID,MemberName,BookID,BookName,Author,IssueDate,DueDate from borrowbooks where MemberID like '%"+ id +"%'";
        try{
            
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         
            } catch (Exception e) {
            }
    }//GEN-LAST:event_sidKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    
        String ids=sid.getText();
        String names=sname.getText();
        String idb=bid.getText();
        String nameb=bname.getText();
        String authb=auth.getText();
        String idt=idate.getText();
        String ddt=ddate.getText();
        
    
        try {
            String q="INSERT INTO borrowbooks (MemberID,MemberName,BookID,BookName,Author,IssueDate,DueDate) VALUES ('"+ ids +"','"+ names +"','"+ idb +"','"+ nameb +"','"+ authb +"','"+ idt +"','"+ ddt +"')";
            
            pst=con.prepareStatement(q);
            
            pst.execute();
            tableload();
            //clear all textboxes after deleting
            //id.setText("");nic.setText("");nm.setText("");num.setText("");adrs.setText("");
            
            JOptionPane.showMessageDialog(this, "Issued book Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //filling the fileds when select the row 
        int r=jTable1.getSelectedRow();
        String si=jTable1.getValueAt(r, 0).toString();
        String sn=jTable1.getValueAt(r, 1).toString();
        String bi=jTable1.getValueAt(r, 2).toString();
        String bn=jTable1.getValueAt(r, 3).toString();
        String ba=jTable1.getValueAt(r, 4).toString();
        String i=jTable1.getValueAt(r, 5).toString();
        String d=jTable1.getValueAt(r, 6).toString();
             
        sid.setText(si);
        sname.setText(sn);
        bid.setText(bi);
        bname.setText(bn);
        auth.setText(ba);
        idate.setText(i);
        ddate.setText(d);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        librarianHome hom=new librarianHome();
         hom.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(issueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issueBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auth;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField ddate;
    private javax.swing.JTextField idate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel showdate;
    private javax.swing.JLabel showtime;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    // End of variables declaration//GEN-END:variables
}
