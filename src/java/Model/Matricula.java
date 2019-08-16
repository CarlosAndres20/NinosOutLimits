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
public class Matricula {
    private int id_Matriculas ;
    private int id_Usuarios  ;
    private int id_Cursos  ;
    private String Fecha ;

    public int getId_Matriculas() {
        return id_Matriculas;
    }

    public void setId_Matriculas(int id_Matriculas) {
        this.id_Matriculas = id_Matriculas;
    }

    public int getId_Usuarios() {
        return id_Usuarios;
    }

    public void setId_Usuarios(int id_Usuarios) {
        this.id_Usuarios = id_Usuarios;
    }

    public int getId_Cursos() {
        return id_Cursos;
    }

    public void setId_Cursos(int id_Cursos) {
        this.id_Cursos = id_Cursos;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}
