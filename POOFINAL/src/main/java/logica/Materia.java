package logica;

import java.util.ArrayList;

public class Materia {
    private String Nombre;
    private String Codigo;
    private ArrayList<String> Correlativas;

    public Materia(String nombre, String codigo) {
        Nombre = nombre;
        Codigo = codigo;
        Correlativas =new ArrayList<>();
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

    public void addCorrelativa(String codigoCorrelativa) {
        if (!Correlativas.contains(codigoCorrelativa)) {
            Correlativas.add(codigoCorrelativa);
        }
    }

    public void deleteCorrelativa(String codigoCorrelativa) {
            Correlativas.remove(codigoCorrelativa);
    }
}