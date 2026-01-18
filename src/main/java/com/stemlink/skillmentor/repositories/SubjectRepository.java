package com.stemlink.skillmentor.repositories;

import com.stemlink.skillmentor.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {

}
