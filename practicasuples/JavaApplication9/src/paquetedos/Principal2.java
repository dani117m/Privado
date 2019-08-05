/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Principal2 {

    public static void main(String[] args) {
     
        //iNICIALIZACION DE VARIABLES
        int partidos;
        double sueldo;
        String jugador;
        int goles;
        String nombreEquipo;
        int contador = 1;
        boolean opcion = true;
        double sueldoTotal = 0;
        double bono = 0;
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        String contrato;

        System.out.println("INGRESE EL NOMBRE DEL EQUIPO");
        nombreEquipo = entrada.nextLine();
        //Ingreso de datos usando una opcion en booleano
        while (opcion) {
            System.out.print("Ingrese el Nombre dle Jugador: ");
            jugador = entrada.nextLine();
            System.out.print("Ingrese el número de partidos jugados de," + 
                    jugador + ": ");
            partidos = entrada.nextInt();
            
            System.out.print("Ingrese el número de goles marcados por ," + 
                    jugador + ": ");
            goles = entrada.nextInt();
            
            System.out.println("Ingrese el valor del sueldo de, " + jugador
                    + ": ");
            sueldo = entrada.nextDouble();
            
            //Mensaje bos permite almacenar lso datos de cadajugador
            mensaje = String.format("\n%s%s\t %d \t %d \t %.0f", mensaje, 
                    jugador, partidos, goles, sueldo);
            
            //Limpieza de la entrada
            entrada.nextLine();
            System.out.println("Desea seguir ingresando datos si / no ?");
            String temporal = entrada.nextLine();

            //Llamada a los metodos de la claseLogica
            bono = ClaseLogica.obtenerBono(sueldo, goles);
            sueldoTotal = ClaseLogica.obtenerTotalSueldo(sueldo, bono);
            contrato = ClaseLogica.obtenerTipo(goles);

            //Nos permitira salir del bucle 
            if (temporal.equals("si")) {
                opcion = true;
                //permite contar el numero de jugadores
                contador = contador +1;
            } else {
                opcion = false;
            }
            //slida dedatos para el reporte
            mensaje = String.format("%s\t %.0f\t %.0f\t\t%s\n", mensaje,
                    bono, sueldoTotal, contrato);
        }
        System.out.printf("%sJugadores del club \nNombre\tPartidos Goles\t "
                + "Sueldo\t Bono\ttotal\t\tTipo%s\nNumero de Jugadores del "
                + "equipo: %d\n",nombreEquipo, mensaje, contador);
    }
}
