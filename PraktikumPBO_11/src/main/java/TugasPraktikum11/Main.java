/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum11;

/**
 *
 * @author yasaw
 */
public class Main {
    public static void main(String[] args) {
        Pengarang p1 = new Pengarang("James Clear");
        Pengarang p2 = new Pengarang("Morgan Housel");

        Perpustakaan perpus = new Perpustakaan();

        
        perpus.tambahBuku("Atomic Habits", p1);
        perpus.tambahBuku("The Psychology of Money", p2);
        perpus.tambahBuku("Good Habits", p1);

        perpus.infoPerpustakaan();
    }
}
