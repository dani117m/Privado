/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica100619;
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author dani117m
 */
public class RegistroF {

    /**
     * @param args the command line arguments
     */
    public static void leerRegistro() {
        // Aquie se leera todo los datos de los jugadores
        
        //Se abrira el archivo txt
        try
        {   // se utliza el escaner para leer el archivo txt  
            // en new file se pone la direcion del mismo
            Scanner entrada = new Scanner (new File("data/tabula-FWC_2018_Squadlists_4.txt")); 

            //abrimos un ciclo while 
            while (entrada.hasNext()) {
                
                String separador = entrada.nextLine();
                // se utliza una arraylist
                ArrayList<String> separador_lineas = new ArrayList<>(
                    Arrays.asList(separador.split("\\|")));// se utilizara el separador |
                     // contador
                    
                    System.out.printf("%s\n", separador_lineas.get(0));
                    System.out.printf("%s\n", separador_lineas.get(1));
                    System.out.printf("%s\n", separador_lineas.get(2));
                    System.out.printf("%s\n", separador_lineas.get(3));
                    System.out.printf("%s\n", separador_lineas.get(4));
                    System.out.printf("%s\n", separador_lineas.get(5));
                    System.out.printf("%s\n", separador_lineas.get(6));
                    System.out.printf("%s\n", separador_lineas.get(7));
                    System.out.printf("%s\n", separador_lineas.get(8));
                    System.out.printf("%s\n", separador_lineas.get(9));
                    System.out.printf("%s\n", separador_lineas.get(10));
                    System.out.printf("%s\n", separador_lineas.get(11));
                    System.out.println("");
      
            }//fin while
            
            entrada.close();
        }// fin del try
        catch (Exception e) {
            System.err.println("Error al leer del archivo. ");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerregistro
    
} // fin de la clase
