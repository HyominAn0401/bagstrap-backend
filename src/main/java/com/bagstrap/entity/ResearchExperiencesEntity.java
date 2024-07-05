package com.bagstrap.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ResearchExperiencesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String position;
    private String organization;
    private String detailDepartment;
    private String organizationCountry;
    private String startYear;
    private String startMonth;
    private String endYear;
    private String endMonth;
    private Boolean currentlyInOffice;
    private String role;

    @OneToOne
    @JoinColumn(name = "personal_information_id")
    private PersonalInformationEntity personalInformationEntity;

    public ResearchExperiencesEntity(String position, String organization, String detailDepartment,
                                     String organizationCountry, String startYear, String startMonth,
                                     String endYear, String endMonth, Boolean currentlyInOffice, String role){
        this.position = position;
        this.organization = organization;
        this.detailDepartment = detailDepartment;
        this.organizationCountry = organizationCountry;
        this.startYear = startYear;
        this.startMonth = startMonth;
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.currentlyInOffice = currentlyInOffice;
        this.role = role;
    }
}
