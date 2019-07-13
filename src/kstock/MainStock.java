/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kstock;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Mayur
 */
public class MainStock extends javax.swing.JFrame {

    /**
     * Creates new form MainStock
     */
    public MainStock() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainjPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        MenuAddStockjPanel = new javax.swing.JPanel();
        stockSelect = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MenuAddItemjPanel1 = new javax.swing.JPanel();
        itemSelect = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MenuAddSupploerjPanel2 = new javax.swing.JPanel();
        SupplierSelect = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        MenucmgSoonjPanel2 = new javax.swing.JPanel();
        cmgSoonSelect = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        MenuAddStockjPanel3 = new javax.swing.JPanel();
        stockSelect3 = new javax.swing.JPanel();
        MenuHomejPanel = new javax.swing.JPanel();
        homeSelect = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Work_Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));

        MenuAddStockjPanel.setBackground(new java.awt.Color(102, 0, 204));
        MenuAddStockjPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAddStockjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAddStockjPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuAddStockjPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout stockSelectLayout = new javax.swing.GroupLayout(stockSelect);
        stockSelect.setLayout(stockSelectLayout);
        stockSelectLayout.setHorizontalGroup(
            stockSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        stockSelectLayout.setVerticalGroup(
            stockSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kstock/image/plus.png"))); // NOI18N
        jLabel2.setText("Add Stock");

        javax.swing.GroupLayout MenuAddStockjPanelLayout = new javax.swing.GroupLayout(MenuAddStockjPanel);
        MenuAddStockjPanel.setLayout(MenuAddStockjPanelLayout);
        MenuAddStockjPanelLayout.setHorizontalGroup(
            MenuAddStockjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAddStockjPanelLayout.createSequentialGroup()
                .addComponent(stockSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuAddStockjPanelLayout.setVerticalGroup(
            MenuAddStockjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stockSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuAddStockjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuAddItemjPanel1.setBackground(new java.awt.Color(102, 0, 204));
        MenuAddItemjPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAddItemjPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAddItemjPanel1MouseClicked(evt);
            }
        });

        itemSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSelectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout itemSelectLayout = new javax.swing.GroupLayout(itemSelect);
        itemSelect.setLayout(itemSelectLayout);
        itemSelectLayout.setHorizontalGroup(
            itemSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        itemSelectLayout.setVerticalGroup(
            itemSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kstock/image/plus.png"))); // NOI18N
        jLabel3.setText("Add Item");

        javax.swing.GroupLayout MenuAddItemjPanel1Layout = new javax.swing.GroupLayout(MenuAddItemjPanel1);
        MenuAddItemjPanel1.setLayout(MenuAddItemjPanel1Layout);
        MenuAddItemjPanel1Layout.setHorizontalGroup(
            MenuAddItemjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAddItemjPanel1Layout.createSequentialGroup()
                .addComponent(itemSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuAddItemjPanel1Layout.setVerticalGroup(
            MenuAddItemjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuAddItemjPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuAddSupploerjPanel2.setBackground(new java.awt.Color(102, 0, 204));
        MenuAddSupploerjPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAddSupploerjPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAddSupploerjPanel2MouseClicked(evt);
            }
        });

        SupplierSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierSelectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SupplierSelectLayout = new javax.swing.GroupLayout(SupplierSelect);
        SupplierSelect.setLayout(SupplierSelectLayout);
        SupplierSelectLayout.setHorizontalGroup(
            SupplierSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SupplierSelectLayout.setVerticalGroup(
            SupplierSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kstock/image/add-friend.png"))); // NOI18N
        jLabel4.setText("Add Supplier");

        javax.swing.GroupLayout MenuAddSupploerjPanel2Layout = new javax.swing.GroupLayout(MenuAddSupploerjPanel2);
        MenuAddSupploerjPanel2.setLayout(MenuAddSupploerjPanel2Layout);
        MenuAddSupploerjPanel2Layout.setHorizontalGroup(
            MenuAddSupploerjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAddSupploerjPanel2Layout.createSequentialGroup()
                .addComponent(SupplierSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuAddSupploerjPanel2Layout.setVerticalGroup(
            MenuAddSupploerjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SupplierSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuAddSupploerjPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenucmgSoonjPanel2.setBackground(new java.awt.Color(102, 0, 204));
        MenucmgSoonjPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenucmgSoonjPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenucmgSoonjPanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cmgSoonSelectLayout = new javax.swing.GroupLayout(cmgSoonSelect);
        cmgSoonSelect.setLayout(cmgSoonSelectLayout);
        cmgSoonSelectLayout.setHorizontalGroup(
            cmgSoonSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cmgSoonSelectLayout.setVerticalGroup(
            cmgSoonSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kstock/image/plus.png"))); // NOI18N
        jLabel8.setText("Comming Soon");

        javax.swing.GroupLayout MenucmgSoonjPanel2Layout = new javax.swing.GroupLayout(MenucmgSoonjPanel2);
        MenucmgSoonjPanel2.setLayout(MenucmgSoonjPanel2Layout);
        MenucmgSoonjPanel2Layout.setHorizontalGroup(
            MenucmgSoonjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenucmgSoonjPanel2Layout.createSequentialGroup()
                .addComponent(cmgSoonSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenucmgSoonjPanel2Layout.setVerticalGroup(
            MenucmgSoonjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmgSoonSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenucmgSoonjPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuAddStockjPanel3.setBackground(new java.awt.Color(102, 0, 204));
        MenuAddStockjPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAddStockjPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAddStockjPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout stockSelect3Layout = new javax.swing.GroupLayout(stockSelect3);
        stockSelect3.setLayout(stockSelect3Layout);
        stockSelect3Layout.setHorizontalGroup(
            stockSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        stockSelect3Layout.setVerticalGroup(
            stockSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuAddStockjPanel3Layout = new javax.swing.GroupLayout(MenuAddStockjPanel3);
        MenuAddStockjPanel3.setLayout(MenuAddStockjPanel3Layout);
        MenuAddStockjPanel3Layout.setHorizontalGroup(
            MenuAddStockjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAddStockjPanel3Layout.createSequentialGroup()
                .addComponent(stockSelect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        MenuAddStockjPanel3Layout.setVerticalGroup(
            MenuAddStockjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stockSelect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuHomejPanel.setBackground(new java.awt.Color(102, 0, 204));
        MenuHomejPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuHomejPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHomejPanelMouseClicked(evt);
            }
        });

        homeSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeSelectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeSelectLayout = new javax.swing.GroupLayout(homeSelect);
        homeSelect.setLayout(homeSelectLayout);
        homeSelectLayout.setHorizontalGroup(
            homeSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        homeSelectLayout.setVerticalGroup(
            homeSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kstock/image/plus.png"))); // NOI18N
        jLabel9.setText("Home");

        javax.swing.GroupLayout MenuHomejPanelLayout = new javax.swing.GroupLayout(MenuHomejPanel);
        MenuHomejPanel.setLayout(MenuHomejPanelLayout);
        MenuHomejPanelLayout.setHorizontalGroup(
            MenuHomejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuHomejPanelLayout.createSequentialGroup()
                .addComponent(homeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuHomejPanelLayout.setVerticalGroup(
            MenuHomejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuHomejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(MenuAddStockjPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(200, 200, 200))
            .addComponent(MenuHomejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuAddItemjPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuAddSupploerjPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuAddStockjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenucmgSoonjPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MenuHomejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuAddItemjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuAddSupploerjPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuAddStockjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenucmgSoonjPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuAddStockjPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Work_PanelLayout = new javax.swing.GroupLayout(Work_Panel);
        Work_Panel.setLayout(Work_PanelLayout);
        Work_PanelLayout.setHorizontalGroup(
            Work_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        Work_PanelLayout.setVerticalGroup(
            Work_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainjPanelLayout = new javax.swing.GroupLayout(mainjPanel);
        mainjPanel.setLayout(mainjPanelLayout);
        mainjPanelLayout.setHorizontalGroup(
            mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainjPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Work_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainjPanelLayout.setVerticalGroup(
            mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Work_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kstock/image/error.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    Color defaultClor = new Color(240, 240, 240);
    Color selected = new Color(0,204,102) ;
    private void MenuAddStockjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAddStockjPanelMouseClicked
       stockSelect.setBackground(selected);
       SupplierSelect.setBackground(defaultClor);
       itemSelect.setBackground(defaultClor); 
       homeSelect.setBackground(defaultClor);
       cmgSoonSelect.setBackground(defaultClor);
       Work_Panel.removeAll();
       Work_Panel.repaint();
       AddStockMaster master = new AddStockMaster();
       master.setBorder(null);
       BasicInternalFrameUI bi = (BasicInternalFrameUI)master.getUI();
       bi.setNorthPane(null);
       Work_Panel.add(master).setVisible(true);
    }//GEN-LAST:event_MenuAddStockjPanelMouseClicked

    private void itemSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSelectMouseClicked
        stockSelect.setBackground(defaultClor);
       SupplierSelect.setBackground(defaultClor);
       itemSelect.setBackground(selected);
       homeSelect.setBackground(defaultClor);
       cmgSoonSelect.setBackground(defaultClor);
    }//GEN-LAST:event_itemSelectMouseClicked

    private void SupplierSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierSelectMouseClicked
        
    }//GEN-LAST:event_SupplierSelectMouseClicked

    private void MenuAddItemjPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAddItemjPanel1MouseClicked
       stockSelect.setBackground(defaultClor);
       SupplierSelect.setBackground(defaultClor);
       itemSelect.setBackground(selected);
       homeSelect.setBackground(defaultClor);
       cmgSoonSelect.setBackground(defaultClor);
       Work_Panel.removeAll();
       Work_Panel.repaint();
       AddItemMaster master = new AddItemMaster();
       master.setBorder(null);
       BasicInternalFrameUI bi = (BasicInternalFrameUI)master.getUI();
       bi.setNorthPane(null);
       Work_Panel.add(master).setVisible(true);
    }//GEN-LAST:event_MenuAddItemjPanel1MouseClicked

    private void MenuAddSupploerjPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAddSupploerjPanel2MouseClicked
        stockSelect.setBackground(defaultClor);
       SupplierSelect.setBackground(selected);
       itemSelect.setBackground(defaultClor);
       homeSelect.setBackground(defaultClor);
       cmgSoonSelect.setBackground(defaultClor);
       Work_Panel.removeAll();
       Work_Panel.repaint();
       SupplierMaster supplierMaster = new SupplierMaster();
       supplierMaster.setBorder(null);
       BasicInternalFrameUI bi = (BasicInternalFrameUI)supplierMaster.getUI();
        bi.setNorthPane(null);
       Work_Panel.add(supplierMaster).setVisible(true);
               
    }//GEN-LAST:event_MenuAddSupploerjPanel2MouseClicked

    private void MenucmgSoonjPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenucmgSoonjPanel2MouseClicked
       Work_Panel.removeAll();
       Work_Panel.repaint();
       stockSelect.setBackground(defaultClor);
       SupplierSelect.setBackground(defaultClor);
       itemSelect.setBackground(defaultClor);
       homeSelect.setBackground(defaultClor);
       cmgSoonSelect.setBackground(selected);
    }//GEN-LAST:event_MenucmgSoonjPanel2MouseClicked

    private void MenuAddStockjPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAddStockjPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAddStockjPanel3MouseClicked

    private void homeSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeSelectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homeSelectMouseClicked

    private void MenuHomejPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHomejPanelMouseClicked
       Work_Panel.removeAll();
       Work_Panel.repaint();
       stockSelect.setBackground(defaultClor);
       SupplierSelect.setBackground(defaultClor);
       itemSelect.setBackground(defaultClor);
       homeSelect.setBackground(selected);
       cmgSoonSelect.setBackground(defaultClor);
        
    }//GEN-LAST:event_MenuHomejPanelMouseClicked

    private void MenuAddStockjPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAddStockjPanelMousePressed
        Work_Panel.removeAll();
        Work_Panel.repaint();
    }//GEN-LAST:event_MenuAddStockjPanelMousePressed

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
            java.util.logging.Logger.getLogger(MainStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuAddItemjPanel1;
    private javax.swing.JPanel MenuAddItemjPanel3;
    private javax.swing.JPanel MenuAddItemjPanel4;
    private javax.swing.JPanel MenuAddStockjPanel;
    private javax.swing.JPanel MenuAddStockjPanel1;
    private javax.swing.JPanel MenuAddStockjPanel3;
    private javax.swing.JPanel MenuAddSupploerjPanel2;
    private javax.swing.JPanel MenuHomejPanel;
    private javax.swing.JPanel MenucmgSoonjPanel2;
    private javax.swing.JPanel SupplierSelect;
    private javax.swing.JPanel Work_Panel;
    private javax.swing.JPanel cmgSoonSelect;
    private javax.swing.JPanel homeSelect;
    private javax.swing.JPanel itemSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel mainjPanel;
    private javax.swing.JPanel stockSelect;
    private javax.swing.JPanel stockSelect1;
    private javax.swing.JPanel stockSelect3;
    // End of variables declaration//GEN-END:variables
}
