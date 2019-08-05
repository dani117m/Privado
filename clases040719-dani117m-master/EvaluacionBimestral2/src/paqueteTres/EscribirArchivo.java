/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteTres;

import java.util.Formatter;

/**
 *
 * @author marce
 */
public class EscribirArchivo {
   
    public static void agregarRegistros(String Archivo, String valores) {
        try {
            // Se envia la direccion donde se creara el archivo 
            String nombre = String.format("archivos-salidas/%s.txt", Archivo);
            Formatter salida = new Formatter(nombre);
            // Se agregan valores dentro del archivo
            salida.format("%s\n", valores);
            salida.close();
            // Captura cualquier error que se presente al crear el archivo
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    } // fin método agregarRegistros

} // fin de la clase CrearArchivoTexto

