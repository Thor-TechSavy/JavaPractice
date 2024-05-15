## tomcat
## jetty
## undertow
## netty for the reactive application
## How to disable the web server
spring.main.web-application-type=none
@SpringBootApplication = @EnableAutoConfiguration, @Configuration, @ComponentScan
@RestController = @Controller + @ResponseBody = for rest client in json or xml
@Controller - model object to view template
Yaml java configuration - to define a PropertySourceBean to tell Spring to treat application.yaml as configuration file rather than application.properties
@ConfigurationProperty("prefix=.yml")
T
