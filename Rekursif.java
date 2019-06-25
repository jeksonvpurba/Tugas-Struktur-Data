/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jekson viktory purba
 */

public class Rekursif {
    public static void main(String[] args) {
        cetakAngka(1,-10,0);
    }
 
    static void cetakAngka(int angka,int batas,int hasil) {
        if (angka >= batas ) {
            hasil=angka*angka*angka;
            System.out.println(angka+"^3 = "+hasil);
            
            cetakAngka(--angka,batas,0);
        }
 

}
