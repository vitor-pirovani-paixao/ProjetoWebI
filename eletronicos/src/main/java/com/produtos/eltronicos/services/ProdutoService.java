package com.produtos.eltronicos.services;

import com.produtos.eltronicos.model.Produto;
import com.produtos.eltronicos.repositories.ProdutoRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    @NonNull
    private ProdutoRepository produtoRepository;

    public List<Produto> getAllProducts(){
        return produtoRepository.findAll();
    }

    public Produto saveProduct(Produto produto){
        return produtoRepository.save(produto);
    }

    public String deleteById(Long id){
        produtoRepository.deleteById(id);
        return "Produto excluído com sucesso";
    }

    public Produto getById(Long id){
        return produtoRepository.findById(id).orElse(null);
    }
}
