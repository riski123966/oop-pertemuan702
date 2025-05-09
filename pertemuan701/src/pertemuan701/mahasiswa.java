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
public class mahasiswa {
    private String nama;
    private int usia;
    private String jurusan;
    private String alamat;

    // Constructor
    public void mahasiswa(String nama, int usia, String jurusan, String alamat) {
        
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Method untuk menampilkan informasi lengkap mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }

    // Method Overloading: Menampilkan informasi berdasarkan nama
    public void tampilkanInfo(String nama) {
        System.out.println("Nama: " + nama);
    }

    // Method Overloading: Menampilkan informasi berdasarkan usia
    public void tampilkanInfo(int usia) {
        System.out.println("Usia: " + usia);
    }

    // Method Overloading: Menampilkan informasi berdasarkan jurusan
    public void tampilkanInfo(String jurusan, boolean showJurusan) {
        if (showJurusan) {
            System.out.println("Jurusan: " + jurusan);
        }
    }

    // Method Overloading: Menampilkan informasi berdasarkan alamat
    public void tampilkanInfo(String alamat, int limit) {
        if (limit > 0) {
            System.out.println("Alamat: " + alamat.substring(0, Math.min(limit, alamat.length())));
        } else {
            System.out.println("Alamat: " + alamat);
        }
    }
}
    
