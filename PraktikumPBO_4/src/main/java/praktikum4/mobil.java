/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author yasaw
 */
public class mobil extends Kendaraan_1{
    private int jumlahPintu;

    public mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu){
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    public void tampilkaninfoMobil() {
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + "km/h");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

