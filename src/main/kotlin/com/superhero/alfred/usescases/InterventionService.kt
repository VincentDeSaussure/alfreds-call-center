package com.superhero.alfred.usescases

import com.superhero.alfred.domain.entity.Intervention
import com.superhero.alfred.infra.repository.HeroRepository
import com.superhero.alfred.presentation.controller.InterventionRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InterventionService {

    @Autowired
    private lateinit var interventionRepository: HeroRepository

    fun createIntervention(heroRequest: InterventionRequest): Intervention {
        val hero = Intervention(
                hero = heroRequest.name,
                action = "standby",
                localisation = "batcave"
        )
        interventionRepository.save(hero)
        return hero
    }

    fun getAll(): MutableList<Intervention> = interventionRepository.findAll()


}
