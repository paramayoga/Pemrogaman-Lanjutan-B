/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coba.tugas1;

/**
 *
 * @author user
 */
public interface Dao {
    int getSaldo();
    
    void addSaldo(int s);
    
    void tarikSaldo(int s);
    
    boolean isLimit();
    
    int cekTransaksi(int s);
    
}
