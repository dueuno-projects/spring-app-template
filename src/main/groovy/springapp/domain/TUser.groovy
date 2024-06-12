package springapp.domain

import groovy.transform.CompileStatic
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = 't_user')
@CompileStatic
class TUser {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id
    String name
    String email

}
