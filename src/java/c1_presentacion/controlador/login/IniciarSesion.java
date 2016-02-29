/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.controlador.login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hacybeyker
 */
public class IniciarSesion extends GestionarLoginComando{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        String url_retorno = "c1_presentacion/PaginaPrincipal.jsp";
        String usuario,password;
        usuario = request.getParameter("usuario");
        password = request.getParameter("password");        
        try{
            if (usuario.equalsIgnoreCase("Hacybeyker") && password.equalsIgnoreCase("123")) {
            Cookie cookie = new Cookie("usuario", usuario);
            cookie.setMaxAge(30*60);
            response.addCookie(cookie);
            //response.sendRedirect(url_retorno);
            } else {
                url_retorno = "CerrarSesion";
            }            
        }catch(Exception ex){
            url_retorno = "CerrarSesion";
        }
        return url_retorno;
    }
    
}
