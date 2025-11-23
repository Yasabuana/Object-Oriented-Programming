/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studiKasus_agregasi;

/**
 *
 * @author yasaw
 */

public class Main {
    public static void main(String[] args) {

        Anggota a1 = new Anggota("Repuy");
        Anggota a2 = new Anggota("Widodo");

        Klub klubBola = new Klub("Badutlona FC");

        klubBola.tambahAnggota(a1);
        klubBola.tambahAnggota(a2);

        System.out.println("Informasi Klub");
        klubBola.infoKlub();
    }
}