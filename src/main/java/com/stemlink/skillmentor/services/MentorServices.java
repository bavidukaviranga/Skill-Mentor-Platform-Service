package com.stemlink.skillmentor.services;

import com.stemlink.skillmentor.entities.Mentor;
import com.stemlink.skillmentor.repositories.MentorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MentorServices {

    private final MentorRepository mentorRepository;

    public Mentor createNewMentor(Mentor mentor){
        return mentorRepository.save(mentor);
    }

    public List<Mentor> getAllMentors(){
        return mentorRepository.findAll();
    }

    public Mentor addSubject(){
        mentorRepository.
    }
}
