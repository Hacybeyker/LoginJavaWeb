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
public abstract class GestionarLoginComando {        
    public abstract String ejecutar(HttpServletRequest request, HttpServletResponse response);    
    public static GestionarLoginComando instanciarComando(String claseComando) {
       GestionarLoginComando gestionarLoginComando;
        String nombreClaseComando;
        try{
            nombreClaseComando = "c1_presentacion.controlador.login." + claseComando;
            gestionarLoginComando = (GestionarLoginComando)Class.forName(nombreClaseComando).newInstance();      
            return gestionarLoginComando;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            return null;
        }
    }
}
