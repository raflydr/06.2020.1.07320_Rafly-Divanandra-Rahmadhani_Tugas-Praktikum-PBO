
package gudangsepatugui07320;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.awt.*;
//rafly

public class GudangSepatuGUI07320 extends javax.swing.JFrame {
    private javax.swing.JTable TabelProduk;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelHargaSepatu;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelKodeSepatu;
    private javax.swing.JLabel jLabelNamaSepatu;
    private javax.swing.JLabel jLabelJumlahSepatu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextHargaSepatu;
    private javax.swing.JTextField jTextKodeSepatu;
    private javax.swing.JTextField jTextNamaSepatu;
    private javax.swing.JTextField jTextJumlahSepatu;
    
    DefaultTableModel tabModel;
    ResultSet RsSepatu07320 = null;

    public GudangSepatuGUI07320() {
        initComponents();

        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize=this.getSize();
        if(frameSize.height > screenSize.height){
            frameSize.height=screenSize.height;
        }
        if(frameSize.width > screenSize.width){
            frameSize.width=screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height = screenSize.height) / 20);


        showData();
        SetEditOff();
    }

    private void showData(){
        try{
            Object[] judul_kolom = {"KodeSepatu", "NamaSepatu", "HargaSepatu", "JumlahSepatu"};
            tabModel=new DefaultTableModel(null,judul_kolom);
            TabelProduk.setModel(tabModel);

            Connection conn=(Connection)Koneksi07320.koneksiDB();
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();

            RsSepatu07320=stt.executeQuery("SELECT * from sepatu; ");
            while(RsSepatu07320.next()){
                Object[] data={
                        RsSepatu07320.getString("KodeSepatu"),
                        RsSepatu07320.getString("NamaSepatu"),
                        RsSepatu07320.getString("HargaSepatu"),
                        RsSepatu07320.getString("JumlahSepatu"),
                        
                };
                tabModel.addRow(data);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        jButtonSave.setEnabled(true);
        jButtonUpdate.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonCancel.setEnabled(true);
    }

    void tblKeForm(){
        jTextKodeSepatu.setText(tabModel.getValueAt(TabelProduk.getSelectedRow(),0)+"");
        jTextNamaSepatu.setText(tabModel.getValueAt(TabelProduk.getSelectedRow(),1)+"");
        jTextHargaSepatu.setText(tabModel.getValueAt(TabelProduk.getSelectedRow(),2)+"");
        jTextJumlahSepatu.setText(tabModel.getValueAt(TabelProduk.getSelectedRow(),3)+"");

        jButtonUpdate.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonCancel.setEnabled(true);
        jButtonSave.setEnabled(false);
    }

    private void HapusData(){
        jTextKodeSepatu.setText("");
        jTextNamaSepatu.setText("");
        jTextHargaSepatu.setText("");
        jTextJumlahSepatu.setText("");
    }

    private void SetEditOff(){
        jTextKodeSepatu.setEnabled(false);
        jTextNamaSepatu.setEnabled(false);
        jTextHargaSepatu.setEnabled(false);
        jTextJumlahSepatu.setEnabled(false);
    }

    private void seteditOn(){
        jTextKodeSepatu.setEnabled(true);
        jTextNamaSepatu.setEnabled(true);
        jTextHargaSepatu.setEnabled(true);
        jTextJumlahSepatu.setEnabled(true);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabelHeader = new javax.swing.JLabel();
        jLabelKodeSepatu = new javax.swing.JLabel();
        jTextKodeSepatu = new javax.swing.JTextField();
        jLabelNamaSepatu = new javax.swing.JLabel();
        jTextNamaSepatu = new javax.swing.JTextField();
        jLabelHargaSepatu = new javax.swing.JLabel();
        jTextHargaSepatu = new javax.swing.JTextField();
        jLabelJumlahSepatu = new javax.swing.JLabel();
        jTextJumlahSepatu = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelProduk = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelHeader.setBackground(new java.awt.Color(34, 139, 35));
        jLabelHeader.setFont(new java.awt.Font("Arial", 1, 18)); 
        jLabelHeader.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeader.setText("Data Gudang Sepatu RAFLY");
        jLabelHeader.setOpaque(true);

        jLabelKodeSepatu.setText("Kode Sepatu");

        jLabelNamaSepatu.setText("Nama Sepatu");

        jLabelHargaSepatu.setText("Harga Sepatu");

        jLabelJumlahSepatu.setText("Jumlah Sepatu");

        jButtonAdd.setText("AddNew");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        TabelProduk.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        TabelProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelProduk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNamaSepatu)
                                        .addComponent(jLabelHargaSepatu)
                                        .addComponent(jLabelJumlahSepatu)
                                        .addComponent(jLabelKodeSepatu))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jTextHargaSepatu)
                                                                        .addComponent(jTextNamaSepatu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextKodeSepatu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextJumlahSepatu)))
                                                        .addComponent(jButtonAdd))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonSave)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonUpdate)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonDelete)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonCancel)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextKodeSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelKodeSepatu))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextNamaSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelNamaSepatu))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextHargaSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelHargaSepatu))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextJumlahSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelJumlahSepatu))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonAdd)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSave)
                                        .addComponent(jButtonUpdate)
                                        .addComponent(jButtonDelete)
                                        .addComponent(jButtonCancel))
                                .addGap(21, 21, 21))
        );

        pack();
    }

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {
        
        HapusData();
        jTextKodeSepatu.requestFocus();
        jButtonSave.setEnabled(true);
        jButtonUpdate.setEnabled(true);
        jButtonDelete.setEnabled(true);
        seteditOn();
    }


    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {
        
        String KodeSepatu =jTextKodeSepatu.getText();
        String NamaSepatu =jTextNamaSepatu.getText();
        String HargaSepatu=jTextHargaSepatu.getText();
        String JumlahSepatu=jTextJumlahSepatu.getText();


        if (KodeSepatu.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Kode Sepatu tidak boleh kosong");
            jTextKodeSepatu.requestFocus();
        }else if (NamaSepatu.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nama Sepatu tidak boleh kosong");
            jTextNamaSepatu.requestFocus();
        }else if (HargaSepatu.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Harga Sepatu tidak boleh kosong");
            jTextHargaSepatu.requestFocus();
        }else if (JumlahSepatu.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Jumlah Sepatu tidak boleh kosong");
            jTextJumlahSepatu.requestFocus();
        }
        else if (!(new Scanner(HargaSepatu).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Inputan Harga Sepatu Salah");
            jTextHargaSepatu.requestFocus();
        }else if (!(new Scanner(JumlahSepatu).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Inputan Jumlah Sepatu Salah");
            jTextJumlahSepatu.requestFocus();
        }else{
            try{
                Connection conn=(Connection)Koneksi07320.koneksiDB();
                Statement stt=conn.createStatement();
                stt.executeUpdate("insert into sepatu(KodeSepatu, NamaSepatu, HargaSepatu, JumlahSepatu)"+
                        "VALUES('"+KodeSepatu+"', '"+NamaSepatu+"', '"+HargaSepatu+"', '"+JumlahSepatu+"')");
                HapusData();
                showData();
                SetEditOff();
                JOptionPane.showMessageDialog(this,"Data berhasil disimpan","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Simpan data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }

    }


    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        String KodeSepatu=jTextKodeSepatu.getText();
        String NamaSepatu=jTextNamaSepatu.getText();
        String HargaSepatu=jTextHargaSepatu.getText();
        String JumlahSepatu=jTextJumlahSepatu.getText();

        if (KodeSepatu.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Kode Sepatu tidak boleh kosong");
            jTextKodeSepatu.requestFocus();
        }else if (NamaSepatu.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Nama Sepatu tidak boleh kosong");
            jTextNamaSepatu.requestFocus();
        }else if (HargaSepatu.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Harga Sepatu tidak boleh kosong");
            jTextHargaSepatu.requestFocus();
        }else if (JumlahSepatu.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Jumlah Sepatu tidak boleh kosong");
            jTextJumlahSepatu.requestFocus();
        }
        else if (!(new Scanner(HargaSepatu).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Inputan Harga Sepatu Salah");
            jTextHargaSepatu.requestFocus();
        }else if (!(new Scanner(JumlahSepatu).hasNextInt())) {
            JOptionPane.showMessageDialog(null,"Inputan Harga Sepatu Salah");
            jTextJumlahSepatu.requestFocus();
        }else{
            try{
                Connection conn=(Connection)Koneksi07320.koneksiDB();
                Statement stt=conn.createStatement();
                stt.executeUpdate("UPDATE sepatu SET NamaSepatu='"+NamaSepatu+"', HargaSepatu='"+HargaSepatu+"', JumlahSepatu='"+JumlahSepatu+"' WHERE KodeSepatu='"+KodeSepatu+"'");
                HapusData();
                showData();
                SetEditOff();
                JOptionPane.showMessageDialog(this,"Data berhasil diubah","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Ubah data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }

    }


    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        String KodeSepatu=jTextKodeSepatu.getText();

        if (KodeSepatu.isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Kode Sepatu tidak boleh kosong");
            jTextKodeSepatu.requestFocus();
        }else if(JOptionPane.showConfirmDialog(null,"Apakah anda yakin akan menghapus data ini?",
                "Informasi",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE)==JOptionPane.OK_OPTION){
            try{
                Connection conn=(Connection)Koneksi07320.koneksiDB();
                Statement stt=conn.createStatement();
                stt.executeUpdate("DELETE FROM sepatu WHERE KodeSepatu='"+KodeSepatu+"'");
                HapusData();
                showData();
                SetEditOff();
                JOptionPane.showMessageDialog(this,"Data berhasil di hapus","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Hapus data gagal\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {

        HapusData();
        jButtonSave.setEnabled(true);
        jButtonUpdate.setEnabled(true);
        jButtonDelete.setEnabled(true);
        SetEditOff();
    }


    private void TabelProdukMouseClicked(java.awt.event.MouseEvent evt) {

        seteditOn();
        jTextKodeSepatu.setEnabled(false);
        tblKeForm();
    }
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GudangSepatuGUI07320.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GudangSepatuGUI07320.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GudangSepatuGUI07320.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GudangSepatuGUI07320.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GudangSepatuGUI07320().setVisible(true);
            }
        });
    }
}
    

