/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author Asus
 */
class LimasSegitiga extends BangunRuang{
    double t,tsm;
    double tS,aS;
    
    @Override
    double volume(){
        double volume = (aS*tS / 2)*t / 3;
        System.out.println("Volume Limas : "+ volume);
        return volume;
    }
    @Override
    double luasPermukaan(){
        double luasPermukaan = (1/2 * aS * tS)+(3*tsm);
        System.out.println("Luas permukaan Limas : "+ luasPermukaan);
        return luasPermukaan;
    }
    
}
