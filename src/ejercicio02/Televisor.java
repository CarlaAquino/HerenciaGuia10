/*Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
*/
package ejercicio02;


public class Televisor extends Electrodomestico {
  protected int pulgadas;
protected boolean  sintonizadorTdt;

    public Televisor(int pulgadas, boolean sintonizadorTdt) {
        this.pulgadas = pulgadas;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Televisor(int pulgadas, boolean sintonizadorTdt, int precio, String color, char consumoEnergetico, int peso, int precioBase) {
        super(precio, color, consumoEnergetico, peso, precioBase);
        this.pulgadas = pulgadas;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    Televisor() {
    }

   public void crearTelevisor(){
     super.crearElectrodomestico();
       System.out.println("Ingrese pulgadas del televisor:");
       this.pulgadas = entrada.nextInt();
       System.out.println("Ingrese si tiene sincronizador tdt:");
       this.sintonizadorTdt = entrada.nextBoolean();
       precioFinal();
   }
   
  @Override
   public double precioFinal(){
      double precio= super.precioFinal();
      if(pulgadas>40){
          precio+=precioBase*0.3;
      }
      if(sintonizadorTdt){
          precio+=500;
      }
      return precio;
   }
   
   

}
