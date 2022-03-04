/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente
 
 */
package ejercicio01;

public class Herencia_guia10 {

    public static void main(String[] args) {

        Animal perro = new Perro("Odie", "Alimento balanceado", 2, "Labrador");
        perro.alimentarse();
        System.out.println(perro);
        
        Perro perro1 = new Perro("Duke", "Coquetas", 8, "San Bernardo");
        perro1.alimentarse();
        System.out.println(perro1);
        
        Animal gato = new Gato("Mashi", "Galletas", 3, "Persa");
        gato.alimentarse();
        System.out.println(gato);

        Animal caballo = new Caballo("Potro", "Alfalfa", 5, "Frison");
        caballo.alimentarse();
        System.out.println(caballo);
    }

}
