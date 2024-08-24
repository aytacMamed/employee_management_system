package com.changeside.employee_management_system.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    //todo:Fill real data
    @Bean
    public OpenAPI openApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("OpenAPI Documentation")
                        .version("0.0.1")
                        .description("For Employee Management System")
                        .contact(new Contact()
                                .url("/api/**")
                                .url("/v3/api-docs/**")
                                .url("/swagger-ui/**")
                                .email("aytajmammmadli@gmail.com")
                                .name("EMS")));
    }



}
