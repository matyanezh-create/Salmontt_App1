package data;

import model.*;
import java.util.ArrayList;

//Se encarga de administrar una colección polimórfica de entidades que implementan la interfaz Registrable.
public class GestorEntidades {

    // Colección genérica que almacena distintas entidades del sistema
    // Todas deben implementar la interfaz Registrable
    private ArrayList<Registrable> entidades = new ArrayList<>();

    //Agrega una nueva entidad a la colección.
    public void agregarEntidad(Registrable r) {
        entidades.add(r);
    }

    /**
     * Recorre la colección de entidades y muestra un resumen
     * de cada objeto utilizando polimorfismo.
     *
     * Además, se utiliza instanceof para identificar el tipo real
     * del objeto en tiempo de ejecución y aplicar lógica diferenciada.
     */
    public void mostrarEntidades() {

        // Recorrido polimórfico de la colección
        for (Registrable r : entidades) {

            // Llamada polimórfica al método definido en la interfaz
            System.out.println(r.mostrarResumen());

            // Validación dinámica del tipo de objeto
            if (r instanceof Empleado) {
                System.out.println("Tipo detectado: Empleado");
            } else if (r instanceof Proveedor) {
                System.out.println("Tipo detectado: Proveedor");
            } else if (r instanceof Transporte) {
                System.out.println("Tipo detectado: Transporte");
            }
        }
    }

    //Retorna la lista de entidades registradas.
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }
}
