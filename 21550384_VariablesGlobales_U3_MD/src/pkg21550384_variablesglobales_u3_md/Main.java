package pkg21550384_variablesglobales_u3_md;

import java.util.Scanner;

/* 
   0.- Paquetes
   1.- Clase -> Variables de instancia o estáticas
   2.- Métodos
   3.- Variables
 */
public class Main {

    // Variables Globales
    // Variables de Instancia - Dependen de una instancia (objeto) clase -> objeto -> variables instanciadas
    // Variables estáticas - Son variables que se crean cuando se entra a la clas, Pueden ser llamadas en cualquier parte del código sin la necesidad de tener una instancia (objeto)
    // Contexto Static
    // Requerimos que TODO sea declarado como static 
    // Métodos
    // Clases
    // Variables
    // Variable Global
    static double dResultado;
    
    // Métodos
    public static void operacion(double dVar) {
        dResultado = (dVar / 29) * 100;
    }

    public static void main(String[] args) {
        // Clases con Mayúscula
        // Importamos el Scanner
        Scanner sNúmero = new Scanner(System.in);
        System.out.println("Escribe los reactivos correctos de tu trabajo: ");
        String sNúmeroEscrito = sNúmero.nextLine();
        double dReactivosCorrectos = Double.parseDouble(sNúmeroEscrito);
        operacion(dReactivosCorrectos);
        // String - No realiza cálculos matemáticos, solo son palabras.
        // int - Nos permite realizar operaciones siempre y cuando sea con números enteros
        // Convertir ese String en double
        System.out.println("Tu calificación es: " + dResultado);

    }

}
