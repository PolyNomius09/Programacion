/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author Rafa
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroBoleta;
    private String fechaNacimiento;
    private String carrera;
    private String grupo;
    private String correoElectronico;

    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroBoleta, String fechaNacimiento, String carrera, String grupo, String correoElectronico) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numeroBoleta = numeroBoleta;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
        this.grupo = grupo;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNumeroBoleta() {
        return numeroBoleta;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}

class Profesor {
    private String nombreCompleto;
    private String numeroEmpleado;

    public Profesor(String nombreCompleto, String numeroEmpleado) {
        this.nombreCompleto = nombreCompleto;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }
}

class Lista {
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;

    public Lista(Profesor profesor, ArrayList<Alumno> alumnos) {
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}

public class Programa2 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();

        // Solicitar los datos del profesor
        System.out.print("Ingrese el nombre completo del profesor: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingrese el número de empleado del profesor: ");
        String numeroEmpleado = scanner.nextLine();

        // Crear el objeto Profesor
        Profesor profesor = new Profesor(nombreCompleto, numeroEmpleado);

        // Crear la lista de alumnos
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.print("Ingrese el número de alumnos a registrar: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese los datos del alumno #%d:\n", (i+1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido paterno: ");
            String apellidoPaterno = scanner.nextLine();

            System.out.print("Apellido materno: ");
            String apellidoMaterno = scanner.nextLine();

            System.out.print("Número de boleta: ");
            String numeroBoleta = scanner.nextLine();

            System.out.print("Fecha de nacimiento: ");
            String fechaNacimiento = scanner.nextLine();
            
            System.out.print("Ingrese la carrera del alumno: ");
            String carrera = scanner.nextLine();
        
            System.out.print("Ingrese el grupo del alumno: ");
            String grupo = scanner.nextLine();
        
            System.out.print("Ingrese el correo electrónico del alumno: ");
            String correoElectronico = scanner.nextLine();
        
        // Crear objeto Alumno y agregarlo a la lista
            Alumno alumno = new Alumno(nombre, apellidoPaterno, apellidoMaterno, numeroBoleta, fechaNacimiento, carrera, grupo, correoElectronico);
            listaAlumnos.add(alumno);
        
        // Preguntar si se desea registrar otro alumno
            System.out.print("¿Desea registrar otro alumno? (S/N): ");
            String respuesta = scanner.nextLine();
        
            if (respuesta.equalsIgnoreCase("N")) {
            break;
            }
        }
    
    // Mostrar lista de alumnos inscritos
        System.out.println("\n================================");
        System.out.println("Lista de Alumnos Inscritos");
        System.out.println("================================");

    
        for (int i = 0; i < listaAlumnos.size(); i++) {
            Alumno alumno = listaAlumnos.get(i);
            System.out.printf("%d. %s %s, %s - %s - %s - %s\n", i+1, alumno.getApellidoPaterno(), alumno.getApellidoMaterno(), alumno.getNombre(), alumno.getNumeroBoleta(), alumno.getCarrera(), alumno.getGrupo(), alumno.getCorreoElectronico());
        }
    
        System.out.printf("\nTotal de alumnos inscritos: %d", listaAlumnos.size());
    }
}