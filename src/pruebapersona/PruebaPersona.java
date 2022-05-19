package pruebapersona;

import java.util.Scanner;

public class PruebaPersona {

    public static void main(String[] args) {

        String nombre;
        String apellido;
        int dia;
        int mes;
        int anio;

        Scanner input = new Scanner(System.in);
        FrecuenciasCardiacas frecc = new FrecuenciasCardiacas("Ernesto", "Estanislao", 31, 10, 2001);

        System.out.println("Persona 1");
        System.out.printf("Nombre: %s %s", frecc.getNombre(), frecc.getApellido());
        frecc.edadPersona();
        frecc.frecMaxPersona();
        frecc.frecEspPersona();

        System.out.println("\n\nIngrese Datos de Persona 2");
        System.out.print("Nombre: ");
        nombre = input.nextLine();
        frecc.setNombre(nombre);
        System.out.print("Apellido: ");
        apellido = input.nextLine();
        frecc.setApellido(apellido);
        System.out.println("Fecha de Nacimiento (DD/MM/YYYY)");
        System.out.print("Dia: ");
        dia = input.nextInt();
        frecc.setDia(dia);
        System.out.print("Mes: ");
        mes = input.nextInt();
        frecc.setMes(mes);
        System.out.print("Anio: ");
        anio = input.nextInt();
        frecc.setAnio(anio);

        System.out.println("\nPersona 2");
        System.out.printf("Nombre: %s %s", frecc.getNombre(), frecc.getApellido());
        frecc.edadPersona();
        frecc.frecMaxPersona();
        frecc.frecEspPersona();
    }
}


