package ejercicio02;




public class principal {

    public static void main(String[] args) {
       Electrodomestico electrodomesticos=new Electrodomestico();
       Lavadora lavadora = new Lavadora();
       Televisor televisor = new Televisor();
       
        System.out.println("Seleccione una opcion:"
                         + "1.ingrese electrodomestico----------"
                         + "2.color-----------------------------"
                         + "3.precio final----------------------"
                         + "4.salir-----------------------------");
       int opcion = 0;
       do{
         switch(opcion){
             case 1:
                electrodomesticos.crearElectrodomestico();
                 break;
             case 2:
                 electrodomesticos.getColor();
                 break;
             case 3:
                electrodomesticos.precioFinal();
                 break;
             case 4:
                 System.out.println("salir");
         }
            
       }while(opcion!=4);
       
    } 
}
