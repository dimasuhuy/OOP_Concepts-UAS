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
public class BankBeraksi {
    public static void main(String[] args) {   
        Bank bankku = new Bank(100000);
        bankku.getSaldo();
        bankku.SimpanUang(500000);
        bankku.AmbilUang(150000);
    }
}
