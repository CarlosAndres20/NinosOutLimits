/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.AsignaturaDl;
import Model.Asignatura;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class AsignaturaBl {
        AsignaturaDl asignaturadl=new AsignaturaDl();
    public List listar(){
        return asignaturadl.listar();
    }
    public void insertar(Asignatura as){
        asignaturadl.insertar(as);
    }
    public List buscar(int id_Asignaturas){
        return asignaturadl.buscar(id_Asignaturas);
    }
    public void actualizar(Asignatura as){
        asignaturadl.actualizar(as);
    }
    public void eliminar(int id_Asignaturas){
        asignaturadl.eliminar(id_Asignaturas);
    }
}
