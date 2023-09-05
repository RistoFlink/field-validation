package dev.ristoflink.fieldvalidation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FieldController {
    User user = new User();
    List<User> users = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("user", user);
        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult() {
        return "result";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "sign-up";
        }
        users.add(user);
        return "redirect:/result";
    }
}
