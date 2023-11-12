/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luchadorinterface;

import java.util.Scanner;

/**
 *
 * @author jhon1
 */
public class Luchadorinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        // TODO code application logic here
         int dl1;
        int dl2;
        int dl3;
        
       Raza1 Ironman = new Raza1 ("Iron man",100,40,10,30);
       Raza2 Duende  = new Raza2 ("Dragon",200,50,14,20);
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
        
        
        
    
        
    
     while(Ironman.getHp()>0 && Dragon.getHp()>0)
    {
      dl1 = (int) (Math.random() * (20 - 1+1)) + 1;//dado luchador 1  
      dl2 = (int) (Math.random() * (20 - 1+1)) + 1;//dadoluchador 2      
     
      System.out.println("Tiro de dados para turno.....");
      System.out.println("Dado luchador 1: "+dl1);
      System.out.println("Dado luchador 2: "+dl2);
      System.out.println(" ");
         
      if(dl1>dl2){
         System.out.println("Gano luchador 1 pega:");
         System.out.println("Ataca:"+Ironman.getNombre());
         Ironman.atacarLuchador(Dragon);
        }
      else if(dl2>dl1){
         System.out.println("Gano luchador 2 pega:");
         System.out.println("Ataca:"+Dragon.getNombre());
         Dragon.atacarLuchador(Ironman);
        }
    }
   //Se imprimen en pantalla los valores finales:
    System.out.println(" ");
    System.out.println("Iron man "+Ironman.getHp());
    System.out.println("Dragon "+Dragon.getHp());
    }
}



       
          
     

=======
        Scanner sc = new Scanner(System.in);

// Luchadores de la Raza1
        Raza1 Ironman = new Raza1("Iron man", 9999, 40, 40, 30);
        Raza1 Thanos = new Raza1("Thanos", 150, 50, 30, 10);

        System.out.println("Luchadores listos para la pelea: ");
        System.out.println(" ");
        System.out.println("1. Iron man");
        System.out.println("2. Thanos");
        System.out.println(" ");
        System.out.println("Escoge tu luchador");
        int opc1 = sc.nextInt();

        Raza1 jugador1 = seleccionarLuchador(opc1);
        Raza1 jugador2;

        // Cambiando las opciones disponibles dependiendo de la elección del primer luchador
        if (opc1 == 1) {
            System.out.println("Escoge el luchador para enfrentar a " + jugador1.getNombre());
            System.out.println("1. Iron man");

            System.out.println("2. Thanos");
        } else if (opc1 == 2) {
            System.out.println("Escoge el luchador para enfrentar a " + jugador1.getNombre());
            System.out.println("2. Thanos");

            System.out.println("1. Iron man");
        }

        int opc2 = sc.nextInt();
        jugador2 = seleccionarLuchador(opc2);

        while (jugador1.getHp() > 0 && jugador2.getHp() > 0) {
            int dl1 = (int) (Math.random() * (6 - 1 + 1)) + 1; // dado del luchador 1
            int dl2 = (int) (Math.random() * (6 - 1 + 1)) + 1; // dado del luchador 2

            System.out.println("Tiro de dados para turno.....");
            System.out.println("Dado luchador 1: " + dl1);
            System.out.println("Dado luchador 2: " + dl2);
            System.out.println(" ");

            if (dl1 > dl2) {
                System.out.println("Gano " + jugador1.getNombre() + " pega:");
                System.out.println("Ataca: " + jugador1.getNombre());
                jugador1.atacarLuchador(jugador2);
            } else if (dl2 > dl1) {
                System.out.println("Gano " + jugador2.getNombre() + " pega:");
                System.out.println("Ataca: " + jugador2.getNombre());
                jugador2.atacarLuchador(jugador1);
            }

            //Lo que se imprime
            System.out.println(" ");
            System.out.println(jugador2.getNombre() + ": " + jugador2.getHp());
            System.out.println(jugador1.getNombre() + ": " + jugador1.getHp());
        }
    }

    private static Raza1 seleccionarLuchador(int opcion) {
        switch (opcion) {
            case 1:
                return new Raza1("Iron man", 9999, 40, 40, 30);
            case 2:
                return new Raza1("Thanos", 150, 50, 30, 10);
            default:
                System.out.println(
                        "Opcion incorrecta, elige nuevamente.");
                return seleccionarLuchador(new Scanner(System.in).nextInt());
        }
    }
}
>>>>>>> e10dbf63d6386ab3d3e4b27edd1e2d9fc4ac7241
