public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Crear choferes
        Chofer chofer1 = new Chofer("LIC123", CategoriaEnum.COLECTIVO, 12345678L, "Juan", "Pérez");
        Chofer chofer2 = new Chofer("LIC456", CategoriaEnum.COLECTIVO, 87654321L, "Ana", "Gómez");

        sistema.registrarChofer(chofer1);
        sistema.registrarChofer(chofer2);

        // Crear vehículos
        Vehiculo colectivo1 = new Colectivo("ABC123", 60, true);
        Vehiculo colectivo2 = new Colectivo("XYZ789", 55, false);
        Vehiculo minibus1 = new Minibus(true, true, "MIN456", 20);

        sistema.registrarVehiculo(colectivo1);
        sistema.registrarVehiculo(colectivo2);
        sistema.registrarVehiculo(minibus1);

        // Crear ciudades
        Ciudad cordoba = new Ciudad("Córdoba", ProvinciaEnum.CORDOBA);
        Ciudad rosario = new Ciudad("Rosario", ProvinciaEnum.SANTA_FE);
        Ciudad mendoza = new Ciudad("Mendoza", ProvinciaEnum.MENDOZA);

        sistema.registrarCiudad(cordoba);
        sistema.registrarCiudad(rosario);
        sistema.registrarCiudad(mendoza);

        // Planificar viajes
        Viaje viaje1 = new Viaje("2025-06-25", "08:00", "12:00", chofer1, cordoba, rosario, colectivo1);
        Viaje viaje2 = new Viaje("2025-06-25", "13:00", "17:00", chofer1, rosario, mendoza, colectivo1);
        Viaje viaje3 = new Viaje("2025-06-26", "09:00", "14:00", chofer2, cordoba, mendoza, colectivo2);
        Viaje viaje4 = new Viaje("2025-06-25", "11:00", "15:00", chofer1, mendoza, cordoba, colectivo2); // se solapa con viaje1

        System.out.println("\n--- Planificando viajes ---");
        sistema.planificarViaje(viaje1);  // OK
        sistema.planificarViaje(viaje2);  // OK
        sistema.planificarViaje(viaje3);  // OK
        sistema.planificarViaje(viaje4);  // RECHAZADO por superposición

        // Mostrar todos los viajes
        System.out.println("\n--- Viajes programados ---");
        sistema.mostrarViajes();

        // Informe de viajes por colectivo
        System.out.println("\n--- Informe de viajes del colectivo ABC123 ---");
        sistema.informeViajesPorColectivo("ABC123");
    }
}