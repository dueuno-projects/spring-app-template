package myspringapp

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@Slf4j
@CompileStatic
@SpringBootApplication
class Application {

	static void main(String... args) {
		SpringApplication.run(Application, args)
		log.error "Errors are highlighted!"
	}

}
