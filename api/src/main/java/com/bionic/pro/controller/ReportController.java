package com.bionic.pro.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @GetMapping("reports")
    @PreAuthorize("hasRole('prothetic_user')")
    public String getReport() {
        return "Some bionic report";
    }
}
