package com.stemlink.skillmentor.controller;


import com.stemlink.skillmentor.entities.Mentor;
import com.stemlink.skillmentor.entities.Subject;
import com.stemlink.skillmentor.services.MentorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/mentors")
@RequiredArgsConstructor

public class MentorController {

    private final MentorServices mentorServices;

    @GetMapping
    public List<Mentor> getAllMentors(){
        return mentorServices.getAllMentors();
    }

    @PostMapping
    public Mentor createMentor(@RequestBody Mentor mentor){
        return mentorServices.createNewMentor(mentor);
    }
}

