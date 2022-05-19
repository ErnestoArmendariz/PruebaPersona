package pruebapersona;

import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {

    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void edadPersona() {

        LocalDate fechaNac = LocalDate.of(dia, mes, anio);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("%nEdad: %d agnos", periodo.getYears());
    }

    public void frecMaxPersona() {

        LocalDate fechaNac = LocalDate.of(dia, mes, anio);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);

        System.out.printf("%nFrecuencia cardiaca maxima: %d", 220 - periodo.getYears());
    }

    public void frecEspPersona() {

        LocalDate fechaNac = LocalDate.of(dia, mes, anio);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);

        System.out.printf("%nRango de frecuencia cardiaca esperada: entre %.0f y %.0f",
                (220 - periodo.getYears()) * 0.5,
                (220 - periodo.getYears()) * 0.85);
    }
}
