/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller07320;
import Model07320.SepatuModel07320;

public class SepatuController07320 {   
    protected SepatuModel07320 sepatuModel = new SepatuModel07320();
    
    public void Sync(){
        sepatuModel.toSync();
    }
    public void Insert(String merk, String ukuran, String warna ){
        sepatuModel.Insert(merk, ukuran, warna);
    }
    public void Display(){
        sepatuModel.Display();
    }
    public void Update(String merk, String ukuran, String warna){
        sepatuModel.Update(merk, ukuran, warna);
    }
    public void Delete(String merk){
         sepatuModel.Delete(merk);
    }
}
