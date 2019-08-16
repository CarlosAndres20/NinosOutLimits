/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.CursoDl;
import Model.Curso;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CursoBl {
    CursoDl cursodl=new CursoDl();
    public List listar(){
    return cursodl.listar();
    }
    public List buscar(int id_Cursos ){
        return cursodl.buscar(id_Cursos);
    }
    public void insertar(Curso c){
        cursodl.insertar(c);
    }
    public void actualizar(Curso c){
        cursodl.actualizar(c);
    }
    public void eliminar(int id_Cursos){
        cursodl.eliminar(id_Cursos);
    }
}
