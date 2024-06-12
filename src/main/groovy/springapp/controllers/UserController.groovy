package springapp.controllers

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import springapp.repositories.UserRepository
import springapp.domain.TUser

@CompileStatic
@RestController
@RequestMapping(path = "/user")
class UserController {

    @Autowired
    UserRepository userRepository

    @ResponseBody
    @GetMapping(path = "/add") // call with queryString -> /add?name=Gianluca&email=g.sartori@gmail.com
    String addNewUser(@RequestParam String name, @RequestParam String email) {
        TUser n = new TUser()
        n.setName(name)
        n.setEmail(email)
        userRepository.save(n)

        return "Saved"
    }

    @ResponseBody
    @GetMapping(path = "/all")
    Iterable<TUser> getAllUsers() {
        return userRepository.findAll()
    }

}