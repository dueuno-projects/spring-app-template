package springapp.repositories

import org.springframework.data.repository.CrudRepository
import springapp.domain.TUser

interface UserRepository extends CrudRepository<TUser, Integer> {

}