/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package melianatugas3;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Melianatugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int angka;
        
        Scanner i = new Scanner (System. in);
        System.out.println("Input Angka");
        
    if(i.hasNextInt()){
        angka = i.nextInt();
        System.out.println("angka");
        if (angka < 6) {
            System.out.println("Angka harus lebih dari 6");
        } else if(angka >= 100) {
            System.out.println("Angka harus kurang dari 100");
        } else if (angka% 2==0) {
            System.out.println("Anda Menginput Bilangan Genap");
         } else {
            System.out.println("Anda Menginputkan Bilangan Ganjil");
        } 
    } else {
        System.out.println("Anda Harus Menginputkan Angka");
    }
    }
    
}
