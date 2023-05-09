package Practica7;

import java.util.Scanner;
import ventas.Ventas;

/**
 * Principal.java
 * Practica 7
 * @author Rafael Lopez Olvera
 * date 2023-05-01
 */
public class Principal {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int opc = -1;
        Ventas vende = new Ventas();
        
        while(opc != 10){
            System.out.println("Bienvenido a Mascotas el Driver");
            System.out.println("1.- Reabastecer tienda");
            System.out.println("2.- Vender Gato");
            System.out.println("3.- Vender Perro");
            System.out.println("4.- Vender Brontosaurio");
            System.out.println("5.- Vender Raptor");
            System.out.println("6.- Vender Trex");
            System.out.println("7.- Vender Tigre");
            System.out.println("8.- Vender Vibora");
            System.out.println("9.- Ver historial de ventas");
            System.out.println("10.- Salir");
            System.out.println("Eleccion:");
            opc = in.nextInt();
            in.nextLine();
            
            switch(opc){
                case 1:
                    vende.abastecer();
                    break;
                case 2:
                    vende.venderGato();
                    break;
                case 3:
                    vende.venderPerro();
                    break;
                case 4:
                    vende.venderBrontosaurio();
                    break;
                case 5:
                    vende.venderRaptor();
                    break;
                case 6:
                    vende.venderTRex();
                    break;
                case 7:
                    vende.venderTigre();
                    break;
                case 8:
                    vende.venderViboras();
                    break;
                case 9:
                    vende.imprimirVentas();
                    break;
                case 10:
                    System.out.println("Adios");
                    break;  
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
