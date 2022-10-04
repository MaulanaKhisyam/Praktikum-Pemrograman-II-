/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak.pkg1;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class PRAK401_2110817110009_MaulanaKhisyam {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        int andi_1, andi_2, andi_3, budi_1, budi_2, budi_3, Hasil_andi, Hasil_budi;
        
        
        System.out.print("Kartu Andi: ");
        andi_1 = userInput.nextInt();
        andi_2 = userInput.nextInt();
        andi_3 = userInput.nextInt();
        
        Hasil_andi = andi_1+ andi_2+ andi_3;
                
        System.out.print("Kartu Budi: ");
        budi_1 = userInput.nextInt();
        budi_2 = userInput.nextInt();
        budi_3 = userInput.nextInt();
        
        Hasil_budi = budi_1+ budi_2+ budi_3;
        
        if (Hasil_andi > Hasil_budi){
            System.out.print("ANDI MENANG");
            
        } else if (Hasil_andi == Hasil_budi){
            System.out.print("HASIL SERI");
        }else 
            System.out.print("BUDI MENANG");
        
    
}
}
