/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Usuario;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Usuario
 */
public class UsuarioDl {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    public List listar(){
        String sql="SELECT us.id_Usuarios, ac.IdAcudiente, us.Nombre, us.Apellido, us.Documento, us.FechaNacimiento, us.Telefono, us.Contrasena, us.Correo FROM usuario us, acudiente ac "
                + "WHERE us.IdAcudiente=ac.IdAcudiente";
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }
    public List buscar(int id_Usuarios){
        String sql="SELECT us.id_Usuarios, ac.IdAcudiente, us.Nombre, us.Apellido, us.Documento, us.FechaNacimiento, us.Telefono, us.Contrasena, us.Correo FROM usuario us, acudiente ac "
                + "WHERE us.IdAcudiente=ac.IdAcudiente and us.id_Usuarios="+id_Usuarios;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void eliminar(int id_Usuarios){
        String sql="DELETE FROM usuario WHERE id_Usuarios="+id_Usuarios;
        this.jdbctemplate.update(sql);
    }
    public void insertar(Usuario us){
        String sql="INSERT INTO usuario(IdAcudiente, Nombre, Apellido, Documento, FechaNacimiento, Telefono, Contrasena, Correo) VALUES (?,?,?,?,?,?,?,?)";
        jdbctemplate.update(sql,us.getIdAcudiente(),us.getNombre(),us.getApellido(),us.getDocumento(),us.getFechaNacimiento(),us.getTelefono(),us.getContrasena(),us.getCorreo());
    }
    public void actualizar(Usuario us){
        String sql="UPDATE usuario SET IdAcudiente=?,Nombre=?,Apellido=?,Documento=?,FechaNacimiento=?,Telefono=?,Contrasena=?,Correo=? WHERE id_Usuarios=?";
        jdbctemplate.update(sql,us.getIdAcudiente(),us.getNombre(),us.getApellido(),us.getDocumento(),us.getFechaNacimiento(),us.getTelefono(),us.getContrasena(),us.getCorreo(),us.getId_Usuarios());
    }
}
