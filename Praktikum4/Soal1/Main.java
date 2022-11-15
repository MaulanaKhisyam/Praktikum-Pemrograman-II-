package Praktikum4.Soal1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
        
        System.out.print("Judul : ");
        String judul = input.nextLine();
        
        System.out.print("Penulis : ");
        String penulis = input.nextLine();
        
        System.out.print("Tahun Terbit : ");
        Integer tahun = input.nextInt();
        
        Buku book = new Buku (judul, penulis, tahun);
        book.display();       
    }
}
