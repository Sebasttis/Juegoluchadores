/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadorinterface;

/**
 *
 * @author jhon1
 */
public class Raza2 implements Skills {
    
    private String Nombre;
    private int Hp;
    private int atk;
    int defenza;
    private int magia;

    public Raza2(String Nombre, int Hp, int atk, int defenza, int magia) {
        this.Nombre = Nombre;
        this.Hp = Hp;
        this.atk = atk;
        this.defenza = defenza;
        this.magia = magia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDefenza() {
        return defenza;
    }

    public void setDefenza(int defenza) {
        this.defenza = defenza;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }
    
    
    @Override
    public int Escapar() {
        System.out.println("Escapando del rival...");
        return 0;
    }

    @Override
    public int Atacar() {
        System.out.println("Escapando del rival...");
        return 0;
    }

    @Override
    public int Dobleataque() {
        System.out.println("Doble ataque...");
        return 0;
    }
    
    
    
}
