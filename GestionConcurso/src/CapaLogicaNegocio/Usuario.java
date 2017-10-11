package CapaLogicaNegocio;

import java.util.ArrayList;

public class Usuario {
    private Facultad facultad;
    
    
    
    public String obtenerNombreFacultad(){
        return facultad.mostrarNombre();
    }
    
    public ArrayList<Carrera> obtenerCarrerasFacultadUsuarioLogueado(){
        return facultad.obtenerCarreras();
    }
}
