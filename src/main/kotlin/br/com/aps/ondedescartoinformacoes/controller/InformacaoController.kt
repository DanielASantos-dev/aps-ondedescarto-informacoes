package br.com.aps.ondedescartoinformacoes.controller

import br.com.aps.ondedescartoinformacoes.Mensagem
import br.com.aps.ondedescartoinformacoes.entity.InformacaoModel
import br.com.aps.ondedescartoinformacoes.service.InformacaoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/informacoes")
class InformacaoController(val informacaoService: InformacaoService) {


    @GetMapping("/{titulo}")
    fun buscarInformacaoPorTitulo(@PathVariable titulo: String): InformacaoModel{
        return informacaoService.buscarInformacaoPorTitulo(titulo)

    }


}