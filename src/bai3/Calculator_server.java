/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JTextField;

/**
 *
 * @author phamv
 */
public class Calculator_server extends javax.swing.JFrame {

    /**
     * Creates new form Calculator_server
     */
    public Calculator_server() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsoa = new javax.swing.JTextField();
        txtsob = new javax.swing.JTextField();
        btncong = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        btnnhan = new javax.swing.JButton();
        btnchia = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaStatus = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nhập số a");

        jLabel2.setText("Nhập số b");

        jLabel3.setText("Kết quả");

        txtsoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoaActionPerformed(evt);
            }
        });
        txtsoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsoaKeyTyped(evt);
            }
        });

        txtsob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsobKeyTyped(evt);
            }
        });

        btncong.setText("+");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });
        btncong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btncongKeyTyped(evt);
            }
        });

        btntru.setText("-");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });

        btnnhan.setText("*");
        btnnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanActionPerformed(evt);
            }
        });

        btnchia.setText("/");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");

        btnexit.setText("Exit");

        txaStatus.setColumns(20);
        txaStatus.setRows(5);
        jScrollPane2.setViewportView(txaStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntru, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnchia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnhan)
                        .addGap(25, 25, 25)
                        .addComponent(btnclear)
                        .addGap(18, 18, 18)
                        .addComponent(btnexit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsob)
                            .addComponent(txtsoa)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntru, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnchia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsoa, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsob, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncongKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncongKeyTyped
    // TODO add your handling code here:
    }//GEN-LAST:event_btncongKeyTyped

    private void txtsoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoaActionPerformed

    private void txtsoaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsoaKeyTyped
        JTextField txt = (JTextField)evt.getSource();
        String after = txt.getText() + evt.getKeyChar();
        try
        {
            Integer.parseInt(after);
        }
        catch(NumberFormatException ex)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtsoaKeyTyped

    private void txtsobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsobKeyTyped
        JTextField txt = (JTextField)evt.getSource();
        String after = txt.getText() + evt.getKeyChar();
        try
        {
            Integer.parseInt(after);
        }
        catch(NumberFormatException ex)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtsobKeyTyped

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try
        { 
            Socket ClientSocket = new Socket("Localhost", 1234); 
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream()); 
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream()); 
            // nhap du lieu tu ban phim gui len Server
            outToServer.writeBytes(txtsoa.getText()+'\n'); 
            outToServer.writeBytes(txtsob.getText()+'\n'); 
            txaStatus.append("Kết quả từ Server:"+inFromServer.readLine() + "\n\n"); 
            //dong luong gui du lieu len Server
            outToServer.close(); 
            //dong luong nhan du lieu tu Server
            inFromServer.close(); 
            //dong socket Client
            ClientSocket.close(); 
        }
        catch(UnknownHostException e) 
        { 
            txaStatus.append("Server Not Found\n\n");
        }
        catch(IOException e) 
        { 
            txaStatus.append("Cannot make a connection\n\n");
        } 
    }//GEN-LAST:event_btncongActionPerformed

    private void btnnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanActionPerformed
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try
        { 
            Socket ClientSocket = new Socket("Localhost", 1234); 
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream()); 
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream()); 
            // nhap du lieu tu ban phim gui len Server
            outToServer.writeBytes(txtsoa.getText()+'\n'); 
            outToServer.writeBytes(txtsob.getText()+'\n'); 
            txaStatus.append("Kết quả từ Server:"+inFromServer.readLine() + "\n\n"); 
            //dong luong gui du lieu len Server
            outToServer.close(); 
            //dong luong nhan du lieu tu Server
            inFromServer.close(); 
            //dong socket Client
            ClientSocket.close(); 
        }
        catch(UnknownHostException e) 
        { 
            txaStatus.append("Server Not Found\n\n");
        }
        catch(IOException e) 
        { 
            txaStatus.append("Cannot make a connection\n\n");
        }
    }//GEN-LAST:event_btnnhanActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try
        { 
            Socket ClientSocket = new Socket("Localhost", 1234); 
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream()); 
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream()); 
            // nhap du lieu tu ban phim gui len Server
            outToServer.writeBytes(txtsoa.getText()+'\n'); 
            outToServer.writeBytes(txtsob.getText()+'\n'); 
            txaStatus.append("Kết quả từ Server:"+inFromServer.readLine() + "\n\n"); 
            //dong luong gui du lieu len Server
            outToServer.close(); 
            //dong luong nhan du lieu tu Server
            inFromServer.close(); 
            //dong socket Client
            ClientSocket.close(); 
        }
        catch(UnknownHostException e) 
        { 
            txaStatus.append("Server Not Found\n\n");
        }
        catch(IOException e) 
        { 
            txaStatus.append("Cannot make a connection\n\n");
        }
    }//GEN-LAST:event_btntruActionPerformed

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try
        { 
            Socket ClientSocket = new Socket("Localhost", 1234); 
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream()); 
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream()); 
            // nhap du lieu tu ban phim gui len Server
            outToServer.writeBytes(txtsoa.getText()+'\n'); 
            outToServer.writeBytes(txtsob.getText()+'\n'); 
            txaStatus.append("Kết quả từ Server:"+inFromServer.readLine() + "\n\n"); 
            //dong luong gui du lieu len Server
            outToServer.close(); 
            //dong luong nhan du lieu tu Server
            inFromServer.close(); 
            //dong socket Client
            ClientSocket.close(); 
        }
        catch(UnknownHostException e) 
        { 
            txaStatus.append("Server Not Found\n\n");
        }
        catch(IOException e) 
        { 
            txaStatus.append("Cannot make a connection\n\n");
        }
    }//GEN-LAST:event_btnchiaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator_server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncong;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnnhan;
    private javax.swing.JButton btntru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txaStatus;
    private javax.swing.JTextField txtsoa;
    private javax.swing.JTextField txtsob;
    // End of variables declaration//GEN-END:variables
}
