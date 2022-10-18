/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK_202_2110817110009_MaulanaKhisyam;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author Lenovo
 */
public class Mobil {
    String merek, tahun_keluaran;
    private String pemilik;
    int kapasitas, harga;
    private int pajak;
    
    
    public Mobil(String mb, String thn,int kpst, int hrg){
        merek = mb;
        tahun_keluaran = thn;
        kapasitas = kpst;
        harga = hrg;
    }
    
    public Mobil(){
        
    }
    public void setPemilik(String pm){
        pemilik = pm;    
    }
    public void setPajak(int pjk){
        pajak = pjk;
    }
 
    
    
    public String getPemilik (){
        return pemilik;
    }
    public int getPajak(){ 
        
        return pajak = (harga*2)/100;
    } 
    
    
    public void info(){
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Merek Mobil: " + merek);
        System.out.printf("Harga: %s %n", kursIndonesia.format(harga));
        System.out.println("Tahun Keluaran : " + tahun_keluaran);
        System.out.println("Kapasitas : " + kapasitas +"cc");
        
        
    }

   
}
