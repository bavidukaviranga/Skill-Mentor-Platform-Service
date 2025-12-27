package com.stemlink.skillmentor.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/v1/subjects")
public class SubjectController {

    @GetMapping
    public String getAllSubject(){
        return "get all subjects";
    }
    @GetMapping("{id}")
    public String getSubjectById(
            @PathVariable String id ,
            @RequestParam(name ="name",defaultValue = "all")String name) {
        System.out.println("GET BY ID" +id);
        System.out.println("Filter BY name" +name);
        return "get subject " +id + " filter by " +name;
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
