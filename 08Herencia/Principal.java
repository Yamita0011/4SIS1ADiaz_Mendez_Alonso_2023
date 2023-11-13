import java.util.Scanner;
public class Principal{

    public static void main(String [] args){
        System.out.println("BIENVENIDO AL CENTRO DE ADOPCION" + "\n");
        Michi gato = new Michi("Bolita", "De la calle", "Croquetas bb", 1, 7);
        gato.mostrarMichi();

        Lomito perro = new Lomito("Carlos", "Chihuahua", "Croquetas: Ganador Premium", 2);
        perro.mostrarLomito();

        Cuyo cuyo = new Cuyo("Tostada", "Rex", "Frutas", 1);
        cuyo.mostrarCuyo();

        Conejo conejo = new Conejo("Obrador", "Mini Lop", "Alfalfa", 3);
        conejo.mostrarConejo();

        Huron huron  = new Huron("SoloSeFue", "Mescla", "Dieta basada en Carne" , 1);
        huron.mostrarHurones();

        Hamster hamster = new Hamster("Francisco Segundo", "Domestico", "Frutas", 5);
        hamster.mostrarHamster();

        Scanner scanner = new Scanner(System.in);

            System.out.println("Selecciona una opcion para obtener mas informacion del animal que deseas adoptar");
            System.out.println("1.- Michi");
            System.out.println("2.- Lomito");
            System.out.println("3.- Conejo");
            System.out.println("4.- Cuyos");
            System.out.println("5.- Hurones");
            System.out.println("6.- Hamster");
            System.out.println("0.- Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                gato.mostrarMichi();
                break;
                
                case 2:
                perro.mostrarLomito();
                break;
                
                case 3:
                conejo.mostrarConejo();
                break;
                
                case 4:
                cuyo.mostrarCuyo();
                break;

                case 5:
                huron.mostrarHurones();
                break;

                case 6:
                hamster.mostrarHamster();
                break;
                    
                case 7: 
                System.exit(0);
                break;
                
                default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
                break;

            }
        }
    }
