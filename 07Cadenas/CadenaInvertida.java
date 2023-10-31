import java.util.Scanner;

public class CadenaInvertida{

    //objetivo para la entrada de datos

    Scanner entrada = new Scanner(System.in);

    public void cadenaInvertidaPalabras(){

    String cadena = "";

    System.out.println("Ingresa la palabra que desea invertir");

    cadena = entrada.nextLine();

    //El Chiste es opder invertir la cadena ingresada por el usuario

    String invertida = "";

    //Con un ciclo for 
    for(int i = cadena.length()-1; i >= 0; i--){
        //obtengo los caracteres
        char car = cadena.charAt(i);
        //lo concateno 
        invertida += car;
    }
System.out.println("Cadena invertida es : "+ invertida);
}
}

