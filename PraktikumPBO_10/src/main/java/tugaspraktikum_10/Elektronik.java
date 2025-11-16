/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum_10;

/**
 *
 * @author yasaw
 */
public class Elektronik implements Pembayaran{
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.1;
    }
}
