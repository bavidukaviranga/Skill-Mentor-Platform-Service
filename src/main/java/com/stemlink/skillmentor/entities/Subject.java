package com.stemlink.skillmentor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subject")
@Data
public class Subject {


    @Id
    private Long id;
    private String subjectName;

    private String description;


}
