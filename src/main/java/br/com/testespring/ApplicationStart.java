package br.com.testespring;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://www.devdojo.com.br/aula?playlistId=PL62G310vn6nF3gssjqfCKLpTK2sZJ_a_1
@SpringBootApplication //@EnableAutoConfiguration @ComponentScan @Configuration
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
