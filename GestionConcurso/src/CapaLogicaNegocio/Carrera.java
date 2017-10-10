
package CapaLogicaNegocio;

import CapaLogicaNegocio.Iterador.IteradorCatedra;
import CapaLogicaNegocio.Iterador.ListaCatedras;
import java.util.ArrayList;

public class Carrera implements ListaCatedras{
    private String nombre;
    private String descripcion;
    private ArrayList<Catedra> catedras;
    
    public Carrera(){
        catedras = new ArrayList<>();
    }

    //HACER BIEN!!!
    public IteradorCatedra crearIterador(){
        
        return new IteradorCatedra();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Catedra> getCatedras() {
        return catedras;
    }
    
    public void agregarCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }
    
    
}
