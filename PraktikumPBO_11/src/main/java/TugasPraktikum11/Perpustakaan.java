/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasaw
 */
public class Perpustakaan {
    private List<Buku> daftarBuku;

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(String judul, Pengarang pengarang) {
        Buku bukuBaru = new Buku(judul, pengarang);
        daftarBuku.add(bukuBaru);
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku Perpustakaan");
        
    for (int i = 0; i < daftarBuku.size(); i++) {
        System.out.print((i + 1) + ". "); 
        daftarBuku.get(i).infoBuku();
        }
    }
}
