/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author yasaw
 */
class Peminjaman implements OperasiPeminjaman, Serializable {
    private String idPeminjaman;
    private Anggota peminjam;
    
    private List<ItemKoleksi> daftarBukuDipinjam; 

    public Peminjaman(String idPeminjaman, Anggota peminjam) {
        this.idPeminjaman = idPeminjaman;
        this.peminjam = peminjam;
        this.daftarBukuDipinjam = new ArrayList<>();
    }

    public void tambahBuku(ItemKoleksi buku) {
        daftarBukuDipinjam.add(buku);
    }

    @Override
    public void pinjam() {
        System.out.println("Transaksi Peminjaman " + idPeminjaman + " berhasil diproses untuk " + peminjam.getNama());
    }

    @Override
    public void kembalikan() {
        System.out.println("Buku-buku pada transaksi " + idPeminjaman + " telah dikembalikan.");
    }
    
    public void cetakStruk() {
        System.out.println("\nStruk Peminjaman");
        System.out.println("ID: " + idPeminjaman);
        System.out.println(peminjam);
        System.out.println("Daftar Buku:");
        for (ItemKoleksi item : daftarBukuDipinjam) {
            System.out.print("- ");
            item.tampilkanInfo();
        }
    }
}

