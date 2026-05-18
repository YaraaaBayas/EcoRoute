package gestion_residuos;

/**
 * Camión especializado en la recogida de residuos líquidos.
 * 
 * Extiende de CamionBasura e implementa la lógica de esta.
 *
 * @author YaraBayas
 * @version 1.0
 */
public class CamionCisterna extends CamionBasura {

    /**
     * Constructor para la clase CamionCisterna.
     *
     * @param matricula Identifica de manera única al camión.
     * @param modelo    Modelo o marca del camión.
     * @param capacidad La carga máxima en kg que puede transportar.
     */
    public CamionReciclaje(String matricula, String modelo, double capacidad) {
        super(matricula, modelo, capacidad, "Reciclaje");
    }

    /**
     * Recoge los residuos líquidos de los contenedores de una ruta.
     *
     * @param ruta La ruta de contenedores a recoger.
     */
    @Override
    public void realizarRecogida(Ruta ruta) {
        // TODO: Pone en práctica el razonamiento para colectar los residuos líquidos.
        throw new UnsupportedOperationException(realizarRecogida()+" no implementado aún en CamionReciclaje");
    }
}