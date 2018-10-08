Swagger
-------

Swagger takes the manual work out of API documentation, with a range of solutions for generating, visualizing, and maintaining API docs.

We will use the Springfox implementation of the Swagger specification.
To add it to our Maven project, we need a dependency in the pom.xml file.

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>

Enabling Springfox’s Swagger UI

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>


The configuration of Swagger mainly centers around the Docket bean.

@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
}

Swagger 2 is enabled through the @EnableSwagger2 annotation.

After the Docket bean is defined, its select() method returns an instance of ApiSelectorBuilder, which provides a way to control the endpoints exposed by Swagger.

Predicates for selection of RequestHandlers can be configured with the help of RequestHandlerSelectors and PathSelectors. Using any() for both will make documentation for your entire API available through Swagger.



In this particular project we are using the .h2which is an embedded db with scope as runtime and spring boot starter jpa which is a repository dependency.

   <dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		
		