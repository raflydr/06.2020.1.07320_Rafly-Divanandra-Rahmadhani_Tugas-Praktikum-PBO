/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikalkulator07320;
import java.util.Scanner;

public class UjiKalkulator07320 {
    private static Scanner input_07320 = new Scanner(System.in);
    public static float nilai1;
    public static float nilai2;
    public static float hasil;
    public static Proses proses = new Proses (nilai1, nilai2);

    public static void main(String[] args) {
        
        int pilih_07320;
        Scanner input_07320 = new Scanner(System.in);
       
        do{
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Exit");
        
            System.out.print("Pilih = ");
            pilih_07320 = input_07320.nextInt();
            
            
            switch (pilih_07320){
                
            case 1 :
                System.out.print("NIlai 1 = ");
                nilai1 = input_07320.nextFloat();
                System.out.print("Nilai 2 = ");
                nilai2 = input_07320.nextFloat();
                hasil = proses.penjumlahan(nilai1, nilai2);
                System.out.println("hasil = " + hasil);
                break;
                
            case 2 :
                System.out.print("NIlai 1 = ");
                nilai1 = input_07320.nextFloat();
                System.out.print("Nilai 2 = ");
                nilai2 = input_07320.nextFloat();
                hasil = proses.pengurangan(nilai1, nilai2);
                System.out.println("hasil = " + hasil);
                break;
                
            case 3 :
                System.out.print("NIlai 1 = ");
                nilai1 = input_07320.nextFloat();
                System.out.print("Nilai 2 = ");
                nilai2 = input_07320.nextFloat();
                hasil = proses.perkalian(nilai1, nilai2);
                System.out.println("hasil = " + hasil);
                break;
                
            case 4 :
                System.out.print("NIlai 1 = ");
                nilai1 = input_07320.nextFloat();
                System.out.print("Nilai 2 = ");
                nilai2 = input_07320.nextFloat();
                hasil = proses.pembagian(nilai1, nilai2);
                System.out.println("hasil = " + hasil);
                break;
 
            case 5:
                System.out.println("Exit");
                break;
            
 
                default:
                System.out.println("tidak di temukan");
                break;
        }
    }while(pilih_07320 < 5 && pilih_07320 != 5);
      
    }
    }
    
        

        
 
        
 
        
    
    

