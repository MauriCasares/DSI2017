package CapaLogicaNegocio.Iterador;

import CapaLogicaNegocio.*;
import java.util.ArrayList;

public class IteradorCatedra implements Iterador{
    private ArrayList<Catedra> catedras;
    private int posicion;
   
    public IteradorCatedra(){
        this.catedras = new ArrayList<>();
        this.posicion = 0;
    }
    
    public IteradorCatedra(ArrayList<Catedra> catedras){
        this.catedras = catedras;
        this.posicion = 0;
    }
    
    
    //HACER!!!!
    
    public String mostrarNombreElementoActual(){
        
        return "";
    }
    
    public boolean cumpleFiltro(String nombreCatedra){
        
        
        return true;
    }
    
    public Object elementoActual(){
        return null;
    }
    
    
    public boolean haTerminado(){
        return false;
    }
    
    public void primero(){
        
    }
    
    public void siguiente(){
        
    }
    
}
