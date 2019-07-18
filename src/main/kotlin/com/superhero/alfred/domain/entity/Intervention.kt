package com.superhero.alfred.domain.entity

import javax.persistence.*

@Entity
@Table(name = "interventions")
data class Intervention(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(nullable = false)
        var hero: String? = null,

        @Column(nullable = false)
        var action: String? = null,

        @Column(nullable = false)
        var localisation: String? = null
)
