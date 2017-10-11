
package CapaLogicaNegocio;

import java.util.ArrayList;


public class Sesion {
    private Usuario usuario;
    
    
    
    
    
    
    
    
    
    
    public String obtenerNombreFacultad(){
        return usuario.obtenerNombreFacultad();
    }
    
    public ArrayList<Carrera> obtenerCarrerasFacultadUsuarioLogueado(){
        return usuario.obtenerCarrerasFacultadUsuarioLogueado();
    }
    
}
