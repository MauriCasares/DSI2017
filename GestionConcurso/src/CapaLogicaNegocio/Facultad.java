
package CapaLogicaNegocio;

import java.util.ArrayList;

public class Facultad {
    private  String nombre;
    private ArrayList<Carrera> carreras;

    public Facultad() {
        carreras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }
    
    
    
}
