package examenfinalparte2;

import java.util.Scanner;

/**
 *
 * @author ylagorebollar
 */
public class Principal {

    public static boolean numPrimo = false;

    public static void main(String arg[]) {
        
        int numDigitos = 2;
        int nDigitos = 0;
        
        if (numDigitos <= 0) {
            introduceNumDigitos();
        }
        
        for (int comparaNum = 1; comparaNum <= 99999; comparaNum++) {
            int contador = contadorNumeros(comparaNum);
            nDigitos = contador;

            if (nDigitos == numDigitos) {
                if (comparaNum < 4) {
                    numPrimo = true;
                } else {
                    if (comparaNum % 2 == 0) {
                        numPrimo = false;
                    } else {
                        int contador2 = 0;
                        int i = 1;
                        int k = (comparaNum - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        contador2 = divisiones(i, k, comparaNum, contador2);

                        if (contador2 == 1) {
                            numPrimo = true;
                        }
                    }
                }
                
                if (numPrimo == true) {
                    System.out.println(comparaNum);
                }
            }
        }
    }
    /**
     * Pide que se introduzca por teclado un numero mayor de 0
     * @return Retorna dicho numero
     */
    public static int introduceNumDigitos() {
        int digitos;
        Scanner introduce=new Scanner(System.in);
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        return digitos=introduce.nextInt();
    }  
    
    /**
     * Compara numeros para despues comprobar si es primo
     * @param comparaNum Recibe el numero a comparar
     * @return numero comprado
     */
    public static int contadorNumeros(int comparaNum) {
        int aux = comparaNum;
        int contador = 0;
        while (aux != 0) {
            aux = aux / 10;
            contador++;
        }
        return contador;
    }
    /**
     * Calculo de numeros primos
     * @param i1
     * @param k
     * @param comparaNum
     * @param contador1
     * @return Devuelve el resutado de las operaciones hechas para el calculo de numeros primos
     */
    public static int divisiones(int i1, int k, int comparaNum, int contador1) {
        while (i1 <= k) {
            if (comparaNum % i1 == 0) {
                contador1++;
            }
            i1 += 2;
            if (contador1 == 2) {
                i1 = k + 1;
            }
        }
        return contador1;
    }

    

    

}
