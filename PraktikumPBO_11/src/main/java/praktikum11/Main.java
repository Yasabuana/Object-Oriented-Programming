/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author yasaw
 */
public class Main {
    public static void main(String[] args) {
        Buku b1 = new Buku("Psychology of Money", "Morgan Housel");
        Buku b2 = new Buku("Atomic Habits", "James Clear");
        
        Perpustakaan perpus = new Perpustakaan();
        
        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        
        perpus.infoPerpustakaan();
        
    }
}
