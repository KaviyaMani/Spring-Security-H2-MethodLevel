package com.nila.security_method_level.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public String adminMethod(Authentication authentication) {
        return "Welcome admin: "+authentication.getName();
    }
}
