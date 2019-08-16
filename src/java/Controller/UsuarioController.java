/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.AcudienteBl;
import Business.UsuarioBl;
import Model.Usuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */
public class UsuarioController {
    UsuarioBl usuariobl=new UsuarioBl();
    AcudienteBl acudientebl=new AcudienteBl();
    List datos;
    int IdAcudiente ;
    int id_Usuarios;
    ModelAndView mav=new ModelAndView();
    @RequestMapping("indexUser.htm") 
    public ModelAndView Listar(){
        datos=usuariobl.Listar();
        mav.addObject("lista", datos);
        mav.setViewName("indexUser");
        return mav;
    }
    @RequestMapping(value="RegisterUser.htm", method = RequestMethod.GET )
    public ModelAndView Agregar(){
        mav.addObject(new Usuario());
        datos = acudientebl.listarAcu();//Instanciar CiudBL clase de negocio
        mav.addObject("lista",datos);
        mav.setViewName("RegisterUser");
        return mav;
    }
    @RequestMapping(value="RegisterUser.htm", method = RequestMethod.POST )
    public ModelAndView Agregar(Usuario us) {
        usuariobl.Insertar(us);
        return new ModelAndView("redirect:/index.htm");
    }
     @RequestMapping(value = "editarUsuario.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        id_Usuarios= Integer.parseInt(request.getParameter("id_Usuarios"));
        datos = usuariobl.Buscar(id_Usuarios);
        mav.addObject("lista", datos);
        mav.setViewName("editarUsuario");
        return mav;
    }
    @RequestMapping(value = "editarUsuario.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Usuario us) {
        usuariobl.Actualizar(us);
        return new ModelAndView("redirect:/indexPage.htm");
    }
    @RequestMapping("deleteUsuario.htm")
    public ModelAndView Delete(HttpServletRequest request) {
        id_Usuarios = Integer.parseInt(request.getParameter("id_Usuarios"));
        usuariobl.Eliminar(id_Usuarios);
        return new ModelAndView("redirect:/index.htm");
    }
}
