/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaTres;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import practicaDos.PracticaOperacion;

/**
 *
 * @author marce
 */
public class LeerArchivo {
    
    public static void leerRegistros() {
        try {// lee registros del archivo, usando el objeto Scanner
            // Se lee el documento con los datos
            Scanner entrada = new Scanner(new File("data/ciudades.txt"));
            Scanner entrada2 = new Scanner(new File("data/nombres.txt"));
            Scanner entrada3 = new Scanner(new File("data/notas.txt"));
            String valores = "";
            String promocion = "";
            // Lectura del fichero
            while (entrada.hasNext()) {
                valores = "";
                // Obtienes la linea del documento
                String Dir = entrada.nextLine();
                String nombre = entrada2.nextLine();
                String linea = entrada3.nextLine();
                // Obtiene cada elemento de la linea
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                // Se obtienen los valores de las notas 
                int nota1 = Integer.parseInt(linea_partes.get(0));
                int nota2 = Integer.parseInt(linea_partes.get(1));
                int nota3 = Integer.parseInt(linea_partes.get(2));
                // Se invoca el metodo para hacer mayuscula la direccion
                String DirMayus = PracticaOperacion.obtenerDireccionEnMayusculas(Dir);
                // Se invoca el metodo para calcular el promedio
                double promedio = PracticaOperacion.obtenerPromedioNotas(nota1,
                        nota2, nota3);
                // Se invoca el metodo para determinar el estado de la promocion
                promocion = PracticaOperacion.obtenerPromocion(promedio);
                // Se almacenan los datos de cada estudiante
                
                /*
                valores = String.format("%sBoleta de Calificaciones de \n"
                        + "%s\nNotas:%s%s%sPromedio: %s\n"
                        + "Promoción: %s\nDireccion: %s\n", valores,
                        nombre, nota1, nota2, nota3, promedio,
                        promocion, DirMayus);
                */ 
                valores = String.format("%sBoleta de Calificaciones de \n%s\n"
                        + "Notas: %s %s %s\nPromedio: %s\nPromocion: %s\n"
                        + "Direccion: %s\n", valores, nombre, nota1, nota2,
                        nota3, promedio, promocion, DirMayus);
                // Se envian los datos y se ejecuta el metodo agregarRegistros
                EscribirArchivo.agregarRegistros(nombre, valores);
                // Se eliminan los datos dentro de la cadena
                
            } // fin de while
            entrada.close();
        } // fin de try
        // Captura cualquier excepcion durante la lectura del archivo
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }
    
}
