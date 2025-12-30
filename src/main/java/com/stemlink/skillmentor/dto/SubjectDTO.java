package com.stemlink.skillmentor.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SubjectDTO {

    @Size(min = 3,max = 20,message ="Subject must be between 3 and 20 characters")
    @NotBlank
    @NotNull
    @NotEmpty
    private String subjectName;
    private String description;
}
