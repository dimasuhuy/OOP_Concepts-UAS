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
import java.util.Scanner;
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di Kalkulator BMI");
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.print("Masukan tinggi badan anda : ");
        int tb = in.nextInt();
        System.out.print("Masukan berat badan anda : ");
        int bb = in.nextInt();
        operasiBMI hitungBMI = new operasiBMI(tb, bb);
        hitungBMI.hitungBMI();
    }
    
}
