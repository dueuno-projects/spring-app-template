[![Dueuno on X](https://img.shields.io/twitter/follow/dueunoframework?style=social)](https://x.com/dueunoframework)

# Spring Boot Web App Template

This is a web application template. Use it to start creating your new project.

## Run the template

1. Download the [Spring Boot Web App Template](https://github.com/dueuno-projects/spring-web-app-template) project
2. Start the application:
   - `gradlew bootRun`
3. Health service is available at:
   - http://localhost:8081/actuator
3. The API documentation is available at:
   - http://localhost:8081/swagger-ui/index.html
4. Service monitoring is available at:
   - http://localhost:8081/monitoring
5. You can test the demo service:
   - http://localhost:8081/api/v1/message/42

## Create a new app

To create a new app from this template:

1. Find/replace the string `springapp` in all project files with a name of your choice
2. Rename the `springapp` package with a name of your choice

## Create executable jar

1. Run `gradlew bootJar`
2. The application executable file will be generated under the `/biuld/libs` directory
3. Run the application with `java -jar springapp-1.0-SNAPSHOT.jar`

## Edit this README

Markdown Cheat Sheet: https://www.markdownguide.org/cheat-sheet/

## Please remember...

```
It's not what you do,
but how you do it.
That makes the difference.

Happy coding :)
```