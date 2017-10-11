package CapaLogicaNegocio;

import java.util.ArrayList;
import CapaPresentacion.PantallaConvocatoriaConcurso;

public class GestorConvocatoriaConcurso {
    //Atributos 
    //--Datos Primitivos
    private String nombreFacultadUsuarioLogueado;
    private Sesion activa;
    private ArrayList<String> listadoCarrerasFacultadUsuarioLogueado;
    
    //--Referencias a Objetos
    private ArrayList<Carrera> carrerasFacultadUsuarioLogueado; 
    private PantallaConvocatoriaConcurso pantalla;
    
            
    //Metodos
    public GestorConvocatoriaConcurso(Sesion activa, PantallaConvocatoriaConcurso pantalla){
        // Por Parametros
        this.activa = activa;
        this.pantalla = pantalla;
        
        // Creacion        
        this.nombreFacultadUsuarioLogueado = "";
        this.carrerasFacultadUsuarioLogueado = new ArrayList<>();
        this.listadoCarrerasFacultadUsuarioLogueado = new ArrayList<>();
    }
    
    
    
    private String buscarNombreFacultadUsuarioLogueado(){
        return activa.obtenerNombreFacultad();
    }
    
    private ArrayList<Carrera> buscarCarreras(){
        
        return activa.obtenerCarrerasFacultadUsuarioLogueado();
    } 
    
    public void registrarConvocatoria(){
        this.nombreFacultadUsuarioLogueado = this.buscarNombreFacultadUsuarioLogueado();
        
        this.carrerasFacultadUsuarioLogueado = this.buscarCarreras();
        
        for (Carrera carrera : carrerasFacultadUsuarioLogueado) {
            this.listadoCarrerasFacultadUsuarioLogueado.add(carrera.getNombre());
        }
        
        pantalla.presentarNombreFacultad(this.nombreFacultadUsuarioLogueado);
        pantalla.presentarCarreras(this.listadoCarrerasFacultadUsuarioLogueado);
        
        
        
    }
}
