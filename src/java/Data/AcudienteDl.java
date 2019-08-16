/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Acudiente;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Usuario
 */
public class AcudienteDl {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    public List listar()
    {
        String sql="SELECT * FROM acudiente";
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }
    public List ListaUltimo()
    {
        String sql="SELECT IdAcudiente, Nombre, Parentesco, Telefono, Email FROM acudiente WHERE IdAcudiente=(SELECT MAX(IdAcudiente)FROM acudiente )";
        datos=jdbctemplate.queryForList(sql);
        return datos;
    }
    public List buscar(int IdAcudiente)
    {
        String sql="SELECT * FROM acudiente WHERE IdAcudiente="+IdAcudiente;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void insertar(Acudiente ac)
    {
        String sql="INSERT INTO acudiente(Nombre,Parentesco ,Telefono, Email) VALUES (?,?,?,?)";
        jdbctemplate.update(sql,ac.getNombre(),ac.getParentesco(),ac.getTelefono(),ac.getEmail());
    }
    public void actualizar(Acudiente ac)
    {
        String sql="UPDATE acudiente SET Nombre=?,Parentesco=?,Telefono=?,Email=?  WHERE id_Acudientes =?";
        jdbctemplate.update(sql,ac.getNombre(),ac.getParentesco(),ac.getTelefono(),ac.getEmail());
    }
    public void eliminar(int IdAcudiente )
    {
        String sql="DELETE FROM acudiente WHERE IdAcudiente="+IdAcudiente ;
        this.jdbctemplate.update(sql);
    }
}
