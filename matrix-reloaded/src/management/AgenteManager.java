package management;

import entities.Agente;
import utils.ConsoleUtils;

import java.util.ArrayList;

public class AgenteManager {
    private ArrayList<Agente> agentes;

    public AgenteManager() {
        this.agentes = new ArrayList<>();
    }

    public void registrarAgente() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente: ");
        ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

        String nombre = ConsoleUtils.leerTexto("Ingrese el nombre del agente: ");
        String habilidad = ConsoleUtils.leerTexto("Ingrese la habilidad especial del agente: ");
        int nivelDePoder = (int) ConsoleUtils.leerEntero("Ingrese el nivel de poder del agente: ");

        Agente nuevoAgente = new Agente(id, nombre, habilidad, nivelDePoder);
        agentes.add(nuevoAgente);
        System.out.println("Agente registrado con éxito.");
    }

    public void mostrarAgentes() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }
        System.out.println("=== Lista de Agentes ===");
        for (Agente agente : agentes) {
            System.out.println(agente + ", Nivel: " + agente.getNivelDePoder());
        }
    }
    public void aumentarNivel(){
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }
        System.out.println("=== Lista de Agentes ===");
        for (Agente agente : agentes) {
            agente.incrementarNivel();
            System.out.println("Nivel incrementado de el agentes");
            System.out.println(agente + " Nivel: " + agente.getNivelDePoder());
        }
    }

    public void mostrarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menú Agentes ===");
            System.out.println("1. Registrar Agente");
            System.out.println("2. Mostrar Agentes");
            System.out.println("3. Aumentar nivel");
            System.out.println("4. Salir");
            // System.out.println("4. Regresar al menú anterior");
            int opcion = ConsoleUtils.leerEntero("Seleccione una opción: ");
            ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

            switch (opcion) {
                case 1 -> registrarAgente();
                case 2 -> mostrarAgentes();
                case 3 -> aumentarNivel();
                case 4 -> continuar = false;
                // case 4 -> continuar = true;
                default -> System.out.println("Opción no válida.");
            }
        }
    }
    // public void asignarAnomalia(){
        
    // }
}