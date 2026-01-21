package com.stemlink.skillmentor.services;

import com.stemlink.skillmentor.entities.Mentor;
import com.stemlink.skillmentor.exceptions.SkillMentorException;
import com.stemlink.skillmentor.repositories.MentorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MentorServices {

    private final MentorRepository mentorRepository;

    public Mentor createNewMentor(Mentor mentor) {
        try {
            return mentorRepository.save(mentor);
        } catch (Exception exception) {

            // What, When, Where, Why
            System.err.println("Error creating mentor" + exception.getMessage());
            throw new SkillMentorException("Failed to create new Mentor",HttpStatus.CONFLICT);
        }
    }

    public List<Mentor> getAllMentors(){
        return mentorRepository.findAll();
    }


}
