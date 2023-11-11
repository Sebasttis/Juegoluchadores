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

    private String Nombrej;
    private int Hpj;
    private int atkj;
    private int defenzaj;
    private int magiaj;

    public Raza2(String Nombre, int Hp, int atk, int defenza, int magia) {
        this.Nombrej = Nombre;
        this.Hpj = Hp;
        this.atkj = atk;
        this.defenzaj = defenza;
        this.magiaj = magia;
    }

    public String getNombre() {
        return Nombrej;
    }

    public void setNombre(String Nombre) {
        this.Nombrej = Nombre;
    }

    public int getHp() {
        return Hpj;
    }

    public void setHp(int Hp) {
        this.Hpj = Hp;
    }

    public int getAtk() {
        return atkj;
    }

    public void setAtk(int atk) {
        this.atkj = atk;
    }

    public int getDefenza() {
        return defenzaj;
    }

    public void setDefenza(int defenza) {
        this.defenzaj = defenza;
    }

    public int getMagia() {
        return magiaj;
    }

    public void setMagia(int magia) {
        this.magiaj = magia;
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