package com.stemlink.skillmentor.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/v1/subjects")
public class SubjectController {

    @GetMapping
    public String getAllSubject(@RequestParam(name ="name",defaultValue = "all")String name){
        System.out.println("Filter BY name" +name);
        return "get all subjects"+ " filter by " +name;
    }
    @GetMapping("{id}")
    public String getSubjectById(
            @PathVariable String id
            ) {
        System.out.println("GET BY ID" +id);

        return "get subject " +id ;
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
