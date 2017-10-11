package CapaPresentacion;

import CapaLogicaNegocio.*;

public class Main {

    public static void Main(String[] args) {
        Universidad utn = new Universidad();
        
        utn.setNombre("Universidad Tecnológica Nacional");
        utn.setSigla("UTN");
        
        Facultad frc = new Facultad();
        Facultad frvm = new Facultad();
        
        frc.tomarNombre("Facultad Regional Córdoba");
        frvm.tomarNombre("Facultad Regional Villa María");
        
        Carrera isi = new Carrera();
        Carrera iin = new Carrera();
        Carrera ici = new Carrera();
        
        isi.setNombre("Ingenieria en Sistemas de Información");
        isi.setDescripcion("DESCRIPCION Ingenieria en Sistemas de Información");
        iin.setNombre("Ingenieria Industrial");
        iin.setDescripcion("DESCRIPCION Ingenieria Industrial");
        ici.setNombre("Ingenieria Civil");
        ici.setDescripcion("DESCRIPCION Ingenieria Civil");
        
        Catedra ami = new Catedra(); //TODAS
        Catedra amii = new Catedra(); //TODAS
        Catedra mad = new Catedra(); // SIS
        Catedra aed = new Catedra(); //SIS
        Catedra cim = new Catedra(); //Ciencia de los Materiales (Industrial)
        Catedra mef = new Catedra(); //Mecanica de los Fluidos (Industrial)
        Catedra est = new Catedra(); //Estabilidad (Civil)
        Catedra rem = new Catedra(); //Resistencia de los Materiales (Civil)
        
        
        //LOS AGREGAR DEBERIAN VERIFICAR REPETIDOS
        isi.agregarCatedra(ami);
        isi.agregarCatedra(amii);
        isi.agregarCatedra(aed);
        isi.agregarCatedra(mad);
        
        iin.agregarCatedra(ami);
        iin.agregarCatedra(amii);
        iin.agregarCatedra(cim);
        iin.agregarCatedra(mef);
        
        ici.agregarCatedra(ami);
        ici.agregarCatedra(amii);
        ici.agregarCatedra(rem);
        ici.agregarCatedra(est);
        
        frc.agregarCarrera(ici);
        frc.agregarCarrera(isi);
        frc.agregarCarrera(iin);
        
        frvm.agregarCarrera(ici);
        frvm.agregarCarrera(isi);
        
        utn.agregarFacultad(frc);
        utn.agregarFacultad(frvm);
        
        //FALTA SESION Y USUARIO ACTIVOS
                
        //PantallaConvocatoriaConcurso pantalla = new PantallaConvocatoriaConcurso();
        //GestorConvocatoriaConcurso gestor = new GestorConvocatoriaConcurso(null, pantalla);
        
        
        
        
    }
}
