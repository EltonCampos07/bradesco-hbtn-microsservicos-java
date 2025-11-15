package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
        return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "user", required = false) String user,
                        @RequestParam(value = "password", required = false) String password) {

        String u = user == null ? "" : user.trim();
        String p = password == null ? "" : password.trim();

        if (u.isEmpty() || p.isEmpty()) {
            return "USUÁRIO E SENHA NÃO INFORMADOS";
        }

        if (u.length() > 15 || p.length() > 15) {
            return "USUÁRIO E SENHA INVÁLIDOS";
        }

        return "LOGIN EFETUADO COM SUCESSO !!!";
    }

}
