/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaDos;

/**
 *
 * @author marce
 */
public class PracticaOperacion {
    //
        public static double obtenerPromedioNotas(double nota1, double nota2,
            double nota3) {
        // Se declara e inicializa la variable n
        double prom = 0;
        // Operacion para calcular la suma
        prom = (nota1 + nota2 + nota3)/3;
        // Se devuelve el valor guardado en la variable n
        return prom;
    }

    public static String obtenerDireccionEnMayusculas(String Dir) {
        // Se declara e inicializa la variable DirMayus
        String DirMayus = Dir.toUpperCase();
        // Se devuelve el valor guardado en la variable DirMayus
        return DirMayus;
    }

    public static String obtenerPromocion(double prom) {
        // Se declara e inicializa la variable n
        String Promo = "";
        if (prom >= 15){
            Promo = "Si";
        } else {
            Promo = "No";
        }
        return Promo;
    }
    
}
