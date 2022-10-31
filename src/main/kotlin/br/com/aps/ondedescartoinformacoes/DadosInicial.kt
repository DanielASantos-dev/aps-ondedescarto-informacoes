package br.com.aps.ondedescartoinformacoes

import br.com.aps.ondedescartoinformacoes.entity.InformacaoModel
import br.com.aps.ondedescartoinformacoes.repository.InformacaoRepository
import br.com.aps.ondedescartoinformacoes.service.InformacaoService
import org.springframework.stereotype.Component

@Component
class DadosInicial(val informacaoService: InformacaoService) {

    init {
        iniciarDados()
    }


    fun iniciarDados(){
        informacaoService.salvarInformacao(
            InformacaoModel(
                titulo = Mensagem.PEV.titulo,
                mensagem = Mensagem.PEV.mensagem
            )
        )

    }
}