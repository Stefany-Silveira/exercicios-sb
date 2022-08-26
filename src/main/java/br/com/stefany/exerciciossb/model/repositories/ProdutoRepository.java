package br.com.stefany.exerciciossb.model.repositories;

import br.com.stefany.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

}
