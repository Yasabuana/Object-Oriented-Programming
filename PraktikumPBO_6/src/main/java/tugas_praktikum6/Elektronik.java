/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum6;

/**
 *
 * @author yasaw
 */
class Elektronik extends Produk{
    public Elektronik(String nama, double harga){
        super(nama, harga);
    }
    @Override
    public double hitungDiskon(){
        return harga * 0.95;
    }
}
