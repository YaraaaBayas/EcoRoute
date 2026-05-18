package residuos;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una ruta de recogida que contiene varios contenedores.
 * @author YaraBayas
 */
public class Ruta {
    /** Nombre de la ruta. */
    private String nombre;
    /** Lista con los contenedores a recoger de la ruta. */
    private List<Contenedor> listaContenedores;

    /**
     * @param nombre Nombre de la ruta con contenedores a recoger.
     */
    public Ruta(String nombre) {
        this.nombre = nombre;
        this.listaContenedores = new ArrayList<>();
    }

    /**
     * Añade un contenedor a la ruta.
     * @param c El contenedor a añadir.
     */
    public void añadirContenedor(Contenedor c) {
        this.listaContenedores.add(c);
    }

    /**
     * @return Nombre de la ruta
     */
    public String getNombre() { 
        return nombre; 
    }
    
    /** 
     * @return Devuelve la lista con los contenedores de la ruta.
     */
    public List<Contenedor> getListaContenedores() { 
        return listaContenedores; 
    }

    /**
     * @return Devuelve de forma concadenada todos los atributos de la clase.
     */
    public String toString() {
        String nombre="Nombre de la ruta: "+nombre+"\n";
        String lista="";
        for (int i=0;i<listaContenedores.size();i++) {
            lista+=" - "+listaContenedores.get(i).toString()+"\n";
        }
        return nombre+lista;
    }

}