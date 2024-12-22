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
interface InterfaceBeraksi{

    public static final int KEADAAN_HIDUP=1;
    public static final int KEADAAN_MATI=0;
    public abstract void hidupkan();
    public abstract void matikan();

    public static final int KEADAAN_DINGIN=1;
    public static final int KEADAAN_PANAS=0;
    public abstract void dinginkan();
    public abstract void panaskan();

}
