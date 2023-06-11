package inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotasdomesticas.*;
import mascotasexoticas.*;
import mascota.mascota;

/**
 * Inventario.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */

public class Inventario {
    private List <Gato> miaus;
    private List <Perro> guaus;
    private List <Brontosaurio> aaaah;
    private List <Raptor> grrr;
    private List <TRex> roar;
    private List <Tigre> miaugrande;
    private List <Vibora> shhhh;

    public Inventario(){
        miaus = new ArrayList();
        guaus = new ArrayList();
        aaaah = new ArrayList();
        grrr = new ArrayList();
        roar = new ArrayList();
        miaugrande = new ArrayList();
        shhhh = new ArrayList();
    }
    
    public void reabastecerAnimales(){
        String n;
        int e;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Se pidió el nuevo lote de mascotas, llega una de cada tipo.");
        System.out.println("Introduce el nombre del nuevo gato: ");
        n = in.nextLine();
        System.out.println("Introduce la edad del gato: ");
        e = in.nextInt();
        in.nextLine();
        miaus.add(new Gato(n, e, ""));
        System.out.println("Introduce el nombre del nuevo perro: ");
        n = in.nextLine();
        System.out.println("Introduce la edad del perro: ");
        e = in.nextInt();
        in.nextLine();
        guaus.add(new Perro(n, e, ""));
        System.out.println("Introduce el nombre del nuevo brontosaurio: ");
        n = in.nextLine();
        System.out.println("Introduce la edad del brontosaurio: ");
        e = in.nextInt();
        in.nextLine();
        aaaah.add(new Brontosaurio(n, e, ""));
        System.out.println("Introduce el nombre del nuevo raptor: ");
        n = in.nextLine();
        System.out.println("Introduce la edad del raptor: ");
        e = in.nextInt();
        in.nextLine();
        grrr.add(new Raptor(n, e, ""));
        System.out.println("Introduce el nombre del nuevo T-rex: ");
        n = in.nextLine();
        System.out.println("Introduce la edad del T-rex: ");
        e = in.nextInt();
        in.nextLine();
        roar.add(new TRex(n, e, ""));
        System.out.println("Introduce el nombre del nuevo tigre: ");
        n = in.nextLine();
        System.out.println("Introduce la edad del tigre: ");
        e = in.nextInt();
        in.nextLine();
        miaugrande.add(new Tigre(n, e, ""));
        System.out.println("Introduce el nombre de la nueva vibora: ");
        n = in.nextLine();
        System.out.println("Introduce la edad de la vibora: ");
        e = in.nextInt();
        in.nextLine();
        shhhh.add(new Vibora(n, e, ""));
    }
    
    public Gato venderGato(){
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Gato aux;
        
        System.out.println("Gatos disponibles");
        System.out.println("");
        if(!miaus.isEmpty()){
            for(int i = 0; i < miaus.size(); ++i){
                aux = miaus.get(i);
                System.out.println("Gato numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de ternura: " + aux.getFactorTernura());
            }
            System.out.println("Elegir el numero de gato a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = miaus.get(indice);
            miaus.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }

    public Perro venderPerro(){
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Perro aux;
        
        System.out.println("Perros disponibles");
        System.out.println("");
        if(!guaus.isEmpty()){
            for(int i = 0; i < guaus.size(); ++i){
                aux = guaus.get(i);
                System.out.println("Perro numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de ternura: " + aux.getFactorTernura());
            }
            System.out.println("Elegir el numero de perro a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = guaus.get(indice);
            guaus.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }

    public Brontosaurio venderBrontosaurio(){
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Brontosaurio aux;
        
        System.out.println("Brontosaurio disponibles");
        System.out.println("");
        if(!aaaah.isEmpty()){
            for(int i = 0; i < aaaah.size(); ++i){
                aux = aaaah.get(i);
                System.out.println("Brontosaurio numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de brontosaurio a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = aaaah.get(indice);
            aaaah.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }
    
    public Raptor venderRaptor(){
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Raptor aux;
        
        System.out.println("Raptores disponibles");
        System.out.println("");
        if(!grrr.isEmpty()){
            for(int i = 0; i < grrr.size(); ++i){
                aux = grrr.get(i);
                System.out.println("Raptor numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de raptor a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = grrr.get(indice);
            grrr.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }

    public TRex venderTRex(){
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        TRex aux;
        
        System.out.println("TRex disponibles");
        System.out.println("");
        if(!roar.isEmpty()){
            for(int i = 0; i < roar.size(); ++i){
                aux = roar.get(i);
                System.out.println("TRex numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de TRex a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = roar.get(indice);
            roar.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }
    
    public Tigre venderTigre(){
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Tigre aux;
        
        System.out.println("Tigres disponibles");
        System.out.println("");
        if(!miaugrande.isEmpty()){
            for(int i = 0; i < miaugrande.size(); ++i){
                aux = miaugrande.get(i);
                System.out.println("Tigre numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de tigre a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = miaugrande.get(indice);
            miaugrande.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }
    
    public Vibora venderVibora(){
        int indice;
        String nombre;
        Scanner in = new Scanner(System.in);
        Vibora aux;
        
        System.out.println("Vibora disponibles");
        System.out.println("");
        if(!shhhh.isEmpty()){
            for(int i = 0; i < shhhh.size(); ++i){
                aux = shhhh.get(i);
                System.out.println("Vibora numero: " + (i + 1));
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Edad: " + aux.getEdad());
                System.out.println("Factor de peligro: " + aux.getFactorPeligro());
            }
            System.out.println("Elegir el numero de vibora a comprar: ");
            indice = in.nextInt();
            in.nextLine();
            indice--;
            System.out.println("Nombre del nuevo dueño: ");
            nombre = in.nextLine();
            aux = shhhh.get(indice);
            shhhh.remove(indice);
            aux.setDuenio(nombre);
            return aux;
        }
        return null;
    }
}
