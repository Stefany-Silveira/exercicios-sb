package br.com.stefany.exerciciossb.model.repository;

import br.com.stefany.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
