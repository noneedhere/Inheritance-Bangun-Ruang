/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author Asus
 */
class Tabung extends BangunRuang{
    double r;
    double t;
    
    @Override
    double volume(){
        double volume = Math.PI*(r*r)*t;
        System.out.println("Volume Tabung :"+ volume);
        return volume;
        
    }
    @Override
    double luasPermukaan(){
        double luasPermukaan = (2*Math.PI*(r*r))+(Math.PI*(2*r)*t);
        System.out.println("Luas permukaan Tabung : " + luasPermukaan);
        return luasPermukaan;
    }
    
    
}
