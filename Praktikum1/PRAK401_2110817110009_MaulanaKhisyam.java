/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class PRAK401_2110817110009_MaulanaKhisyam {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        int andi_1, andi_2, andi_3, budi_1, budi_2, budi_3, Hasil_andi, Hasil_budi;
        int score_andi = 0, score_budi = 0;
        
        
        System.out.print("Kartu Andi: ");
        andi_1 = userInput.nextInt();
        andi_2 = userInput.nextInt();
        andi_3 = userInput.nextInt();
        
                
        System.out.print("Kartu Budi: ");
        budi_1 = userInput.nextInt();
        budi_2 = userInput.nextInt();
        budi_3 = userInput.nextInt();
        
        int [] andi = {andi_1, andi_2, andi_3};
        int [] budi = {budi_1, budi_2, budi_3};
    
        
        for (int i = 0; i < 3; i++){
            if (andi[i] > budi[i]){
                score_andi++;
            } else if (andi[i] < budi[i]){
                score_budi++;
            }
        }
        
        if (score_andi > score_budi){
            System.out.print("ANDI MENANG");
            
        } else if (score_andi < score_budi){
            System.out.print("BUDI MENANG");
        }else 
            System.out.print("HASIL SERI");
        
    
}
}
