package Praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> Dice = new LinkedList<Dadu>();
        int masuk = input.nextInt();
        
        for (int z = 0; z <=masuk; ++z){
            Dice.add(new Dadu());
            Dice.getLast().acakNilai();
        }  
        for (int y = 1; y < Dice.size(); ++y){
            System.out.println("Dadu ke "+ y + " bernilai : " + Dice.get(y).getAngka());
            total += Dice.get(y).getAngka();
            
        }
        System.out.println("Total nilai keseluruhan " + total);
        System.out.println("Ukuran " + Dice.size());
    }
}
