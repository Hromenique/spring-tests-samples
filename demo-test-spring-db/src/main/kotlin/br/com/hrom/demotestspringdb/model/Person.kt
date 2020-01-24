package br.com.hrom.demotestspringdb.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long?=null,
        var name: String,
        var age:Int,
        var job: String
)