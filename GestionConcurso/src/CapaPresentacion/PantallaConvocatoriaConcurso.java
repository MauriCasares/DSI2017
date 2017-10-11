package CapaPresentacion;

import CapaLogicaNegocio.*;
import java.util.ArrayList;

public class PantallaConvocatoriaConcurso
{
    private GestorConvocatoriaConcurso gestor;
    
    private PantallaConvocatoriaConcurso(){
        
    }
    
    private void habilitar(){
       
    }
    
    public void presentarNombreFacultad(String nombreFacultadUsuarioLogueado)
    {
        System.out.println("Facultad: " + nombreFacultadUsuarioLogueado);
    }
    
    public void presentarCarreras(ArrayList<String> listadoCarrerasFacultadUsuarioLogueado)
    {
        for (String nombreCarrera : listadoCarrerasFacultadUsuarioLogueado) {
             System.out.println(" " + nombreCarrera);
        }
        
        
    }
    
    
    
    public void opcionConvocatoriaConcurso(){
        //VER SINGLETON
        //habilitar()
        
        gestor.registrarConvocatoria();
         
         
    }
}
