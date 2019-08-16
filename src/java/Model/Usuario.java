/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private int id_Usuarios; 
    private int IdAcudiente ; 
    private String Nombre ;
    private String Apellido  ;
    private String Documento  ;
     private Date FechaNacimiento  ;
    private String Telefono  ;
    private String Contrasena   ;
    private String Correo   ;

    public int getId_Usuarios() {
        return id_Usuarios;
    }

    public void setId_Usuarios(int id_Usuarios) {
        this.id_Usuarios = id_Usuarios;
    }

    public int getIdAcudiente() {
        return IdAcudiente;
    }

    public void setIdAcudiente(int IdAcudiente) {
        this.IdAcudiente = IdAcudiente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
}
