package CapaLogicaNegocio;

import java.util.ArrayList;

public class CargoLlamado {
    private Categoria categoria;
    private int cantidad;
    private ArrayList<Inscripcion> inscripciones;
    
    public CargoLlamado(){
        inscripciones = new ArrayList<Inscripcion>();
        categoria = new Categoria();
    }
    
    
    
}
