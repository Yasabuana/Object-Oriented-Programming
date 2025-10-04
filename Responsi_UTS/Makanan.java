/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author yasaw
 */
class Makanan extends Produk{
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    public String gettanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void settanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    @Override 
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("tanggal kadaluarsa : " + tanggalKadaluarsa);
    }
}
