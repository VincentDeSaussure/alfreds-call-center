package com.superhero.alfred.infra.repository

import com.superhero.alfred.domain.entity.Intervention
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HeroRepository : JpaRepository<Intervention, Long> {

    fun findByHero(hero: String): Intervention?


}
