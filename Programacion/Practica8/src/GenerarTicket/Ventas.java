package GenerarTicket;

import java.time.LocalDate;
import java.time.LocalTime;
import inventario.Inventario;
import java.util.ArrayList;
import java.util.List;
import mascotasdomesticas.*;
import mascotasexoticas.*;
import mascota.mascota;

/**
 * Ventas.java
 * Practica 8
 * @author Rafael Lopez Olvera
 * date 2023-05-18
 * PROGRAMACION
 */
public class Ventas {
    private Inventario local;
    private List <Gato> gatos;
    private List <Perro> perros;
    private List <Brontosaurio> brontos;
    private List <Raptor> raptos;
    private List <TRex> trexes;
    private List <Tigre> tigres;
    private List <Vibora> viboras;
    private LocalDate fecha;
    private LocalTime hora;
    private String articulo;
    private int cantidad;
    private double total;
    /**
     * Constructora de la clase ventas.
     */
    public Ventas(){
        local = new Inventario();
        gatos = new ArrayList();
        perros = new ArrayList();
        brontos = new ArrayList();
        raptos = new ArrayList();
        trexes = new ArrayList();
        tigres = new ArrayList();
        viboras = new ArrayList();
        local.reabastecerAnimales();
        this.fecha = fecha;
        this.hora = hora;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.total = total;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getArticulo() {
        return articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }
    
    public void abastecer(){
        local.reabastecerAnimales();
    }
    
    public void imprimirVentas(){
        Gato aux;
        Perro aux2;
        Brontosaurio aux3;
        Raptor aux4;
        TRex aux5;
        Tigre aux6;
        Vibora aux7;
        
        System.out.println("Ventas del local");
        for(int i = 0; i < gatos.size(); ++i){
            aux = gatos.get(i);
            System.out.println("Gato numero: " + (i + 1));
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Edad: " + aux.getEdad());
            System.out.println("Duenio: " + aux.getDuenio());
            System.out.println("Factor de ternura: " + aux.getFactorTernura());
        }
        for(int i = 0; i < perros.size(); ++i){
            aux2 = perros.get(i);
            System.out.println("Perro numero: " + (i + 1));
            System.out.println("Nombre: " + aux2.getNombre());
            System.out.println("Edad: " + aux2.getEdad());
            System.out.println("Duenio: " + aux2.getDuenio());
            System.out.println("Factor de ternura: " + aux2.getFactorTernura());
        }
        for(int i = 0; i < brontos.size(); ++i){
            aux3 = brontos.get(i);
            System.out.println("Brontosaurio numero: " + (i + 1));
            System.out.println("Nombre: " + aux3.getNombre());
            System.out.println("Edad: " + aux3.getEdad());
            System.out.println("Duenio: " + aux3.getDuenio());
            System.out.println("Factor de peligro: " + aux3.getFactorPeligro());
        }
        for(int i = 0; i < raptos.size(); ++i){
            aux4 = raptos.get(i);
            System.out.println("Raptor numero: " + (i + 1));
            System.out.println("Nombre: " + aux4.getNombre());
            System.out.println("Edad: " + aux4.getEdad());
            System.out.println("Duenio: " + aux4.getDuenio());
            System.out.println("Factor de peligro: " + aux4.getFactorPeligro());
        }
        for(int i = 0; i < trexes.size(); ++i){
            aux5 = trexes.get(i);
            System.out.println("TRex numero: " + (i + 1));
            System.out.println("Nombre: " + aux5.getNombre());
            System.out.println("Edad: " + aux5.getEdad());
            System.out.println("Duenio: " + aux5.getDuenio());
            System.out.println("Factor de peligro: " + aux5.getFactorPeligro());
        }
        for(int i = 0; i < tigres.size(); ++i){
            aux6 = tigres.get(i);
            System.out.println("Tigres numero: " + (i + 1));
            System.out.println("Nombre: " + aux6.getNombre());
            System.out.println("Edad: " + aux6.getEdad());
            System.out.println("Duenio: " + aux6.getDuenio());
            System.out.println("Factor de peligro: " + aux6.getFactorPeligro());
        }
        for(int i = 0; i < viboras.size(); ++i){
            aux7 = viboras.get(i);
            System.out.println("Viboras numero: " + (i + 1));
            System.out.println("Nombre: " + aux7.getNombre());
            System.out.println("Edad: " + aux7.getEdad());
            System.out.println("Duenio: " + aux7.getDuenio());
            System.out.println("Factor de peligro: " + aux7.getFactorPeligro());
        }
    }
    
    public void venderGato(){
        Gato aux = local.venderGato();
        if(aux != null){
            gatos.add(aux);
        }
    }
    
    public void venderPerro(){
        Perro aux = local.venderPerro();
        if(aux != null){
            perros.add(aux);
        }
    }
    
   public void venderBrontosaurio(){
        Brontosaurio aux = local.venderBrontosaurio();
        if(aux != null){
            brontos.add(aux);
        }
    }
    
  
    public void venderRaptor(){
        Raptor aux = local.venderRaptor();
        if(aux != null){
            raptos.add(aux);
        }
    }
    

    public void venderTRex(){
        TRex aux = local.venderTRex();
        if(aux != null){
            trexes.add(aux);
        }
    }
    

    public void venderTigre(){
        Tigre aux = local.venderTigre();
        if(aux != null){
            tigres.add(aux);
        }
    }
    

    public void venderViboras(){
        Vibora aux = local.venderVibora();
        if(aux != null){
            viboras.add(aux);
        }
    }
}
