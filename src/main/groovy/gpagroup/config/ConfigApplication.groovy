package gpagroup.config


import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties('application')
class ConfigApplication {
    ConfigMessage message
}
