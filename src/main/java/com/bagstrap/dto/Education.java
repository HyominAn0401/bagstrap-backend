package com.bagstrap.dto;

import com.bagstrap.entity.EducationEntity;
import com.bagstrap.entity.PersonalInformationEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Education {

    private String level;
    private String uniDepartment;
    private String country;
    private String city;
    private String enrollYear;
    private String enrollMonth;
    private String graduateYear;
    private String graduateMonth;
    private Boolean currentlyEnrolled;
    private Double gpa;
    private Double standardGPA;
    private String title;
    private String advisorName;
    private String degree;

    public EducationEntity toEntity() {
        return new EducationEntity(level, uniDepartment, country, city, enrollYear, enrollMonth, graduateYear, graduateMonth, currentlyEnrolled, gpa, standardGPA, title, advisorName, degree);
    }
}
