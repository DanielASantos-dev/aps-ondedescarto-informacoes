package br.com.aps.ondedescartoinformacoes.repository

import br.com.aps.ondedescartoinformacoes.entity.InformacaoModel
import org.springframework.data.jpa.repository.JpaRepository

interface InformacaoRepository: JpaRepository<InformacaoModel, Integer> {

    fun findByTituloContainsIgnoreCase(titulo:String):InformacaoModel
}