/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador_01.Modelos;

import integrador_01.Logica.Campeon;

import integrador_01.Logica.IMago;

/**
 *
 * @author rafae
 */
public class Hechicero extends Campeon implements IMago {

    public String estiloDeMagia;

    public Hechicero(String estiloDeMagia, String nombre, String tipo, int danioFisico, int danioMagico, int vida, int armadura) {
        super(nombre, tipo, danioFisico, danioMagico, vida, armadura);
        this.estiloDeMagia = estiloDeMagia;
    }

    public Hechicero() {
    }
    
    
    
    @Override
    public void usarAtaqueBasico() {
        System.out.println(nombre + " uso su ataque basico");
    }

    @Override
    public void usarAtaqueEspecial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reducirVida(int daño) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reducirDefensa(int daño) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void usarHechizo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void aumentarDañoMagico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void recudirDefensaMagica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
