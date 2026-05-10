package residuos;

/**
 * Clase abstracta que sirve de base para los distintos vehículos del sistema de residuos urbanos.
 * * @author YaraBayas
 * @version 1.0
 */
public abstract class Vehiculo {

    // Atributos privados (Cumple el criterio de Encapsulamiento)
    private String matricula, modelo;
    private double capacidad;

    /**
     * Constructor por defecto para la clase Vehiculo.
     * @param matricula Ifentifica de manera única al vehículo.
     * @param modelo Modelo o marca del vehículo.
     * @param capacidad La carga máxima en kg que puede transportar un vehículo.
     */
    public Vehiculo(String matricula, String modelo, double capacidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    /**
     * Método que devuelve si el vehículo puede soportar la cantidad ingresada.
     * * @return true si la cantidad es menor al máximo y false si la supera.
     */
    public boolean capacidadPermitida(double cantidad) {
        if (cantidad<this.capacidad) {
        	return true;
        } else {
        	System.out.println("La cantidad supera la capacidad máxima");
        	return false;
        }
    }
   
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidad() {
        return capacidad;
    }
    public String toString() {
    	return "Matrícula: "+matricula+" Modelo: "+modelo+" Capacidad máxima: "+capacidad;
    }
}