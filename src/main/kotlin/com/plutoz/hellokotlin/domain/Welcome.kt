package com.plutoz.hellokotlin.domain

import javax.persistence.*

const val ID_SEQ_GENERATOR = "welcome_id_seq_gen"

@Entity
class Welcome(
        var message: String,

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ID_SEQ_GENERATOR)
        @SequenceGenerator(name = ID_SEQ_GENERATOR, sequenceName = "welcome_id_seq", allocationSize = 20)
        var id: Long? = null
)