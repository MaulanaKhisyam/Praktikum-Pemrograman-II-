/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak.pkg1;
import java.util.Scanner;//meambil

/**
 *
 * @author Lenovo
 */
    public class PRAK201_2110817110009_MaulanaKhisyam {
        
    public static void main (String [] args){
    Scanner userInput = new Scanner(System.in); 
    int user= userInput.nextInt(); 
    int angka = 1;
       
        while (angka <= 7){            
            if (user % 2 == 0){  
                int m;
                m =(user / 2)-1;
                System.out.print(" "+m+" ");               
            }
            else {
                System.out.print(user);
            }
        user++;
        angka++;
        }
    }    
}
