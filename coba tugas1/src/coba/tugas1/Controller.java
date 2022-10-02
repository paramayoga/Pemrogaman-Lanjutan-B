/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba.tugas1;

/**
 *
 * @author user
 */
public class Controller {
    View view;
    Model model;
    int pilih;
    
    Controller(){
        this.view = new View();
        this.model = new Model();
        
        while(pilih != 4){
            pilih = view.mainMenu();
            switch(pilih)
            {
                case 1:
                view.cekSaldo(this.model);
                break;

                case 2:
                view.tarikTunai(this.model);
                break;
 
                case 3:
                view.setorTunai(this.model);
                break;
 
                case 4:
                System.out.println("Terimakasih..");
                break;
                
                default:
                    System.out.println("Menu tidak terdaftar");
                    break;
        }
    }
    
}
}
