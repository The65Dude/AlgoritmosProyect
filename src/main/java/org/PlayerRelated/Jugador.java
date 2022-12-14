package org.PlayerRelated;

//Clase jugador donde se almacenan todos los atributos necesarios para el funcionamiento del sistema de inicio de sesion,
//del juego y del historial.

public class Jugador {
    private String usuario;
    private String password;
    private int posicion;
    private boolean turno;
    private int score;
    private int laps;
    private ListaHistoriales historial;

    public Jugador(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        posicion = 0;
        turno = true;
        this.historial = new ListaHistoriales();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ListaHistoriales getHistorial(){
        return historial;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return usuario + "-" + password;
    }
}
