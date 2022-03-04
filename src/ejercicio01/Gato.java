package ejercicio01;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.nombre = nombre;
        this.alimento= alimento;
        this.edad = edad;
        this.raza = raza;
        
    }

    
}
