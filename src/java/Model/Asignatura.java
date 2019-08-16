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
public class Asignatura {
    private int id_Asignaturas;
    private int id_Juegos ;
    private String Nombre ;

    public int getId_Asignaturas() {
        return id_Asignaturas;
    }

    public void setId_Asignaturas(int id_Asignaturas) {
        this.id_Asignaturas = id_Asignaturas;
    }

    public int getId_Juegos() {
        return id_Juegos;
    }

    public void setId_Juegos(int id_Juegos) {
        this.id_Juegos = id_Juegos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
