package br.com.kaiiquecosta.todolist.controller;

import org.springframework.stereotype.controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//https://c6118vgg-960.brs.devtunnels.ms// ----
public class MinhaPrimeiraController {

    // Métodos de acesso do HTTP
    // * GET - Buscar uma informação
    // * POST - Adicionar um dado/informação
    // * PUT - Alterar um dado/info
    // * DELETE - Remover um dado
    // * PATCH - Alterar somente uma parte da info/dado

    // Método (Funcionalidade) de uma classe
    @GetMapping("/")
    public String primeiraMensagem () {
        return "Funcionou";
    }
}