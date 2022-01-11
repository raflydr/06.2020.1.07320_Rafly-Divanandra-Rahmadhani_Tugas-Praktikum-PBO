/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudangsepatu07320;
import Controller07320.SepatuController07320;
import java.util.Scanner;
import Model07320.SepatuModel07320;
import Controller07320.Koneksi07320;

public class GudangSepatu07320 {
    static Scanner input = new Scanner(System.in);
    static SepatuController07320 SepatuController = new SepatuController07320();
    
    public static void main(String[] args) throws Exception {
        SepatuController.Sync();
    
    int pil;
    do {
        System.out.println("+-------------------------------+");
        System.out.println("|     GUDANG SEPATU RAFLY       |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. DAFTARKAN SEPATU           |");
        System.out.println("| 2. LIHAT SEPATU YANG ADA      |");
        System.out.println("| 3. UPDATE DATA SEPATU         |");
        System.out.println("| 4. HAPUS DATA SEPATU          |");
        System.out.println("| 5. EXIT                       |");
        System.out.println("---------------------------------");
        System.out.print("Masukan pilihan : ");
        pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
            case 1 -> {
                System.out.println("Create");
                Create();
            }
            
            case 2 -> {
                System.out.println("Read");
                Read();
            }
            
            case 3 -> {
                System.out.println("Update");
                Update();
            }
            
            case 4 -> {
                System.out.println("Delete");
                Delete();
            }
        }
    } while (pil != 5);
    }

    static void Create(){
        System.out.print("merk : ");
        String merk = input.nextLine();
        System.out.print("ukuran : ");
        String ukuran = input.nextLine();
        System.out.print("warna : ");
        String warna = input.nextLine();
        SepatuController.Insert (merk, ukuran, warna);   
    }

    static void Read(){
        SepatuController.Display();
    }

    static void Update(){
        System.out.print(" Data sepatu yang akan diedit merk: ");
        String merk = input.nextLine();
        
        System.out.println("Ukuran = ");
        String ukuran = input.nextLine();
        System.out.print("warna: ");
        String warna = input.nextLine();
        SepatuController.Update(merk, ukuran, warna);
    }

    static void Delete(){
        System.out.print("merk yang mau dihapus: ");
        String merk = input.nextLine();
        SepatuController.Delete(merk);
    }
        
}
 

    


        
 

    
    /*
    static void showData(){
        for(SepatuEntity07320 sepatuEntities : sepatu.getdataSepatu()){
            System.out.println("--------------------------------------------------");
            System.out.println(" ID        = " + sepatuEntities.getId());
            System.out.println(" Merk      = " + sepatuEntities.getMerk());
            System.out.println(" Ukuran       = " + sepatuEntities.getUkuran());
            System.out.println(" Warna  = " + sepatuEntities.getWarna());
            //System.out.println(" STATUS    = ");
            //if(mahasiswaEntities.getStatus()==0){
               // System.out.println("Unverified");
          //  } else {
             //   System.out.println("Verified");
           // }
        }
        
    }
}
    */
    
    
    