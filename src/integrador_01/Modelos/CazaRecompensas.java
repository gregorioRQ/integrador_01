/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador_01.Modelos;

import integrador_01.Logica.Campeon;

import integrador_01.Logica.IAsesino;

/**
 *
 * @author rafae
 */
public class CazaRecompensas extends Campeon implements IAsesino {
    public String tipoDeArma;
  
    
    public CazaRecompensas() {
    }

    public CazaRecompensas(String tipoDeArma, String nombre, String tipo, int danioFisico, int danioMagico, int vida, int armadura) {
        super(nombre, tipo, danioFisico, danioMagico, vida, armadura);
        this.tipoDeArma = tipoDeArma;
    }

    public String getTipoDeArma() {
        return tipoDeArma;
    }

    public void setTipoDeArma(String tipoDeArma) {
        this.tipoDeArma = tipoDeArma;
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
        System.out.println(nombre + " ataco al enemigo y redujo su defensa");
    }

    @Override
    public void mejorarArmas(int ataque) {
        System.out.println(nombre + " recibio un objeto que aumento su daño de ataque a: " + (danioFisico+ataque));
         if(danioFisico > 300){
            System.out.println("ahora si...Nadie me va a parar");
        }
    }

    @Override
    public void reducirDefensa(int daño) {
        System.out.println(this.nombre + " perdio algo de defensa: " + (this.armadura - daño));
    }

    @Override
    public void reducirVida(int daño) {
        this.vida = this.vida - daño;
        System.out.println(nombre +" recibio daño su vida restante es de: " + this.vida);
    }

    @Override
    public void campurarRecompensa() {
        System.out.println(nombre + " ah capturado con exito la recompensa");
    }

}
