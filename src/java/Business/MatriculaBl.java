/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.MatriculaDl;
import Model.Matricula;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class MatriculaBl {
    MatriculaDl matriculadl=new MatriculaDl();
    public List listar(){
        return matriculadl.listar();
    }
    public List buscar(int id_Matriculas ){
        return matriculadl.buscar(id_Matriculas);
    }
    public List buscarUsuario(int id_Usuarios ){
        return matriculadl.buscarUsuario(id_Usuarios);
    }
    public void insertar(Matricula m){
        matriculadl.insertar(m);
    }
    public void actualizar(Matricula m){
        matriculadl.actualizar(m);
    }
    public void eliminar(int id_Matriculas){}
}
