/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

/**
 *
 * @author dimas
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        mobilku.warna = "Merah";
        mobilku.tahunProduksi = 1975;
        
        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun Produksi: " + mobilku.tahunProduksi);
    }
}
