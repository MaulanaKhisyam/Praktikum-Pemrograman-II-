/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum1;

import java.util.Scanner;//menginput 
import java.util.Locale;
/*kenapa ditambahi locale: karena dalam java itu tipe data yang ada titiknya
misal kaya float bisa tidak terbaca sebagai titik. Makanya ditambahi locale*/
/**
 *
 * @author Lenovo
 */
public class PRAK101_2110817110009_MaulanaKhisyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(Locale.US);//locale 
        String nama, tempat, bulanLahir = null;
        int tanggal, bulan, tahun, tinggi_badan;
        float berat_badan;
       

        System.out.print("Masukan Nama Lengkap\t: ");
        nama = userInput.nextLine();

        System.out.print("Masukan Tempat Lahir\t: ");
        tempat = userInput.nextLine();

        System.out.print("Masukan Tanggal Lahir\t: ");
        tanggal = userInput.nextInt();

        System.out.print("Masukan Bulan Lahir\t: ");
        bulan = userInput.nextInt();
        
        if (bulan == 1) bulanLahir = "Januari";
        else if(bulan == 2) bulanLahir = "Februari";
        else if(bulan == 3) bulanLahir = "Maret";
        else if(bulan == 4) bulanLahir = "April";
        else if(bulan == 5) bulanLahir = "Mei";
        else if(bulan == 6) bulanLahir = "Juni";
        else if(bulan == 7) bulanLahir = "Juli";
        else if(bulan == 8) bulanLahir = "Agustus";
        else if(bulan == 9) bulanLahir = "September";
        else if(bulan == 10) bulanLahir = "Oktober";
        else if(bulan == 11) bulanLahir = "November";
        else if(bulan == 12) bulanLahir = "Desember";
        
        System.out.print("Masukan Tahun Lahir\t: ");
        tahun = userInput.nextInt();

        System.out.print("Masukan Tinggi Badan\t: ");
        tinggi_badan = userInput.nextInt();

        System.out.print("Masukan Berat Badan\t: ");
        berat_badan = userInput.nextFloat();
    
        System.out.println("============================");
        System.out.println("Data Telah Ditambahkan");
        System.out.println("Nama Lengkap"+" "+nama+","+"Lahir di "+tempat+" "+"pada Tanggal "+tanggal+" "+bulanLahir+" "+tahun);
        System.out.println("Tinggi Badan "+tinggi_badan+"cm dan Berat Badan "+berat_badan+"Kilogram");
        
    userInput.close();    
    }
    
}
