/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Juego;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Usuario
 */
public class JuegoDl {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
     public List listar(){
        String sql="SELECT * FROM juego ";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    }
     public List listarJ(){
        String sql="SELECT * FROM juego WHERE condicion=1 ";
        datos = jdbctemplate.queryForList(sql);
        return datos;
    } 
    public void insertar(Juego j){
        String sql="INSERT INTO juego(Nivel, Puntuacion,condicion) VALUES (?,?,?)";
        jdbctemplate.update(sql,j.getNivel(),j.getPuntuacion(),j.getCondicion());
    }
    public List buscar(int id_Juegos){
        String sql="SELECT * FROM juego where id_Juegos="+id_Juegos;
        datos= this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public List buscarJuego(int id_Usuarios){
        String sql="SELECT  us.Nombre,j.Nivel,j.Puntuacion FROM  matricula m, curso c, asignatura asi, juego j, usuario us WHERE us.id_Usuarios=m.id_Usuarios and c.id_Cursos=m.id_Cursos and  j.id_Juegos=asi.id_Juegos and c.id_Asignaturas=asi.id_Asignaturas and m.id_Usuarios=1"+id_Usuarios;
        datos= this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Juego j){
        String sql="update juego set Nivel=?,Puntuacion=? condicion=? where id_Juegos=?";
        jdbctemplate.update(sql,j.getNivel(),j.getPuntuacion(),j.getCondicion(),j.getId_Juegos());
    }
    public void eliminar(int id_Juegos){
        String sql="DELETE FROM juego WHERE id_Juegos="+id_Juegos;
        this.jdbctemplate.update(sql);
    }
}
