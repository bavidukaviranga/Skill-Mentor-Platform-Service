package com.stemlink.skillmentor.services;
import com.stemlink.skillmentor.repositories.SubjectRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.stemlink.skillmentor.entities.Subject;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepository subjectRepository;

    private final List<Subject> subjects =new ArrayList<>();

    public List<Subject> getSubjects(){
        return subjectRepository.findAll();
    }

    public Subject addNewSubject(@NotNull Long mentorId, Subject subject){
        return subjectRepository.save(subject);
    }
}
