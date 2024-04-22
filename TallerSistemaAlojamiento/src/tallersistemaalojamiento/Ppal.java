/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallersistemaalojamiento;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Jairo F
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {int opcion;
        do {
            System.out.println("\nMenú Principal");
            System.out.println("1. Agregar Alojamiento");
            System.out.println("2. Eliminar Alojamiento");
            System.out.println("3. Modificar Alojamiento");
            System.out.println("4. Imprimir todos los Alojamientos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (opcion) {
                case 1:
                    agregarAlojamiento();
                    break;
                case 2:
                    eliminarAlojamiento();
                    break;
                case 3:
                    // Implementar la lógica para modificar alojamiento
                    System.out.println("Función aún no implementada.");
                    break;
                case 4:
                    imprimirAlojamientos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);
    }

    private static void agregarAlojamiento() {
        System.out.println("\nAgregar Alojamiento:");
        System.out.print("Ingrese el tipo de alojamiento (Habitación / Cabaña): ");
        String tipoAlojamiento = scanner.nextLine();

        System.out.print("Ingrese el código del alojamiento: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()

        System.out.print("Ingrese la dirección del alojamiento: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese la ciudad del alojamiento: ");
        String ciudad = scanner.nextLine();

        System.out.print("Ingrese el país del alojamiento: ");
        String pais = scanner.nextLine();

        Alojamiento nuevoAlojamiento;
        if (tipoAlojamiento.equalsIgnoreCase("Habitación")) {
            System.out.print("Ingrese el número máximo de personas: ");
            int noMaxPersonas = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()
            nuevoAlojamiento = new Habitacion(noMaxPersonas, codigo, direccion, ciudad, pais);
        } else if (tipoAlojamiento.equalsIgnoreCase("Cabaña")) {
            System.out.print("Ingrese el número de cuartos: ");
            int noCuartos = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()
            nuevoAlojamiento = new Cabaña(noCuartos, codigo, direccion, ciudad, pais);
        } else {
            System.out.println("Tipo de alojamiento no válido.");
            return;
        }

        registro.agregarAlojamiento(nuevoAlojamiento);
        System.out.println("Alojamiento agregado exitosamente.");
    }

    private static void eliminarAlojamiento() {
        System.out.println("\nEliminar Alojamiento:");
        System.out.print("Ingrese el código del alojamiento que desea eliminar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()

        Alojamiento alojamientoAEliminar = registro.buscar(codigo);
        if (alojamientoAEliminar != null) {
            registro.eliminar(alojamientoAEliminar);
            System.out.println("Alojamiento eliminado exitosamente.");
        } else {
            System.out.println("No se encontró ningún alojamiento con el código proporcionado.");
        }
    }

    private static void imprimirAlojamientos() {
        System.out.println("\nLista de Alojamientos:");
        for (Alojamiento alojamiento : registro.obtenerAlojamientos()) {
            System.out.println(alojamiento);
        }
    }
}
 
