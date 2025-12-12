package model;

/**
 * Representa a un colaborador interno de la empresa Salmontt.
 *
 * Hereda de la clase Entidad para reutilizar atributos comunes
 * e implementa la interfaz Registrable para permitir su gestión
 * dentro de una colección polimórfica.
 */
public class Empleado extends Entidad implements Registrable {

    // Cargo o rol que desempeña el empleado dentro de la empresa
    private String cargo;

    //Constructor de la clase Empleado.
    public Empleado(String nombre, String cargo) {
        super(nombre);
        this.cargo = cargo;
    }

    /**
     * Implementación del método definido en la interfaz Registrable.
     * Retorna un resumen con la información del empleado.
     */
    @Override
    public String mostrarResumen() {
        return "Empleado: " + nombre + " | Cargo: " + cargo;
    }
}
