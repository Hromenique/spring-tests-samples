package br.com.hrom.demotestspringdb.repository

import br.com.hrom.demotestspringdb.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: JpaRepository<Person, Long> {
    fun countByJob(job: String): Long
}