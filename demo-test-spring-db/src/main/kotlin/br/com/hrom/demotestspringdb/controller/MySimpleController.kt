package br.com.hrom.demotestspringdb.controller

import br.com.hrom.demotestspringdb.model.Person
import br.com.hrom.demotestspringdb.repository.PersonRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class MySimpleController (val personRepository: PersonRepository){

    @GetMapping
    fun listPersons() = personRepository.findAll()

    @GetMapping("/count/{job}")
    fun countByJob(@PathVariable job: String) = personRepository.countByJob(job)

    @PostMapping
    fun createPerson(person: Person) = personRepository.save(person)
}