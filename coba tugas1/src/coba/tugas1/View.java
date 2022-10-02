/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba.tugas1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class View {
    Scanner sc = new Scanner(System.in);
    
    public int mainMenu(){
    System.out.println("SELAMAT DATANG DI ATM");
    System.out.println("Masukkan pilihanmu :");
    System.out.println("1. Cek Saldo");
    System.out.println("2. Tarik Tunai");
    System.out.println("3. Setor Tunai");
    System.out.println("4. Exit");
    System.out.println("Pilih : ");
    
    return sc.nextInt();
    }
    
    public void cekSaldo(Model saldo){
        System.out.println("\nSaldo Anda Rp." +saldo.csaldo.getsaldo());
    }
    
    public void tarikTunai(Model saldo){
        int jumlah;
        System.out.print("Masukkan jumlah penarikan (kelipatan 50.000) : Rp");
        jumlah = sc.nextInt();
        
        if(saldo.isLimit()){
            System.out.println("\nSaldo Anda Mencapai Limit");  
        }
        else if((saldo.getSaldo() - jumlah) < saldo.limit()){
        System.out.println("\n Jumlah penarikan melebihi limit saldo anda");
        }
        else if((saldo.getSaldo() > jumlah) && (saldo.cekTransaksi(jumlah) == 0)){
            saldo.tarikSaldo(jumlah);
            System.out.println("\n Anda mengambil uang sejumlah Rp" + jumlah);
        }
        else{
        System.out.println("Harus kelipatan 50.000");
        }     
      }
    
    public void setorTunai(Model saldo){
        int jumlah;
        System.out.print("Masukkan jumlah setoran (kelipatan 50.000) : Rp");
        jumlah = sc.nextInt();
        
        if(saldo.cekTransaksi (jumlah) == 0){
            saldo.addSaldo(jumlah);
            System.out.println("Saldo anda bertambah sejumlah : Rp." + jumlah);
        }
        else{
        System.out.println("Harus kelipatan 50.000");
        }     
      }
}
