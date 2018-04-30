
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TeacherFrame extends javax.swing.JFrame {

    public TeacherFrame() {
        initComponents();
        setTitle("Student Management System/Teacher");
        
    }
    
    public ArrayList<User> userList(){
        ArrayList<User> userList = new ArrayList<>();
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
            
            String s2 = "select * from students";
            Statement s1 = conn.createStatement();

            ResultSet rs = s1.executeQuery(s2);
            
            User user;
            
            while(rs.next())
            {   
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getLong(4));
                userList.add(user);
            }
            rs.close();
            conn.close();
        }
        catch(SQLException e){
                JOptionPane.showMessageDialog(new JDialog(),"issue"+e);
        }
        
        return userList;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddStudent = new javax.swing.JButton();
        btnViewRecord = new javax.swing.JButton();
        btnUpdateStudent = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnViewRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnViewRecord.setText("View Record");
        btnViewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRecordActionPerformed(evt);
            }
        });

        btnUpdateStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdateStudent.setText("Update");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        btnDeleteStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteStudent.setText("Delete");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No.", "Name", "Email", "Contact"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnViewRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        // TODO add your handling code here:
        AddFrame addFrame = new AddFrame();
        addFrame.setVisible(true);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        // TODO add your handling code here:
        UpdateFrame updateFrame = new UpdateFrame();
        updateFrame.setVisible(true);
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        // TODO add your handling code here:
        DeleteFrame deleteFrame = new DeleteFrame();
        deleteFrame.setVisible(true);
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void btnViewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRecordActionPerformed
        // TODO add your handling code here:
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0]=list.get(i).getRoll();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getEmail();
            row[3]=list.get(i).getContact();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnViewRecordActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JButton btnViewRecord;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
