import entities.Agente;
import management.*;
import utils.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
        System.out.println("Elige una píldora para continuar:");
        System.out.println("1. Píldora Roja: Agentes de la Resistencia");
        System.out.println("2. Píldora Azul: Control de Anomalías");
        
        int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1 o 2): ");

        if (opcion == 1) {
            AgenteManager agenteManager = new AgenteManager();
            agenteManager.mostrarMenu();
            System.out.println("Menú de opciones para el agente:");
            System.out.println("1 ver informacion del agente");
            System.out.println("2 subir nivel del agente");
            System.out.println("3 salir");
            int opcionAgente = ConsoleUtils.leerEntero("Selecciona una opción (1, 2 o 3): ");
            if (opcionAgente == 2) {
                int nivel = ConsoleUtils.leerEntero("Ingresa el nivel que deseas subir al agente: ");
                Agente agente = new Agente(1, "John Doe", "Habilidad especial");
                for (int i = 0; i < nivel; i++) {
                    agente.incrementarNivel();
                }
                System.out.println("Nivel actual del agente: " + agente.getNivel());
            }
        } else if (opcion == 2) {
            AnomaliaManager anomaliaManager = new AnomaliaManager();
            anomaliaManager.mostrarMenu();
        } else {
            System.out.println("Opcion no valida. Adios.");
        }
    }
}