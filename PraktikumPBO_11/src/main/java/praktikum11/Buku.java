/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author yasaw
 */
public class Buku {
    private String judul;
    private String pengarang;
    
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    public void infoBuku(){
        System.out.println("Judul buku : " + judul);
        System.out.println("Nama Pengarang : " + pengarang);
    }
}
