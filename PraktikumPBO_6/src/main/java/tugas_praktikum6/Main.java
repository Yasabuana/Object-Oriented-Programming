/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum6;

/**
 *
 * @author yasaw
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja kb = new KeranjangBelanja();
        
        kb.tambahProduk(new Buku ("Buku Sejarah OOP", 125000));
        kb.tambahProduk(new Elektronik("Headset Gaming", 350000));
        kb.tambahProduk(new Pakaian("Kemeja Hawaii", 250000));
        
        System.out.println("Total belanja anda Rp " + kb.hitungTotal());
        System.out.println("Total belanja anda setelah diskon Rp " +kb.hitungTotalDiskon());
    }
}
