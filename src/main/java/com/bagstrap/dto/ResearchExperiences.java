package com.bagstrap.dto;

import com.bagstrap.entity.ResearchExperiencesEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ResearchExperiences {

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

    public ResearchExperiencesEntity toEntity(){
        return new ResearchExperiencesEntity(position, organization, detailDepartment, organizationCountry,
                startYear, startMonth, endYear, endMonth, currentlyInOffice, role);
    }

}
