package com.bauschbakeries.bauschbakeries_backend.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignOnController {

    @GetMapping("/")
    public String signOn(@AuthenticationPrincipal OidcUser user, Model model) {
        if(user != null) {
            model.addAttribute("user", user);
        }
        return "index";
    }
}
