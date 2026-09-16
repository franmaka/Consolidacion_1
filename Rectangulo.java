public class Rectangulo extends Figura {
    
    double ancho;
    double largo;

    public Rectangulo(String color, double ancho, double largo) {
        super(color); // Llama al constructor de la clase padre (Figura)
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return ancho * largo; //area = ancho * largo
    }

    @Override
    public String toString() {
        return super.toString() + "│ Rectangulo:" + ancho + "x" + largo; // Llama al método toString() de la clase padre (Figura) y agrega información específica del rectángulo
    }
}
