/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.AsignaturaBl;
import Business.JuegoBl;
import Model.Asignatura;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */
public class AsignaturaController {
    AsignaturaBl asignaturabl=new AsignaturaBl();
    JuegoBl juegobl=new JuegoBl();
    ModelAndView mav=new ModelAndView();
    List datos;
    int id_Asignaturas ;
    @RequestMapping("c.htm")
    public ModelAndView Listar(){
        datos = asignaturabl.listar();
        mav.addObject("lista",datos);  
        mav.setViewName("indexAsignatura");
        return mav;
    }
    @RequestMapping(value = "agregarAsignatura.htm", method = RequestMethod.GET)

    public ModelAndView Agregar() {

        mav.addObject(new Asignatura());
        datos = juegobl.listar();
        mav.addObject("lista",datos);
        mav.setViewName("agregarAsignatura");
        return mav;
    }

    @RequestMapping(value = "agregarAsignatura.htm", method = RequestMethod.POST)

    public ModelAndView Agregar(Asignatura asi) {
        asignaturabl.insertar(asi);
        return new ModelAndView("redirect:/indexAsignatura.htm");
    }

    @RequestMapping(value = "editarAsignatura.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        id_Asignaturas= Integer.parseInt(request.getParameter("id_Asignaturas"));
        datos = asignaturabl.buscar(id_Asignaturas);
        mav.addObject("lista", datos);
        mav.setViewName("editarCiud");
        return mav;
    }

    @RequestMapping(value = "editarAsignatura.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Asignatura asi) {
        asignaturabl.actualizar(asi);
        return new ModelAndView("redirect:/indexCiud.htm");
    }

    @RequestMapping("deleteAsignatura.htm")
    public ModelAndView Delete(HttpServletRequest request) {
        id_Asignaturas = Integer.parseInt(request.getParameter("id_Asignaturas"));
        asignaturabl.eliminar(id_Asignaturas);
        return new ModelAndView("redirect:/indexAsignatura.htm");
    }
}
