package CapaLogicaNegocio;

import java.util.Date;

public class Concurso {

    private Date fechaCreacion;
    private Date fechaEstimadaConvocatoriaInscripcion;
    private Date fechaEstimadaRealizacion;
    
    private Date fechaDesdeInscripcionAspirantes;
    private Date fechaFinInscripcionAspirantes;
    private Date fechaLimiteRecepcionTemas;
    private Date fechaSorteoTemas;
    private Date fechaClasePublica;
    
    private Date fechaDesdeExcusacion;
    private Date fechaLimiteExcusacion;
    private Date fechaDesdeRecusacion;
    private Date fechaLimiteRecusacion;
    // ESTADOS CON PATRON STATE

    private CargoLlamado cargos;
    private MiembroTribunal[] tribunal; //Maximo 6
    private Sorteo sorteo;
    
    private String lugarDesignado;
    private EjecucionConcurso sustanciacion;    
    
    private int numeroExpediente;
    private Catedra catedra;

    public Concurso() {
        this.fechaCreacion = new Date();
        this.fechaEstimadaConvocatoriaInscripcion = new Date();
        this.fechaEstimadaRealizacion = new Date();
        this.fechaDesdeInscripcionAspirantes = new Date();
        this.fechaFinInscripcionAspirantes = new Date();
        this.fechaLimiteRecepcionTemas = new Date();
        this.fechaSorteoTemas = new Date();
        this.fechaClasePublica = new Date();
        this.fechaDesdeExcusacion = new Date();
        this.fechaLimiteExcusacion = new Date();
        this.fechaDesdeRecusacion = new Date();
        this.fechaLimiteRecusacion = new Date();
        this.cargos = new CargoLlamado();
        this.tribunal = new MiembroTribunal[6];
        this.sorteo = new Sorteo();
        this.lugarDesignado = "";
        this.sustanciacion = new EjecucionConcurso();
        this.catedra = new Catedra();
    }

    
    
    
}
