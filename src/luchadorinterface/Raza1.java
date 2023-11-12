/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchadorinterface;

/**
 *
 * @author jhon1
 */
public class Raza1 implements Skills, Magrase {

    private String Nombre;
    private int Hp;
    private int atk;
    private int defenza;
    private int magia;

    public Raza1(String Nombre, int Hp, int atk, int defenza, int magia) {
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
        System.out.println("Atacando...");
        return 0;
    }

    @Override
    public int Dobleataque() {
        System.out.println("Ataque doble...");
        return 0;
    }

    @Override
    public int curar() {
        System.out.println("Curandose...");
        return 0;
    }

    @Override
    public int Robovida() {
        System.out.println("Robando vida al oponente...");
        return 0;
    }

    @Override
    public int Ataque() {
        System.out.println("Atacando...");
        return 0;
    }

    @Override
    public int Ataquehielo() {
        System.out.println("Ataque de hielo...");
        return 0;
    }

    @Override
    public int Ataquefuego() {
        System.out.println("Ataque de hielo...");
        return 0;
<<<<<<< HEAD
    }   
    public void mostrar(){
        System.out.println("NOMBRE:"+this.Nombre);
        System.out.println("HP: "+this.Hp);
        System.out.println("ATK: "+this.atk);
        System.out.println("DEF: "+this.defenza);
        System.out.println("DES: "+this.magia);

=======
    }

    public void mostrar() {
        System.out.println("NOMBRE:" + this.Nombre);
        System.out.println("HP: " + this.Hp);
        System.out.println("ATK: " + this.atk);
        System.out.println("DEF: " + this.defenza);
        System.out.println("DES: " + this.magia);
    }

    public void atacarLuchador(Raza1 luchador) {//el parametro es el luchador que llega

        System.out.println("Tiro de dados para destreza......");
        int dl1 = (int) (Math.random() * (20 - 1 + 1)) + 1;
        int dl2 = (int) (Math.random() * (20 - 1 + 1)) + 1;

        System.out.println("dado 1:" + dl1);
        System.out.println("dado 2:" + dl2);
        System.out.println(" ");

        //modificamos la destreza con el dado 20
        this.setDefenza(this.defenza + dl1);
        luchador.setDefenza(luchador.defenza + dl2);
        //modificamos el atk con el dado 20
        this.setAtk(this.atk + dl1);
        luchador.setAtk(luchador.atk + dl2);
        //atributos en pantalla
        System.out.println("Nombre: " + this.Nombre + " " + "Atk: " + this.atk + " " + "Des: " + this.defenza);
        System.out.println("Nombre: " + luchador.Nombre + " " + "Atk: " + luchador.atk + " " + "Des: " + luchador.defenza);
        System.out.println(" ");

        if (this.defenza > luchador.defenza) {
            luchador.Hp = luchador.Hp - (luchador.atk - this.magia);
            luchador.mostrar();

        } else if (this.defenza < luchador.defenza) {
            this.Hp = this.Hp - (this.atk - luchador.magia);
            this.mostrar();

        }
        this.defenza = 60;
        luchador.defenza = 60;
        this.atk = 100;
        luchador.atk = 100;

    }
>>>>>>> e10dbf63d6386ab3d3e4b27edd1e2d9fc4ac7241
}
      public void atacarLuchador(Raza1 Ironman){//el parametro es el luchador que llega
       
        System.out.println("Tiro de dados para destreza......");
        int dl1 = (int) (Math.random() * (20 - 1+1)) + 1;  
        int dl2 = (int) (Math.random() * (20 - 1+1)) + 1;
        
        System.out.println("dado 1:"+dl1);
        System.out.println("dado 2:"+dl2);
        System.out.println(" ");
       
        //modificamos la destreza con el dado 20
        this.setDefenza(this.defenza+dl1);
        Ironman.setDefenza(Ironman.defenza+dl2);
        //modificamos el atk con el dado 20
        this.setAtk(this.atk+dl1);
        Ironman.setAtk(Ironman.atk+dl2);
        //atributos en pantalla
        System.out.println("Nombre: "+this.Nombre+" "+"Atk: "+this.atk+" "+"Des: "+this.defenza);
        System.out.println("Nombre: "+Ironman.Nombre+" "+"Atk: "+Ironman.atk+" "+"Des: "+Ironman.defenza);
        System.out.println(" ");
       
        if(this.defenza>Ironman.defenza){
            Ironman.Hp=Ironman.Hp-(Ironman.atk-this.magia);
            Ironman.mostrar();
                     
        }
        else if(this.defenza<Ironman.defenza){
           this.Hp=this.Hp-(this.atk-Ironman.magia);
           this.mostrar();
           
        }
        this.defenza=10;
        Ironman.defenza=10;
        this.atk=40;
        Ironman.atk=40;
   
    }

    void atacarLuchador(Raza3 Dragon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}