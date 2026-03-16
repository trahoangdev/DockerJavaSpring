package com.example.hoangtrongtra.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping({"/", "/portfolio"})
    public String portfolio(Model model) {
        model.addAttribute("fullName", "Hoang Trong Tra");
        model.addAttribute("headline", "Backend Developer | Java & Spring Boot");
        model.addAttribute("tagline", "Xay dung ung dung web tot, nhanh va de mo rong.");
        model.addAttribute("about", "Toi tap trung vao xay dung he thong backend ben vung voi Java, Spring Boot va co kha nang trien khai thuc te tren Docker.");

        model.addAttribute("location", "Viet Nam");
        model.addAttribute("email", "hoangtrongtra@example.com");
        model.addAttribute("github", "https://github.com/hoangtrongtra");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/hoangtrongtra");

        model.addAttribute("skills", List.of(
                "Java 21",
                "Spring Boot",
                "REST API",
                "Thymeleaf",
                "Docker",
                "PostgreSQL",
                "Git",
                "Maven"));

        model.addAttribute("highlights", List.of(
                "Thiet ke API ro rang, de bao tri",
                "Toi uu hieu nang truy van va xu ly du lieu",
                "Kiem thu va dong goi ung dung theo quy trinh"));

        model.addAttribute("projects", List.of(
                new Project(
                        "Portfolio with Thymeleaf",
                        "Trang portfolio mot trang hien thi thong tin ca nhan va du an, toi uu responsive.",
                        "Tu thiet ke giao dien, model data va trien khai voi Spring Boot",
                        "Spring Boot, Thymeleaf, CSS",
                        "#"),
                new Project(
                        "Task Manager API",
                        "Xay dung API quan ly cong viec co phan quyen va phan trang.",
                        "Phat trien API, validation, exception handling",
                        "Spring Boot, JPA, PostgreSQL",
                        "#"),
                new Project(
                        "Containerized Web App",
                        "Dong goi ung dung va chay dong nhat tren cac moi truong.",
                        "Tao Dockerfile, docker compose va script khoi dong",
                        "Docker, Maven, Spring",
                        "#")));

        model.addAttribute("experiences", List.of(
                new Experience("2025 - hien tai", "Backend Developer", "Freelance",
                        "Xay dung cac module backend, tich hop CSDL va toi uu deployment."),
                new Experience("2023 - 2025", "Software Engineering Student", "University",
                        "Nghien cuu kien truc web, OOP, va quy trinh phat trien phan mem.")));

        return "portfolio";
    }

    public record Project(String name, String summary, String role, String stack, String link) {
    }

    public record Experience(String period, String role, String company, String detail) {
    }
}
