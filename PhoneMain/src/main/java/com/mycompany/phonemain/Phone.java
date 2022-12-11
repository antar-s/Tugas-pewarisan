/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phonemain;

/**
 *
 * @author user
 */
public interface Phone {
    int Max_vol = 100;
    int Min_vol = 100;
    
    void PowerOn();
    void PowerOff();
    void volumeUp();
    void volumeDown();
    void tampilInfo();
}
