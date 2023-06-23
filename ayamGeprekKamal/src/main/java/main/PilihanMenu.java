/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Kei
 */import java.util.Scanner;

public class PilihanMenu {
    protected int pilihan;
    public void pilih(){ //pemilihan  Utama
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
    
    public void pilihan1(){ // Pemilihan Menu
        System.out.println("1.Biasa (RP. 5000.0)");
        System.out.println("2. Double Rp. 7000.0)");
        System.out.println("3. Special t 8000.0)");
        
        Scanner input = new Scanner();
        System.out.println("Pilih Menu :");
        int pilih1 = input.nextInt();
        nextLine();
        int harga;
        if (pilih1==1){
            harga = 5000;
        } else if(pilih1 == 2){
            harga = 7000;
        }else if(pilih == 3){
            harga = 8000;
        }
        
        System.out.println("Aakah ingin Menambah nasi :(ya/tidak)");
        String nasi = input.nextLine();
        
        if(nasi.EqualsIgnore("ya")){
           harga += 30000;
        }
    }
    
    public void pilihan2(){//
    }
    
    public void pilihan3(){
        //
    }
}