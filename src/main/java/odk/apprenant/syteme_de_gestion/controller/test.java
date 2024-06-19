package odk.apprenant.syteme_de_gestion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/admin/info")
    public String adminInfo() {
        return "Admin's secret info";
    }

    @GetMapping("/user/info")
    public String userInfo() {
        return "User's public info";
    }
}
