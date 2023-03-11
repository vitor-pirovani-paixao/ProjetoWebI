package com.produtos.eltronicos.resources.api;

import com.produtos.eltronicos.model.Produto;
import com.produtos.eltronicos.services.ProdutoService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/0.0.1/produtos")
@RequiredArgsConstructor
public class ProdutoRestControler {

    @NonNull
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> getAllProducts() {
        return produtoService.getAllProducts();
    }

    @GetMapping("/deletar")
    public String deleteById(@ModelAttribute Produto produto, Model mode) {
        Integer d = 1;
        return produtoService.deleteById(produto.getId());
    }

    @GetMapping("/procurar")
    public Produto getById(@ModelAttribute Produto produto, Model model) {
        Integer d = 1;
        return produtoService.getById(produto.getId());
    }

    @PostMapping("/edit")
    public Object editById(@ModelAttribute Produto produtoToUpdate, Model model) {
        if (produtoService.getById(produtoToUpdate.getId()) == null){
            return "ID do produto não econtrado";
        }else{
            return produtoService.saveProduct(produtoToUpdate);
        }
    }

    @PostMapping("/save")
    public Produto save(@ModelAttribute Produto produto, Model model) {

        return produtoService.saveProduct(produto);
    }


}
