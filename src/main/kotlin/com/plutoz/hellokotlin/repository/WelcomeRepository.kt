package com.plutoz.hellokotlin.repository

import com.plutoz.hellokotlin.domain.Welcome
import org.springframework.data.repository.CrudRepository

interface WelcomeRepository : CrudRepository<Welcome, Long> {
}