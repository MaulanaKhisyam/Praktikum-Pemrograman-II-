/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRAK_201_2110817110009_MaulanaKhisyam;

/**
 *
 * @author Lenovo
 */

public class buah {
    String nama, warna, tekstur, rasa;
    double berat;
    int harga, jumlahbeli; 
    
    /**
     * @param args the command line arguments
     */
    
    public buah (String nama, String warna, String tekstur, String rasa,  int harga,  int jumlahbeli, double berat){
    this.nama = nama;
    this.warna = warna;
    this.tekstur = tekstur;
    this.rasa = rasa;
    this.harga = harga;
    this.berat = berat;
    this.jumlahbeli = jumlahbeli;
    }
    
    public int totalharga(){
        int totalharga = harga * jumlahbeli;
        return totalharga;
    }
    
    public double totalberat(){
        double totalberat = berat * jumlahbeli;
        return totalberat;
    }
    
    public void tampil(){
        System.out.println("Nama Mangga: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jumlah Beli: " + jumlahbeli);
        System.out.println("Total Berat: " + totalberat() + " kg");
        System.out.println("Total Harga: Rp" + totalharga());
}
}