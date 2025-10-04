/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author yasaw
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    public String getnamaPegawai() {
        return namaPegawai;
    }
    public double getGaji() {
        return gaji;
    }
    public void setnamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void tampilkanInfo() {
        System.out.println("nama pegawai : " + namaPegawai);
        System.out.println("gaji : " + gaji);
    }
}
