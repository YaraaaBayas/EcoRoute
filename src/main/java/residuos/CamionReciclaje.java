package gestion_residuos;

/**
 * Camión especializado en la recogida de residuos de reciclaje.
 * 
 * Extiende de CamionBasura e implementa la lógica de esta.
 *
 * @author YaraBayas
 * @version 1.0
 */
public class CamionReciclaje extends CamionBasura {

    /**
     * Constructor para la clase CamionReciclaje.
     *
     * @param matricula Identifica de manera única al camión.
     * @param modelo    Modelo o marca del camión.
     * @param capacidad La carga máxima en kg que puede transportar.
     */
    public CamionReciclaje(String matricula, String modelo, double capacidad) {
        super(matricula, modelo, capacidad, "Reciclaje");
    }

    /**
     * Recoge los residuos de reciclaje de los contenedores de una ruta.
     *
     * @param ruta La ruta de contenedores a recoger.
     */
    @Override
    public void realizarRecogida(Ruta ruta) {
        // TODO: Pone en práctica el razonamiento para colectar los residuos de reciclaje.
        throw new UnsupportedOperationException("realizarRecogida() no implementado aún en CamionReciclaje");
    }
}