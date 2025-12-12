package model;

/**
 * Representa a un proveedor externo de la empresa Salmontt.
 *
 * Hereda de la clase Entidad para reutilizar atributos comunes
 * e implementa la interfaz Registrable, lo que permite que
 * los proveedores sean gestionados dentro de una colección
 * polimórfica junto a otras entidades del sistema.
 */
public class Proveedor extends Entidad implements Registrable {

    // Servicio principal que ofrece el proveedor
    private String servicio;

    //Constructor de la clase Proveedor.
    public Proveedor(String nombre, String servicio) {
        super(nombre);
        this.servicio = servicio;
    }

    /**
     * Implementación del método definido en la interfaz Registrable.
     * Retorna un resumen con la información del proveedor.
     */
    @Override
    public String mostrarResumen() {
        return "Proveedor: " + nombre + " | Servicio: " + servicio;
    }
}
