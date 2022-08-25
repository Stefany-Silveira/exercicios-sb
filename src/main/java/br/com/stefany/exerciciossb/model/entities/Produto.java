package br.com.stefany.exerciciossb.model.entities;

import br.com.stefany.exerciciossb.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @Autowired
    @Transient
    public ProdutoRepository repository;

    public Produto() {

    }

    public Produto(String nome) {
        super();
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
