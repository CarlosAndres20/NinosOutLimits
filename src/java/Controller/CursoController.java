/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.AsignaturaBl;
import Business.CursoBl;
import Model.Curso;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */
public class CursoController {
    ModelAndView mav=new ModelAndView();
    List datos;
    AsignaturaBl asignaturabl=new AsignaturaBl();
    CursoBl cursobl=new CursoBl();
    int id_Cursos ;
       
    @RequestMapping("indexCurso.htm")
    public ModelAndView Listar(){
        datos = cursobl.listar();//Instanciar CiudBL clase de negocio
        mav.addObject("lista",datos);//Adicionar lista al ModelAndView     
        mav.setViewName("indexCurso");
        return mav;
    }
    /*@RequestMapping("indexCiud.htm")
    public ModelAndView ListarDep(){
        datos= deptobl.listaD();//Instanciar DeptoBL clase de negocio
        mav.addObject("lista",datos);      
        mav.setViewName("indexCiud");
        return mav;
    }*/
    

    @RequestMapping(value = "agregarCurso.htm", method = RequestMethod.GET)

    public ModelAndView Agregar() {

        mav.addObject(new Curso());
        datos = asignaturabl.listar();//Instanciar CiudBL clase de negocio
        mav.addObject("lista",datos);
        mav.setViewName("agregarCurso");
        return mav;
    }

    @RequestMapping(value = "agregarCurso.htm", method = RequestMethod.POST)

    public ModelAndView Agregar(Curso c) {

        cursobl.insertar(c);
        return new ModelAndView("redirect:/indexCurso.htm");
    }

    @RequestMapping(value = "editarCurso.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        id_Cursos = Integer.parseInt(request.getParameter("id_Cursos"));
        datos = cursobl.buscar(id_Cursos);
        mav.addObject("lista", datos);
        mav.setViewName("editarCurso");
        return mav;
    }

    @RequestMapping(value = "editarCurso.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Curso c) {
        cursobl.actualizar(c);
        return new ModelAndView("redirect:/indexCurso.htm");
    }

    @RequestMapping("deleteCurso.htm")
    public ModelAndView Delete(HttpServletRequest request) {
        id_Cursos = Integer.parseInt(request.getParameter("id_Cursos"));
        cursobl.eliminar(id_Cursos);
        return new ModelAndView("redirect:/indexCurso.htm");
    }
}
