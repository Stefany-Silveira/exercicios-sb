package br.com.stefany.exerciciossb.controllers;

import br.com.stefany.exerciciossb.model.entities.Produto;
import br.com.stefany.exerciciossb.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public  @ResponseBody Produto novoProduto(@RequestParam String nome) {
        Produto produto = new Produto(nome);
        System.out.println(produto.repository);
        produtoRepository.save(produto);
        return produto;
    }
}
