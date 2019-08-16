/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.AcudienteBl;
import Model.Acudiente;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */
public class AcudienteController {
    ModelAndView mav=new ModelAndView();
    AcudienteBl acudientebl=new AcudienteBl();
    int id_Acudientes;
    List datos;
    @RequestMapping("indexAcudiente.htm")
    public ModelAndView Listar()
    {
        datos=acudientebl.listar();
        mav.addObject("lista",datos);
        mav.setViewName("indexAcudiente");
        return mav;
    }
    
    @RequestMapping(value="index.htm", method = RequestMethod.GET)
    public ModelAndView Agregar( )
    {
        mav.addObject(new AcudienteController());
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping(value="index.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Acudiente ac)
    {
        acudientebl.insertar(ac);
        return new ModelAndView("redirect:/RegisterUser.htm");
    }
    @RequestMapping(value="editarAcudiente.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request)
    {
        
        id_Acudientes=Integer.parseInt(request.getParameter("id_Acudientes"));
        datos=acudientebl.buscar(id_Acudientes);
        mav.addObject("lista",datos);
        mav.setViewName("editarAcudiente");
        return mav;
    }
    @RequestMapping(value="editarAcudiente.htm",method = RequestMethod.POST)
    public ModelAndView Editar(Acudiente ac)
    {
        acudientebl.actualizar(ac);
        return new ModelAndView("redirect:/index.htm");
    }
    @RequestMapping("deleteAcudiente.htm")
    public ModelAndView Delete(HttpServletRequest request)
    {
        id_Acudientes=Integer.parseInt(request.getParameter("id_Acudientes"));
        acudientebl.eliminar(id_Acudientes);
        return new ModelAndView("redirect:/index.htm");
    }
}
