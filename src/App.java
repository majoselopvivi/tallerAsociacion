public class App {
    public static void main(String[] args) {

        // Ejercicio Libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupery");

        Lector lector1 = new Lector ("Ana Torres", "1022548489");
        Lector lector2 = new Lector ("Carlos Ruiz", "27598865");

        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();

        System.out.println();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.regresarLibro();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();
    }
}