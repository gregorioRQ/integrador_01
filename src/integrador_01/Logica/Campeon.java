/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador_01.Logica;

/**
 *
 * @author rafae
 */
public abstract class Campeon {
    protected String nombre;
    protected String tipo;
    protected int danioFisico;
    protected int danioMagico;
    protected int vida;
    protected int armadura;

    public Campeon(String nombre, String tipo, int danioFisico, int danioMagico, int vida, int armadura) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.danioFisico = danioFisico;
        this.danioMagico = danioMagico;
        this.vida = vida;
        this.armadura = armadura;
    }

    public Campeon() {
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
    public abstract void usarAtaqueBasico();
    public abstract void usarAtaqueEspecial();
    public abstract void reducirVida(int daño);
    public abstract void reducirDefensa(int daño);
   
}
