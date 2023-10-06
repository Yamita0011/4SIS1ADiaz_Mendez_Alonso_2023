//esta clase es la que encarga de las operaciones de la calculara 
//y tambien tendra opciones para convertir unidades, crar cuadritos magicos

import java.util.Scanner;

class Ejercicios{
// objeto para la entrada de datos
Scanner entrada = new Scanner (System.in);

//Variables globales
char op;

//Menu
public void menu(){
    System.out.println("EJercicios que ahi les quedan de tarea ");
    System.out.println("a.- Calculadora");
    System.out.println("b.- Convercion de unidades ");
    System.out.println("c.- Crear cuadro magico");
    System.out.println("d.- Despazamiento de un cuadrito");
    System.out.println("Elija la opcion deseada");

    op = entrada.next().charAt(0);

    switch(op){
        case 'a' :
        //implementamos los metodos
        Ejercicio1();
        break;

        case 'b' :
        Ejercicio2();
        break;

        case 'c' :
        Ejercicio3();
        break;

        case 'd' :
        Ejercicio4();
        break;

        default:
        System.out.println("Gracias por jugar :3");
        

    }

}
public void Ejercicio1(){
    //Se le llaman vacios porque no poseen argumentos y no son metodos 
    //o funciones que necesiten una entrada o salida de algun tipo de dato

    //Calculadora
    double num1 = 0.00, suma = 0.00, multi = 1.00;
    char operacion;
    
    System.out.println("Selecciona la operacion que deseas relizar");
    System.out.println("a.- Suma y Resta");
    System.out.println("b.- Multiplicacion");
    System.out.println("c.- Division");

    operacion = entrada.next().charAt(0);
    switch(operacion){
        case 'a':
        //vamos a sumar o restar tantos numeros como desee el usuario
        //Cuando coloque 0 la operacion termina
        System.out.println("Para detener la suma o resta, sume el 0");
        do{
            System.out.println("Escriba los numeros que desee sumar o restar");
            num1 = entrada.nextDouble();
            suma += num1;
        }while(num1 != 0);

        System.out.println("El resultado de la operacion es: " + suma);
        break;
        case 'b':

        System.out.println("Para detener la multiplicacion, ingrese el 0");
        do{
            System.out.println("Escriba los numeros que desee multiplicacion");
            num1 = entrada.nextDouble();
            if(num1 != 0){
                multi *= num1;
                //multi = * num1
            }
        

        }while(num1 != 0);
        System.out.println("El resultado de la operacion es: " + multi);
        break;

        case 'c':
        // Tarea Divicion
        System.out.println("Introduza el primer número");
		int numero1 = entrada.nextInt();
		System.out.println("Introduza el segundo número");
		int numero2 = entrada.nextInt();
		
		int division = numero1 / numero2;

        System.out.println("El resultado de la division es: " + division);
        break;

        default:
        System.out.println("opcion no valida, ayos uwu/");
        break;

    }

}

public void Ejercicio2(){
    //Vamos a trear un programa que se encrage de convertir 
    //kg a libras
    //m/s a Km/h
    //m a Yardas
    double metros = 0.00, kg = 0.00, velocidad = 0.00, pulgadas = 39.3701, gramos = 1000, libras = 0.4535592, ms = 0.00;
    double cm = 100, kmh = 3.6, millas = 0.00062, yardas = 1.0936;
    double convercion1, convercion2;
    System.out.println("Seleccione la cantidad que deseas convertir acorde a las siguentes unidades");
    System.out.println("a.- Metros a Cm y Pulgadas");
    System.out.println("b.- Kg a Libras y Gramos");
    System.out.println("c.- m/s a Km/h");
    System.out.println("d.- Metros a Yardas y Millas");
    op = entrada.next().charAt(0);

    switch(op){
        case 'a':
        System.out.println("Ingresa los Metros que quieras tranformar: ");
        metros = entrada.nextDouble();
        convercion1 = metros * cm;
        convercion2 = metros * pulgadas; 

        System.out.println("La cantidad en metros es " + metros + " de m a cm es " + convercion1);
        System.out.println("de m a Pulgadas es " + convercion2);
        break;

        case 'b':
        System.out.println("Ingresa los Kilogramos que quieras tranformar: ");
        kg = entrada.nextDouble();
        convercion1 = kg * gramos;
        convercion2 = kg * libras; 

        System.out.println("La cantidad de Kilogramos es " + 
        kg + " de Kg a Gramos es " + convercion1);
        System.out.println("de Kg a Libras es " + convercion2);
        break;

        case 'c':
        System.out.println("Ingresa los m/s que quieras tranformar");
        ms = entrada.nextDouble();
        convercion1 = ms * kmh;

        System.out.println("La velocidad en m/s es " + ms + " de m/s a Km/h es " + convercion1);
        break;

        case 'd':
        System.out.println("Ingresa los Metros que quieras tranformar: ");
        metros = entrada.nextDouble();
        convercion1 = metros * yardas;
        convercion2 = metros * millas; 

        System.out.println("La cantidad en Metros es " + metros + " de Metros a Yardas es " + convercion1);
        System.out.println("de Metros a Millas es " + convercion2);
        break;

        default:
        System.out.println("Opcion no valida");
        break;
    }
}

public void Ejercicio3(){
            int n = 5; 
            //Cambia el valor de n para generar cuadros mágicos de diferentes órdenes
            int[][] cuadroMagico = new int[n][n];
    
            int num = 1;
            int i = 0;
            int j = n / 2;
    
            while (num <= n * n) {
                cuadroMagico[i][j] = num;
                num++;
                i--;
                j++;
                
                if (i < 0) {
                    i = n - 1;
                }
                if (j >= n) {
                    j = 0;
                }
                if (cuadroMagico[i][j] != 0) {
                    i += 2;
                    j--;
                }
            }
            System.out.println("Cuadro Mágico de Orden " + n + ":");
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(cuadroMagico[row][col] + "\t");
                }
                System.out.println();
            }
        
        }
public void Ejercicio4(){

}
}
