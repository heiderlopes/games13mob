package br.com.heiderlopes.games.repository

import br.com.heiderlopes.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : MongoRepository<Game, String> {

    fun findByNomeIgnoreCaseContaining(nome: String) : List<Game>

}