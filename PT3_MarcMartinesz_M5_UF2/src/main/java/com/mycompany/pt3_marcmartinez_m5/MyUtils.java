/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt3_marcmartinez_m5;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author marcm
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        if (cadena == null) {
            return null;
        } else {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultat += cadena.charAt(i);
            }
        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        LocalDate fechaNacimiento = null;
        try {
            fechaNacimiento = LocalDate.of(year, month, day);
        } catch (Exception e) {
            return -2;
        }
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
        if (edad > 150) {
            return -1;
        }
        return edad;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {
        double resultat = 1;
        if (numero == 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            for (int i = 1; i <= numero; i++) {
                resultat *= i;
            }
            return resultat;
        }
    }
}
