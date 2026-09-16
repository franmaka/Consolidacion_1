public abstract class Figura {

    String color;

    //constructor
    public Figura(String color) {
        this.color = color;
    }

    //metodo concreto
    @Override
    public String toString() {
        return super.toString();
    }

    //metodo abstracto
    public abstract double calcularArea();
    
}
