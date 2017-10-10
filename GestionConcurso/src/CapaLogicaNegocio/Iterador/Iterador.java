package CapaLogicaNegocio.Iterador;

public interface Iterador {
    Object elementoActual();
    boolean haTerminado();
    void primero();
    void siguiente();
}
