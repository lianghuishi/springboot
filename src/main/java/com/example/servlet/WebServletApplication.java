package com.example.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //在springboot启动时会扫描@WebServlet，并将该类实例化
public class WebServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServletApplication.class, args);
    }

}
