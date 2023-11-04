/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luchadorinterface;

/**
 *
 * @author jhon1
 */
public class Luchadorinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int dl1;
        int dl2;
        int dl3;
        
       Raza1 Ironman = new Raza1 ("Iron man",100,40,10,30);
       Raza2 Duende  = new Raza2 ("Dragon",200,300,14,20);
       Raza3 Dragon = new Raza3 ("Duende verde",80,10,50,80);
        
       
      
           
           
        System.out.println("Iron man ");
       Ironman.Atacar();
       Ironman.Escapar();
       Ironman.Ataquehielo();
       Ironman.curar();
        System.out.println("  ");
        System.out.println("Duende");
       Duende.Dobleataque();
       Duende.Escapar();
       
        System.out.println("  ");
        System.out.println("Dragon ");
        Dragon.Ataquefuego();
        Dragon.Ataquehielo();
        Dragon.Ataque();
        Dragon.Robovida();
       
          
    }
    
}

    
    

