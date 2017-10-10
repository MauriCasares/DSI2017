package CapaLogicaNegocio;

import java.util.Date;

public class MiembroTribunal {
    private Evaluador evaluador;
    private TemaConcurso[] temasConcurso;
    
    private Date fechaAsignacion;
    private Date fechaHoraNotificacionDesignacion;
    
    private int orden;
    private boolean titular;
    private SolicitudExcusacion excusacion;

    public MiembroTribunal() {
        this.evaluador = new Evaluador();
        this.temasConcurso = new TemaConcurso[3];
        this.fechaAsignacion = new Date();
        this.fechaHoraNotificacionDesignacion = new Date();
        this.excusacion = new SolicitudExcusacion();
    }

    public MiembroTribunal(Evaluador evaluador, TemaConcurso[] temasConcurso, Date fechaAsignacion, Date fechaHoraNotificacionDesignacion, int orden, boolean titular, SolicitudExcusacion excusacion) {
        this.evaluador = evaluador;
        this.temasConcurso = temasConcurso;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaHoraNotificacionDesignacion = fechaHoraNotificacionDesignacion;
        this.orden = orden;
        this.titular = titular;
        this.excusacion = excusacion;
    }
    
    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public TemaConcurso getTemasConcurso(int indice) {
        return temasConcurso[indice];
    }

    public void setTemasConcurso(TemaConcurso[] temasConcurso) {
        this.temasConcurso = temasConcurso;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Date getFechaHoraNotificacionDesignacion() {
        return fechaHoraNotificacionDesignacion;
    }

    public void setFechaHoraNotificacionDesignacion(Date fechaHoraNotificacionDesignacion) {
        this.fechaHoraNotificacionDesignacion = fechaHoraNotificacionDesignacion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public SolicitudExcusacion getExcusacion() {
        return excusacion;
    }

    public void setExcusacion(SolicitudExcusacion excusacion) {
        this.excusacion = excusacion;
    }
    
    
    
    
}
