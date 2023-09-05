package dev.ristoflink;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    @GetMapping("/")
    public String getForm(Model model) {
        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult() {
        return "result";
    }
}
