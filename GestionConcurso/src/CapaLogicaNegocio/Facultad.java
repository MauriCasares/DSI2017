
package CapaLogicaNegocio;

import java.util.ArrayList;

public class Facultad {
    private  String nombre;
    private ArrayList<Carrera> carreras;

    public Facultad() {
        carreras = new ArrayList<>();
    }

    public String mostrarNombre() {
        return nombre;
    }

    public void tomarNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> obtenerCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }
    
    public void agregarCarrera(Carrera carrera){
        this.carreras.add(carrera);
    }
}
