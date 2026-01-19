package com.stemlink.skillmentor.services;
import com.stemlink.skillmentor.repositories.SubjectRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.stemlink.skillmentor.entities.Subject;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepository subjectRepository;
    private final ModelMapper modelMapper;

    private final List<Subject> subjects =new ArrayList<>();

    public List<Subject> getSubjects(){
        return subjectRepository.findAll();
    }

    public Subject addNewSubject(@NotNull Long mentorId, Subject subject){
        return subjectRepository.save(subject);
    }

    public Subject getSubjectById(Long id){
        return subjectRepository.findById(id).get(); //....WHERE id=={}
    }


    public Subject updateSubjectById(Long id, Subject updatedSubject){
        Subject subject = subjectRepository.findById(id).get();
        // TODO: use model mapper
        subject.setSubjectName(updatedSubject.getSubjectName());
        subject.setDescription(updatedSubject.getDescription());
        return subjectRepository.save(subject);
    }

    public void deleteSubject(Long id){
        subjectRepository.deleteById(id);
    }



}
