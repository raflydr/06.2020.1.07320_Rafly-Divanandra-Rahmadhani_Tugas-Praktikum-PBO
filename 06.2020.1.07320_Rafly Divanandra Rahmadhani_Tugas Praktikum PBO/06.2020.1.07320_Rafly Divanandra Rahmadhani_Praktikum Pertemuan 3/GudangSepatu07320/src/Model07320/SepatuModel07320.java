/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model07320;
import Entity07320.SepatuEntity07320;
import Controller07320.Koneksi07320;
import java.util.ArrayList;

public class SepatuModel07320 {
   protected Koneksi07320 koneksi = new Koneksi07320();
    public ArrayList<SepatuEntity07320> sepatuEntity = new ArrayList<SepatuEntity07320>();
    
    public SepatuModel07320(){
        koneksi.getconnection();
    }

    public void toSync(){
        String sql = "SELECT * FROM admin;";
        try {
            koneksi.rs = koneksi.stmt.executeQuery(sql);

            while (koneksi.rs.next()) {
                sepatuEntity.add(new SepatuEntity07320(koneksi.rs.getString("merk"), koneksi.rs.getString("ukuran"), koneksi.rs.getString("warna")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Insert(String merk, String ukuran, String warna){
        sepatuEntity.add(new SepatuEntity07320(merk, ukuran, warna));
        String sql =String.format("INSERT INTO admin (merk, ukuran, warna) VALUES ('%s', '%s','%s')", merk, ukuran, warna) ;
        try {
        sql = String.format(sql, merk, ukuran, warna);
        koneksi.stmt.execute(sql);
        } catch (Exception e){
            System.out.println(" Data Gagal di buat. \n");
            e.printStackTrace();
        }
    }

    public void Display(){
        System.out.println("+--------------------------------+");
        System.out.println("|    DATA SEPATU YANG ADA   |");
        System.out.println("+--------------------------------+");
        for(int i = 0; i < sepatuEntity.size();i++){
            System.out.println(String.format (
                    " | Merk  : %s "
                    + "\n | Ukuran : %s "
                    + "\n | Warna  : %s  "
                    + "\n+--------------------------------+",
                    sepatuEntity.get(i).getMerk(), sepatuEntity.get(i).getUkuran(), sepatuEntity.get(i).getWarna()));
        }
    }

    public void Update(String merk, String ukuran, String warna){
        try {
            String sql = "UPDATE admin SET ukuran = '%s', Warna = '%s' WHERE merk = '%s';";
            sql = String.format(sql, ukuran, warna, merk);
            koneksi.stmt.executeUpdate(sql);
            sepatuEntity.clear();
            toSync();
        } catch (Exception e) {
            System.out.println("Update Data Gagal.");
            e.printStackTrace();
        }
    }

    public void Delete(String merk){
        try {
            String sql = String.format("DELETE FROM admin WHERE merk = '%s'; ", merk);
            //sql = String.format(sql);
            koneksi.stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
            sepatuEntity.clear();
            toSync();            
        } catch (Exception e) {
            e.printStackTrace();
            }
        }
}


    
