package com.bagstrap.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String managingDepartment;
    private String managingDepartCountry;

    private String startYear;
    private String startMonth;
    private String endYear;
    private String endMonth;
    private Boolean currentlyParticipating;
    private String role;

    @OneToOne
    @JoinColumn(name = "personal_information_id")
    private PersonalInformationEntity personalInformationEntity;

    public ProjectsEntity(String projectName, String managingDepartment, String managingDepartCountry, String startYear, String startMonth, String endYear, String endMonth, Boolean currentlyParticipating, String role) {
        this.projectName = projectName;
        this.managingDepartment = managingDepartment;
        this.managingDepartCountry = managingDepartCountry;
        this.startYear = startYear;
        this.startMonth = startMonth;
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.currentlyParticipating = currentlyParticipating;
        this.role = role;
    }
}
