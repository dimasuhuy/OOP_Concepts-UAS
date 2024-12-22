/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author dimas
 */
public class Bank {
    int saldo;
    
        public Bank (int saldo){
            this.saldo = saldo;
        }
        
        public void getSaldo(){
            System.out.println("Selamat datang di bank ABC");
            System.out.println("Saldo saat ini: RP." + saldo);
        }
        public void SimpanUang(int simpan){
            saldo = simpan + saldo;
            System.out.println("Simpan Uang: RP." + simpan);
            System.out.println("Saldo saat ini: RP." + saldo);
        }
        public void AmbilUang(int ambil) {
            saldo = saldo - ambil;
            System.out.println("Ambil uang: " + ambil);
            System.out.println("Saldo saat ini: " + saldo);
        }
        
        public int newSaldo(){
        return saldo;
    }
}
