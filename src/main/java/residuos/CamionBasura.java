package residuos;

/**
 * Clase abstracta que representa un camión de basura especializado en un tipo de residuo.
 * 
 * Hereda de Vehiculo y se especializa por un tipo de residuo.
 * Todo camión se clasifica en distintos tipos de residuos a recoger, por lo que la clase camionBasura
 * no puede instanciarse directamente.
 *
 * @author YaraBayas
 * @version 1.0
 */
public abstract class CamionBasura extends Vehiculo {

    /** Tipo de residuo en el que está especializado el camión. */
    private String tipoResiduo;

    /**
     * Constructor para la clase CamionBasura.
     *
     * @param matricula   Identifica de manera única al camión.
     * @param modelo      Modelo o marca del camión.
     * @param capacidad   La carga máxima en kg que puede transportar.
     * @param tipoResiduo Tipo de residuo en el que está especializado.
     */
    public CamionBasura(String matricula, String modelo, double capacidad, String tipoResiduo) {
        super(matricula, modelo, capacidad);
        this.tipoResiduo=tipoResiduo;
    }

    /**
     * @return Tipo de residuo especializado del camión.
     */
    public String getTipoResiduo() {
        return tipoResiduo;
    }

    /**
     * Realiza la recogida de residuos de una ruta asignada.
     * 
     * Cada subclase (clase hija) debe implementar este método con el tipo de residuo que 
     * gestione.
     *
     * @param ruta La ruta de contenedores a recoger.
     */
    public abstract void realizarRecogida(Ruta ruta);

    /**
     * @return Devuelve de forma concadenada todos los atributos de la clase, 
     * además de la información heredada de Vehículo.
     */
    @Override
    public String toString() {
        return super.toString()+" Especialización: "+tipoResiduo;
    }
}