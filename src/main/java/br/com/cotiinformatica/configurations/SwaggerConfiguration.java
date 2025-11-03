package br.com.cotiinformatica.configurations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Usuários")
                        .description("Documentação da API de Usuários com Spring Boot e Swagger (OpenAPI).")
                                        .version("1.0.0")
                                        .contact(new Contact()
                                                .name("Coti Informática")
                                                .email
                                                        ("contato@cotiinformatica.com.br")
                                                .url
                                                        ("https://www.cotiinformatica.com.br"))
                                        .license(new License()
                                                .name("Apache 2.0")
                                                .url("http://springdoc.org")));
    }
}