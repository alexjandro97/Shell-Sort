/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellshort;

/**
 *
 * @author alexj
 */
public class ShellShort {

    static int numeros[] = {10, 7, 21, 52, 32, 4, 40, 60, 1, 22, 98, 150, 1, 0, 92, 55, 78, 93, 231};
    static int salto, auxiliar, i;
    static boolean cambios;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ordenarNumeros(numeros);
        imprimirArray(numeros);
    }    
     public static void ordenarNumeros(int[] numeros) {        
        for (salto = numeros.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < numeros.length; i++){ // se da una vuelta                
                    if (numeros[i - salto] > numeros[i]) { // y si están desordenados
                        auxiliar = numeros[i];              // se ordenan
                        numeros[i] = numeros[i - salto];
                        numeros[i - salto] = auxiliar;
                        cambios = true; // y cambiio == true
                    }
                }
            }
        }
    }
     
     public static void imprimirArray(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " - ");
        }
     }
}
