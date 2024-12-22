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
public class AC implements InterfaceBeraksi{
int statusAC;

    public void hidupkan(){

        if (statusAC == KEADAAN_MATI){statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! -> AC hidup");
        }else{
            System.out.println("Hidupkan AC! -> AC sudah hidup");}
    }

    public void matikan(){

        if (statusAC == KEADAAN_HIDUP){statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! -> AC mati");
        }else{
            System.out.println("Matikan AC! -> AC sudah mati");}
    }
    
    public void dinginkan(){

        if (statusAC == KEADAAN_PANAS){statusAC = KEADAAN_DINGIN;
            System.out.println("Dinginkan AC! -> AC dingin");
        }else{
            System.out.println("Dinginkan AC! -> AC sudah dingin");}
    }

    public void panaskan(){

        if (statusAC == KEADAAN_DINGIN){statusAC = KEADAAN_PANAS;
            System.out.println("Panaskan AC! -> AC panas");
        }else{
            System.out.println("Pabaskan AC! -> AC sudah panas");}
    }
    
}
