package com.example.MongoDB;

import com.example.MongoDB.Entity.Student;
import com.example.MongoDB.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class MongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student student = Student.builder()
                    .firstname("Bob")
                    .lastname("Big")
                    .random(new Random(1).nextInt())
                    .address(new Address("Jola", "NightCity", "NC1233"))
                    .randomFloat(123.123)
                    .big(true)
                    .date(new Date())
                    .regEx("\bBig\b")
                    .type(Type.JSON)
                    .build();

            System.out.println(studentRepository.insert(student));
        };
    }
}
