package com.trishul.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }
}
