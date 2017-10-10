
package CapaLogicaNegocio;

import java.util.ArrayList;

public class Universidad {
    private  String nombre;
    private String sigla;
    private ArrayList<Facultad> facultades;

    public Universidad(){
        facultades = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void agregarFacultad (Facultad facultad) {
        this.facultades.add(facultad);
    }
}
