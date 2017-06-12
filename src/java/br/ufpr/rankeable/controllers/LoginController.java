/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;

import br.ufpr.rankeable.dao.JdbcUsuarioDao;
import br.ufpr.rankeable.modelo.Usuario;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author julio
 */
@Controller
public class LoginController {
    
    @RequestMapping("loginForm")
    public String loginForm() {
        return "formulario-login";
    }
 
    @RequestMapping("efetuaLogin")
    public String efetuaLogin(Usuario usuario, HttpSession session) throws SQLException {
        if (new JdbcUsuarioDao().existeUsuario(usuario)) {
            session.setAttribute("usuarioLogado", usuario);
            return "menu";
        }
        return "redirect:telaVotacao";
}
}

