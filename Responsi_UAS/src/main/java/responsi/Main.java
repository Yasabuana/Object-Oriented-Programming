/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author yasaw
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static SistemPerpustakaan perpus = new SistemPerpustakaan();

    public static void main(String[] args) {
        perpus.muatData();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nSISTEM PERPUSTAKAAN DIGITAL");
            System.out.println("1. Tambah Anggota Baru");
            System.out.println("2. Tambah Koleksi Buku");
            System.out.println("3. Transaksi Peminjaman");
            System.out.println("4. Lihat Riwayat & Simpan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = 0;
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus angka");
                continue;
            }

            switch (pilihan) {
                case 1:
                    menuTambahAnggota();
                    break;
                case 2:
                    menuTambahBuku();
                    break;
                case 3:
                    menuPeminjaman();
                    break;
                case 4:
                    perpus.tampilkanSemuaPeminjaman();
                    perpus.simpanData();
                    break;
                case 5:
                    System.out.println("Menyimpan data");
                    perpus.simpanData();
                    isRunning = false;
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void menuTambahAnggota() {
        System.out.println("\nRegistrasi Anggota");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan ID Anggota: ");
        String id = scanner.nextLine();

        Anggota anggotaBaru = new Anggota(nama, id);
        perpus.registrasiAnggota(anggotaBaru);
        System.out.println("Anggota berhasil didaftarkan");
    }

    private static void menuTambahBuku() {
        System.out.println("\nTambah Buku Baru");
        System.out.print("Judul Buku: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("ID Buku: ");
        String id = scanner.nextLine();

        Buku bukuBaru = new Buku(judul, id, penulis);
        perpus.tambahKoleksi(bukuBaru);
        System.out.println("Buku berhasil ditambahkan ke koleksi");
    }

    private static void menuPeminjaman() {
        System.out.println("\nTransaksi Peminjaman");
        
        System.out.print("Masukkan ID Transaksi: ");
        String idTrans = scanner.nextLine();
        
        System.out.print("Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("ID Peminjam: ");
        String idPeminjam = scanner.nextLine();
        
        Anggota peminjam = new Anggota(namaPeminjam, idPeminjam);
        Peminjaman transaksi = new Peminjaman(idTrans, peminjam);

        boolean tambahBukuLagi = true;
        while (tambahBukuLagi) {
            System.out.print("Masukkan Judul Buku yang dipinjam: ");
            String judulBuku = scanner.nextLine();
            System.out.print("ID Buku: ");
            String idBuku = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();

            transaksi.tambahBuku(new Buku(judulBuku, idBuku, penulis));

            System.out.print("Tambah buku lain? (y/n): ");
            String jawab = scanner.nextLine();
            if (!jawab.equalsIgnoreCase("y")) {
                tambahBukuLagi = false;
            }
        }

        perpus.prosesPeminjaman(transaksi);
        System.out.println("Transaksi berhasil dicatat");
    }
}
