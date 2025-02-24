package logica;

public class Alumno {
    private String Nombre;
    private long Dni;
    private String Carrera;


    public Alumno(String nombre, long dni, String carrera) {
        Nombre = nombre;
        Dni = dni;
        Carrera = carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long dni) {
        Dni = dni;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
}
