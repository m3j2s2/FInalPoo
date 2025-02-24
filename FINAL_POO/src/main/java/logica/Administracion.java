package logica;

import java.util.ArrayList;


public class Administracion {
    private ArrayList<Carrera> Carreras;

    
    public void altaDeCarrera(String nombre, String codigo){ //crea una carrera
        Carrera carrera = getCarrera(nombre);
        if (carrera == null){   //si la carrera no existia, la creo
            Carreras.add(new Carrera(nombre,codigo));
        }
    }
    
    public ArrayList<Carrera> getCarreras() { //obtiene todas las carreras
        return Carreras;
    }
    
    public Carrera getCarrera(String Nombre){ //obtiene una carrera concreta mediante el parametro nombre
        for (Carrera carrera : Carreras){
            if (carrera.getNombre().equalsIgnoreCase(Nombre)){
                return carrera;
            }
        }
        return null;
    }
    
    public void altaDeAlumno(String nombre, long dni, String propuesta){
        Carrera carrera = getCarrera(propuesta);
        if (carrera != null){
            carrera.setAlumno(new Alumno(nombre,dni,propuesta));            
        }
    }
    
    public Alumno getAlumno(long DNI, String propuesta){
        Carrera carrera = getCarrera(propuesta);  //obtengo la carrera
        if (carrera != null){
            ArrayList<Alumno> Alumnos = carrera.getAlumnos();  //si existe obtengo la lista de alumnos
            for (Alumno alumno : Alumnos){   //si el alumno existe, lo devuelvo
                if (alumno.getDni() == DNI){
                    return alumno;
                }
            }
        }
        return null; //si no existia la carrera o no existia el alumno devuelvo false
    }
    
    public ArrayList<Alumno> getAlumnos(String propuesta){
        Carrera carrera = getCarrera(propuesta);
        if (carrera != null){
            return carrera.getAlumnos();
        }
        else return null;
    }
    
}