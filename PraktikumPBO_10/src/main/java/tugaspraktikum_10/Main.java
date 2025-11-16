/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum_10;

/**
 *
 * @author yasaw
 */
public class Main {
    public static void main(String[] args) {
        Pembayaran hp = new Elektronik();
        double hargaHp = 2000000;
        double pajakHp = hp.hitungPajak(hargaHp);
        double hargaTotal = hargaHp + pajakHp;
        
        System.out.println("Harga HP :" + hargaHp);
        System.out.println("Pajak Elektronik (10%) : " + pajakHp);
        System.out.println("Total Harga : " + hargaTotal);
        System.out.println("---------------------------------------");
        Pembayaran burger = new Makanan();
        double hargaBurger = 25000;
        double pajakBurger = burger.hitungPajak(hargaBurger);
        double total = hargaBurger + pajakBurger;
        
        System.out.println("Harga Burger :" + hargaBurger);
        System.out.println("Pajak Makanan (5%) : " + pajakBurger);
        System.out.println("Total Harga : " + total);
    }
}
