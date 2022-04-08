package concurso;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean Primo;
        int[] primes = new int[500];
        int mayor = 0, menor = 0;
        System.out.println("Ingrese el número menor del rango");
        int n = sc.nextInt();
        int c = 0;
        System.out.println("Ingrese el número mayor del rango");
        int nu = sc.nextInt();
        int count = 0;
        int i = 0, x = 0, z = 0;
        for (i = n; i <= nu; i++) {
            count++;
            Primo = true;
            for (x = 2; x <= Math.sqrt(i) && Primo; x++) {
                if (i % x == 0) {
                    Primo = false;
                    c++;
                }
            }
            if (Primo) {
                primes[z] = i;
                mayor = (i);
                if (mayor < (i)) {
                    mayor = (i);
                } else if ((i) < menor) {
                    menor = (i);
                }
                z++;

            }
        }
        if (mayor >= n && mayor <= nu) {
            System.out.println("El número primo mayor es: " + mayor);
            System.out.println("El número primo menor es: " + primes[0]);
        }

        if (c == count) {
            System.out.println("No hay primos en este rango");
        }

    }
}

/*
Desarrolle un programa que arroje el número primo más grande y el número primo más chico de un rango
dado.
Nota: En caso de no haber un número primo en tal rango arroje el mensaje: “No hay números primos en
ese rango”.
*/
