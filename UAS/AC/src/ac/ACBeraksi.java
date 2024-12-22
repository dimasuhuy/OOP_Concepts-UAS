/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac;

/**
 *
 * @author dimas
 */
public class ACBeraksi {

    public static void main(String[] args){

        AC ACKamar = new AC();

        System.out.println("Status AC saat ini mati dan dingin");

        ACKamar.hidupkan();
        ACKamar.matikan();
        ACKamar.matikan();
        ACKamar.hidupkan();
        ACKamar.hidupkan();
        
        ACKamar.dinginkan();
        ACKamar.panaskan();
        ACKamar.panaskan();
        ACKamar.dinginkan();
        ACKamar.dinginkan();
    }
}
