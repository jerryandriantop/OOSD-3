/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;
import java.util.Scanner;

/**
 *
 * @author Jerry Pangaribuan
 */
public class Pasien {
    
    /**
     * @param args the command line arguments
     */
    /* MENDEFINISIKAN VARIABEL */
    public static String nama;
    public static int tahunLahir;
    private static int tahunSekarang = 2020;
    public static int usia;
    public static double biaya;
    public static boolean status = true;
    public static double uangPasien;
    private double kembalian;

    public Pasien() {
    }

    public Pasien(String name, int tahunLahir, double fee, double money) {
        /* OPERATOR ASSIGNMENT */
        nama = name;
        usia = tahunSekarang - tahunLahir;
        biaya = fee;
        uangPasien = money;
    }
    
    public void setNama(String name){
        nama = name;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setTahunLahir(int value){
        tahunLahir = value;
    }
    
    public int getTahunLahir(){
        return tahunLahir;
    }
    
    public void setBiaya(double fee){
        biaya = fee;
    }
    
    public double getBiaya(){
        return biaya;
    }
    
    public void setMoney(double money){
        uangPasien = money;
    }
    
    public double getMoney(){
        return uangPasien;
    }
    
    public void cekUmurPasien(){
        int umur = tahunSekarang - tahunLahir;
        
        /* OPERATOR LOGIKA DAN PERBANDINGAN */
        if(umur < 12 && umur >= 0){
            System.out.println("Ini adalah Pasien Anak-anak");
        }else if(umur >= 12 && umur <= 25){
            System.out.println("Ini adalah Pasien Remaja");
        }else if(umur > 25 && umur <= 50){
            System.out.println("Ini adalah Pasien Dewasa");
        }else if(umur > 50){
            System.out.println("Ini adalah Pasien Lansia");
        }else{
            System.out.println("Umur tidak boleh negatif");
        }
    }
    
    public void transaksi(){
        double hasil;
        
        /* OPERATOR ARITMATIKA */
        hasil = uangPasien - biaya;
        
        if(hasil >= 0){
            System.out.println("Transaksi berhasil!");
            System.out.println("Kembalian = " + hasil);
        }else{
            System.out.println("Uang Pasien kurang!");
        }
    }
    
    public void cekStatusPasien(){
        
        /* Operator Komparasi (Perbandingan) */
        if(status == true){
            System.out.println("Pasien masih harus melakukan perawatan");
        }else{
            System.out.println("Pasien sudah sembuh");
        }
    }
    
    public static void printNamaPasien(){
        
        /* OPERATOR STRING */
        System.out.println("Nama Pasien = " + nama);
    }
    
    public int ambilUmur(int umur){
        return umur;
    }
    
    public void printData(){
        
        /* OPERATOR STRING */
        System.out.println("\tData Pasien");
        System.out.println("================================");
        System.out.println("Nama Pasien       = " + nama);
        System.out.println("Umur pasien       = " + usia);
        System.out.println("Biaya Pasien      = " + biaya);
        System.out.println("Uang Pasien      = " + uangPasien);
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        // Pengaksesan property static dan method static
        nama = "Poltak Simanjuntak";
        
        String _nama;
        int _tahunLahir;
        double fee, money;
        
        // instansiasi objek 1
        System.out.print("Masukkan Nama Pasien: ");
        _nama = userInput.nextLine();
        System.out.print("Masukkan Tahun Lahir Pasien: ");
        _tahunLahir = userInput.nextInt();
        System.out.print("Masukkan Biaya yang harus dibayar Pasien: ");
        fee = userInput.nextDouble();
        System.out.print("Masukkan Jumlah Uang Pasien: ");
        money = userInput.nextDouble();
        
        Pasien objPasien = new Pasien(_nama, _tahunLahir, fee, money);
        objPasien.printData();
        objPasien.transaksi();
        
        
        /* OPERATOR ASSIGNMENT */
        
        // instansiasi objek 2
        
   
    }
}
