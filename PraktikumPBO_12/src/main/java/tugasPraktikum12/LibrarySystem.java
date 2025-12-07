/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPraktikum12;

/**
 *
 * @author yasaw
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    
    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSISTEM PERPUSTAKAAN");
            System.out.println("1. Tambah Buku Baru & Simpan ke Teks");
            System.out.println("2. Simpan Objek ke File Serial (buku.ser)");
            System.out.println("3. Tampilkan Daftar Buku (dari kedua file)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileSerial();
                case 3 -> tampilkanDariFile();
                case 4 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan Tahun Terbit: ");
        int tahun = scanner.nextInt();

        Buku bukuBaru = new Buku(judul, pengarang, tahun);
        
        bukuList.add(bukuBaru);

        try (FileWriter writer = new FileWriter(TEXT_FILE, true)) {
            writer.write(bukuBaru.toString() + "\n");
            System.out.println("Sukses: Buku ditambahkan ke RAM dan " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Error saat menulis ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList); 
            System.out.println("Sukses: Semua objek buku di RAM disimpan ke " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("Error saat serialisasi.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFile() {
        System.out.println("\nISI FILE TEKS (buku.txt)");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";"); 
                if(data.length == 3) {
                     System.out.println("Judul: " + data[0] + " | Pengarang: " + data[1] + " | Tahun: " + data[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File teks belum ada.");
        } catch (IOException e) {
            System.out.println("Error membaca file teks.");
        }

        System.out.println("\nISI FILE SERIAL (buku.ser)");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> listDariFile = (List<Buku>) ois.readObject();
            
            for (Buku b : listDariFile) {
                b.tampilkanInfo();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File serial belum ada (Lakukan opsi 2 dulu).");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error membaca file serial.");
        }
    }
}