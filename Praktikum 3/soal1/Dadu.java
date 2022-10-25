package Praktikum3.soal1;

public class Dadu {
    private int angka;
    public int acakNilai() {
        return angka = (int)(Math.random()*(6+1-1)+1);
    }

    public int getAngka() {
        return angka;
    }    
}
