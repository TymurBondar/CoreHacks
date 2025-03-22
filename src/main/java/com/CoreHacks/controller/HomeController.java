package com.CoreHacks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // will render templates/index.html
    }

    @Controller
    public class PopupController {

        @GetMapping("/popup")
        public String showPopupForm(Model model) {
            return "popup-form"; // popup-form.html
        }
    }

}
