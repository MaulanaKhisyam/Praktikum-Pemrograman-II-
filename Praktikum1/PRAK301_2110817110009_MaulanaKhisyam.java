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
public class PRAK301_2110817110009_MaulanaKhisyam {
    public static void main (String [] args){
    
        Scanner userInput = new Scanner(System.in);
        int user = userInput.nextInt();
        int angka = 1;
        
        do {
            if (user % 7 == 0){
                System.out.print(" ");
            }
            else System.out.print(user +",");
            angka++;
            user --;
        }while (angka <=5);
    }
    
}
