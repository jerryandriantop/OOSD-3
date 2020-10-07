/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorinjava;

/**
 *
 * @author Jerry Pangaribuan
 */
public class OperatorInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Operator Assignment (Operator Penugasan)
        System.out.println("===============================");
        System.out.println("Operator Assignment (Penugasan)");
        System.out.println("===============================");
        int a = 10; // memasukkan nilai 10 kedalam variabel a
        System.out.println("Nilai a = " + a);
        
        // Assignment operator jumlah
        a += 2; // ini sama dengan a = 10 + 2 -> 12
        System.out.println("Nilai a menjadi " + a);
        
        // Assignment operator pengurangan
        a -= 3; // a = 12 - 3 -> 9
        System.out.println("Nilai a menjadi " + a);
        
        // Assignment operator perkalian
        a *= 2; // a = 9 * 2 -> 18
        System.out.println("Nilai a menjadi " + a);
        
        // Assignment operator pembagian
        a /= 2; // a = 18 / 2 -> 9
        System.out.println("Nilai a menjadi " + a);
        
        // Assignment Operator modulus
        a %= 2;  // menghitung sisa bagi dari 9 dibagi 2
        System.out.println("Nilai a menjadi " + a);
        
        System.out.println("\n===============================");
        System.out.println("Operator Arithmetic");
        System.out.println("===============================");
        
        int x, y, hasil;
        x = 26;
        y = 12;
        
        // Operasi Penjumlahan
        hasil = x + y;
        System.out.println(x + " + " + y + " = " + hasil);
        
        // Operasi Pengurangan
        hasil = x - y;
        System.out.printf("%d - %d = %d\n", x, y, hasil);
        
        // Operasi Perkalian
        hasil = x * y;
        System.out.printf("%d * %d = %d\n", x, y, hasil);
        
        // Operasi Pembagian
        hasil = x / y;
        System.out.printf("%d : %d = %d\n", x, y, hasil);
        
        // Operasi modulus (sisa bagi)
        hasil = x % y;
        System.out.println(x + " % " + y + " = " + hasil);
        
        
        // Comparison Operator (Operator Perbandingan)
        System.out.println("\n==================================");
        System.out.println("Operator Comparison (Perbandingan)");
        System.out.println("==================================");
        
        // Operator komparasi ini akan menghasilkan nilai dengan tipe data boolean
        int nilai1 = 12;
        int nilai2 = 13;
        boolean hasilKomparasi;
        
        // operator equal (Persamaan)
        hasilKomparasi = (nilai1 == nilai2);
        System.out.printf("%d == %d --> %s\n", nilai1, nilai2, hasilKomparasi);
        
        // operator not equal (Pertidaksamaan)
        hasilKomparasi = (nilai1 != nilai2);
        System.out.printf("%d != %d --> %s\n", nilai1, nilai2, hasilKomparasi);
        
        // operator kurang dari
        hasilKomparasi = (nilai1 < nilai2);
        System.out.printf("%d < %d --> %s\n", nilai1, nilai2, hasilKomparasi);
        
        // operator lebih dari
        hasilKomparasi = (nilai1 > nilai2);
        System.out.printf("%d > %d --> %s\n", nilai1, nilai2, hasilKomparasi);
        
        // operator kurang dari atau sama dengan
        hasilKomparasi = (nilai1 <= nilai2);
        System.out.printf("%d <= %d --> %s\n", nilai1, nilai2, hasilKomparasi);
        
        // operator lebih dari atau sama dengan
        hasilKomparasi = (nilai1 >= nilai2);
        System.out.printf("%d >= %d --> %s\n", nilai1, nilai2, hasilKomparasi);
        
        
        // Logical Operator (Operator Logika)
        System.out.println("\n==================================");
        System.out.println("Operator Logika");
        System.out.println("==================================");
        
        boolean bol1, bol2, hasilLogika;
        
        // logika AND
        System.out.println("AND");
        bol1 = true;
        bol2 = true;
        hasilLogika = (bol1 && bol2);
        System.out.println(bol1 + " && " + bol2 + " = " + hasilLogika);
        
        bol1 = true;
        bol2 = false;
        hasilLogika = (bol1 && bol2);
        System.out.println(bol1 + " && " + bol2 + " = " + hasilLogika);
        
        bol1 = false;
        bol2 = true;
        hasilLogika = (bol1 && bol2);
        System.out.println(bol1 + " && " + bol2 + " = " + hasilLogika);
        
        bol1 = false;
        bol2 = false;
        hasilLogika = (bol1 && bol2);
        System.out.println(bol1 + " && " + bol2 + " = " + hasilLogika);
        
        
        // logika OR
        System.out.println("\nOR");
        bol1 = true;
        bol2 = true;
        hasilLogika = (bol1 || bol2);
        System.out.println(bol1 + " || " + bol2 + " = " + hasilLogika);
        
        bol1 = true;
        bol2 = false;
        hasilLogika = (bol1 || bol2);
        System.out.println(bol1 + " || " + bol2 + " = " + hasilLogika);
        
        bol1 = false;
        bol2 = true;
        hasilLogika = (bol1 || bol2);
        System.out.println(bol1 + " || " + bol2 + " = " + hasilLogika);
        
        bol1 = false;
        bol2 = false;
        hasilLogika = (bol1 || bol2);
        System.out.println(bol1 + " || " + bol2 + " = " + hasilLogika);
        
        // logika XOR
        System.out.println("\nXOR");
        bol1 = true;
        bol2 = true;
        hasilLogika = (bol1 ^ bol2);
        System.out.println(bol1 + " ^ " + bol2 + " = " + hasilLogika);
        
        bol1 = true;
        bol2 = false;
        hasilLogika = (bol1 ^ bol2);
        System.out.println(bol1 + " ^ " + bol2 + " = " + hasilLogika);
        
        bol1 = false;
        bol2 = true;
        hasilLogika = (bol1 ^ bol2);
        System.out.println(bol1 + " ^ " + bol2 + " = " + hasilLogika);
        
        bol1 = false;
        bol2 = false;
        hasilLogika = (bol1 ^ bol2);
        System.out.println(bol1 + " ^ " + bol2 + " = " + hasilLogika);
        
        System.out.println("\nNEGASI");
        hasilLogika = !bol1;
        System.out.println("(!)"+ bol1 + " --> " + hasilLogika);
        
        bol1 = true;
        hasilLogika = !bol1;
        System.out.println("(!)"+ bol1 + " --> " + hasilLogika);
        
        // Logical Operator (Operator Logika)
        System.out.println("\n==================================");
        System.out.println("Operator String");
        System.out.println("==================================");
        
        String nama, umur, NIM, data;
        nama = "Jerry Andrianto Pangaribuan";
        umur = "20";
        
        System.out.println("");
        
    }
    
}
