package br.com.hrom.demotestspringdb.repository

import br.com.hrom.demotestspringdb.config.Loggable
import br.com.hrom.demotestspringdb.config.logger
import br.com.hrom.demotestspringdb.model.Person
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.transaction.annotation.Transactional

@DataJpaTest
@Transactional
class PersonRepositoryTest: Loggable {

    @Autowired
    lateinit var repository: PersonRepository

    @BeforeEach
    fun setup(){
        logger().info("cleaning repository...")
        repository.deleteAll()
    }

    @Test
    @DisplayName("count by job test")
    fun countByJobTest(){
        repository.saveAll(listOf(
                Person(name="Goku", age = 40, job = "warrior"),
                Person(name="Luffy", age = 22, job = "pirate"),
                Person(name="Vegeta", age = 45, job = "warrior"),
                Person(name="Saitama", age = 23, job = "warrior"),
                Person(name="Kenshin", age = 28, job = "samurai")
        ))

        val count = repository.countByJob("warrior")

        assertThat(count).isEqualTo(3)
    }

}