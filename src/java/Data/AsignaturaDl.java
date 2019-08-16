/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Asignatura;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Usuario
 */
public class AsignaturaDl {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    public List listar(){
            String sql="SELECT a.id_Asignaturas, j.id_Juegos,j.Nivel, a.Nombre FROM asignatura a,juego j  where j.id_Juegos=a.id_Juegos";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
    public void insertar(Asignatura as){
        String sql="INSERT INTO asignatura(id_Asignaturas,id_Juegos,Nombre) VALUES (?,?,?)";
        jdbctemplate.update(sql,as.getId_Asignaturas(),as.getId_Juegos(),as.getNombre());
    }
    public List buscar(int id_Asignaturas){
        String sql="SELECT * FROM asignatura where id_Asignaturas="+id_Asignaturas;
        datos= this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Asignatura as){
        String sql="update asignatura set id_Juegos=?,Nombre=? where id_Asignaturas=?";
        jdbctemplate.update(sql,as.getId_Juegos(),as.getNombre(),as.getId_Asignaturas());
    }
    public void eliminar(int id_Asignaturas){
        String sql="DELETE FROM asignatura WHERE id_Asignaturas="+id_Asignaturas;
        this.jdbctemplate.update(sql);
    }
}
