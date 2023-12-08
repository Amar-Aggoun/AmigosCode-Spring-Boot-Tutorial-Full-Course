package com.example.fullcourse.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student amar = new Student( "Amar", "aggounamar69@gmail.com", LocalDate.of(1998, 12, 01)
            );

            Student nio = new Student( "Nio", "nionanoman@gmail.com", LocalDate.of(1998, 12, 01)
            );

            repository.saveAll(List.of(amar, nio));
        };
    }
}
