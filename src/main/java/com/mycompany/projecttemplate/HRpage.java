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
public class HRpage extends javax.swing.JInternalFrame {

    /**
     * Creates new form HRpage
     */
    public HRpage() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRCMBook6 = new javax.swing.JButton();
        btnRCMBook8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRCMBook10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRCMBook1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1450, 800));

        jLabel1.setText("The Hurricane wars");

        jLabel2.setText("Storm and Fury");

        btnRCMBook6.setBackground(new java.awt.Color(255, 255, 255));
        btnRCMBook6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stormbook.png"))); // NOI18N
        btnRCMBook6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCMBook6MouseClicked(evt);
            }
        });

        btnRCMBook8.setBackground(new java.awt.Color(255, 255, 255));
        btnRCMBook8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StheRaven.png"))); // NOI18N
        btnRCMBook8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCMBook8MouseClicked(evt);
            }
        });

        jLabel3.setText("THE RAVEN");

        jLabel4.setText("Greek and Roman ghost stories");

        btnRCMBook10.setBackground(new java.awt.Color(255, 255, 255));
        btnRCMBook10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SGreekRoman.png"))); // NOI18N
        btnRCMBook10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCMBook10MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Horror");

        btnRCMBook1.setBackground(new java.awt.Color(255, 255, 255));
        btnRCMBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lfbook.png"))); // NOI18N
        btnRCMBook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCMBook1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRCMBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnRCMBook6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnRCMBook8))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRCMBook10))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(659, 659, 659))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRCMBook10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRCMBook1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRCMBook6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRCMBook8, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        
        String bookId = "006";  // Set the actual book ID
        String bookName = DatabaseManager.getBookNameById(bookId);
        String author = DatabaseManager.getAuthorById(bookId);
        String picURL = "src\\main\\resources\\Lstorm.png";
        
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
        
        String bookId = "007";  // Set the actual book ID
        String bookName = DatabaseManager.getBookNameById(bookId);
        String author = DatabaseManager.getAuthorById(bookId);
        String picURL = "src\\main\\resources\\rec7.png";
        
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
        
        String bookId = "016";  // Set the actual book ID
        String bookName = DatabaseManager.getBookNameById(bookId);
        String author = DatabaseManager.getAuthorById(bookId);
        String picURL = "src\\main\\resources\\theRaven.png";
        
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
        
        String bookId = "017";  // Set the actual book ID
        String bookName = DatabaseManager.getBookNameById(bookId);
        String author = DatabaseManager.getAuthorById(bookId);
        String picURL = "src\\main\\resources\\GreekRoman.png";
        
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
