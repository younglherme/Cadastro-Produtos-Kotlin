package br.com.guisilva.crud.controller

import br.com.guisilva.crud.entity.Produto
import br.com.guisilva.crud.service.ProdutoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produtos")
class ProdutoController(private val service: ProdutoService) {

    @GetMapping
    fun listar() = service.listar()

    @PostMapping
    fun salvar(@RequestBody produto: Produto) = service.salvar(produto)

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long) = service.buscarPorId(id)

}