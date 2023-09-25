//debe de tener una clase
//public class / class es lo mismo

//variable int num por defecto es publico public int num 
//Libreria 
import java.io.*;

class EntradaDeTexto{

    //debe de existir un metodo principal

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[]args) throws IOException{

        //debemos de crear una estructura basica
        //declaracion
        String nombre;
        //mensaje para el usuario
        System.out.println("Por favor ingresa tu nommbre ");
        //ln es para salto de linea 

        //asignar que operacion o comportamiento le voy a otorgar a la variable 
        //nombre = System.console().read();
        nombre = System.console().readLine();

        //System es la clase del sistema
        //console() es el metodo que puede obtener datos de la consola 
        //readLine() es el metodo que puede dar lectura a los datos introducidos
        //en la consola 
        System.out.println("Hola "+ nombre + " Bienvenido a tronar wiii");
    }


}