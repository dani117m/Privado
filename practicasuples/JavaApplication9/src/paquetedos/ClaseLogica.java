/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

/**
 *
 * @author marce
 */
public class ClaseLogica {
/*
  Metodo que nos permita obterner el bono dle jugador mediante la 
    multiplicacion de goles por el sueldo 
    **/
    public static double obtenerBono(double valor1, double valor2) {

        double sueldoTotal = valor1 * valor2;
        return sueldoTotal;
    }
//Metodo que nos permite obtener el valor del sueldo total del juagdor sumando
    public static double obtenerTotalSueldo(double valor2, double valor3) {
        double totalSueldo = valor2 + valor3;
        return totalSueldo;

    }
//Analisis del contrato segun la cantidad de goles
    public static String obtenerTipo(int valor) {
        String tipo = "";
        if (valor >= 7) {
            tipo = "Renovado";
            return tipo;
        } else {
            
        }if (valor >= 3 || valor <= 6) {
                tipo = "Pendiente";
                return tipo;
            } else {
            
            }if (valor < 3) {
                tipo = "No Renovado";
            }
            return tipo;
        }
}
