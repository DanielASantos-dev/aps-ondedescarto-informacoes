package br.com.aps.ondedescartoinformacoes.entity

import br.com.aps.ondedescartoinformacoes.Mensagem
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "informacoes")
data class InformacaoModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    val titulo: String,

    @Column(length = 1500)
    val mensagem: String
)
