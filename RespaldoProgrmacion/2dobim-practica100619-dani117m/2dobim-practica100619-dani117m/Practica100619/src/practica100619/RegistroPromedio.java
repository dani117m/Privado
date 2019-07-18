package practica100619;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class RegistroPromedio {

    // lee registro del archivo
    public static void leerPromedio() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/tabula-FWC_2018_"
                    + "Squadlists_4.txt"));
            double suma = 0;
            double pro = 0;
            int cont = 0;
            
            while (entrada.hasNext()) {
                

                String linea = entrada.nextLine();
                // System.out.println(linea);
                // aquie empeza el arrary para la lacturata de el documento
               
                ArrayList<String> linea_partes = new ArrayList<>(// 
                        Arrays.asList(linea.split("\\|")));// un array lis de cadena

                //System.out.println(linea_partes.get(i));// aui se muestra los archivos

                double dato = Double.parseDouble(linea_partes.get(11));
                // suma de los sueldos
                suma = suma + dato;
                // promedio de los sueldos
                double dato2 = Double.parseDouble(linea_partes.get(9));
                pro = pro + dato2;
                // nota para que el txt se actulice se debe cerrar para su refresco 
                
                cont = cont + 1;
            } // fin de while
            entrada.close();
            double pro1 = suma / cont; // promedio goles
            double pro2 = pro / cont; // promedio height
            System.out.printf("Promedio de Goals: %.2f\nPromedio de Height:"
                    + " %.2f\n", pro1, pro2);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo. ");
            System.exit(1);
        } // fin de catch
    } // fin del motodo leerRegistros
    // cierra el archivo y termina la aplicaci�n

} // fin de la clase LeerArchivoTexto
