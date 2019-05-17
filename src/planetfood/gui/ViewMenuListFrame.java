/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import planetfood.dao.CategoryDao;
import planetfood.dao.ProductDao;
import planetfood.gui.CashierOptionsFrame;
import planetfood.gui.LoginFrame;
import planetfood.pojo.Product;
import planetfood.pojo.UserProfile;

/**
 *
 * @author a
 */
public class ViewMenuListFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewMenuListForm
     */
    private HashMap<String, String> categories;
    public ViewMenuListFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUserName.setText("Hello "+UserProfile.getUsername());
        try
        {
            categories=CategoryDao.getAllCategoryId();
            Set s=categories.keySet();
            Iterator it=s.iterator();
            while(it.hasNext())
            {
                String st=(String)it.next();
                jcbCategory.addItem(st);
            }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in sql!"+ex,"Input Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            
        }
        showAllDataInTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jcbCategory = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 127, 84));

        lblUserName.setBackground(new java.awt.Color(255, 102, 0));
        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Hello");

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(22, 127, 84));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "Category Wise Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jcbCategory.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        jcbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoryActionPerformed(evt);
            }
        });

        jtProductDetails.setBackground(new java.awt.Color(22, 127, 84));
        jtProductDetails.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtProductDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod Id", "Cat Id", "Product Name", "Prod Price", "Is Active"
            }
        ));
        jScrollPane1.setViewportView(jtProductDetails);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(jcbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(22, 127, 84));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CATEGORY WISE PRODUCT DETAILS PANEL");

        jLabel3.setBackground(new java.awt.Color(22, 127, 84));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlanetFood/gui/WhatsApp Image 2018-09-15 at 11.42.24 PM.jpeg"))); // NOI18N

        btnBack.setBackground(new java.awt.Color(22, 127, 84));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(318, 318, 318))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addGap(0, 97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(lblLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(btnBack)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.dispose();
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CashierOptionsFrame cashierOpt=new CashierOptionsFrame();
        cashierOpt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jcbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoryActionPerformed
        if(jcbCategory.getSelectedItem()==null)
            return;
        else if(jcbCategory.getSelectedItem().toString().equalsIgnoreCase("select category"))
        {    
             DefaultTableModel model = (DefaultTableModel)jtProductDetails.getModel(); model.setRowCount(0);
            showAllDataInTable();
        }
        else
        {    DefaultTableModel model = (DefaultTableModel)jtProductDetails.getModel(); model.setRowCount(0);
            showDataInTable();
        }
       
    }//GEN-LAST:event_jcbCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public void showDataInTable()
    {
        try
        {    String cat_id=jcbCategory.getSelectedItem().toString();
                if(cat_id.equals(""))
                    return;
                 // ProductDao.getcatID(cat_id);
                
            ArrayList<Product>prodList=ProductDao.getAllData(ProductDao.getCatId(cat_id));
            if(prodList.isEmpty()==true)
                JOptionPane.showMessageDialog(null,"Sorry! No Record Present!","Error!",JOptionPane.INFORMATION_MESSAGE);
            
            else
            {
                Object[]rows=new Object[5];
                DefaultTableModel model=(DefaultTableModel)jtProductDetails.getModel();
                for(Product p:prodList)
                {
                    rows[0]=p.getProdId();
                    rows[1]=p.getCatId();
                    rows[2]=p.getProdName();
                    rows[3]=p.getProdPrice();
                    rows[4]=p.getIsActive();
                    
                    
                    model.addRow(rows);
                }
            }
        }
         catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in SQL!!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
     
     
     
     
     public void showAllDataInTable()
    {
        try
        {    String cat_id=jcbCategory.getSelectedItem().toString();
                if(cat_id.equals(""))
                    return;
                 // ProductDao.getcatID(cat_id);
                
            ArrayList<Product>prodList=ProductDao.getAllData();
            if(prodList.isEmpty()==true)
                JOptionPane.showMessageDialog(null,"Sorry! No Record Present!","Error!",JOptionPane.INFORMATION_MESSAGE);
            
            else
            {
                Object[]rows=new Object[5];
                DefaultTableModel model=(DefaultTableModel)jtProductDetails.getModel();
                for(Product p:prodList)
                {
                    rows[0]=p.getProdId();
                    rows[1]=p.getCatId();
                    rows[2]=p.getProdName();
                    rows[3]=p.getProdPrice();
                    rows[4]=p.getIsActive();
                    
                    
                    model.addRow(rows);
                }
            }
        }
         catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in SQL!!","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(ViewMenuListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenuListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenuListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCategory;
    private javax.swing.JTable jtProductDetails;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
