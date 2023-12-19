package br.com.jnsdev.aulaospringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AulaoSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(AulaoSpringSecurityApplication.class, args);
    }

    @RestController
    class HttpController {
        @GetMapping("publica")
        public String publicRoute() {
            return "<h1>Public route, feel to look around 🔓</h1>";

        }

        @GetMapping("privada")
        public String privateRoute() {
            return "<h1>Private route, only authorized personal 🔏</h1>";

        }

    }
}
