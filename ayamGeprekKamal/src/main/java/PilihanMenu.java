/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kei
 */
import java.util.Scanner;

public class PilihanMenu {
    protected int pilihan;
    public void pilih(){
        Scanner input = new Scanner();
        
        System.out.println("====== Menu ====== ");
        System.out.println("1. Pesan menu");
        System.out.println("2. Lihat Pesanan");
        System.out.println("3. selesaikan Pesanan");
        System.out.println("===================");
        System.out.print("Pilih menu");
        
        pilihan = input.nextint();
        
        if (pilihan== 1){
            pilihan1();
        }else if (pilihan == 2){
            pilihan2();
        }else if (pilihan == 3){
            pilhan3();
        }else{
            System.out.println("Keyword Salah");
        }
        
    }
    
    public void pilihan1(){
        System.out.println("1.Biasa (RP. 5000.0)");
        System.out.println("2. Double Rp. 7000.0)");
        System.out.println("3. Special t 8000.0)");
        
        Scanner input = new Scanner(as
        
        
        
    }
}
