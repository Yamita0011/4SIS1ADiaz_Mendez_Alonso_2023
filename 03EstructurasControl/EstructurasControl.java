/*
 vamos a crear un programa el cual debemos tener un menu
 de seleccion para elegir alguna e las 14 opciones siguientes:
 1.-bono o descuento por eded
 2.-convertir numeros decimales a binarios
 3.-convertir temperaturas
 4.-numero de postivos a negativos
 5.-tiendita
 6.-area y perimetro
 7.-
 */

//se debe de structurar el tipo de dsto acorde a su entrada
//si es entero obtenerlo como

import java.util.Scanner;

      class EstructurasControl {

    public static void main(String[] args) {
     
        
     //el manejo de objetos , nos ayuda a poder instancear, (mandar a llamar al objeto)
     //para hacer una instancia, es necesario 1.- identificar el objeto
     //2.- nombrar al objeto
     //3.-crear objeto
     Scanner entrada = new Scanner(System.in);

     //crear una instancia del objeto de la entrada por defecto de la computadora

     //vamos a identificar con scanner el tipo de dato que se esta instaceando
    
     //es declarar a las variables que se utilizaran
     //variables globales o locales
     //en este caso seran locales y si estan por fuera son globales 

     int opcion, numbinario, total=0, cantidadproducto, num1, edad, socios, opcion2=0, opcion6;
     float precio, resultado = 0, compra = 0, grados;
     double mil=1000, multiplicacion, conversion, conTotal, area, perimetro, volumen, L1, L2, L3, semip, base, a, d, radio, Num1, Num2, Resultado;
     ;
     String nombreproducto;
     String binario = "";
     String respuesta;
     char letra;
     double p = 3.1416;
     
     do{
        System.out.println("bienvenido al programa");
        System.out.println("elije alguna opcion deseada");
        System.out.println("1.- descuento por edad");
        System.out.println("2.- convertir numero decimal a binario");
        System.out.println("3.- convertir temperaturas");
        System.out.println("4.- numeros positivos y negativos");
        System.out.println("5.- tiendita");
        System.out.println("6.- area y perimetro");
        System.out.println("7.- tabla");
        System.out.println("8.- factorial");
        System.out.println("9.- Dibujito");
        System.out.println("10.- Figura hueca");
        System.out.println("11.- Patrones de codigo");
        System.out.println("12.- Diamante");
        System.out.println("13.- Calculadora");
        System.out.println("14.- Salir");
        opcion = entrada.nextInt();
        //menu
      switch(opcion){
      case 1:
      System.out.println("su abono es de 1000");
    System.out.println("Ingrese su edad");
    edad = entrada.nextInt();
    if (edad >= 65){
      System.out.println("Se le aplicara un 40% de descuento");
      multiplicacion= mil*.40;
      mil-=multiplicacion;
      System.out.println("el bono sera de: "+mil);
    }else{
    if (edad <= 21){
     System.out.println("¿Tus padres son socios?");
    System.out.println("1.- SI");
    System.out.println("2.- NO");
    socios = entrada.nextInt();
    if(socios == 1){
      System.out.println("se le aplicara un 45% de descuento");
      multiplicacion= mil*.45;
      mil-=multiplicacion;
      System.out.println("el bono sera de: "+mil);
    }else{
     if (socios == 2){
      System.out.println("se le aplicara un 20% de descuento");
      multiplicacion= mil*.20;
      mil-=multiplicacion;
      System.out.println("el bono sera de: "+mil);
      }
    }
  }
}
break;

case 2:
System.out.println("ingresa un numero positivo entero que desee comvertir a binario");
numbinario = entrada.nextInt();
//Primero tengo que saber que sea positivo
    if (numbinario > 0) {
    //se cuantas veces el numero se va a dividir entre 2
   while (numbinario > 0){
    if (numbinario%2 == 0){
       binario = "0" + binario;
        }else{
           binario = "1" + binario;
          }
            numbinario = (int)numbinario/2;
              }
            }else if (numbinario == 0){

            }else{
              binario = "no se puede convertir un numero negativo";
            }
            System.out.println("el numero binario es: " + binario);
     break;

    case 3:
    System.out.println("Bienvenido al conversor de grados");
    System.out.println("Ingresa los grados farenheit que desea convertir");
    grados = entrada.nextInt();
    System.out.println("A que tipo de temperatura desea convertir");
    System.out.println("1.- Grados celsius");
    System.out.println("2.- Grados kelvin");
    System.out.println("3.- Grados rankine");
     opcion2 = entrada.nextInt();
    switch(opcion2){
     case 1:
     conversion = grados-32;
     conTotal = conversion*.5555555556;
     System.out.println("la conversion es: "+conTotal+ " Grados celsius");
     break;
     case 2:
     conversion = grados-273.15;
     conTotal = (conversion * 1.8) + 32;
     System.out.println("la conversion es: "+conTotal+ " Grados kelvin");
     break;
    case 3:
    conTotal = grados + 459.67;
    System.out.println("la conversion es: "+ conTotal+ " Grados renkine");
    break;
    }
    


    break;

    case 4:
    System.out.println("Bienvenido al contador de numeros negativos y positivos");
    System.out.println("Introduce la cantidad de numeros en la serie: ");
    int n = entrada.nextInt();
    int positivos = 0;
    int negativos = 0;
    System.out.println("Introduce la serie de numeros, uno por uno:");
    for (int i = 0; i < n; i++) {
        int numero = entrada.nextInt();
        if (numero > 0) {
            positivos++;
        } else if (numero < 0) {
            negativos++;
        }
    }
    System.out.println("Cantidad de números positivos: " + positivos);
    System.out.println("Cantidad de números negativos: " + negativos);

    break;

    case 5:

      System.out.println("Bienvenido a la tienda kawai");
      System.out.println("Ingrese el nuemro de productos que desaa comprar");
      total = entrada.nextInt();
      for(int i=1; i<= total; i++){
      System.out.println("Ingrese el nombre del producto: ");
      nombreproducto =  entrada.next();
      System.out.println("Ingrese el precio: ");
      precio = entrada.nextInt();
      System.out.println("Ingrese la Cantidad de Productos: ");
      cantidadproducto = entrada.nextInt();
       compra = 0;                 
       resultado = precio * cantidadproducto;                 
      compra = compra + resultado;                  
                    }
      System.out.println("El Total de la Compra es: "+compra);              
    break;                  

    case 6:
    System.out.println("Bienvenido a el calculador de area, perimetro y volumen");
    System.out.println("¿Que desea calcular?");
    System.out.println("1.- Area y perimetro de un rectangulo");
    System.out.println("2.- Area y perimetro de un triangulo");
    System.out.println("3.- Volumen de una esfera");
    System.out.println("4.- Volumen de un cilindro");
    opcion6 = entrada.nextInt();
    switch(opcion6){
      case 1:
      System.out.println("Ingresa el valor de el lado largo del rectangulo");
      L1 = entrada.nextInt();
      while(L1 < 0){
        System.out.println("Ingrese un numero positivo");
      L1 = entrada.nextInt();
     }
      System.out.println("Ingresa el valor de el lado corto del rectangulo");
     L2 = entrada.nextInt();
     while(L2 < 0){
        System.out.println("Ingrese un numero positivo");
      L2 = entrada.nextInt();
      }
      perimetro = (L1 * 2)+(L2 * 2);
     area = L1 * L2;
     System.out.println("El perimetro del rectangulo es: "+perimetro);
     System.out.println("El area del rectangulo es: "+area);
      break;

      case 2:
      System.out.println("Que triangulo desea calcular");
      System.out.println("1.- Triangulo equilatero");
      System.out.println("2.- Triangulo isosceles");
      System.out.println("3.- Triangulo escaleno");
      opcion = entrada.nextInt();
      switch(opcion){
      case 1:
        System.out.println("ingrese el valor de uno de los lados del triangulo");
        L1 = entrada.nextInt();
        while(L1 < 0){
          System.out.println("ingresa un valor positivo");
          L1 = entrada.nextInt();
        }
        semip=(L1+L1+L1)/2;
        area = Math.sqrt((semip*(semip-L1)*(semip-L1)*(semip-L1)));
        perimetro = L1+L1+L1;
        System.out.println("el area del triangulo es: "+area);
        System.out.println("el perimetro del triangulo es: "+perimetro);
      break;

      case 2:
      System.out.println("ingrese el valor de la base del triangulo");
      L1 = entrada.nextInt();
       while(L1 < 0){
          System.out.println("ingresa un valor positivo");
          L1 = entrada.nextInt();
        }
        System.out.println("ingresa el valor de uno de los lados del triangulo");
        L2 = entrada.nextInt();
         while(L2 < 0){
          System.out.println("ingresa un valor positivo");
          L2 = entrada.nextInt();
        }
        while(L1 == L2){
          System.out.println("la base y el lado no pueden ser los mismos para este tipo de triangulo");
          System.out.println("ingrese el valor de la base del triangulo");
      L1 = entrada.nextInt();
       System.out.println("ingresa el valor de uno de los lados del triangulo");
        L2 = entrada.nextInt();
        }
        base = L1/2;
        a=(L2*L2)-(base*base);
						d=Math.sqrt(a);
						area=(L1*d)/2;
            perimetro=L1+L2+L2;
            System.out.println("el area del triangulo es: "+area);
            System.out.println("el perimetro del triangulo es: "+perimetro);
      break;

      case 3:
      System.out.println("ingresa el valor de la base del triangulo");
      L1 = entrada.nextInt();
      while(L1 < 0){
          System.out.println("ingresa un valor positivo");
          L1 = entrada.nextInt();
        }
        System.out.println("ingresa el valor de uno de los lados del triangulo");
        L2 = entrada.nextInt();
         while(L2 < 0){
          System.out.println("ingresa un valor positivo");
          L2 = entrada.nextInt();
        }
         System.out.println("ingresa el valor del lado faltante del triangulo");
        L3 = entrada.nextInt();
         while(L3 < 0){
          System.out.println("ingresa un valor positivo");
          L3 = entrada.nextInt();
        }
        while(L1 == L2 || L1 == L3 || L2 == L3){
          System.out.println("los lados no pueden ser iguales para este triangulo ingrese diferentes");
          System.out.println("ingresa el valor de la base del triangulo");
      L1 = entrada.nextInt();
      System.out.println("ingresa el valor de uno de los lados del triangulo");
        L2 = entrada.nextInt();
        System.out.println("ingresa el valor del lado faltante del triangulo");
        L3 = entrada.nextInt();

        }
        semip=(L1+L2+L3)/2;
						area=Math.sqrt((semip*(semip-L1)*(semip-L2)*(semip-L3)));
						perimetro=L1+L2+L3;
            System.out.println("el area del triangulo es: "+area);
            System.out.println("el perimetro del triangulo es: "+perimetro);
      }
      break;
      case 3:
      System.out.println("ingrese el radio de la esfera");
      radio = entrada.nextInt();
      while(radio < 0){
        System.out.println("ingresa un valor positivo");
        radio = entrada.nextInt();
      }
			volumen=1.333333333*p*(radio*radio*radio);
			System.out.println("el volumen de la esfera es: "+volumen);
      break;


      case 4:
      System.out.println("ingresa el radio del cilindro");
      radio = entrada.nextInt();
       while(radio < 0){
        System.out.println("ingresa un valor positivo");
        radio = entrada.nextInt();
      }
      System.out.println("ingresa la altura de el cilindro");
      L1 = entrada.nextInt();
       while(L1 < 0){
          System.out.println("ingresa un valor positivo");
          L1 = entrada.nextInt();
        }
        volumen=p*(radio*radio)*L1;
        System.out.println("el volumen de el cilindro es: "+volumen);

      break;
    }

    break;

    case 7:
   System.out.println("Bienvenido a la tabla");
   System.out.println("");
   System.out.printf("%s%n"," N ");
   System.out.printf("|%s|%s|%s|%s|%n","1","10","100","1000");
   System.out.printf("|%s|%s|%s|%s|%n","2","20","200","2000");
   System.out.printf("|%s|%s|%s|%s|%n","3","30","300","3000");
   System.out.printf("|%s|%s|%s|%s|%n","4","40","400","4000");
   System.out.printf("|%s|%s|%s|%s|%n","5","50","500","5000");
   System.out.printf("|%s|%s|%s|%s|%n","6","60","600","6000");
   System.out.printf("|%s|%s|%s|%s|%n","7","70","700","7000");
   System.out.printf("|%s|%s|%s|%s|%n","8","80","800","8000");
   System.out.printf("|%s|%s|%s|%s|%n","9","90","900","9000");
   System.out.printf("|%s|%s|%s|%s|%n","10","100","1000","10000");
    break;
    case 8:
    System.out.println("Bienvenido al calculador de factoriales");
    System.out.println("ingrese un numero positivo");
    n = entrada.nextInt();
    while (n < 0){

      System.out.println("El numero ingresado es negativo , por favor ingrese uno positivo");
      n = entrada.nextInt();
    }
    long factorial = 1;
    for(int i = 1;i<=n;i++){
      factorial = factorial * i;
    }
    System.out.println("El factorial de "+n+" es: "+factorial);
    break;
    case 9:
    System.out.println("Bienvenido al dibujito ");
    System.out.println("ingrese el lado del cuadrado (entre 1 y 20)");
    n = entrada.nextInt();
    while(n < 1 || n > 20){
      System.out.println("El lado debe de ser de un tamaño de entre 1 y 20");
      n = entrada.nextInt();
    }
    for(int i = 0;i < n;i++){
      for(int j = 0;j < n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    break;
    case 10:
    System.out.println("Bienvanido a la figura hueca");
    System.out.println("ingrese el lado del cuadrado (entre 1 y 20)");
    n = entrada.nextInt();
    while (n < 0){

      System.out.println("El numero ingresado es negativo , por favor ingrese uno positivo");
      n = entrada.nextInt();
    }
    for(int i = 0;i < n;i++){
      for(int j = 0;j < n;j++){
        if (i == 0 || i == n-1 || j == 0 || j == n-1){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    break;
    case 11:
    System.out.println("Bienvenido a patrones de codigo");
   System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
   System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
   System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
   System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
   System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
   System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
   System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
   System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
   
    break;
    case 12:
    System.out.println("Bienvenido al diamante");
    int filas = 9;
        int columnas = filas;
        int espacios = (columnas - 1) / 2;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j < espacios || j > columnas - espacios - 1) {
                    System.out.print(" ");
                } else { 
                    System.out.print("*");
                }
            }
            System.out.println();
            if (i < filas / 2) {
                espacios--;
            } else { 
                espacios++;
            }
          }

    break;
    case 13:
        do {
           
          System.out.println("Seleccione una opción: ");
          System.out.println("1. Suma");
          System.out.println("2. Resta");
          System.out.println("3. Multiplicación");
          System.out.println("4. División");
          System.out.println("5. Salir");

          opcion = entrada.nextInt();

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion invalida");
            }
            if (opcion == 5) {
                break;
            }
            System.out.println("Ingrese Primer numero: ");
            Num1 = entrada.nextInt();
            System.out.println("Ingrese el segundo número:");
            Num2 = entrada.nextInt();

            switch (opcion) {
                case 1: // Suma
                    Resultado = Num1 + Num2;
                    System.out.println( "La suma de " + Num1 + " y " + Num2 + " es " + Resultado);
                    break;
                case 2: // Resta
                    Resultado = Num1 - Num2;
                    System.out.println("La resta de " + Num1 + " y " + Num2 + " es " + Resultado);
                    break;
                case 3: // Multiplicación
                    Resultado = Num1 * Num2;
                    System.out.println("La multiplicación de " + Num1 + " y " + Num2 + " es " + Resultado);
                    break;
                case 4: // División
                    if (Num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                        break;
                    }
                    Resultado = Num1 / Num2;
                    System.out.println("La división de " + Num1 + " y " + Num2 + " es " + Resultado);
                    break;
                default:
                    break;
            }
        } while (true);
    break;
    case 14:
    System.out.println("ah! pues chinga tu Madre..");
    break;
      }
       System.out.println("Deseas repetir el programa? , escribe s para si");
      letra = entrada.next().charAt(0);
      }while(letra ==  's' || letra == 'S');
    
    }
  }