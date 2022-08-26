package br.com.stefany.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.stefany.exerciciossb.model.entities.Produto;
import br.com.stefany.exerciciossb.model.repositories.ProdutoRepository;

import java.util.Optional;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public  @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    @PutMapping
    public Produto alterarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }


}
