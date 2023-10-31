package Palindromo;

import java.util.Scanner;


public class Palindromo {

    public static boolean esPalindromo(String palabra){
        // La ruta nos aporto otro paso natural
        // larutanosaportootropasonatural

        palabra = palabra.toLowerCase(); // la ruta nos aporto otro paso natural
        palabra = palabra.replace(" ", ""); // larutanosaportootropasonatural
        palabra = palabra.replace("á", "a");
        palabra = palabra.replace("é", "e");
        palabra = palabra.replace("í", "i");
        palabra = palabra.replace("ó", "o");// larutanosaportootropasonatural
        palabra = palabra.replace("ú", "u");

        // larutanosaportootropasonatural

        int a = 0;
        int b = palabra.length() -1;

        for(int i=0; i<palabra.length(); i++) {
            if((palabra.charAt(a)) == palabra.charAt(b)){
                a++;
                b--;
            }
            else
                 return false;
        }
        return true;
        
    }

    public static void main(String[] args) {
    /*Comprobar si una palabra o una frase es palindroma
     * Ejemplo
     * -> Reconocer 
     * -> Anna
     * -> Ojo rojo
     * -> La ruta nos aporto otro paso natural
     * 
     *  Tener en cuenta que no se tienen en cuenta ni los espacio ni las mayusculas ni las tildes
     */

     Scanner lector = new Scanner(System.in);

     String palabra;

     System.out.println("Ingrese una palabra o frase: ");
     palabra = lector.nextLine();

     if(esPalindromo(palabra))
       System.out.println("Es palindromo");
    else
       System.out.println("No es palindromo");

    }
}