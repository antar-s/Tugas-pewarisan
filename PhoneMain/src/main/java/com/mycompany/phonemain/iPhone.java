/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phonemain;

import static com.mycompany.phonemain.Phone.Max_vol;
import static com.mycompany.phonemain.Phone.Min_vol;

/**
 *
 * @author user
 */
public class iPhone implements Phone{
    
    private int volume;
    private boolean isPowerOn;
    
    public iPhone(){
    this.volume = 50;
}
    
    public void PowerOn(){
        isPowerOn=true;
        System.out.println("iPhone nyala :)");
    }
    
    public void PowerOff(){
        isPowerOn=false;
        System.out.println("Mati");
    }
    
    public void volumeUp(){
        if(isPowerOn){
        if(this.volume == Max_vol){
            System.out.println("Volume Full om");
            System.out.println("Sudah "+this.getVolume()+"%");
        }else{
            this.volume += 10;
            System.out.println("Volume: "+this.getVolume()+"%");
        }
        }else{
                System.out.println("Hp-nya mati om");
                }
    }

    @Override
    public void volumeDown() {
        if(isPowerOn){
            if(this.volume == Min_vol){
                System.out.println("Volume = 0%");
            }else{
                this.volume -= 10;
                System.out.println("Volume: "+this.getVolume()+"%");
            }
        }else{
            System.out.println("Hp-nya mati om");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    @Override
    public void tampilInfo() {
        System.out.println("iPhone");
        System.out.println("1. Nyalakan");
        System.out.println("2. Volume Up");
        System.out.println("3. Volume Down");
        System.out.println("4. Matikan");
    }
}
