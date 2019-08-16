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
public class Curso {
    private int id_Cursos;
    private int id_Asignaturas;
    private String Nombre;
    private String NumeroEstudiantes ;
    private String FechaInicio ;
    private String FechaFin ;

    public int getId_Cursos() {
        return id_Cursos;
    }

    public void setId_Cursos(int id_Cursos) {
        this.id_Cursos = id_Cursos;
    }

    public int getId_Asignaturas() {
        return id_Asignaturas;
    }

    public void setId_Asignaturas(int id_Asignaturas) {
        this.id_Asignaturas = id_Asignaturas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumeroEstudiantes() {
        return NumeroEstudiantes;
    }

    public void setNumeroEstudiantes(String NumeroEstudiantes) {
        this.NumeroEstudiantes = NumeroEstudiantes;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }
}
