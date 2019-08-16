/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Matricula;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Usuario
 */
public class MatriculaDl {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    public List listar(){
        String sql="SELECT * FROM matricula";
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }
    public List buscar(int id_Matriculas){
        String sql="SELECT * FROM matricula WHERE id_Matriculas="+id_Matriculas;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
     public List buscarUsuario(int id_Usuarios ){
        String sql="SELECT * FROM matricula Where id_Usuarios="+id_Usuarios;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
     public void insertar(Matricula m){
         String sql="INSERT INTO matricula ( id_Usuarios, id_Cursos, Fecha) VALUES VALUES(?,?,?)";
         jdbctemplate.update(sql,m.getId_Usuarios(),m.getId_Cursos(),m.getFecha());
    }
     public void actualizar(Matricula m){
         String sql="UPDATE `matricula` SET id_Usuarios=?,id_Cursos=?,Fecha=? WHERE id_Matriculas=?";
         jdbctemplate.update(sql,m.getId_Usuarios(),m.getId_Cursos(),m.getFecha(),m.getId_Matriculas());
    }
     public void eliminar(int id_Matriculas){
        String sql="DELETE FROM `matricula` WHERE id_Matriculas="+id_Matriculas;
        this.jdbctemplate.update(sql);
    }
}
