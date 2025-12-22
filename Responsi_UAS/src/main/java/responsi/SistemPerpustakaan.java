/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author yasaw
 */
public class SistemPerpustakaan {
    private List<Anggota> daftarAnggota = new ArrayList<>();
    private List<ItemKoleksi> daftarKoleksi = new ArrayList<>();
    private List<Peminjaman> riwayatPeminjaman = new ArrayList<>();
    
    private final String FILE_NAME = "Data_Perpustakaan.ser";
    
    public void registrasiAnggota(Anggota a) {
        daftarAnggota.add(a);
    }

    public void tambahKoleksi(ItemKoleksi k) {
        daftarKoleksi.add(k);
    }

    public void prosesPeminjaman(Peminjaman p) {
        riwayatPeminjaman.add(p);
        p.pinjam();
    }
    
    public void simpanData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(daftarAnggota);
            oos.writeObject(daftarKoleksi);
            oos.writeObject(riwayatPeminjaman);
            System.out.println("Data berhasil disimpan ke " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Gagal menyimpan data: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public void muatData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            daftarAnggota = (List<Anggota>) ois.readObject();
            daftarKoleksi = (List<ItemKoleksi>) ois.readObject();
            riwayatPeminjaman = (List<Peminjaman>) ois.readObject();
            System.out.println("Data berhasil dimuat");
        } catch (FileNotFoundException e) {
            System.out.println("File data belum ada, membuat baru...");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Gagal memuat data: " + e.getMessage());
        }
    }
    
    public void tampilkanSemuaPeminjaman() {
        if(riwayatPeminjaman.isEmpty()){
            System.out.println("Belum ada riwayat peminjaman.");
        } else {
            for (Peminjaman p : riwayatPeminjaman) {
                p.cetakStruk();
            }
        }
    }
    
}
