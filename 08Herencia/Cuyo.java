public class Cuyo extends Animal {

    public Cuyo(){

    }

    public Cuyo(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
    }

    public void mostrarCuyo(){
        System.out.println("El nombre del Cuyo es : " + getNombre() + "\n"
                        + "La raza del Cuyo es : " + getRaza() + "\n"
                        + "Se alimenta de : " + getTipo_Alimento() + "\n"
                        + "El Cuyo tiene la edad de : " + getEdad() + "\n");
    }
    
}