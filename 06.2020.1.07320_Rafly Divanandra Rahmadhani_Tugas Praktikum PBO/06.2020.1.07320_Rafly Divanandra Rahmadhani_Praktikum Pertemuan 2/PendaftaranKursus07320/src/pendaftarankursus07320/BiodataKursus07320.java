/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftarankursus07320;

public class BiodataKursus07320 {
    protected String nama,noTelp,alamat;
    
    public BiodataKursus07320(String nama,String noTelp,String alamat){
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNoTelp(){
        return noTelp;
    }
    
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
}

