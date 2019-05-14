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
        int min,max,total=0;
        double  rata;
        
        Scanner keyboard = new  Scanner(System.in);
        
        for(int i=1 ; i<=7 ; i++){
            System.out.print("nilai praktikum ke-" + i + ": ");
            nilai[i] = keyboard.nextInt();
            
            total = total + nilai[i];
        }
        
        min=nilai[1];
        max=nilai[1];
        
        for(int i=1 ; i<=7 ; i++){
            if(nilai[i] > max){
                max = nilai[i];
            }
            else if (nilai[i]<min){
                min = nilai [i];
            }
        }
        
        rata = total / 7;
        System.out.println("\nnilai praktikum rata-rata : "+rata);
        System.out.println("nilai praktikum tertinggi : "+max);
        System.out.println("nilai praktikum tertinggi : "+min+"\n");
        
        for(int i=1 ; i<=7 ; i++){
            System.out.print(nilai[i]+", ");
        }
    }
}

