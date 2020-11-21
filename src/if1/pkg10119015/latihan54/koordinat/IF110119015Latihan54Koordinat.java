/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan54.koordinat;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat titik = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna Koordinate : " + titik.getNamaWarna());
        System.out.println("Koordinate sumbu x : " + titik.getX() + ", y : "+ titik.getY());
        
    }
    
}
