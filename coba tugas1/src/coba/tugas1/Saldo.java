/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba.tugas1;

/**
 *
 * @author user
 */
public class Saldo {
    private int saldo;
    public int minSaldo;
    
    public Saldo(){
        this.saldo = 500000;
        this.minSaldo = 100000;
    }

    public int getsaldo() {
        return this.saldo;
    }

    public void setSaldo(int s) {
        this.saldo = s;
    }
    
}
