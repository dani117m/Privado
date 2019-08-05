/*
 * To change this license header, choose License Headers in Project Properties.
 * To chsumaTotalLVange this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Principal3 {

    public static void main(String[] args) {
        /*
         Una empresa de ventas de libros para secundaria, tiene 4 sucursales en 
         el Ecuador. Para cada sucursal se ingresa la cantidad de libros vendidos 
         y la cantidad de libros devueltos por fallas en el contenido; para cada día de la semana.
         La información por cada sucursal sería ingresada así
         */
        // Inicializacion de variables
        int contador1 = 1;
        int cont_Dias = 1;
        int lib_Vend = 0;
        int lib_Dev = 0;
        int suma_Lib_V = 0;
        int suma_Lib_D = 0;
        int sucursal = 2;
        int fallas = 0;
        int total= 0 ; 
        int totalfallas = 0;
        String nom_Sucursal = "";
        int num_Dias = 3;
        String mensaje = "";
        Scanner entrada = new Scanner(System.in);
        // generar las 4 sucursales
        while (contador1 <= sucursal) { // inicio while
            // se inicia el mensaje 
            mensaje = String.format("Sucursal %d \n", contador1);   
            System.out.printf(mensaje);
            // se reinician las variables 
            suma_Lib_D = 0;
            suma_Lib_V = 0;
            cont_Dias = 1;
            
            while (cont_Dias <= num_Dias) { // inicio while

                System.out.printf("Dia %d :", cont_Dias);
                // Ingreso de la cantidad de libros vendidos
                System.out.print(" Cantidad de libros vendidos: ");
                lib_Vend = entrada.nextInt();
                // se suman los libros vendidos en la misma pregunta
                suma_Lib_V = suma_Lib_V + lib_Vend;
                // se ingresen los libros devueltos
                System.out.print("\tCantidad de libros devueltos: ");
                lib_Dev = entrada.nextInt();
                // se suman los libros devueltos en la misma pregunta
                suma_Lib_D = suma_Lib_D + lib_Dev;
                // se encuentra las fallas dividiendo libros devueltos y vendidos 
                fallas = suma_Lib_V / suma_Lib_D;
                // los dias se aumenta con este contador
                cont_Dias = cont_Dias + 1;
      
            }// fin while 
            
            // se suman los totales de los libros vendisos 
            total = total + suma_Lib_D + suma_Lib_V ;
            // se suma el total de las fallas 
            totalfallas = totalfallas + fallas ;
            // el mensaje almacenara los datos de cada sucursal 
            nom_Sucursal = String.format("%s\nSucursal %d\t%d \t\t\t%d \t\t\t"
                    + "%d",nom_Sucursal ,contador1,  suma_Lib_V ,suma_Lib_D 
                    ,fallas );
            // esta ultima cadena la utilize para evitar fallas en la imprecion 
            mensaje = String.format("%s\nTotal = %d\nPorcentaje total de "
                    + "falla: %d", nom_Sucursal ,total ,totalfallas);
            // el contador para aumentar las sucursales del programa
            contador1 = contador1 + 1;
            
        } // fin while
        // finalmente se imprimen todos los datos 
        System.out.printf("\nSucursales \tLibros vendidos \tLibros"
                    + " Devueltos \tFallas %s\n", mensaje);


    }

}
