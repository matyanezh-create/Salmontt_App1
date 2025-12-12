package model;

/**
 * Representa un medio de transporte utilizado por la empresa Salmontt
 * para apoyar sus operaciones logísticas.
 *
 * Hereda de la clase Entidad para reutilizar atributos comunes
 * e implementa la interfaz Registrable, lo que permite gestionar
 * los transportes dentro de una colección polimórfica.
 */
public class Transporte extends Entidad implements Registrable {

    // Tipo de transporte (por ejemplo, camión, barco, furgón, etc.)
    private String tipo;

    //Constructor de la clase Transporte.
    public Transporte(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    /**
     * Implementación del método definido en la interfaz Registrable.
     * Retorna un resumen con la información del transporte.
     */
    @Override
    public String mostrarResumen() {
        return "Transporte: " + nombre + " | Tipo: " + tipo;
    }
}
