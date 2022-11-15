package Praktikum4.Soal1;

public class Buku {
    private String judul, penulis;
    private Integer tahun;
    
    public Buku(String j, String p, Integer t){
    this.judul = j;
    this.penulis = p;
    this.tahun = t;
    
    }

    public void display(){
        System.out.println("==========================");
        System.out.println("Detail Buku: ");
        System.out.println("Judul adalah " + judul);
        System.out.println("Penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}
