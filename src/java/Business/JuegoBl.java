/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.JuegoDl;
import Model.Juego;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class JuegoBl {
    JuegoDl juegodl=new JuegoDl();
    public List listar(){
        return juegodl.listar();
    }
    public List listaJ(){
        return juegodl.listarJ();
    }
    public void insertar(Juego j){
        juegodl.insertar(j);
    }
    public List buscar(int id_Juegos){
        return juegodl.buscar(id_Juegos);
    }
    public List buscarJuego(int id_Usuarios){
        return juegodl.buscarJuego(id_Usuarios);
    }
    public void actualizar(Juego j){
        juegodl.actualizar(j);
    }
    public void eliminar(int id_Juegos){
        juegodl.eliminar(id_Juegos);
    }
}
