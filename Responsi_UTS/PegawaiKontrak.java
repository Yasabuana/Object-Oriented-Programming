/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author yasaw
 */
class PegawaiKontrak extends Pegawai{
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    public int getlamaKontrak() {
        return lamaKontrak;
    }
    public void setlamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("lama kontrak : " + lamaKontrak + " bulan");
    }
    
}
