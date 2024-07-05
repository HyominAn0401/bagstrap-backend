package com.bagstrap.controller;

import com.bagstrap.dto.*;
import com.bagstrap.entity.*;
import com.bagstrap.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class InfoController {

    @Autowired
    private PersonalInformationRepository personalInformationRepository;
    @Autowired
    private EducationRepository educationRepository;
    @Autowired
    private ProjectsRepository projectsRepository;
    @Autowired
    private PublicationsRepository publicationsRepository;
    @Autowired
    private ConferencesRepository conferencesRepository;

    @Autowired
    private ResearchExperienceRepository researchExperienceRepository;

    @Autowired
    private AwardsHonorsRepository awardsHonorsRepository;
    @Autowired
    private SkillsTechniquesRepository skillsTechniquesRepository;

    @GetMapping("/superpass/new")
    public String newInfoForm(){
        return "superpass/new";
    }

    @PostMapping("/superpass/create")
    public String createSuperpass(@ModelAttribute PersonalInformation personalInformation, @ModelAttribute Education education, @ModelAttribute Projects projects,
                                  @ModelAttribute Publications publications, @ModelAttribute Conferences conferences,
                                  @ModelAttribute ResearchExperiences researchExperiences, @ModelAttribute AwardsHonors awardsHonors,
                                  @ModelAttribute SkillsTechniques skillsTechniques){
        //1. DTO -> Entity
        PersonalInformationEntity personalInformationEntity = personalInformation.toEntity();
        EducationEntity educationEntity = education.toEntity();
        ProjectsEntity projectsEntity = projects.toEntity();
        PublicationsEntity publicationsEntity = publications.toEntity();
        ConferencesEntity conferencesEntity = conferences.toEntity();
        ResearchExperiencesEntity researchExperiencesEntity = researchExperiences.toEntity();
        AwardsHonorsEntity awardsHonorsEntity = awardsHonors.toEntity();
        SkillsTechniquesEntity skillsTechniquesEntity = skillsTechniques.toEntity();


        // 관계 설정
        personalInformationEntity.setEducationEntity(educationEntity);
        personalInformationEntity.setProjectsEntity(projectsEntity);
        personalInformationEntity.setPublicationsEntity(publicationsEntity);
        personalInformationEntity.setConferencesEntity(conferencesEntity);
        personalInformationEntity.setResearchExperiencesEntity(researchExperiencesEntity);
        personalInformationEntity.setAwardsHonorsEntity(awardsHonorsEntity);
        personalInformationEntity.setSkillsTechniquesEntity(skillsTechniquesEntity);

        educationEntity.setPersonalInformationEntity(personalInformationEntity);
        projectsEntity.setPersonalInformationEntity(personalInformationEntity);
        publicationsEntity.setPersonalInformationEntity(personalInformationEntity);
        conferencesEntity.setPersonalInformationEntity(personalInformationEntity);
        researchExperiencesEntity.setPersonalInformationEntity(personalInformationEntity);
        awardsHonorsEntity.setPersonalInformationEntity(personalInformationEntity);
        skillsTechniquesEntity.setPersonalInformationEntity(personalInformationEntity);

        //2. Repository로 Entity->DB 저장
//        PersonalInformationEntity savedPersonalInformation = personalInformationRepository.save(personalInformationEntity);
//        EducationEntity savedEducation = educationRepository.save(educationEntity);
//        ProjectsEntity savedProjects = projectsRepository.save(projectsEntity);
//        PublicationsEntity savedPublications = publicationsRepository.save(publicationsEntity);
//        ConferencesEntity savedConferences = conferencesRepository.save(conferencesEntity);
//        ResearchExperiencesEntity savedResearchExperiences = researchExperienceRepository.save(researchExperiencesEntity);
//        AwardsHonorsEntity savedAwardsHonors = awardsHonorsRepository.save(awardsHonorsEntity);
//        SkillsTechniquesEntity savedSkillsTechniques = skillsTechniquesRepository.save(skillsTechniquesEntity);

        // 2. Repository로 Entity -> DB 저장
        personalInformationRepository.save(personalInformationEntity);

//        log.info(savedPersonalInformation.toString());
//        log.info(savedEducation.toString());
//        log.info(savedProjects.toString());
//        log.info(savedPublications.toString());
//        log.info(savedConferences.toString());
//        log.info(savedResearchExperiences.toString());
//        log.info(savedAwardsHonors.toString());
//        log.info(savedSkillsTechniques.toString());

        return "redirect:/superpass/view/" + personalInformationEntity.getId();
    }

    @GetMapping("/superpass/view/{id}")
    public String viewSuperpass(@PathVariable Long id, Model model) {
        PersonalInformationEntity personalInformation = personalInformationRepository.findById(id).orElse(null);
        model.addAttribute("personalInformation", personalInformation);

        if (personalInformation != null) {
            model.addAttribute("education", personalInformation.getEducationEntity());
            model.addAttribute("projects", personalInformation.getProjectsEntity());
            model.addAttribute("publications", personalInformation.getPublicationsEntity());
            model.addAttribute("conferences", personalInformation.getConferencesEntity());
            model.addAttribute("researchExperiences", personalInformation.getResearchExperiencesEntity());
            model.addAttribute("awardsHonors", personalInformation.getAwardsHonorsEntity());
            model.addAttribute("skillsTechniques", personalInformation.getSkillsTechniquesEntity());
        }

        return "superpass/show";
    }
}
