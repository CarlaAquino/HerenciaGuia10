package ejercicio04;

import static java.lang.Math.PI;
import java.util.Locale;
import java.util.Scanner;

public class Circulo implements CalculoFormas {

    Scanner entrada;
    double radio;

    public Circulo() {
        
    }

    public Circulo(Scanner entrada, double radio) {
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        this.radio = radio;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void ingresarCirculo(){
        System.out.println("Ingrese el radio: ");
        radio = entrada.nextDouble();
        area();
        perimetro();
    }
    

    @Override
    public void area() {
        System.out.printf("El area del circulo es %.2f \n:", PI *Math.pow(radio, 2));
    }

    @Override
    public void perimetro() {
        System.out.printf("El primetro del circulo es %.2f \n",(2*PI*radio));
    }
     
}
