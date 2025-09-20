/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Modul_PrakPBO5;

/**
 *
 * @author yasaw
 */
public class Main_hewan {
    public static void main(String[] args) {
        Anjing anj = new Anjing();
        System.out.println("Informasi terkait Anjing");
        anj.nama = "Bobby";
        anj.jenis = "Chihuahua";
        anj.jenisBulu = "Lebat";
        anj.suaraAnjing = "Wok-wok";
        anj.info();
        
        System.out.println("\nInformasi terkait Kucing");
        Kucing kcg = new Kucing();
        kcg.nama = "Gatot";
        kcg.jenis = "Kampung";
        kcg.warna = "Oren dan Putih";
        kcg.suaraKucing = "Miauu";
        kcg.info();
    }
}
