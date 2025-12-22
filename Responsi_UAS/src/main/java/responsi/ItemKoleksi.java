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
abstract class ItemKoleksi implements Serializable {
    protected String judul;
    protected String idKoleksi;
    
public ItemKoleksi(String judul, String idKoleksi) {
        this.judul = judul;
        this.idKoleksi = idKoleksi;
    }

public abstract void tampilkanInfo();

public String getJudul(){
    return judul;
    }
}
