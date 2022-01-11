/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftarankursus07320;

public class PesertaTerdaftarKursus07320 {
    private PesertaKursus07320 peserta07320;
    private int indexLomba;
    private String kodePeserta;
    
    public PesertaTerdaftarKursus07320(PesertaKursus07320 peserta07320, int indexLomba, String kodePeserta){
        this.peserta07320 = peserta07320;
        this.indexLomba = indexLomba;
        this.kodePeserta = kodePeserta;
    }
    
    public PesertaKursus07320 getPesertaKursus07320(){
        return peserta07320;
    }
    
    public int getIndexLomba(){
        return indexLomba;
    }
    
     public String getkodePeserta(){
        return kodePeserta;
    }
    
    public void setPeserta07320(PesertaKursus07320 peserta07320){
        this.peserta07320 = peserta07320;
    }
    
    public void setIndexLomba(int indexLomba){
        this.indexLomba = indexLomba;
    }
    
    public void setKodePeserta(String kodePeserta){
        this.kodePeserta = kodePeserta;
    }    
}

