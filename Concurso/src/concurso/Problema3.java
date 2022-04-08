package concurso;

import java.util.Arrays;
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, fibo1, fibo2, count2 = 0, x = 0, z = 0, c = 0, a = 0;
        boolean Primo;
        int[] primes = new int[999];

        System.out.println("numero menor ");
        int nu = sc.nextInt();
        System.out.println("numero mayor ");
        int nd = sc.nextInt();
        numero = nd - nu;
        int array[] = new int[numero + 1];
        int count = 0;
        System.out.println("Ingresa el número menor ");

        fibo1 = 0;
        fibo2 = 1;

        //System.out.print(fibo1 + " ");
        for (int i = 2; i <= nd; i++) {
            //System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
            if (i >= nu && i <= nd) {
                array[count] = fibo2;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            count2++;
            Primo = true;
            int i2 = array[i];
            for (x = 2; x <= Math.sqrt(i2) && Primo; x++) {
                if (i2 % x == 0) {
                    Primo = false;
                    c++;
                }
            }
            if (Primo) {

                a += i2;
                z++;
            }
        }

        System.out.println(a);
        if (c == count) {
            System.out.println("No hay primos en este rango");
        }
        System.out.println();
    }
}

/*
Cada nuevo término en la secuencia de Fibonacci se genera sumando los dos términos anteriores. Al
comenzar con 1 y 2, los primeros 10 términos serán:
0, 1, 1 ,2, 3, 5, 8, 13, 21, 34, 55, 89, ..
0, 1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
Al considerar los términos en la secuencia de Fibonacci cuyos valores no exceden de un rango dado,
encuentre la suma de los términos primos.
Nota: Considere al número 1 como número primo.
 */
