/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.projecttemplate;

import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class RMpage extends javax.swing.JInternalFrame {

    /**
     * Creates new form RMpage
     */
    public RMpage() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRCMBook10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRCMBook1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRCMBook6 = new javax.swing.JButton();
        btnRCMBook8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1450, 800));
        setRequestFocusEnabled(false);

        jLabel3.setText("Borrowed Bride");

        jLabel4.setText("The story of Selena Quintanilla ");

        btnRCMBook10.setBackground(new java.awt.Color(255, 255, 255));
        btnRCMBook10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selenabook.png"))); // NOI18N
        btnRCMBook10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCMBook10MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Rom Com");

        btnRCMBook1.setBackground(new java.awt.Color(255, 255, 255));
        btnRCMBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imobiouslybook.png"))); // NOI18N
        btnRCMBook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCMBook1MouseClicked(evt);
            }
        });

        jLabel1.setText("Imogen Obviously");

        jLabel2.setText("Kaguya Sama");

        btnRCMBook6.setBackground(new java.awt.Color(255, 255, 255));
        btnRCMBook6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Skaguya.png"))); // NOI18N
        btnRCMBook6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCMBook6MouseClicked(evt);
            }
        });

        btnRCMBook8.setBackground(new java.awt.Color(255, 255, 255));
        btnRCMBook8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SBorrowedB.png"))); // NOI18N
        btnRCMBook8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCMBook8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(650, 650, 650)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRCMBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnRCMBook6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(btnRCMBook8))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRCMBook10))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRCMBook10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRCMBook8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnRCMBook6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnRCMBook1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(225, 225, 225))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRCMBook1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRCMBook1MouseClicked
        // TODO add your handling code here:
        
        JDesktopPane desktop = getDesktopPane();
        
        JInternalFrame[] frames = desktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
            desktop.remove(frame);
            }

        desktop.repaint();
        
        String bookId = "008";  // Set the actual book ID
        String bookName = DatabaseManager.getBookNameById(bookId);
        String author = DatabaseManager.getAuthorById(bookId);
        String picURL = "src\\main\\resources\\rec8.png";
        
        Book1 bookP = new Book1();
        bookP.setBookDetails(bookId,bookName,author,picURL); 
        bookP.setVisible(true);
        desktop.add(bookP);
    }//GEN-LAST:event_btnRCMBook1MouseClicked

    private void btnRCMBook6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRCMBook6MouseClicked
        // TODO add your handling code here:
        JDesktopPane desktop = getDesktopPane();
        
        JInternalFrame[] frames = desktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
            desktop.remove(frame);
            }

        desktop.repaint();
        
        String bookId = "014";  // Set the actual book ID
        String bookName = DatabaseManager.getBookNameById(bookId);
        String author = DatabaseManager.getAuthorById(bookId);
        String picURL = "src\\main\\resources\\kaguya.png";
        
        Book1 bookP = new Book1();
        bookP.setBookDetails(bookId,bookName,author,picURL); 
        bookP.setVisible(true);
        desktop.add(bookP);
    }//GEN-LAST:event_btnRCMBook6MouseClicked

    private void btnRCMBook8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRCMBook8MouseClicked
        // TODO add your handling code here:
        JDesktopPane desktop = getDesktopPane();
        
        JInternalFrame[] frames = desktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
            desktop.remove(frame);
            }

        desktop.repaint();
        
        String bookId = "015";  // Set the actual book ID
        String bookName = DatabaseManager.getBookNameById(bookId);
        String author = DatabaseManager.getAuthorById(bookId);
        String picURL = "src\\main\\resources\\BorrowedB.png";
        
        Book1 bookP = new Book1();
        bookP.setBookDetails(bookId,bookName,author,picURL); 
        bookP.setVisible(true);
        desktop.add(bookP);
    }//GEN-LAST:event_btnRCMBook8MouseClicked

    private void btnRCMBook10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRCMBook10MouseClicked
        // TODO add your handling code here:
        JDesktopPane desktop = getDesktopPane();
        
        JInternalFrame[] frames = desktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
            desktop.remove(frame);
            }

        desktop.repaint();
        
        String bookId = "003";  // Set the actual book ID
        String bookName = DatabaseManager.getBookNameById(bookId);
        String author = DatabaseManager.getAuthorById(bookId);
        String picURL = "src\\main\\resources\\rec3.png";
        
        Book1 bookP = new Book1();
        bookP.setBookDetails(bookId,bookName,author,picURL); 
        bookP.setVisible(true);
        desktop.add(bookP);
    }//GEN-LAST:event_btnRCMBook10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRCMBook1;
    private javax.swing.JButton btnRCMBook10;
    private javax.swing.JButton btnRCMBook6;
    private javax.swing.JButton btnRCMBook8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
