/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jekson viktory purba
 */
import java.util.Scanner;

public class SD_20182_T1_E1E117033 {
    public static void main(String[] args){
        int [] nilai = new int[8];
        int nMin,nMax,Total=0;
        double  Rata;
        
        Scanner input = new  Scanner(System.in);
        
        for(int i=1 ; i<=7 ; i++){
            System.out.print("Nilai praktikum ke-" + i + ": ");
            nilai[i] = input.nextInt();
            Total = Total + nilai[i];
        }
        
        nMin=nilai[1];
        nMax=nilai[1];
        for(int i=1 ; i<=7 ; i++){
            if(nilai[i] > nMax){
                nMax = nilai[i];
            }
            else if (nilai[i]<nMin){
                nMin = nilai [i];
            }
        }
        System.out.println("-------------------------------");
        Rata = Total / 7;
        System.out.println("Nilai praktikum rata-rata : "+Rata);
        System.out.println("Nilai praktikum tertinggi : "+nMax);
        System.out.println("Nilai praktikum terendah : "+nMin+"\n");
        
        for(int i=1 ; i<=7 ; i++){
            System.out.print(nilai[i]+", ");
        }
        System.out.println("\n-------------------------------");
    }
}
