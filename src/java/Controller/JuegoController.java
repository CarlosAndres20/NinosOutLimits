/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.JuegoBl;
import Business.MatriculaBl;
import Model.Juego;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */
public class JuegoController {
    ModelAndView mav=new ModelAndView();
    JuegoBl juegobl=new JuegoBl();
    MatriculaBl matriculabl=new MatriculaBl();
    int id_Juegos;
    int id_Usuarios;
    List datos;
    @RequestMapping(value= "indexJuego.htm")
    public ModelAndView Listar(){
        datos=juegobl.listar();
        mav.addObject("lista",datos);
        mav.setViewName("indexJuego");
        return mav;
    }
    /*@RequestMapping(value= "Juego.htm")
    public ModelAndView buscarUsuario(HttpServletRequest request){
        datos=matriculabl.buscarUsuario(id_Usuarios);
        mav.addObject("lista",datos);
        mav.setViewName("indexJuego");
        return mav;
    }*/
    @RequestMapping("Juego.htm")
    public ModelAndView ListarJuegos(){
    datos=matriculabl.listar();
    mav.addObject("lista",datos);
    mav.setViewName("Juego");
    return mav;
    }
    @RequestMapping( value="indexActivo.htm",method = RequestMethod.GET)
    public ModelAndView buscarJuego(HttpServletRequest request){
        id_Usuarios=Integer.parseInt(request.getParameter("id_Usuarios"));
        datos=juegobl.buscarJuego(id_Usuarios);
        mav.addObject("listaj",datos);
        mav.setViewName("indexActivo");
        return mav;
    }
    @RequestMapping(value="AgregarJuego.htm", method = RequestMethod.GET)
    public ModelAndView Agregar( )
    {
        mav.addObject(new JuegoController());
        mav.setViewName("AgregarJuego");
        return mav;
    }
    @RequestMapping(value="AgregarJuego.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Juego j){
        juegobl.insertar(j);
        return new ModelAndView("redirect:/indexJuego.htm");
    }
    @RequestMapping(value="editarJuego.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request)
    {
        id_Juegos=Integer.parseInt(request.getParameter("id_Juegos"));
        datos=juegobl.buscar(id_Juegos);
        mav.addObject("lista",datos);
        mav.setViewName("editarJuego");
        return mav;
    }
    @RequestMapping(value="editarJuego.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Juego j)
    {
        juegobl.actualizar(j);
        return new ModelAndView("redirect:/indexJuego.htm");
    }
    @RequestMapping("deleteJuego.htm")
    public ModelAndView Delete(HttpServletRequest request)
    {
        id_Juegos=Integer.parseInt(request.getParameter("id_Juegos"));
        juegobl.eliminar(id_Juegos);
        return new ModelAndView("redirect:/indexJuego.htm");
    }
    
}
