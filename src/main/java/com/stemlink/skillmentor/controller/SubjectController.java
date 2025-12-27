package com.stemlink.skillmentor.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/v1/subjects")
public class SubjectController {

    @GetMapping
    public String getAllSubject(){
        return "get all subjects";
    }
    @PostMapping
    public String createSubject() {
        return "create subjects";
    }
    @PutMapping
    public String updateSubject() {
        return "update subjects";
    }
    @DeleteMapping
    public String deleteSubject() {
        return "delete subjects";
    }

}
