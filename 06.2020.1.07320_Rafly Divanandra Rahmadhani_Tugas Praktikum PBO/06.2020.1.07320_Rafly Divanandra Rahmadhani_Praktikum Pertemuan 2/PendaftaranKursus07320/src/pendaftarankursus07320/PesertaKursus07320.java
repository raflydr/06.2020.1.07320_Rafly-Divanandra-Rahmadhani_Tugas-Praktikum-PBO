/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftarankursus07320;

public class PesertaKursus07320 extends BiodataKursus07320 {
    private String umur;
    
    public PesertaKursus07320(String umur, String nama, String noTelp, String alamat){
        super(nama, noTelp, alamat);
        this.umur = umur;
    }
    
    public String getUmur(){
        return umur;
    }
    
    public void setUmur(String umur){
        this.umur = umur;
    }
}

