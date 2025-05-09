/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan701;

/**
 *
 * @author PC-A-30
 */
public class Pertemuan701 {
    
    public static void main(String[] args) {
        Salam psn = new Salam ();
        psn.tulispesan();
        psn.tulispesan("Belajar oop Overloading");
    }
    
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        mahasiswa mhs = new mahasiswa("Budi", 20, "Teknik Informatika", "Jl. Merdeka No. 25, Jakarta");

        // Menggunakan method yang overload
        System.out.println("Tampilkan semua informasi:");
        mhs.tampilkanInfo();  // Menampilkan semua informasi

        System.out.println("\nTampilkan berdasarkan nama:");
        mhs.tampilkanInfo("Budi");  // Menampilkan berdasarkan nama

        System.out.println("\nTampilkan berdasarkan usia:");
        mhs.tampilkanInfo(20);  // Menampilkan berdasarkan usia

        System.out.println("\nTampilkan berdasarkan jurusan:");
        mhs.tampilkanInfo("Teknik Informatika", true);  // Menampilkan berdasarkan jurusan

        System.out.println("\nTampilkan berdasarkan alamat (dengan limit karakter):");
        mhs.tampilkanInfo("Jl. Merdeka No. 25, Jakarta", 15);  // Menampilkan alamat dengan limit karakter
    }
}
    


