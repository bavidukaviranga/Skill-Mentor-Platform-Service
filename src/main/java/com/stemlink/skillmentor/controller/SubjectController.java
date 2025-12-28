package com.stemlink.skillmentor.controller;


import com.stemlink.skillmentor.entities.Subject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path ="/api/v1/subjects")
public class SubjectController {


    private final List<Subject> subjects = new ArrayList<>((
            List.of(new Subject("Maths","MT 101"),
                    new Subject("Computer Science","CS 101"))
    )
    );



    @GetMapping
    public List<Subject> getAllSubject(@RequestParam(name ="name",defaultValue = "all")String name){
//        String result = subjects.toString();
//        System.out.println(result);
        return subjects;
    }
//    @GetMapping("{id}")
//    public String getSubjectById(
//            @PathVariable int id) {
//        System.out.println("GET BY ID" +id);
//
//        return subjects.get(id) ;
//    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {

        //validation to check subject length
        if (subject.getSubjectName().length()>20){
            Subject errorSubject = new Subject();
            errorSubject.setSubjectName(" ");
            errorSubject.setSubjectName(" ");
            return errorSubject;
        }


        System.out.println("POST");
        subjects.add(subject);
        return subject;
    }
    @PutMapping("{id}")
    public String updateSubject(@RequestBody String updateSubject) {
        System.out.println("PUT"+ updateSubject);
        return "update subjects";
    }
//    @DeleteMapping("{id}")
//    public String deleteSubject(@PathVariable int id) {
//        subjects.remove(id);
//        return subjects.toString();
//    }
//
}
