public class Conejo extends Animal {

        public Conejo (){
    
        }
    
        public Conejo(String nombre, String raza, String tipo_alimento, int edad){
            super(nombre, raza, tipo_alimento, edad);
        }
    
        public void mostrarConejo(){
            System.out.println("El nombre del Lomito es : " + getNombre() + "\n"
                            + "La raza del Lomito es : " + getRaza() + "\n"
                            + "Se alimenta de : " + getTipo_Alimento() + "\n"
                            + "El Lomito tiene la edad de : " + getEdad() + "\n");
        }
        
    }
