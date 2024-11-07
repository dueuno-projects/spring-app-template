package springapp.controllers.v1

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import springapp.repositories.UserRepository
import springapp.domain.TUser

@CompileStatic
@RestController
@RequestMapping("/api/v1/user")
class UserController {

    @Autowired
    UserRepository userRepository

    // call with queryString -> /add?name=Gianluca&email=g.sartori@gmail.com
    @ResponseBody
    @GetMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    String addNewUser(@RequestParam String name, @RequestParam String email) {
        TUser n = new TUser()
        n.setName(name)
        n.setEmail(email)
        userRepository.save(n)

        return "Saved"
    }

    @ResponseBody
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<TUser> getAllUsers() {
        return userRepository.findAll()
    }

}