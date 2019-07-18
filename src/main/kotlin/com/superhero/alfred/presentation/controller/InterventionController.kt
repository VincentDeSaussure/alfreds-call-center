package com.superhero.alfred.presentation.controller

import com.superhero.alfred.usescases.InterventionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InterventionController {

    @Autowired
    private lateinit var interventionService: InterventionService

    @GetMapping("/interventions")
    fun fetchListInterventions(): ResponseEntity<*> {
        val interventions = interventionService.getAll()
        return ResponseEntity.ok(
                interventions
        )
    }
}
