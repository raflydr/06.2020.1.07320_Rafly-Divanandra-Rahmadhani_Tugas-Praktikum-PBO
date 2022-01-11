/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07320;

public abstract class UserEntityAbstract07320 {
    //protected int id;
    protected String merk, ukuran;
    
    public UserEntityAbstract07320(){
        
    }
    public UserEntityAbstract07320(String merk, String ukuran){
        this.merk = merk;
        this.ukuran = ukuran;
        
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getUkuran() {
        return ukuran;
    }
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
}
