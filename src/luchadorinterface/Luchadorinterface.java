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
        // TODO code application logic here
       
               

        Raza1 Ironman = new Raza1("Iron man", 100, 40, 10, 30);
        Raza2 Duende = new Raza2("Dragon", 200, 300, 14, 20);
        Raza3 Dragon = new Raza3("Duende verde", 80, 10, 50, 80);
        
        System.out.println("Luchadores activos: ");
        System.out.println(" ");
        System.out.println("1. Iron man ");
        System.out.println("2. Duende");
        System.out.println("3. Dragon ");
        System.out.println(" ");
        System.out.println("Escoge tu luchador");
        
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Iron Man");
                System.out.println("1. Atacar");
                System.out.println("2. Escapar");
                System.out.println("3. Ataque de Hielo");
                System.out.println("4. Curar");
                System.out.println("Elige tu poder :");
                int opc1 = sc.nextInt();

                switch (opc1) {
                    case 1:
                        Ironman.Atacar();
                        break;
                    case 2:
                        Ironman.Escapar();
                        break;
                    case 3:
                        Ironman.Ataquehielo();

                        break;
                    case 4:
                        Ironman.curar();

                        break;
                    default:
                        System.out.println("Opción no válida");
                }
                break;

            case 2:
                System.out.println("Duende");
                System.out.println("1. Doble Ataque");
                System.out.println("2. Escapar");
                System.out.println("Elige tu poder:");
                int opc2 = sc.nextInt();

                switch (opc2) {
                    case 1:
                        Duende.Dobleataque();

                        break;
                    case 2:
                        Duende.Escapar();
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
                break;

            case 3:
                System.out.println("Dragon");
                System.out.println("1. Ataque de Fuego");
                System.out.println("2. Ataque de Hielo");
                System.out.println("3. Ataque");
                System.out.println("4. Robo de Vida");
                System.out.println("Elige tu poder:");
                int opc3 = sc.nextInt();

                switch (opc3) {
                    case 1:
                        Dragon.Ataquefuego();
                        break;
                    case 2:
                        Dragon.Ataquehielo();

                        Dragon.Ataquehielo();

                        break;
                    case 3:
                        Dragon.Ataque();

                        Dragon.Ataque();

                        break;

                    case 4:
                        Dragon.Robovida();

                        Dragon.Robovida();

                        break;
                    default:
                        System.out.println("Opción no válida");

                }
                break;
            default:
                System.out.println("Ingrese del 1 al tres");
        }
    }
}  

      