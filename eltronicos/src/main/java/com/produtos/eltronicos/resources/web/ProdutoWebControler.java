package com.produtos.eltronicos.resources.web;

import com.produtos.eltronicos.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProdutoWebControler {

    @GetMapping("home")
    public String paginaInicial(){
        return "home";
    }

    @GetMapping("cadastrar")
    public String paginaDeCadastro(Model model){
        model.addAttribute("produto",new Produto());
        return "cadastrar";
    }

    @GetMapping("editar")
    public String paginaDeEdicao(Model model){
        model.addAttribute("produto",new Produto());
        return "editar";
    }

    @GetMapping("procurar")
    public String paginaDeProcura(Model model){
        model.addAttribute("produto",new Produto());
        return "procurar";
    }

    @GetMapping("deletar")
    public String paginaDeExculsao(Model model){
        model.addAttribute("produto",new Produto());
        return "deletar";
    }
}
