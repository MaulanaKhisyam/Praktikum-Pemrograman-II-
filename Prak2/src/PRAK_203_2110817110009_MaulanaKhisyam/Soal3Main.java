/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK_203_2110817110009_MaulanaKhisyam;


public class Soal3Main {
    public static void main(String[] args) {
    Pegawai p1 = new Pegawai();
    // Pada baris ini terjadi error karena kurangya titik koma
    //p1.nama = "Roi"
    p1.nama = "Roi";
    //Pada baris ini terjadi error karena pada file Pegawai.java variabel asal di deklarasikan sebagai tipe data char
    p1.asal = "Kingdom of Orvel";
    p1.setJabatan("Assasin");
    
    //Instasiasi variabel umur pada file main
    p1.umur = 17;
    
    System.out.println("Nama Pegawai: " + p1.getNama());
    System.out.println("Asal: " + p1.getAsal());
    System.out.println("Jabatan: " + p1.jabatan);
    //Pada baris ini diperlukan "tahun" dibelakang angka 17, kita dapat melakukan penambahan dibelakang p1.umur
//System.out.println("Umur: " + p1.umur);
    System.out.println("Umur: " + p1.umur);
    }
}
