package logica;

import java.util.ArrayList;

public class Carrera {
    private String Nombre;
    private String Codigo;
    private ArrayList<Alumno>Alumnos;

    public Carrera(String nombre, String codigo) {
        Nombre = nombre;
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }


    public ArrayList<Alumno> getAlumnos() {
        return Alumnos;
    }

    public void setAlumno(Alumno alumno) {
        Alumnos.add(alumno);
    }

    public Alumno getAlumno(long DNI){
        for (Alumno alumno : Alumnos){
            if (alumno.getDni()==DNI){
                return  alumno;
            }
        }
        return null;
    }

}
