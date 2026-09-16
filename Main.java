public class Main {
    
    public static void main(String[] args) {
        
        // Crear un objeto Circulo
        Circulo c1 = new Circulo("Rojo", 5);
        
        // Crear un objeto Rectangulo
        Rectangulo r1 = new Rectangulo("Azul", 4, 6);

        Figura[] figuras = {c1, r1}; // Crear un arreglo de figuras
        
        for (Figura f : figuras) {
            System.out.println(f + "│ Area: "+ f.calcularArea()); //Imprimir la información de figuras
        }
        
    }
}
