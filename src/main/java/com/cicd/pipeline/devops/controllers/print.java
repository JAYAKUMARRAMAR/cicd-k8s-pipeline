//generate print controller class to print the message
package com.cicd.pipeline.devops.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class print {

    @GetMapping("/print")
    public String printMessage() {
        return "Hello, this is a message from the print controller!";
    }
}