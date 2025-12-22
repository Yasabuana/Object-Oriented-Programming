/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author yasaw
 */
public class Buku extends ItemKoleksi{
    private String penulis;

    public Buku(String judul, String idKoleksi, String penulis) {
        super(judul, idKoleksi);
        this.penulis = penulis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Buku: " + judul + " Penulis: " + penulis + " ID: " + idKoleksi);
    }
}
