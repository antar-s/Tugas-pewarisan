/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.phonemain;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class PhoneMain {

    public static void main(String[] args) {
        int pilih;
        Samsung s = new Samsung();
        Xiaomi x = new Xiaomi();
        iPhone i = new iPhone();
        Oppo o = new Oppo();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu Phone");
        System.out.println("1. Samsung");
        System.out.println("2. Xiaomi");
        System.out.println("3. iPhone");
        System.out.println("4. Oppo");
        System.out.print("Pilih: ");
        pilih = sc.nextInt();
        
        switch(pilih){
            
            case 1:
                s.tampilInfo();
                pilih = sc.nextInt();
                if(pilih==1){
                    s.PowerOn();
                }else if(pilih==2){
                    s.volumeUp();
                }else if(pilih==3){
                    s.volumeDown();
                }else if(pilih==4){
                    s.PowerOff();
                }else{
                    System.out.println("Pilihan salah om");
                }
                break;
            case 2:
                x.tampilInfo();
                pilih = sc.nextInt();
                if(pilih==1){
                    x.PowerOn();
                }else if(pilih==2){
                    x.volumeUp();
                }else if(pilih==3){
                    x.volumeDown();
                }else if(pilih==4){
                    x.PowerOff();
                }else{
                    System.out.println("Pilihan salah om");
                }
                break;
            
            case 3:
                i.tampilInfo();
                pilih = sc.nextInt();
                if(pilih==1){
                    i.PowerOn();
                }else if(pilih==2){
                    i.volumeUp();
                }else if(pilih==3){
                    i.volumeDown();
                }else if(pilih==4){
                    i.PowerOff();
                }else{
                    System.out.println("Pilihan salah om");
                }
                break;
            
            case 4:
                o.tampilInfo();
                pilih = sc.nextInt();
                if(pilih==1){
                    o.PowerOn();
                }else if(pilih==2){
                    o.volumeUp();
                }else if(pilih==3){
                    o.volumeDown();
                }else if(pilih==4){
                    o.PowerOff();
                }else{
                    System.out.println("Pilihan salah om");
                }
                break;
                
                default: System.out.println("Pilihan salah om");
        } 
    }
}
