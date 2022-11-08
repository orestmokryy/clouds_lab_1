package ua.lviv.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication(scanBasePackages ="ua.lviv.iot" )
@Configuration
@EnableWebMvc
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}