package Areas;

class Circulos extends Figuras {
    private double radio;

    public void Circulo(double radio) {
        this.radio = radio;
        AreaCirculo();
        PerimetroCirculo();
    }

    private void AreaCirculo() {
        this.perimetro = Math.PI * radio * radio;
    }

    private void PerimetroCirculo() {
        this.perimetro = 2 * Math.PI * radio;
    }
}