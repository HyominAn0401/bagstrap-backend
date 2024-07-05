package com.bagstrap.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class PersonalInformationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String englishLastName;
    private String englishFirstName;
    private String koreanName;
    private String currentOrganization;
    private String currentOrganizationAddress;
    private String email;
    private String secondEmail;
    private String mobile;
    private String countryCode;
    private String currentStatus;
    private String homepageUrl;

    @OneToOne(mappedBy = "personalInformationEntity", cascade = CascadeType.ALL)
    private EducationEntity educationEntity;

    @OneToOne(mappedBy = "personalInformationEntity", cascade = CascadeType.ALL)
    private ProjectsEntity projectsEntity;

    @OneToOne(mappedBy = "personalInformationEntity", cascade = CascadeType.ALL)
    private PublicationsEntity publicationsEntity;

    @OneToOne(mappedBy = "personalInformationEntity", cascade = CascadeType.ALL)
    private AwardsHonorsEntity awardsHonorsEntity;

    @OneToOne(mappedBy = "personalInformationEntity", cascade = CascadeType.ALL)
    private ConferencesEntity conferencesEntity;

    @OneToOne(mappedBy = "personalInformationEntity", cascade = CascadeType.ALL)
    private ResearchExperiencesEntity researchExperiencesEntity;

    @OneToOne(mappedBy = "personalInformationEntity", cascade = CascadeType.ALL)
    private SkillsTechniquesEntity skillsTechniquesEntity;

    public PersonalInformationEntity(String englishLastName, String englishFirstName, String koreanName, String currentOrganization, String currentOrganizationAddress, String email, String secondEmail, String mobile, String countryCode, String currentStatus, String homepageUrl) {
        this.englishLastName = englishLastName;
        this.englishFirstName = englishFirstName;
        this.koreanName = koreanName;
        this.currentOrganization = currentOrganization;
        this.currentOrganizationAddress = currentOrganizationAddress;
        this.email = email;
        this.secondEmail = secondEmail;
        this.mobile = mobile;
        this.countryCode = countryCode;
        this.currentStatus = currentStatus;
        this.homepageUrl = homepageUrl;
    }
}
