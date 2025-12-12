package model;

//Define un contrato común para todas las entidades que pueden ser gestionadas por el sistema Salmontt.
public interface Registrable {

    /**
     * Retorna un resumen con la información relevante de la entidad.
     * Este método se utiliza para mostrar los datos en consola o GUI.
     */
    String mostrarResumen();
}
