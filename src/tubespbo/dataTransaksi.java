/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubespbo;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author Microsoft
 */
public class dataTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form dataTransaksi
     */Connection con = Koneksidb.getkoneksi();
    public dataTransaksi() {
        initComponents();
       tabeltransaksi();
    }   
 public void tabeltransaksi(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Transaksi");
        model.addColumn("Id Buku");
        model.addColumn("Tanggal");
        model.addColumn("Judul");
        model.addColumn("Kategori");
        model.addColumn("Harga Stuan");
        model.addColumn("Jumlah Beli");
        model.addColumn("Harga");
        model.addColumn("Bayar");
        model.addColumn("Kembalian");
        //menampilkan data database kedalam tabel
        try {
            String sql = "select * from penjualan";
            java.sql.Statement stm=con.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)
                               ,res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
            tabeltransaksi.setModel(model);
            
        } catch (Exception e) {
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltransaksi = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        all = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        tabeltransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Transaksi", "Id Buku", "Tanggal", "Judul", "Kategori", "Harga Stuan", "Jumlah Beli", "Harga", "Bayar", "Kembalian"
            }
        ));
        tabeltransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltransaksi);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jButton2.setText("Cetak");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        all.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                allKeyPressed(evt);
            }
        });

        txtNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNotaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_allKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_allKeyPressed

    private void txtNotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyPressed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Transaksi");
        model.addColumn("Id Buku");
        model.addColumn("Tanggal");
        model.addColumn("Judul");
        model.addColumn("Kategori");
        model.addColumn("Harga Stuan");
        model.addColumn("Jumlah Beli");
        model.addColumn("Harga");
        model.addColumn("Bayar");
        model.addColumn("Kembalian");
        //menampilkan data database kedalam tabel
        try {
            String nota = txtNota.getText();
            String sql = "select * from penjualan where id_transaksi like'%"+nota+"%'";
            java.sql.Statement stm=con.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)
                               ,res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
            tabeltransaksi.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }
    }//GEN-LAST:event_txtNotaKeyPressed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
      if(tabeltransaksi.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(null,"Silahkan pilih baris data yang akan di hapus");
            return ;
        }
        if(JOptionPane.showConfirmDialog(null,"Apakah anda yakin akaan menghapus data ini?")==JOptionPane.OK_OPTION){
            try{

                String sql="DELETE FROM penjualan WHERE id_transaksi='"+txtNota.getText()+"'";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil di hapus");

            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            tabeltransaksi();
       
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabeltransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltransaksiMouseClicked
          int row = tabeltransaksi.getSelectedRow();
        txtNota.setText(tabeltransaksi.getModel().getValueAt(row, 0).toString());
    }//GEN-LAST:event_tabeltransaksiMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Transaksi");
        model.addColumn("Id Buku");
        model.addColumn("Tanggal");
        model.addColumn("Judul");
        model.addColumn("Kategori");
        model.addColumn("Harga Stuan");
        model.addColumn("Jumlah Beli");
        model.addColumn("Harga");
        model.addColumn("Bayar");
        model.addColumn("Kembalian");
        //menampilkan data database kedalam tabel
        try {
            String nota = jButton2.getText();
            String sql = "select * from penjualan where id_transaksi like'%"+nota+"%'";
            java.sql.Statement stm=con.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)
                               ,res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
            tabeltransaksi.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(dataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField all;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeltransaksi;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
