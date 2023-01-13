package io.github.julianopadoinvieira;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    String applicationName() {
        return "Sistema de vendas";
    }
	

}
