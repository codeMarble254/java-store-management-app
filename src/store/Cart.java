/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Cart() {
        showCart();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productstable = new javax.swing.JTable();
        checkout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        typefield = new javax.swing.JTextField();
        notify1 = new javax.swing.JLabel();
        pricefield = new javax.swing.JTextField();
        removefromcart = new javax.swing.JButton();
        idfield = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        notify = new javax.swing.JLabel();
        emptycart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setBackground(new java.awt.Color(153, 255, 204));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cart");

        productstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productstable);

        checkout.setBackground(new java.awt.Color(102, 255, 204));
        checkout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 0, 0));
        checkout.setText("Checkout");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(102, 255, 204));
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        id.setText("Id");

        type.setText("Type");

        namefield.setEditable(false);

        typefield.setEditable(false);

        notify1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        notify1.setForeground(new java.awt.Color(255, 0, 0));
        notify1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notify1.setToolTipText("");

        pricefield.setEditable(false);

        removefromcart.setBackground(new java.awt.Color(204, 255, 204));
        removefromcart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        removefromcart.setForeground(new java.awt.Color(255, 0, 0));
        removefromcart.setText("Remove from Cart");
        removefromcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removefromcartActionPerformed(evt);
            }
        });

        idfield.setEditable(false);

        name1.setText("Name");

        price1.setText("Price");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(notify1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removefromcart, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(594, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(594, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(notify1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(pricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addComponent(removefromcart, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(250, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(200, Short.MAX_VALUE)
                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(117, 117, 117)))
        );

        notify.setBackground(new java.awt.Color(153, 255, 204));
        notify.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        notify.setForeground(new java.awt.Color(255, 0, 51));
        notify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        emptycart.setBackground(new java.awt.Color(102, 255, 204));
        emptycart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emptycart.setForeground(new java.awt.Color(255, 0, 0));
        emptycart.setText("Empty cart");
        emptycart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptycartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emptycart, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(checkout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(notify, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(451, 451, 451)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emptycart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(notify, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(86, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productstableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)productstable.getModel();
        int selectedRowIndex  = productstable.getSelectedRow();
        idfield.setText(model.getValueAt(selectedRowIndex, 0).toString());
        namefield.setText(model.getValueAt(selectedRowIndex, 1).toString());
        typefield.setText(model.getValueAt(selectedRowIndex, 2).toString());
        pricefield.setText(model.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_productstableMouseClicked

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        // TODO add your handling code here:

         try {
                Store stor = new Store();
                Connection con = stor.createConnection();
                Statement stm = null;
                stm = con.createStatement();
                String sql3 = "SELECT * from cart";
                ResultSet s = stm.executeQuery(sql3);
                while(s.next()){
                    String name = s.getString("name");
                    String type = s.getString("type");
                    String price = s.getString("price").toString();
                    String quantity = s.getString("quantity").toString();
                    String sql4 = "INSERT INTO sales(name, type, price, quantity) VALUES('"+name+"', '"+type+"', '"+price+"','"+quantity+"')";
                      stm.executeUpdate(sql4);
                   notify.setText("Sold");
                   JOptionPane.showMessageDialog(jPanel1,
                       "Sale made",
                       "A plain message",
                       JOptionPane.PLAIN_MESSAGE);
                
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
         
//                emptyCart();
                this.dispose();
                new Items().setVisible(true);
    }//GEN-LAST:event_checkoutActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Items().setVisible(true);

    }//GEN-LAST:event_backActionPerformed

    private void removefromcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removefromcartActionPerformed
        // TODO add your handling code here:
         String id = idfield.getText();
        String name = namefield.getText().trim();
        String type = typefield.getText().trim();
        String price = pricefield.getText().trim();
            try {
                Store stor = new Store();
                Connection con = stor.createConnection();
                Statement stm = null;
                stm = con.createStatement();
                String sql3 = "DELETE FROM cart where id ='"+Integer.parseInt(id)+"'";
                stm.executeUpdate(sql3);
                notify.setText("Product removed");
                JOptionPane.showMessageDialog(jPanel1,
                    "Removed from cart",
                    "A plain message",
                    JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                new Cart().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_removefromcartActionPerformed

    private void emptycartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptycartActionPerformed
        // TODO add your handling code here:
           emptyCart();
    }//GEN-LAST:event_emptycartActionPerformed

    public void emptyCart(){
         try {
                Store stor = new Store();
                Connection con = stor.createConnection();
                Statement stm = null;
                stm = con.createStatement();
                String sql3 = "DELETE FROM cart";
                stm.executeUpdate(sql3);
                notify.setText("Cart Empty");
                JOptionPane.showMessageDialog(jPanel1,
                    "Cart emptied",
                    "A plain message",
                    JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                new Cart().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    
     public void showCart(){
        try {
            initComponents();
            
            DefaultTableModel model = new DefaultTableModel(new String[]{
                "id", "Name", "Type", "price", "Quantity"},
                    0);

            Store stor = new Store();
            Connection con = stor.createConnection();
            Statement stm = null;
            stm = con.createStatement();
            String sql = "SELECT * FROM cart";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next())
            {
                int c = rs.getInt("id");
                String d = rs.getString("name");
                String e = rs.getString("type");
                String f = rs.getString("price");
                String g = rs.getString("quantity");
                model.addRow(new Object[]{c,d, e, f,g});
                
            }
            
            productstable.setModel(model);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton checkout;
    private javax.swing.JButton emptycart;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name1;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel notify;
    private javax.swing.JLabel notify1;
    private javax.swing.JLabel price1;
    private javax.swing.JTextField pricefield;
    private javax.swing.JTable productstable;
    private javax.swing.JButton removefromcart;
    private javax.swing.JLabel type;
    private javax.swing.JTextField typefield;
    // End of variables declaration//GEN-END:variables
}
