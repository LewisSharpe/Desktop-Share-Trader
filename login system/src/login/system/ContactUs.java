
package login.system;
import java.awt.AWTEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class ContactUs extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
int curRow=0;

    public ContactUs() {
        initComponents();
        conn=sql.ConnectDb();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
          
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        setBounds(new java.awt.Rectangle(3, 5, 6, 8));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setForeground(new java.awt.Color(204, 204, 255));
        setIconImages(null);
        setLocationByPlatform(true);
        setName("Form"); // NOI18N
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jTextField1.setText("© Desktop Trade Sharer Ltd 2016");
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("By using this site, you agree to the Terms of Use and Privacy Policy.");
        jTextField2.setName("jTextField2"); // NOI18N

        jLabel4.setText("Contact Us");
        jLabel4.setName("jLabel4"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Write to us at:\nDesktop Share Trader Ltd,\n10 Colinton Road,\nEdinburgh,\nEH10 5DT.");
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jTextField4.setText("Any issues with your product? Then contact us.");
        jTextField4.setName("jTextField4"); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lewis\\OneDrive\\Documents\\email-envelope.jpg")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\lewis\\OneDrive\\Documents\\fb_icon_325x325.png")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Visit our website:\nwww.desktoptradesharer.com");
        jTextArea2.setName("jTextArea2"); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\lewis\\Downloads\\logo_1958289_web (1).jpg")); // NOI18N
        jLabel8.setText("jLabel1");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lewis\\Downloads\\twitter-200x200.png")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(237, 237, 237)
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(310, 310, 310)
                        .add(jLabel4))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(250, 250, 250))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(176, 176, 176))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 263, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 263, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 127, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jLabel3)
                                .add(18, 18, 18)
                                .add(jLabel5)
                                .add(82, 82, 82))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(131, 131, 131))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel4)
                .add(2, 2, 2)
                .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactUs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel8;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTextArea jTextArea1;
    javax.swing.JTextArea jTextArea2;
    javax.swing.JTextField jTextField1;
    javax.swing.JTextField jTextField2;
    javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
