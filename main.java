/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author Asus
 */
public class main {
    public static void main(String[] args){
        
        BangunRuang bangunDatar = new BangunRuang();
        
        
        Bola bola = new Bola();
        bola.r = 7;
        
        
        
        
        Balok balok = new Balok();
        balok.l = 6;
        balok.p = 10;
        balok.t = 5;
        
        
        
        Tabung tabung = new Tabung();
        tabung.r = 7;
        tabung.t = 5;
        
        
        
        LimasSegitiga limasS = new LimasSegitiga();
        limasS.t = 8;
        limasS.tsm = 12;
        limasS.tS = 4;
        limasS.aS = 2;
        
        bangunDatar.volume();
        bangunDatar.luasPermukaan();
        
        System.out.println("");
        
        bola.volume();
        bola.luasPermukaan();
        
        System.out.println("");
        
        balok.volume();
        balok.luasPemukaan();
        
        System.out.println("");
        
        tabung.volume();
        tabung.luasPermukaan();
        
        System.out.println("");
        
        limasS.volume();
        limasS.luasPermukaan();
        
        System.out.println("");
    }
    
}
