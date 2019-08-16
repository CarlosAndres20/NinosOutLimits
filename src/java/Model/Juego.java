/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Juego {
    private int id_Juegos;
    private int id_Usuarios;
    private String Nivel;
    private int Puntuacion ;
    Boolean condicion;

    public Boolean getCondicion() {
        return condicion;
    }

    public void setCondicion(Boolean condicion) {
        this.condicion = condicion;
    }

    public int getId_Juegos() {
        return id_Juegos;
    }

    public void setId_Juegos(int id_Juegos) {
        this.id_Juegos = id_Juegos;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public int getId_Usuarios() {
        return id_Usuarios;
    }

    public void setId_Usuarios(int id_Usuarios) {
        this.id_Usuarios = id_Usuarios;
    }
}
