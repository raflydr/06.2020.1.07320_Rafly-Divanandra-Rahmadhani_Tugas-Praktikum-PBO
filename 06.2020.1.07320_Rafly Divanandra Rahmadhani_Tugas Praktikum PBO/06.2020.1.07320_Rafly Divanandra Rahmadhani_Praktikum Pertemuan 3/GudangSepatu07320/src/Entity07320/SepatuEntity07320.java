/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07320;

public class SepatuEntity07320 extends UserEntityAbstract07320{
     private String warna;
    
    public SepatuEntity07320(String merk, String ukuran, String warna){
        super(merk,ukuran);
        this.warna = warna;
    }
    
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
   
}

