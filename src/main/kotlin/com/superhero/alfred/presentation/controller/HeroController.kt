package com.superhero.alfred.presentation.controller

import com.superhero.alfred.domain.entity.Intervention
import com.superhero.alfred.usescases.InterventionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class HeroController {

    @Autowired
    private lateinit var interventionService: InterventionService

    @PostMapping("/hero")
    fun heroDispo(@Valid @RequestBody interventionRequest: InterventionRequest): ResponseEntity<*> {
        val intervention = interventionService.createIntervention(interventionRequest)
        return ResponseEntity.ok(
                intervention
        )
    }


}
