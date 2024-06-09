package myspringapp.controllers

import myspringapp.services.MessageService
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping("/api/v1")
class MessageController {

    @Autowired
    MessageService messageService

    @GetMapping("/message/{id}")
    String message(@PathVariable String id) {
        return messageService.message + " We've got '${id}'"
    }
}
