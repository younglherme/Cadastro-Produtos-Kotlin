package br.com.guisilva.crud.repository

import br.com.guisilva.crud.entity.Produto
import org.springframework.data.jpa.repository.JpaRepository


interface ProdutoRepository : JpaRepository<Produto, Long> {
}