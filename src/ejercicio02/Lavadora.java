/*A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados
*/
package ejercicio02;


public class Lavadora extends Electrodomestico{
    protected int carga;

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, int peso, int precioBase) {
        super(precio, color, consumoEnergetico, peso, precioBase);
        this.carga = carga;
    }

    Lavadora() {
    }

    
    public void crearLavadora(){
      super.crearElectrodomestico();
        System.out.println("Ingrese carga de la lavadora: ");
        this.carga = entrada.nextInt();
        precioFinal();
    }
    @Override
    public double precioFinal(){
        double precio= super.precioFinal();
        if(carga>30){
            precio+=500;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + "carga=" + carga + '}';
    }
    
    
}
