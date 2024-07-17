import servicio.SolicitarMoneda;
import modelo.IntercambioDeMoneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        SolicitarMoneda consulta = new SolicitarMoneda();
        int opcion = 0;
        while (opcion != 7){
            System.out.println("""
                    Este es un conversor de moneda 
                    *******************************
                    Escoge del siguiente menu la opcion que desees
                    1. Dolar a Peso Argentino
                    2. Peso Argentino a Dolar
                    3. Dolar a Real Brasileño
                    4. Real Brasilero a Dolar
                    5. Dolar a Peso Colombiano
                    6. Peso Colombiano a Dolar
                    7. Salir
                    Digite la opcion: 
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch(opcion){
                case 1:
                    IntercambioDeMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    IntercambioDeMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    IntercambioDeMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    IntercambioDeMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    IntercambioDeMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    IntercambioDeMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Simulacion finalizada...");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }

        }
    }
}