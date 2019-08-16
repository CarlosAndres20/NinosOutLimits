/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.CursoBl;
import Business.MatriculaBl;
import Business.UsuarioBl;
import Model.Matricula;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */
public class MatriculaController {
    ModelAndView mav=new ModelAndView();
    List datos;
    int id_Matriculas ;
     MatriculaBl matriculabl=new MatriculaBl();
     UsuarioBl usuariobl=new UsuarioBl();
     CursoBl cursobl= new CursoBl();
    @RequestMapping("indexMatricula.htm")
    public ModelAndView Listar(){
    datos=matriculabl.listar();
    mav.addObject("lista",datos);
    mav.setViewName("indexMatricula");
    return mav;
    }
     @RequestMapping(value = "agregarMatricula.htm", method = RequestMethod.GET)

    public ModelAndView Agregar() {

        mav.addObject(new Matricula());
        datos = usuariobl.Listar();//Instanciar CiudBL clase de negocio
        mav.addObject("listaUsuario",datos);
        datos = cursobl.listar();//Instanciar CiudBL clase de negocio
        mav.addObject("listaCurso",datos);
        mav.setViewName("agregarMatricula");
        return mav;
    }
    @RequestMapping(value = "agregarMatricula.htm", method = RequestMethod.POST)

    public ModelAndView Agregar(Matricula m) {
        matriculabl.insertar(m);
        return new ModelAndView("redirect:/indexMatricula.htm");
    }

    @RequestMapping(value = "editarMatricula.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        id_Matriculas = Integer.parseInt(request.getParameter("id_Matriculas"));
        datos = matriculabl.buscar(id_Matriculas);
        mav.addObject("lista", datos);
        mav.setViewName("editarMatricula");
        return mav;
    }

    @RequestMapping(value = "editarCiud.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Matricula m) {
        matriculabl.actualizar(m);
        return new ModelAndView("redirect:/indexMatricula.htm");
    }

    @RequestMapping("deleteMatricula.htm")
    public ModelAndView Delete(HttpServletRequest request) {
        id_Matriculas = Integer.parseInt(request.getParameter("id_Matriculas"));
        matriculabl.eliminar(id_Matriculas);
        return new ModelAndView("redirect:/indexCiud.htm");
    }
}
