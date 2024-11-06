package springapp.services

import groovy.json.JsonOutput
import org.springframework.stereotype.Service
import springapp.config.ConfigApplication
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Slf4j
@Service
@CompileStatic
class MessageService {

    @Autowired
    ConfigApplication configApplication

    String getMessage(String answer) {
        Map response = [
                result: [
                        question: configApplication.message.someText,
                        answer: answer,
                ],
        ]

        return JsonOutput.toJson(response)
    }

}
