import java.util.Scanner;
import java.lang.Math;

public class Figura{
    //Variables
    double lado, altura, area, perimetro, base, lado2, lado3;
    int opcion;
    char letra;

    //entrada de datos
    Scanner entrada = new Scanner(System.in);

    //metodos
    public void menu(){
        //Vamos a hacer un programa para calcular area y perimetro de las figuras
        do{
            System.out.println("Bienvenidos al programa de cualculo de areas y perimetos");
            System.out.println("Elija una opcion deseada");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Rectangulo");
            System.out.println("3.- Triangulo");
            System.out.println("Salir");
            opcion = entrada.nextInt();

            switch(opcion){
            case 1:
            calcularCuadrado();
            break;

            case 2:
            calcularRectangulo();
            break;

            case 3:
            calcularTriangulo();
            break;

            case 4:
            System.out.println("Gracias por elegir este lindo programa");
            break;
            }
            System.out.println("Para repetir el programa dijite s");
        }while(letra == 's' || letra == 'S');
     
    }
    public void calcularCuadrado(){
        try{
         System.out.println("Ingresa el valor del lado del cuadrado");
         lado = entrada.nextDouble();
         perimetro = lado*4;
         area = lado*lado;
         System.out.println("El perimetro es de: " + perimetro + "El area es de: " + area);
        }  catch(Exception e){
            //manejar el error
            System.out.println("Ingresa solo nummeros");
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void calcularRectangulo(){
        try{
            System.out.println("Ingresa el valor de la base del rectangulo");
            base = entrada.nextDouble();
            System.out.println("Ingresa el valor de la altura del rectangulo");
            altura = entrada.nextDouble();
            perimetro = base*2 + altura*2;
            area = base*altura;
            System.out.println("El perimetro es de: " + perimetro + " El area es de: " + area);
        }catch(Exception e){
            //manejar el error
            System.out.println("Ingresa solo numeros");
            System.out.println("Error: " + e.getMessage());
            letra = entrada.next().charAt(0);
        }
    }

    public void calcularTriangulo(){
        try{
            System.out.println("Ingresa los 3 lados del triangulo");
            System.out.println("1er lado");
            lado = entrada.nextDouble();
            System.out.println("2do lado");
            lado2 = entrada.nextDouble();
            System.out.println("3er lado");
            lado3 = entrada.nextDouble();
            perimetro = lado+lado2+lado3;
            System.out.println("Ingresa la base del triangulo");
            base = entrada.nextDouble();
            System.out.println("Ingresa la altura del triangulo");
            altura = entrada.nextDouble();
            area = base*altura/2;
            System.out.println("El perimetro es de: " + perimetro + " El area es de: " + area);
        }catch(Exception e){
            //manejar el error
            System.out.println("Ingresa solo numeros");
            System.out.println("Error: " + e.getMessage());
            letra = entrada.next().charAt(0);
        }

        
    }
}



