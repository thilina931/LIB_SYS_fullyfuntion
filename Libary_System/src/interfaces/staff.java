package interfaces;

import codes.DBconnect;
import static interfaces.studentReg.validateID;
import static interfaces.studentReg.validateTele;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

public class staff extends javax.swing.JFrame {
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    int timeRun=0;
    
    public staff() {
        initComponents();
        
        con=DBconnect.connect();
        
        tableload();
    
        //hide validation fields
        jLabel18.setVisible(false);jLabel19.setVisible(false);
        jLabel20.setVisible(false);jLabel21.setVisible(false);
        
        //set the form center in the window
        setLocationRelativeTo(null);
        
        //set table transparancy
        jTable1.setOpaque(false);
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jTable1.setShowGrid(false);
        
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
    
    //loard the record to table after adding  
    public void tableload(){
        try {
            String sql="select EmployeeID,EmployeeName,Position,Address,ContactNumber from staff";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
    }

    //validate telephone number
     public static boolean validateTele(String tele){
        boolean status=false;
        String tele_PATTERN="^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
        Pattern pattern=Pattern.compile(tele_PATTERN);
        Matcher matcher=pattern.matcher(tele);
        if(matcher.matches()){
            status=true;
        }
        else{
            status=false;
        }
        return status;
    }
    
     //validate nic
    public static boolean validateID(String ID){
        boolean status=false;
        String ID_Pattern="[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][v/V]";
        Pattern pattern=Pattern.compile(ID_Pattern);
        Matcher matcher=pattern.matcher(ID);
        if(matcher.matches()){
            status=true;
        }
        else{
            status=false;
        }
        return status;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showdate = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        poss = new javax.swing.JComboBox();
        nmm = new javax.swing.JTextField();
        idd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 680));
        setResizable(false);
        getContentPane().setLayout(null);

        showdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showdate.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(showdate);
        showdate.setBounds(800, 10, 140, 20);

        showtime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showtime.setForeground(new java.awt.Color(0, 51, 102));
        showtime.setText(" ");
        getContentPane().add(showtime);
        showtime.setBounds(800, 30, 100, 20);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Staff Registration");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 50, 410, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 280, 100);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Employee ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 110, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Employee name");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(60, 190, 130, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Position");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 240, 130, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 300, 80, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Contact number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 410, 140, 22);

        numm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nummKeyTyped(evt);
            }
        });
        getContentPane().add(numm);
        numm.setBounds(230, 410, 190, 30);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(164, 94));

        add.setColumns(20);
        add.setRows(5);
        jScrollPane1.setViewportView(add);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 290, 260, 100);

        poss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        poss.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Librarian", "Admin" }));
        getContentPane().add(poss);
        poss.setBounds(230, 240, 140, 30);

        nmm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nmmKeyReleased(evt);
            }
        });
        getContentPane().add(nmm);
        nmm.setBounds(230, 190, 180, 30);

        idd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iddKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iddKeyTyped(evt);
            }
        });
        getContentPane().add(idd);
        idd.setBounds(230, 140, 180, 30);

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setForeground(new java.awt.Color(204, 204, 255));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee name", "Position", "Address", "Contact number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 470, 830, 180);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 153));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 360, 170, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 153));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(680, 410, 170, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeButton.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(860, 580, 75, 70);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*Required");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(420, 150, 70, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*Required");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(500, 370, 70, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("*Required");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(430, 430, 70, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*Required");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(420, 200, 70, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bkground.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nummKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nummKeyTyped

    }//GEN-LAST:event_nummKeyTyped

    private void nmmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nmmKeyReleased

    }//GEN-LAST:event_nmmKeyReleased

    private void iddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iddKeyReleased
        //search for student by id
        String id1=idd.getText();
        
        String sql="select EmployeeID,EmployeeName,Position,Address,ContactNumber from staff where EmployeeID like '%"+ id1 +"%'";
        try {
                
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         
            } catch (Exception e) {
            }
    }//GEN-LAST:event_iddKeyReleased

    private void iddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iddKeyTyped

    }//GEN-LAST:event_iddKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            //filling the fileds when select the row 
        int r=jTable1.getSelectedRow();
        String i=jTable1.getValueAt(r, 0).toString();
        String n=jTable1.getValueAt(r, 1).toString();
        String p=jTable1.getValueAt(r, 2).toString();
        String a=jTable1.getValueAt(r, 3).toString(); 
        String c=jTable1.getValueAt(r, 4).toString(); 
        
        idd.setText(i);
        nmm.setText(n);
        poss.setSelectedItem(p);
        add.setText(a);
        numm.setText(c);
  
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //hide validation fields
        jLabel18.setVisible(false);jLabel19.setVisible(false);
        jLabel20.setVisible(false);jLabel21.setVisible(false);
        
        boolean requiredField=true;
        //validating fields
        if(idd.getText().length()==0||nmm.getText().length()==0||add.getText().length()==0||numm.getText().length()==0)
        {
            requiredField=false;
        }
        //validate telephone number
        if(validateTele(numm.getText())==false)
        {
            JOptionPane.showMessageDialog(this, "Insert a valid telephone number");
            jLabel17.setVisible(true);
            requiredField=false;
        }
        
        //update records
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to update??");
        if(requiredField==true){
        if (x==0) {
            String id=idd.getText();
            String nm=nmm.getText();
            String po=poss.getSelectedItem().toString();
            String ad=add.getText();
            String num=numm.getText();
            
            String sql="update staff set EmployeeName='"+ nm +"',Position='"+ po +"',Address='"+ ad +"',ContactNumber='"+ num +"' where EmployeeID='"+ id+"'";
            try {
            pst=con.prepareStatement(sql);
            pst.execute();
            tableload();
            //clear all textboxes after deleting
            idd.setText("");nmm.setText("");add.setText("");numm.setText("");
            
            JOptionPane.showMessageDialog(this, "Updated Successfully");
            } catch (Exception e) {
            }
        }
        }
        else
        {
            //display appropriate error (*required)
            if(idd.getText().length()==0){jLabel18.setVisible(true);}
            if(nmm.getText().length()==0){jLabel19.setVisible(true);}
            if(add.getText().length()==0){jLabel20.setVisible(true);}
            if(numm.getText().length()==0){jLabel21.setVisible(true);}
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //delete records
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to delete??");
        
        if (x==0) {
            String i=idd.getText();
            String sql="delete from staff where EmployeeID='"+ i +"'";
            try {
                
            pst=con.prepareStatement(sql);
            pst.execute();
            tableload();
            JOptionPane.showMessageDialog(this, "Deleted Successfully");
            //clear all textboxes after deleting
            idd.setText("");nmm.setText("");add.setText("");numm.setText("");
            
            } catch (Exception e) {
            }
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        adminHome hom=new adminHome();
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
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add;
    private javax.swing.JTextField idd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nmm;
    private javax.swing.JTextField numm;
    private javax.swing.JComboBox poss;
    private javax.swing.JLabel showdate;
    private javax.swing.JLabel showtime;
    // End of variables declaration//GEN-END:variables
}
