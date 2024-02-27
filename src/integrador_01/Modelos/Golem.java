/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador_01.Modelos;

import integrador_01.Logica.Campeon;

import integrador_01.Logica.ITanque;

/**
 *
 * @author rafae
 */
public class Golem extends Campeon implements ITanque {
    public int nivelDeEscudo;

    public Golem() {
    }

    
    
    public Golem(int nivelDeEscudo, String nombre, String tipo, int danioFisico, int danioMagico, int vida, int armadura) {
        super(nombre, tipo, danioFisico, danioMagico, vida, armadura);
        this.nivelDeEscudo = nivelDeEscudo;
    }

    public int getNivelDeEscudo() {
        return nivelDeEscudo;
    }

    public void setNivelDeEscudo(int nivelDeEscudo) {
        this.nivelDeEscudo = nivelDeEscudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDanioFisico() {
        return danioFisico;
    }

    public void setDanioFisico(int danioFisico) {
        this.danioFisico = danioFisico;
    }

    public int getDanioMagico() {
        return danioMagico;
    }

    public void setDanioMagico(int danioMagico) {
        this.danioMagico = danioMagico;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
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
    public void usarProtegerAliados() {
        System.out.println(nombre + " uso su escudo para proteger a sus aliados");
    }

    @Override
    public void aumentarVida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void aumentarDefensaMagica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void aumentarDefensa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
