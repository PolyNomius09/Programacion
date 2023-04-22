/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6pt2;

/**
 *
 * @author rafyt
 */

//Clase Hija Exotica
class Exotica extends Mascota {
    protected int factorPeligro;

    public Exotica(String n, int e, String d, String t) {
        super(n, e, d, t);
    }

    public int getFactorPeligro() {
        return factorPeligro;
    }

    public void setFactorPeligro(int f) {
        factorPeligro = f;
    }

    public String toString() {
        return super.toString() + ", Factor de Peligro: " + factorPeligro;
    }
}

//Clase hija Vibora
class Vibora extends Exotica {
    public Vibora(String n, int e, String d) {
        super(n, e, d, "Vibora");
    }

    public String hablar() {
        return "Ssssss!";
    }
}

//Clase hija Tigre
class Tigre extends Exotica {
    public Tigre(String n, int e, String d) {
        super(n, e, d, "Tigre");
    }

    public String hablar() {
        return "Grrrrrr!";
    }
}

//Clase hija Dinosaurio
class Dinosaurio extends Exotica {
    private String tipoDinosaurio;

    public Dinosaurio(String n, int e, String d, String t) {
        super(n, e, d, "Dinosaurio");
        tipoDinosaurio = t;
    }

    public String toString() {
        return super.toString() + ", Tipo de Dinosaurio: " + tipoDinosaurio;
    }
}

//Clase hija HIJA Brontosaurio
class Brontosaurio extends Dinosaurio {
    public Brontosaurio(String n, int e, String d) {
        super(n, e, d, "Brontosaurio");
    }
    
    public String habla() {
        return "¡BRRRRRRRRRRRRRRRRRRRR!";
    }
}

//Clase hija HIJA Raptor
class Raptor extends Dinosaurio {
    public Raptor(String n, int e, String d) {
        super(n, e, d, "Raptor");
    }
    
    public String habla() {
        return "¡GRRRRRRRRRRRRRRRRRRRRRR!";
    }
}

//Clase hija HIJA TRex
class TRex extends Dinosaurio {
    public TRex(String n, int e, String d) {
        super(n, e, d, "TRex");
    }

    public String habla() {
        return "¡ROOOOOOOOOOOOOOOOAR!";
    }
}
