package com.stemlink.skillmentor.controller;

import org.modelmapper.ModelMapper;
import jakarta.validation.Valid;
import com.stemlink.skillmentor.dto.SubjectDTO;
import com.stemlink.skillmentor.entities.Subject;
import org.springframework.validation.annotation.Validated;
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
    public List<Subject> getAllSubjects(@RequestParam(name ="name",defaultValue = "all")String name){
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
    public Subject createSubject(@RequestBody @Validated SubjectDTO subjectDTO) {

        //validation to check subject length
//        if (subject.getSubjectName().length()>20){
//            Subject errorSubject = new Subject();
//            errorSubject.setSubjectName(" ");
//            errorSubject.setSubjectName(" ");
//            return errorSubject;
//        }

        //mapping subject DTO to subject
//        Subject subject = new Subject();
//        subject.setSubjectName(subjectDTO.getSubjectName());
//        subject.setDescription(subjectDTO.getDescription());

        //using model mapper
        Subject subject = modelMapper.map(subjectDTO,Subject.class);

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
