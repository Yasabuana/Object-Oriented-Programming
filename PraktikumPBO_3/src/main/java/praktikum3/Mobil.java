/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author yasaw
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    Mobil(String inputMerk, String inputModel, int inputTahun, String inputWarna) {
        merk = inputMerk;
        model = inputModel;
        tahun = inputTahun;
        warna = inputWarna;
    }
    public String getmerk() {
        return merk;
    }
    public void setmerk(String inputMerk) {
        merk = inputMerk;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel(String inputModel) {
        model = inputModel;
    }
    public int gettahun() {
        return tahun;
    }
    public void setinputTahun(int inputTahun) {
        tahun = inputTahun;
    }
    public String getwarna(){
        return warna;
    }
    public void setinputWarna(String inputWarna){
        warna = inputWarna;
    }
    public void displayInfo() {
        System.out.println("Merk : " + merk + " Model : " + model + " Tahun : " + tahun + " Warna : " + warna);
    }
    void startEngine() {
        System.out.println("Mesin mobil " + merk + "  menyala");
    }
}


