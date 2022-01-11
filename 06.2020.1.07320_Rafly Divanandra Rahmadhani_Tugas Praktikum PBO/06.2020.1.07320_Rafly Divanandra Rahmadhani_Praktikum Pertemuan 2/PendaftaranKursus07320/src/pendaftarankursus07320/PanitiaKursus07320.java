/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftarankursus07320;

public class PanitiaKursus07320 extends BiodataKursus07320 {
    private String password;
    
    public PanitiaKursus07320(String password, String nama, String noTelp, String alamat){
        super (nama, noTelp, alamat);
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}

