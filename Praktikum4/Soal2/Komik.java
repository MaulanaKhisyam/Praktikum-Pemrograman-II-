package Praktikum4.Soal2;

public class Komik extends Buku{
    private Integer Volume;
    private String Sinopsis;
    
    public Komik(String j, String p, String t, Integer v, String s){
    this.judul = j;
    this.penulis = s;
    this.tahun = Integer.parseInt(t);
    this.Volume =  v;
    this.Sinopsis = s;
    
    }
    public String getKomikDetail() {
         return  "\nSebuah komik dengan judul \""+ this.judul + "\" Komik tersebut dibuat oleh \n"+ penulis +
                "dan diterbitkan pada tahun "+ tahun +  ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + Volume+ " buah.\n" +
                "Sinopsis : " + Sinopsis.substring(0, 64) + "...";
    }
}
