package modelo;

import servicio.SolicitarMoneda;

import java.util.Scanner;

public class IntercambioDeMoneda {
    public static void convertir(String monedaBase, String monedaFin, SolicitarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadIntercambiada;

        Moneda moneda = consulta.investigarMoneda(monedaBase, monedaFin);
        System.out.println("Tasa de conversion actual\n1 " + monedaBase + " = " + moneda.conversion_rate() + " " + monedaFin);
        System.out.println("Digite la cantidad a convertir " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadIntercambiada = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadIntercambiada + " " + moneda.target_code());
    }
}
