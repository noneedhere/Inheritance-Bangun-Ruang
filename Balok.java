/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author Asus
 */
class Balok extends BangunRuang{
    double p,l,t;
    
    double volume(){
        double volume = p * l * t;
        System.out.println("Volume Tabung : "+ volume);
        return volume;    
    }
            
    double luasPemukaan(){
        double luasPermukaan = 2*(p+l+t);
        System.out.println("Luas pemukaan Balok :"+ luasPermukaan);
        return luasPermukaan;
    }
    
}
