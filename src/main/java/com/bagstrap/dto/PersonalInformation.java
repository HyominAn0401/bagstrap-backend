package com.bagstrap.dto;

import com.bagstrap.entity.*;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class PersonalInformation {

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

//    public PersonalInformationEntity toEntity(AwardsHonorsEntity awardsHonorsEntity, ConferencesEntity conferencesEntity, EducationEntity educationEntity, ProjectsEntity projectsEntity, PublicationsEntity publicationsEntity, ResearchExperiencesEntity researchExperiencesEntity, SkillsTechniquesEntity skillsTechniquesEntity){
//        PersonalInformationEntity entity = new PersonalInformationEntity(englishLastName, englishFirstName, koreanName, currentOrganization, currentOrganizationAddress, email, secondEmail, mobile, countryCode, currentStatus, homepageUrl);
//        entity.setEducationEntity(educationEntity);
//        entity.setAwardsHonorsEntity(awardsHonorsEntity);
//        entity.setConferencesEntity(conferencesEntity);
//        entity.setProjectsEntity(projectsEntity);
//        entity.setPublicationsEntity(publicationsEntity);
//        entity.setResearchExperiencesEntity(researchExperiencesEntity);
//        entity.setSkillsTechniquesEntity(skillsTechniquesEntity);
//        return entity;
//    }

    public PersonalInformationEntity toEntity(){
        return new PersonalInformationEntity(englishLastName, englishFirstName, koreanName, currentOrganization, currentOrganizationAddress, email, secondEmail, mobile, countryCode, currentStatus, homepageUrl);
    }
}
