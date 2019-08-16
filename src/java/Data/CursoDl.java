/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Curso;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Usuario
 */
public class CursoDl {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    public List listar(){
        String sql="SELECT c.id_Cursos, asi.id_Asignaturas, c.Nombre, c.NumeroEstudiantes, c.FechaInicio,c.FechaFin "
                + "FROM curso c,asignatura asi WHERE c.id_Asignaturas=asi.id_Asignaturas";
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }
    public List buscar(int id_Cursos){
        String sql="SELECT c.id_Cursos, asi.id_Asignaturas, c.Nombre, c.NumeroEstudiantes, c.FechaInicio,c.FechaFin "
                + "FROM curso c,asignatura asi WHERE c.id_Asignaturas=asi.id_Asignaturas and c.id_Cursos="+id_Cursos;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void insertar(Curso c){
        String sql="INSERT INTO curso( id_Asignaturas, Nombre, NumeroEstudiantes, FechaInicio, FechaFin) VALUES (?,?,?,?,?) ";
        jdbctemplate.update(sql,c.getId_Asignaturas(),c.getNombre(),c.getNumeroEstudiantes(),c.getFechaInicio(),c.getFechaFin());
    }
    public void actualizar(Curso cu){
        String sql="UPDATE curso SET id_Asignaturas=?,Nombre=?,NumeroEstudiantes=?,FechaInicio=?,FechaFin=? WHERE id_Cursos =?";
    }
    public void eliminar(int id_Cursos){
        String sql="DELETE FROM curso WHERE  id_Cursos="+id_Cursos;
        this.jdbctemplate.update(sql);
    }
}
