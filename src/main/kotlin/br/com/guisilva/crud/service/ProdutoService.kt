package br.com.guisilva.crud.service

import br.com.guisilva.crud.entity.Produto
import br.com.guisilva.crud.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoService(private val repository: ProdutoRepository) {

    fun listar(): List<Produto> = repository.findAll()

    fun salvar(produto: Produto) = repository.save(produto)

    fun buscarPorId(id: Long) = repository.findById(id).orElse(null)

    fun atualizar(id: Long, produto: Produto): Produto? {
        val produtoExistente = repository.findById(id).orElse(null) ?: return null
        produtoExistente.nome = produto.nome
        produtoExistente.preco = produto.preco
        return repository.save(produtoExistente)
    }
    fun deletar(id: Long) {
        repository.deleteById(id)
    }

}