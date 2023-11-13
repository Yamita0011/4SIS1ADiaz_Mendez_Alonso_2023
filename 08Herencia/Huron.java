public class Huron extends Animal {

    public Huron(){

    }

    public Huron(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
    }

    public void mostrarHurones(){
        System.out.println("El nombre del Huron es : " + getNombre() + "\n"
                        + "La raza del Huron es : " + getRaza() + "\n"
                        + "Se alimenta de : " + getTipo_Alimento() + "\n"
                        + "El Huron tiene la edad de : " + getEdad() + "Año(s)" + "\n");
    }
    
}