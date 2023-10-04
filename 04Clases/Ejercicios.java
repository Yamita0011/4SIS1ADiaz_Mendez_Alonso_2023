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
        break;
        default:
        System.out.println("opcion no valida, ayos uwu/");
        break;

    }

}

public void Ejercicio2(){

}

public void Ejercicio3(){

}

public void Ejercicio4(){

}
}