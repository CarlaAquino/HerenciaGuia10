package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo implements CalculoFormas{

Scanner entrada;
double altura;
double base;

    public Rectangulo() {
    }

    public Rectangulo(Scanner entrada, double altura, double base) {
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
;
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void ingresarRectangulo(){
        System.out.println("Ingrese base del rectangulo: ");
        this.base = entrada.nextDouble();
        System.out.println("Ingrese altura del rectangulo: ");
        this.altura = entrada.nextDouble();
        area();
        perimetro();  
    }

    @Override
    public void area() {
        System.out.printf("El area del rectangulo es %.2f \n :",altura*base);
    }

    @Override
    public void perimetro() {
        System.out.printf("El perimetro del rectangulo es  %.2f \n: ",(altura+base)*2);
    } 
}
