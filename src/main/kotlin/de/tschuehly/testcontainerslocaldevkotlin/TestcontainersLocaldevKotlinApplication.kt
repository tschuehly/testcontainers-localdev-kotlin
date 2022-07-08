package de.tschuehly.testcontainerslocaldevkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.repository.CrudRepository
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@SpringBootApplication
class TestcontainersLocaldevKotlinApplication{
    companion object {
        @JvmStatic
        fun createSpringApplication(): SpringApplication {
            return SpringApplication(TestcontainersLocaldevKotlinApplication::class.java)
        }
    }

}

fun main(args: Array<String>) {
    runApplication<TestcontainersLocaldevKotlinApplication>(*args)
}

@Entity
class Example(
    @Id
    @GeneratedValue
    var id: Long? = null
)

interface ExampleRepository:CrudRepository<Example,Long>
