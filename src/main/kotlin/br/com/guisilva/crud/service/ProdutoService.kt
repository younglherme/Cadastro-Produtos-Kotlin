package br.com.guisilva.crud.service

import br.com.guisilva.crud.entity.Produto
import br.com.guisilva.crud.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoService(private val repository: ProdutoRepository) {

    fun listar(): List<Produto> = repository.findAll()

    fun salvar(produto: Produto) = repository.save(produto)

    fun buscarPorId(id: Long) = repository.findById(id).orElse(null)

}