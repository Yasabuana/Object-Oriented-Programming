/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author yasaw
 */
public class kendaraan {
    private String merk;
    private String model;
    private int tahun;
    //Construktor
    public kendaraan(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    //Getter Setter
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    } 
    public int getTahun(){
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}