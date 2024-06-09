package springapp.services

import springapp.config.ConfigApplication
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Slf4j
@Component
@CompileStatic
class MessageService {

    @Autowired
    ConfigApplication configApplication

    String getMessage() {
        return configApplication.message.text
    }

}
