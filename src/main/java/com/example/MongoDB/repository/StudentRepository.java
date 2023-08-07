package com.example.MongoDB.repository;

import com.example.MongoDB.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findStudentByFirstnameNotNull(String firstname);
}
