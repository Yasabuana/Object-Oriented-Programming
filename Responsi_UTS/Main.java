/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author yasaw
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("HP", 9000000, 1);
        Produk produk2 = new Makanan("Pizza", 75000, "2025-10-02");
   
        Pegawai pegawai1 = new PegawaiTetap("Abdi", 2500000, 350000);
        Pegawai pegawai2 = new PegawaiKontrak("Rayfal", 1500000, 10);
    
        System.out.println("+----------------------------------+");
        System.out.println("Informasi terkait produk");
        System.out.println("Produk pertama");
        produk1.tampilkanInfo();
        System.out.println();
        System.out.println("Produk kedua");
        produk2.tampilkanInfo();
        System.out.println();
        System.out.println();
        System.out.println("Informasi terkait pegawai");
        System.out.println("Pegawai pertama");
        pegawai1.tampilkanInfo();
        System.out.println();
        System.out.println("Pegawai kedua");
        pegawai2.tampilkanInfo();   
        System.out.println("+----------------------------------+");
    }
}
