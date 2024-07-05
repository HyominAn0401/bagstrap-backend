package com.bagstrap.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class EducationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    @OneToOne
    @JoinColumn(name = "personal_information_id")
    private PersonalInformationEntity personalInformationEntity;

    public EducationEntity(String level, String uniDepartment, String country, String city, String enrollYear, String enrollMonth,
                           String graduateYear, String graduateMonth, Boolean currentlyEnrolled, Double gpa, Double standardGPA, String title, String advisorName, String degree) {
        this.level = level;
        this.uniDepartment = uniDepartment;
        this.country = country;
        this.city = city;
        this.enrollYear = enrollYear;
        this.enrollMonth = enrollMonth;
        this.graduateYear = graduateYear;
        this.graduateMonth = graduateMonth;
        this.currentlyEnrolled = currentlyEnrolled;
        this.gpa = gpa;
        this.standardGPA = standardGPA;
        this.title = title;
        this.advisorName = advisorName;
        this.degree = degree;
    }
}
