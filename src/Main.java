/**
 * Clase principal de la aplicación que demuestra el funcionamiento del sistema de gestión de viajes.
 * Aquí se instancian y se interactúa con las diferentes clases (Chofer, Vehiculo, Ciudad, Viaje, Sistema)
 * para simular la planificación y consulta de viajes.
 */
public class Main {
    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * Contiene la lógica para configurar y probar las funcionalidades del sistema.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        // Se crea una instancia del Sistema, que es el punto central de control.
        Sistema sistema = new Sistema();

        // --- Creación y registro de Choferes ---
        // Se instancian dos choferes con sus datos y se registran en el sistema.
        Chofer chofer1 = new Chofer("LIC123", CategoriaEnum.COLECTIVO, 12345678L, "Juan", "Pérez");
        Chofer chofer2 = new Chofer("LIC456", CategoriaEnum.COLECTIVO, 87654321L, "Ana", "Gómez");

        sistema.registrarChofer(chofer1);
        sistema.registrarChofer(chofer2);

        // --- Creación y registro de Vehículos ---
        // Se instancian diferentes tipos de vehículos (Colectivo, Minibus) y se registran.
        Vehiculo colectivo1 = new Colectivo("ABC123", 60, true); // Colectivo de doble piso
        Vehiculo colectivo2 = new Colectivo("XYZ789", 55, false); // Colectivo de un piso
        Vehiculo minibus1 = new Minibus(true, true, "MIN456", 20); // Minibus con bodega y A/C

        sistema.registrarVehiculo(colectivo1);
        sistema.registrarVehiculo(colectivo2);
        sistema.registrarVehiculo(minibus1);

        // --- Creación y registro de Ciudades ---
        // Se instancian ciudades con sus respectivas provincias y se registran.
        Ciudad cordoba = new Ciudad("Córdoba", ProvinciaEnum.CORDOBA);
        Ciudad rosario = new Ciudad("Rosario", ProvinciaEnum.SANTA_FE);
        Ciudad mendoza = new Ciudad("Mendoza", ProvinciaEnum.MENDOZA);

        sistema.registrarCiudad(cordoba);
        sistema.registrarCiudad(rosario);
        sistema.registrarCiudad(mendoza);

        // --- Planificación de Viajes ---
        System.out.println("\n--- Intentando planificar viajes ---");

        // Viaje 1: Juan Pérez, Colectivo1, Córdoba a Rosario, 25/06/2025 de 08:00 a 12:00
        Viaje viaje1 = new Viaje("2025-06-25", "08:00", "12:00", chofer1, cordoba, rosario, colectivo1);
        System.out.println("Planificando Viaje 1 (Juan Pérez): " + (sistema.planificarViaje(viaje1) ? "OK" : "RECHAZADO"));

        // Viaje 2: Juan Pérez, Colectivo1, Rosario a Mendoza, 25/06/2025 de 13:00 a 17:00
        // Este viaje es posterior al Viaje 1 para el mismo chofer, no debería haber superposición.
        Viaje viaje2 = new Viaje("2025-06-25", "13:00", "17:00", chofer1, rosario, mendoza, colectivo1);
        System.out.println("Planificando Viaje 2 (Juan Pérez): " + (sistema.planificarViaje(viaje2) ? "OK" : "RECHAZADO"));

        // Viaje 3: Ana Gómez, Colectivo2, Córdoba a Mendoza, 26/06/2025 de 09:00 a 14:00
        // Otro chofer y otra fecha, debería ser OK.
        Viaje viaje3 = new Viaje("2025-06-26", "09:00", "14:00", chofer2, cordoba, mendoza, colectivo2);
        System.out.println("Planificando Viaje 3 (Ana Gómez): " + (sistema.planificarViaje(viaje3) ? "OK" : "RECHAZADO"));

        // Viaje 4: Juan Pérez, Colectivo2, Mendoza a Córdoba, 25/06/2025 de 11:00 a 15:00
        // Este viaje se solapa con el Viaje 1 del mismo chofer (Juan Pérez) en la misma fecha.
        // Esperamos que sea RECHAZADO.
        Viaje viaje4 = new Viaje("2025-06-25", "11:00", "15:00", chofer1, mendoza, cordoba, colectivo2);
        System.out.println("Planificando Viaje 4 (Juan Pérez, solapado): " + (sistema.planificarViaje(viaje4) ? "OK" : "RECHAZADO"));

        // --- Mostrar todos los viajes programados exitosamente ---
        System.out.println("\n--- Viajes programados (solo los aceptados) ---");
        sistema.mostrarViajes();

        // --- Informe de viajes realizados por un colectivo específico ---
        System.out.println("\n--- Informe de viajes del colectivo ABC123 ---");
        sistema.informeViajesPorColectivo("ABC123");

        // --- Informe de viajes por chofer de colectivo ---
        // Muestra cuántos viajes cada chofer ha realizado en vehículos tipo Colectivo.
        System.out.println("\n--- Informe de viajes por chofer que usa colectivo ---");
        sistema.informeViajesPorChoferDeColectivo();
    }
