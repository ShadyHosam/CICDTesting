package com.githubcicd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoApplication {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello mother fucker";
    }
    @GetMapping("/me")
    public String thisMe() {
        return "add me endpoint";
    }
//    echo "# CICDTesting" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/ShadyHosam/CICDTesting.git
//    git push -u origin main
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
