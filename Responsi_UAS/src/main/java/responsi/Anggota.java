/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;
import java.io.Serializable;
/**
 *
 * @author yasaw
 */
class Anggota implements Serializable {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public String getNama() { return nama; }
    
    @Override
    public String toString() {
        return "Anggota: " + nama + " (" + idAnggota + ")";
    }
}
