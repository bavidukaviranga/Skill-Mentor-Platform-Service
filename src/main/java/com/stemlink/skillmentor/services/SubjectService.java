package com.stemlink.skillmentor.services;

import com.stemlink.skillmentor.entities.Subject;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject addNewSubject(Long mentorId, Subject subject);
    Subject getSubjectById(Long id);
    Subject updateSubjectById(Long id, Subject updatedSubject);
    void deleteSubject(Long id);
}
