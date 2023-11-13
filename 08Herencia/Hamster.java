public class Hamster extends Animal {

    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
    }

    public void mostrarHamster(){
        System.out.println("El nombre del Hamster es : " + getNombre() + "\n"
                        + "La raza del Hamster es : " + getRaza() + "\n"
                        + "Se alimenta de : " + getTipo_Alimento() + "\n"
                        + "El Hamster tiene la edad de : " + getEdad() + "\n");
    }
    
}