/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum6;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author yasaw
 */
class KeranjangBelanja {
    private final List<Produk> produkList;
    
    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }
    public void tambahProduk(Produk P) {
        produkList.add(P);
    }
    public double hitungTotal(){
        double total = 0;
        for (Produk P : produkList) {
            total += P.getHarga();
        }
        return total;
    }
    public double hitungTotalDiskon() {
        double total = 0;
        for (Produk P : produkList) {
            total += P.hitungDiskon();
        }
        return total;
    }
}
