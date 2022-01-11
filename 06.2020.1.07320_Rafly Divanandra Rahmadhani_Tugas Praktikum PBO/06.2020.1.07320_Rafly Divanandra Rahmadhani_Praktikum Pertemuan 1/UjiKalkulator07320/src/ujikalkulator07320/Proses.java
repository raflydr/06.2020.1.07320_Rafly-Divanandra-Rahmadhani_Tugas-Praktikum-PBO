/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikalkulator07320;


public class Proses {
    public float nilai1_07320; 
    public float nilai2_07320;
    
    
    public Proses(float nilai1_07320, float nilai2_07320){
        this.nilai1_07320 = nilai1_07320;
        this.nilai2_07320 = nilai2_07320;
        //float jumlah = this.jumlah_07320;
}
    
    public float penjumlahan(float nilai1,float nilai2){
        float jumlah = nilai1 + nilai2;
        return jumlah;
    }
    public float pengurangan(float nilai1,float nilai2){
        float kurang = nilai1 - nilai2;
        return kurang;
    }
    public float perkalian(float nilai1,float nilai2){
        float kali = nilai1 * nilai2;
        return kali;
    }
    public float pembagian(float nilai1,float nilai2){
        float bagi = nilai1 / nilai2;
        return bagi;
    }
    
}
