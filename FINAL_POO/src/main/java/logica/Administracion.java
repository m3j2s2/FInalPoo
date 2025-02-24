package logica;

import java.util.ArrayList;


public class Administracion {
    private ArrayList<Carrera> Carreras;
    private ArrayList<Alumno> Alumnos;
    
    public Administracion(){
        Carreras=new ArrayList<>();
        Alumnos=new ArrayList<>();
    }
    
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
    
    public Alumno getAlumno(long DNI){
        for (Alumno alumno: Alumnos){
            if (alumno.getDni()==DNI){
                return alumno;
            }
        }
        return null;
    }
    
    public void altaDeAlumno(String nombre, String carrera, long Dni){
        Alumno alumno = getAlumno(Dni);
            if (alumno==null){
                Alumnos.add(new Alumno( nombre,  Dni,  carrera));
            
            }
    }
    
    
    
    
 
}