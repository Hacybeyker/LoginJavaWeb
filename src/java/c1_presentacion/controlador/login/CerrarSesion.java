/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.controlador.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hacybeyker
 */
public class CerrarSesion extends GestionarLoginComando{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        String url_retorno = "index.jsp";
        try{
            
        }catch(Exception ex){
            
        }
        return url_retorno;
    }
    
}
