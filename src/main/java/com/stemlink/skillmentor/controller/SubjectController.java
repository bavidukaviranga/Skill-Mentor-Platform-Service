package com.stemlink.skillmentor.controller;

import com.stemlink.skillmentor.services.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import jakarta.validation.Valid;
import com.stemlink.skillmentor.dto.SubjectDTO;
import com.stemlink.skillmentor.entities.Subject;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path ="/api/v1/subjects")
@RequiredArgsConstructor

public class SubjectController {

    private final ModelMapper modelMapper;
    private final SubjectService subjectService;


    @GetMapping
    public List<Subject> getAllSubjects(){

        return subjectService.getAllSubjects();
    }


    @GetMapping("{id}")
    public Subject getSubjectById(@PathVariable Long id) {
        return subjectService.getSubjectById(id);
    }


    @PostMapping
    public Subject createSubject(@Valid @RequestBody SubjectDTO subjectDTO) {
        Subject subject = modelMapper.map(subjectDTO, Subject.class);
        return subjectService.addNewSubject(subjectDTO.getMentorId(), subject);
    }


    @PutMapping("{id}")
    public Subject updateSubject(@PathVariable Long id, @RequestBody SubjectDTO updatedSubjectDTO) {
        Subject subject = modelMapper.map(updatedSubjectDTO, Subject.class);
        return subjectService.updateSubjectById(id, subject);
    }

    @DeleteMapping("{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectService.deleteSubject(id);
    }

}
