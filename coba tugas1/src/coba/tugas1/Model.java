/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba.tugas1;

/**
 *
 * @author user
 */
public class Model implements Dao{
    Saldo csaldo;
    
    Model(){
        this.csaldo = new Saldo();
    }
    
    public int limit(){
        return this.csaldo.minSaldo;
    }
    @Override
    public int getSaldo() {
        return this.csaldo.getsaldo();
    }

    @Override
    public void addSaldo(int s) {
        csaldo.setSaldo(csaldo.getsaldo() + s);
    }

    @Override
    public void tarikSaldo(int s) {
        csaldo.setSaldo(csaldo.getsaldo() - s);
    }

    @Override
    public boolean isLimit() {
        if(this.csaldo.getsaldo() <= this.csaldo.minSaldo){
            return true;
        }
        else{
        return false;
        }
    }

    @Override
    public int cekTransaksi(int s) {
        if(s % 50000 != 0){
        return 1;
        }
       return 0;
    }
}
