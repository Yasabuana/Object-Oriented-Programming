/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author yasaw
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan ("Mimi", 3);
        kucing.suara();
        kucing.info(); 
       
        Hewan anjing = new Hewan ("Forfo", 7);
        anjing.info();
        anjing.berlari();
    
        Mobil mobil1 = new Mobil("Mercedes-Benz", "S-Class", 2020, "Hitam");
        mobil1.displayInfo();
        mobil1.startEngine();
        Mobil mobil2 = new Mobil("BYD", "Seaelion 7 Performance", 2025, "Kuning");
        mobil2.displayInfo();
        mobil2.startEngine();
        
        mobil1.setinputWarna("Merah");
        System.out.println("Mobil anda telah di cat ulang");
        mobil1.displayInfo();
    }
}


