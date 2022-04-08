package concurso;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0;
        String unos = s.next();
        char[] a_ceros = unos.toCharArray();
        for (int i = 0; i < a_ceros.length; i++) {
            if (a_ceros[i] == '1') {
                c++;
            }
        }
        if (c % 2 == 0) {
            System.out.println("Paridad");
        } else {
            System.out.println("No paridad");
        }
    }
}
 
/*
Proporcione una serie de 1 y 0 y responda si la serie es tiene paridad, es decir, si la cantidad de 1s es par o
no paridad si la cantidad de 1s es impar.
Nota: Una serie de 0s sin ningún 1, por definición tiene paridad.
*/
