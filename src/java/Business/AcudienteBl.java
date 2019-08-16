/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.AcudienteDl;
import Model.Acudiente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class AcudienteBl {
    AcudienteDl acudientedl=new AcudienteDl();
    public List listar(){
        return acudientedl.listar();
    }
    public List listarAcu(){
        return acudientedl.ListaUltimo();
    }
    public List buscar(int id_Acudientes){
        return acudientedl.buscar(id_Acudientes);
    }
    public void insertar(Acudiente ac)
    {
        acudientedl.insertar(ac);
    }
    public void eliminar(int IdAcudiente)
    {
        acudientedl.eliminar(IdAcudiente);
    }
    public void actualizar(Acudiente ac)
    {
        acudientedl.actualizar(ac);
    }

}
