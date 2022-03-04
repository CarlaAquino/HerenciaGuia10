/*Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {

    protected int precio;
    protected String color;
    protected final static String colorDiferente = "blanco";
    protected char consumoEnergetico;
    protected final static char consumoDiferente = 'F';
    protected int precioBase;
    protected int peso;
    protected Scanner entrada;

    public Electrodomestico() {
        this.entrada=new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso,int precioBase) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.precioBase = precioBase;
    }

    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    

    public void comprobarConsumoEnergetico(char consumoEnergetico) {
       if(consumoEnergetico>=600 && consumoEnergetico<=800) {
           this.consumoEnergetico=consumoEnergetico;
       }else{
           this.consumoEnergetico=consumoDiferente;
       }
    }

    public void comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "azul", "gris"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equals(color)) {
                encontrado = true;
            }

        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = colorDiferente;

        }
    }

    public void crearElectrodomestico() {
        System.out.println("Ingrese electrodomestico");
        String electrodomestico =entrada.next();
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        precioBase = 1000;
    }

    public double precioFinal() {
        double precio=0;
        switch(consumoEnergetico){
            case 'A':
               precio+=1000;
               break;
            case 'B' :
               precio+=800;
               break;
            case 'C' :
                precio+=600;
                break;
            case 'D' :
                precio+=500;
                break;
            case 'E' :
                precio+=300;
                break;
            case 'F' :
                precio+=100;
                break;
            default:
                System.out.println("Ingrese opcion orrecta: ");   
        }
        if(peso>=1&& peso<=19){
            precio+=100;
        }else if(peso>=20 && peso<=49){
            precio+=500;
        }else if(peso>=50 && peso<=79){
            precio+=800;
        }else if(peso>80){
            precio+=1000;
        }
      return precioBase+precio;           
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", precioBase=" + precioBase + '}';
    }
    
    
}
