package residuos;
 
/**
 * Clase abstracta que sirve de base para los distintos vehículos del sistema de gestión de residuos urbanos.
 * 
 * Todo vehículo del sistema pertenece a un tipo en concreto, por lo que la clase vehículo
 * no puede instanciarse directamente.
 *
 ** @author Yara Bayas
 * @version 1.0
 */
public abstract class Vehiculo {
 
    /** Identifica de manera única al vehículo.*/
    private String matricula;
 
    /** Modelo o marca del vehículo.*/
    private String modelo;
 
    /**
     * Carga máxima en kg que puede transportar el vehículo.
     * Se declara {@code protected} para que las clases hijas puedan acceder
     * a este atributo sin necesidad de usar un getter.
     */
    protected double capacidad;
 
    /**
     * Constructor para la clase.
     *
     * @param matricula Identifica de manera única al vehículo.
     * @param modelo    Modelo o marca del vehículo.
     * @param capacidad Carga máxima en kg que puede transportar.
     */
    public Vehiculo(String matricula, String modelo, double capacidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
 
    /**
     * Comprueba si el vehículo puede soportar ciertas cantidades.
     *
     * @param cantidad Kg que se quiera transportar.
     * @return {@code true} si la cantidad es menor o igual a la capacidad máxima;
     *         {@code false} si la supera.
     */
    public boolean capacidadPermitida(double cantidad) {
        if (cantidad <= capacidad) {
            return true;
        } else {
            System.out.println("La cantidad supera el máximo permitido.");
            return false;
        }
    }
 
    /**
     * @return Devuelve la matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }
 
    /**
     * @return Devuelve el modelo o marca del vehículo.
     */
    public String getModelo() {
        return modelo;
    }
 
    /**
     * @return devuelve la capacidad máxima del vehículo en kg.
     */
    public double getCapacidad() {
        return capacidad;
    }
 
    /**
     * @return Devuelve de forma concadenada todos los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Matrícula: "+matricula+" Modelo: "+modelo+" Capacidad máxima: "+capacidad+" kg";
    }
}
 
