package CapaLogicaNegocio;

public class Catedra {
    private String nombre;
    private int codigo;
    private int nivel;
    private String sigla;

    public Catedra() {
    
    }

    public Catedra(String nombre, int codigo, int nivel, String sigla) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nivel = nivel;
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }     
}
