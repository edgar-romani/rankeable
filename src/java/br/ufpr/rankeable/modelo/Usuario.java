/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.modelo;

import static javax.swing.text.StyleConstants.Size;


    public class Usuario {
   
    private String nome;
    private String senha;
    
    private boolean finalizado;

    public Usuario(){
        super();
    }

      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
