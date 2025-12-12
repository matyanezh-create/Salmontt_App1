package model;

/**
 * Representa una entidad base del sistema Salmontt.
 *
 * Esta clase define atributos comunes que serán heredados
 * por las distintas entidades del sistema, como Empleado,
 * Proveedor y Transporte.
 *
 * Al ser abstracta, no puede ser instanciada directamente.
 */
public abstract class Entidad {

    // Nombre identificador común para todas las entidades
    protected String nombre;

    //Constructor de la clase Entidad.
    public Entidad(String nombre) {
        this.nombre = nombre;
    }
}
