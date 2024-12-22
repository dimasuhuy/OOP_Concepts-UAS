    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author dimas
 */
public class operasiBMI {
    int bb;
    int tb;
    
    public operasiBMI(int tb, int bb) {
        this.bb = bb;
        this.tb = tb;
    }
    
    public void hitungBMI(){
        double hasil = bb / Math.pow(tb / 100.0, 2);
        System.out.println("Hasil kalkulasi dari tinggi badan " + tb + " dan berat badan " + bb);
        if(hasil < 18.5){
            System.out.println("Adalah "+ hasil +" yaitu, kategori berat badan kurang atau underweight");
        } else if(hasil >= 18.5 && hasil <= 22.9){
            System.out.println("Adalah "+ hasil +" yaitu, kategori berat badan ideal");
        } else if(hasil >= 22.9 && hasil <= 24.9){
            System.out.println("Adalah "+ hasil +" yaitu, kategori kelebihan berat badan atau overweight");
        } else if(hasil >= 24.9 && hasil <= 29.9){
            System.out.println("Adalah "+ hasil +" yaitu, kategori obesitas 1");
        } else {
            System.out.println("Adalah "+ hasil +" yaitu, kategori obesitas 2");
        }
    }
}
