package ui;

import data.GestorEntidades;
import model.*;

import javax.swing.*;

/**
 * Contiene el método main y se encarga de iniciar la aplicación,
 * mostrando una interfaz gráfica simple basada en JOptionPane
 * para la interacción con el usuario.
 */
public class SalmonttGUI {

    /**
     * Método principal que inicia la ejecución del sistema.
     * Desde aquí se despliega el menú gráfico y se gestionan
     * las acciones seleccionadas por el usuario.
     */
    public static void main(String[] args) {

        // Gestor encargado de administrar las entidades del sistema
        GestorEntidades gestor = new GestorEntidades();

        // Variable de control para mantener el menú activo
        boolean continuar = true;

        // Bucle principal del menú
        while (continuar) {

            // Menú principal de opciones
            String opcion = JOptionPane.showInputDialog(
                    "1. Agregar Proveedor\n" +
                            "2. Agregar Empleado\n" +
                            "3. Agregar Transporte\n" +
                            "4. Mostrar registros\n" +
                            "5. Salir"
            );

            // Si el usuario cierra la ventana, se termina la ejecución
            if (opcion == null) break;

            // Evaluación de la opción seleccionada
            switch (opcion) {

                case "1":
                    // Creación de un proveedor a través de la interfaz gráfica
                    gestor.agregarEntidad(new Proveedor(
                            JOptionPane.showInputDialog("Nombre del proveedor:"),
                            JOptionPane.showInputDialog("Servicio:")
                    ));
                    break;

                case "2":
                    // Creación de un empleado a través de la interfaz gráfica
                    gestor.agregarEntidad(new Empleado(
                            JOptionPane.showInputDialog("Nombre del empleado:"),
                            JOptionPane.showInputDialog("Cargo:")
                    ));
                    break;

                case "3":
                    // Creación de un transporte a través de la interfaz gráfica
                    gestor.agregarEntidad(new Transporte(
                            JOptionPane.showInputDialog("Identificación del transporte:"),
                            JOptionPane.showInputDialog("Tipo de transporte:")
                    ));
                    break;

                case "4":
                    // Muestra de los registros por consola utilizando instanceof
                    gestor.mostrarEntidades();

                    // Construcción del mensaje para mostrar los registros en la GUI
                    StringBuilder sb = new StringBuilder();
                    for (Registrable r : gestor.getEntidades()) {
                        sb.append(r.mostrarResumen()).append("\n");
                    }

                    // Visualización de los registros en una ventana emergente
                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;

                case "5":
                    // Finaliza la ejecución del programa
                    continuar = false;
                    break;
            }
        }
    }
}
