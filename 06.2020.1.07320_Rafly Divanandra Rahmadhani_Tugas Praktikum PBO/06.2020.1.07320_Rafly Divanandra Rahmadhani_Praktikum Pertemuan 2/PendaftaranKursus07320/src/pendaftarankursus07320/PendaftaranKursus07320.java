/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftarankursus07320;
import java.util.Scanner;

public class PendaftaranKursus07320 {
private static Scanner input = new Scanner(System.in);
private static PesertaKursus07320[] peserta07320 = new PesertaKursus07320[20];
private static PanitiaKursus07320[] panitia07320 = new PanitiaKursus07320[20];
private static PesertaTerdaftarKursus07320[] terdaftar07320 = new PesertaTerdaftarKursus07320[20];
private static int pilLomba;
private static int jumPeserta = 0;
private static int cekPanitia;
    
    public static void main(String[] args) {
        dataPanitia();
       int pil;
        
        do{
            System.out.println("Jumlah Peserta : " +jumPeserta);
            System.out.println("1. Login Panitia Kursus");
            System.out.println("2. Lihat Peserta Terdaftar Kursus");
            System.out.println("3. Biodata Panitia Kursus");
            
            System.out.print("Pilih : ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    loginPanitia();
                    break;
                    
                case 2:
                    viewPeserta();
                    break;
                   
                case 3:
                    viewPanitia();
                    break;
                default:
                    System.out.println("Exit");
            }
        }while(pil < 4 && pil != 4);
    }
    static int dataPanitia(){
        String namaPanitia[] = {"Rafly", "Rahmad"};
        String passPanitia[] = {"01", "02"};
        String noTelpPanitia[] = {"083", "085"};
        String alamatPanitia[] = {"Jl. Merpati", "Jl. Mawar"};
        
        for (int i=0; i < namaPanitia.length; i++){
            panitia07320[i] = new PanitiaKursus07320(passPanitia[i], namaPanitia[i], noTelpPanitia[i], alamatPanitia[i]);
        }
        return namaPanitia.length;
    }
    static void loginPanitia(){
        System.out.println("Nama : ");
        String nama = input.next();
        System.out.println("Password : ");
        String password = input.next();
        cekPanitia = login(nama, password);
        System.out.println("Selamat Datang " +panitia07320[cekPanitia].getNama());
        int pil;
        
        do{
            System.out.println("Jumlah Peserta : " +jumPeserta);
            System.out.println("1. Daftarkan Peserta");
            System.out.println("2. Ubah Data Peserta");
            System.out.println("3. Lihat Peserta Terdaftar");
            System.out.println("4. Hapus Peserta");
            System.out.println("0. Log out");
            
            System.out.print("Pilih : ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    insertPeserta();
                    break;
                case 2:
                    updatePeserta();
                    break;
                case 3:
                    viewPeserta();
                    break;
                case 4:
                    deletePeserta();
                    break;
            }
        }while (pil !=0);
        
    }
    static int login (String nama, String password){
        int loop = 0;
        for(int i=0; i <= dataPanitia(); i++){
            if(panitia07320[i].getNama().equals(nama) && panitia07320[i].getPassword().equals(password)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
    
    static void insertPeserta(){
        System.out.println("Input Nama : ");
        String nama = input.nextLine();
        System.out.println("Input Umur : ");
        String umur = input.nextLine();
        System.out.println("Input Alamat : ");
        String alamat = input.nextLine();
        System.out.println("Input No. Telp : ");
        String noTelp = input.nextLine();
        
        peserta07320[jumPeserta] = new PesertaKursus07320(umur, nama, noTelp, alamat);
        insertLomba();
    }
    static void insertLomba(){
        System.out.println("Lomba : ");
        for(int i=0; i < KursusDance07320.dance.length; i++){
            System.out.println(i + ". " + KursusDance07320.dance[i]);
        }
        System.out.println("Pilih lomba : ");
        pilLomba = input.nextInt();
        System.out.println("Input Kode Peserta : ");
        String kodePeserta = input.next();
        terdaftar07320[jumPeserta] = new PesertaTerdaftarKursus07320(peserta07320[jumPeserta],pilLomba, kodePeserta);
        jumPeserta = jumPeserta + 1;
    }
    static void updatePeserta(){
        System.out.print("Masukan kode peserta yang mau di EDIT : ");
        String search = input.next();
        int cari = 0;
        do{
            if(cari == jumPeserta){
                System.err.println("Tidak ada data");
                break;
            }else if(terdaftar07320[cari].getkodePeserta().equals(search)){
                int pilEdit;
                do{
                    System.out.println("Pilih data yang ingin diubah : ");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Nama");
                    System.out.println("3. Alamat");
                    System.out.println("4. No Telp");
                    System.out.println("5. Umur");
                    System.out.println("6. Lomba");
                    System.out.println("0. Exit");
                    pilEdit = input.nextInt();
                    input.nextLine();
                    if (pilEdit == 1){
                        System.out.println("======================================================");
                        System.out.println("Kode Peserta : " +terdaftar07320[cari].getkodePeserta());
                        System.out.println("======================================================");
                        System.out.println("Nama : " +peserta07320[cari].getNama()
                                + "\n Umur : " +peserta07320[cari].getUmur()
                                + "\n Alamat : " +peserta07320[cari].getAlamat()
                                + "\n No Telp : " +peserta07320[cari].getNoTelp()
                                + "\n Lomba : " +KursusDance07320.dance[terdaftar07320[cari].getIndexLomba()]);
                        System.out.println("======================================================");
                        
                    }else if (pilEdit == 2){
                        System.out.print("Ubah Nama : ");
                        String editNama = input.nextLine();
                        peserta07320 [cari].setNama(editNama);
                    }else if(pilEdit == 3){
                        System.out.print("Ubah Alamat : ");
                        String editAlamat = input.nextLine();
                        peserta07320 [cari].setAlamat(editAlamat);
                    }else if(pilEdit == 4){
                        System.out.print("Ubah No Telp : ");
                        String editNoTelp = input.nextLine();
                        peserta07320 [cari].setNoTelp(editNoTelp);
                    }else if (pilEdit == 5){
                        System.out.print("Ubah Umur : ");
                        String editUmur = input.nextLine();
                        peserta07320 [cari].setUmur(editUmur);
                    }else if (pilEdit == 6){
                        System.out.println("Pilih Lomba : ");
                        for (int i=0; i < KursusDance07320.dance.length; i++){
                            System.out.println(i + ". " + KursusDance07320.dance[i]);
                        }System.out.println("Pilih Lomba : ");
                        int editLomba = input.nextInt();
                        terdaftar07320[cari].setIndexLomba(editLomba);
                    }
                    
                }while(pilEdit != 0);
                break;
            }else{
                cari = cari + 1;
            }
        }while(true);
    }
    static void viewPeserta(){
        if(jumPeserta == 0){
            System.out.println("Belum ada peserta terdaftar");
        }else{
            for(int i=0; i < jumPeserta; i++){
                System.out.println("======================================================");
                System.out.println("Kode Peserta : " + terdaftar07320[i].getkodePeserta());
                System.out.println("======================================================");
                System.out.println("Nama : " +peserta07320[i].getNama()
                                + "\n Umur : " +peserta07320[i].getUmur()
                                + "\n Alamat : " +peserta07320[i].getAlamat()
                                + "\n No Telp : " +peserta07320[i].getNoTelp()
                                + "\n Lomba : " +KursusDance07320.dance[terdaftar07320[i].getIndexLomba()]);
                        System.out.println("======================================================");
            }
        }
    }
    static void viewPanitia(){
        for (int i=0; i < dataPanitia(); i++){
            System.out.println("======================================================");
            System.out.println("Nama : " +panitia07320[i].getNama()
                                + "\n No Telp : " +panitia07320[i].getNoTelp()
                                + "\n Alamat : " +panitia07320[i].getAlamat());
            System.out.println("======================================================");
        }
    }
    static void deletePeserta(){
        System.out.print("Masukan kode peserta yang akan di HAPUS : ");
        String search = input.next();
        input.nextLine();
        int cari = 0;
        do{
            if(cari == jumPeserta){
                System.err.println("Tidak Ada Data!");
                break;
            }else if(terdaftar07320[cari].getkodePeserta().equals(search)){
                if(cari == jumPeserta - 1){
                    jumPeserta = jumPeserta - 1;
                }else{
                    for(int i=cari; i < jumPeserta; i++){
                        terdaftar07320[i] = terdaftar07320[i + 1];
                        peserta07320[i] = peserta07320[i + 1];
                    }jumPeserta = jumPeserta - 1;
                }break;
            }else{
                cari = cari + 1;
            }
        }while (true);
    }
}


