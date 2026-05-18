package residuos;

/**
 * Clase que representa un contenedor de residuos.
 * @author YaraBayas
 * @version 1.0
 */
public class Contenedor {

    /** Identificador único del contenedor. */
    private String id;
    /** Especialización de residuo del contenedor. */
    private String tipoResiduo;
    /** Capacidad máxima del contenedor, expresada en kg. */
    private double capacidad;

    /**
     * Constructor para la clase Contenedor.
     * @param id Identificador único del contenedor.
     * @param tipoResiduo Clasificación de residuo.
     */
    public Contenedor(String id, String tipoResiduo) {
        this.id = id;
        this.tipoResiduo = tipoResiduo;
        this.capacidad = 0;
    }

    /**
     * Actualiza la capacidad del contenedor.
     * @param cant Cantidad que ocupa.
     */
    public void setCapacidad(double cant) {
        this.capacidad=cant;
    }

    /** @return El identificador del contenedor */
    public String getId() { 
        return id; 
    }

    /** @return El tipo de residuo */
    public String getTipoResiduo() {
        return tipoResiduo; 
    }

    /** @return La capacidad del contenedor */
    public double getCapacidad() { 
        return capacidad; 
    }

    /**
     * @return Devuelve de forma concadenada todos los atributos de la clase.
     */
    public String toString() {
        return "Contenedor: "+id+" Tipo de residuo: "+tipoResiduo+" Capacidad: "+capacidad;
    }
}