/*
 * 12. Desarrollar un programa que permita ingresar la antigüedad los autos de una
 * concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada auto ingresado
 * mostrar por pantalla un mensaje adecuado con el siguiente criterio:
 * - si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”
 * - si tiene entre 6 y 10 mostrar “POCO USO”,
 * - si tiene entre 11 y 20 “MUCHO USO”
 * - ysi tiene más de 20 “MUY ANTIGUO”.
 * Luego de finalizada la carga calcular y mostrar los siguientes resultados:
 * • Cantidad total de autos.
 * • Cantidad de autos con poco uso.
 * • Promedio de antigüedad de los autos que no sean muy antiguos.
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // STDIN
        System.out.println("Ingrese la antiguedad del vehículo...");
        Scanner input = new Scanner(System.in);
        Integer antiguedad = input.nextInt();

        Integer cantidadAutosIngresados = 0;
        Integer cantidadAutosPocoUso = 0;
        Integer cantidadAutosNoAntiguos = 0;
        Integer sumaAniosNoAntiguos = 0;


        if (antiguedad <= 20) {
            sumaAniosNoAntiguos += antiguedad;
            cantidadAutosNoAntiguos += 1;
        }

        while (antiguedad != 0) {
            cantidadAutosIngresados += 1;

            if (antiguedad >= 1 && antiguedad <= 5) {
                System.out.println("NUEVO");
            }
            if (antiguedad >= 6 && antiguedad <= 10) {
                cantidadAutosPocoUso += 1;
                System.out.println("POCO USO");
            }
            if (antiguedad >= 11 && antiguedad <= 20) {
                System.out.println("MUCHO USO");
            }
            if (antiguedad > 20) {
                System.out.println("ANTIGUO");
            }
            System.out.println("Ingrese la antiguedad de otro vehiculo...");
            antiguedad = input.nextInt();
        }
        Double promedioNoAntiguos = (double) (sumaAniosNoAntiguos/cantidadAutosNoAntiguos);

        // STOUT
        System.out.println("Cantidad TOTAL DE AUTOS: " + cantidadAutosIngresados);
        System.out.println("Cantidad de AUTOS POCO USO: " + cantidadAutosPocoUso);
        System.out.println("Promedio de antigüedad AUTOS NO MUY ANTIGUOS: " + cantidadAutosIngresados);
    }
}