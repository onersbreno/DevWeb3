package com.exercicio2.exercicio2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Saudacoes {

    @GetMapping("/saudacao")
    @ResponseBody
    public String saudacao(HttpServletRequest request){
        String nome = request.getParameter("nome");
        
        return "Olá, " + nome;  
    }
    
}