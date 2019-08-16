/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.UsuarioDl;
import Model.Usuario;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuarioBl {
    UsuarioDl usuariodl=new UsuarioDl();
    public List Listar(){
        return usuariodl.listar();
    }
    public List Buscar(int id_Usuarios){
        return usuariodl.buscar(id_Usuarios);
    }
    public void Insertar(Usuario us){
        usuariodl.insertar(us);
    }
    public void Actualizar(Usuario us){
        usuariodl.actualizar(us);
    }
    public void Eliminar(int id_Usuarios){
        usuariodl.eliminar(id_Usuarios);
    }
}
