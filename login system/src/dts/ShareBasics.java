package dts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lewis
 */
 import javax.swing.*; 
import java.sql.*; 
import java.awt.event.*;
 public class ShareBasics extends JFrame implements ActionListener{ 
     JLabel JL_tcode,JL_sprice,JL_cname,JL_cmv, JL_interest, JL_time, JL_major, JL_stock; 
     JTextField JT_tcode,JT_sprice,JT_cname,JT_cmv, JT_interest, JT_time, JT_major, JT_stock;
     JButton btn_search;
     
     public ShareBasics(){
         super("Search");
         JL_tcode = new JLabel("Enter ID:");
         JL_tcode.setBounds(20, 20, 200, 20); 
         JT_tcode = new JTextField(20);
         JT_tcode.setBounds(130, 20, 150, 20); 
         btn_search = new JButton("Search"); 
         btn_search.setBounds(300, 20, 80, 20); 
         btn_search.addActionListener(this); setVisible(true); 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         setLocationRelativeTo(null); setSize(500,350); 
         JL_sprice = new JLabel("Share Price: "); 
         JL_sprice.setBounds(20, 50, 100, 20); 
         JT_sprice = new JTextField(20); 
         JT_sprice.setBounds(130, 50, 150, 20); 
         JL_cname = new JLabel("Company Name: "); 
         JL_cname.setBounds(20, 80, 100, 20); 
         JT_cname = new JTextField(20);
         JT_cname.setBounds(130, 80, 150, 20); 
         JL_cmv = new JLabel("Company Market Value: "); 
         JL_cmv.setBounds(20, 110, 100, 20); 
         JT_cmv = new JTextField(20); 
         JT_cmv.setBounds(130, 110, 150, 20); 
         JL_interest = new JLabel("Interest: "); 
         JL_interest.setBounds(20, 140, 100, 20); 
         JT_interest = new JTextField(20); 
         JT_interest.setBounds(130, 140, 150, 20); 
         JL_time = new JLabel("Time: "); 
         JL_time.setBounds(20, 170, 100, 20); 
         JT_time = new JTextField(20); 
         JT_time.setBounds(130, 170, 150, 20); 
         JL_major = new JLabel("Major: "); 
         JL_major.setBounds(20, 200, 100, 20); 
         JT_major = new JTextField(20); 
         JT_major.setBounds(130, 200, 150, 20); 
         JL_stock = new JLabel("Stock: "); 
         JL_stock.setBounds(20, 230, 100, 20); 
         JT_stock = new JTextField(20); 
         JT_stock.setBounds(130, 230, 150, 20); 
         setLayout(null); 
         add(btn_search); 
         add(JL_tcode); 
         add(JT_tcode); 
         add(JL_sprice); 
         add(JT_sprice); 
         add(JL_cname); 
         add(JT_cname); 
         add(JL_cmv); 
         add(JT_cmv);
         add(JL_interest); 
         add(JT_interest); 
         add(JL_time); 
         add(JT_time); 
         add(JL_major); 
         add(JT_major); 
         add(JL_stock); 
         add(JT_stock);} 
     @Override 
     public void actionPerformed(ActionEvent e) { 
         Function f = new Function(); 
         ResultSet rs = null; 
         String tcode = "tcode";
         String sprice = "sprice"; 
         String cname = "cname";
         String cmv = "cmv";
         String interest = "interest"; 
         String time = "time";
          String major = "major"; 
         String stock = "stock";
         rs = f.find(JT_tcode.getText()); 
         try{ 
             if(rs.next()){ 
                 JT_sprice.setText(rs.getString("shareprice"));
                 JT_cname.setText(rs.getString("companyname")); 
                 JT_cmv.setText(rs.getString("company market value")); 
                  JT_interest.setText(rs.getString("interestreg"));
                 JT_time.setText(rs.getString("timerange")); 
                 JT_major.setText(rs.getString("majorshareholder")); 
                  JT_stock.setText(rs.getString("noofstock")); 
             } else{ JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID"); 
             } }
         catch(Exception ex){ 
             JOptionPane.showMessageDialog(null, ex.getMessage()); }
     } public class Function{
         Connection con = null; 
         ResultSet rs = null; PreparedStatement ps = null; 
         public ResultSet find(String s){ 
             try{ 
                 con = DriverManager.getConnection("jdbc:mysql://localhost/user","root",""); 
                 ps = con.prepareStatement("select * from shares where tradingcode = ?");
                 ps.setString(1,s); 
                 rs = ps.executeQuery(); }
             catch(Exception ex){ 
                 JOptionPane.showMessageDialog(null, ex.getMessage()); 
             } return rs; } 
     } public static void main(String[] args){ 
         new ShareBasics(); 
     } }