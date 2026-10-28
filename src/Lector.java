public class Lector {
    private String nombre, cedula;
    private Libro libroActual;

public Lector(){
}

public Lector (String nombre, String cedula){
    this.nombre = nombre;
    this.cedula = cedula;
}

public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getCedula(){
    return cedula;
}    

public void setCedula(String cedula){
    this.cedula = cedula;
}

public void tomarPrestado(Libro libro){
    if (libroActual != null){
        System.out.println(nombre + "ya tiene el libro\"" + libroActual.getTitulo());
    }else{
        if(libro.prestar()){
            libroActual = libro;
        }
    }
}
public void regresarLibro(){
    if(libroActual == null){
        System.out.println("No tiene ningun libro");
    }else{
        System.out.println("El libro no esta disponible");
    }
}

public void mostrarEstado(){
    String estado = (libroActual != null) ? libroActual.getTitulo(): "sin libro";
    System.out.println("Lector: " + nombre + "| libro: " + estado);
}


}
