package br.com.aps.ondedescartoinformacoes.service

import br.com.aps.ondedescartoinformacoes.entity.InformacaoModel
import br.com.aps.ondedescartoinformacoes.repository.InformacaoRepository
import org.springframework.stereotype.Service

@Service
class InformacaoService(val informacaoRepository: InformacaoRepository) {

        fun salvarInformacao(informacaoModel: InformacaoModel){
            informacaoRepository.save(informacaoModel)
        }

        fun buscarInformacaoPorTitulo(titulo: String): InformacaoModel{
            return informacaoRepository.findByTituloContainsIgnoreCase(titulo)
        }

}