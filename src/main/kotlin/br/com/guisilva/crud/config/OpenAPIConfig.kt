package br.com.guisilva.crud.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenAPIConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Kotlin CRUD API")
                    .version("1.0.0")
                    .description("API REST para gerenciamento de Produtos")
                    .contact(
                        Contact()
                            .name("Guilherme Silva")
                            .url("https://github.com")
                    )
            )
    }
}
