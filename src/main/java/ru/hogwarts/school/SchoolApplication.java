package ru.hogwarts.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.hogwarts.school.domain.Faculty;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SchoolApplication {


    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }

}
