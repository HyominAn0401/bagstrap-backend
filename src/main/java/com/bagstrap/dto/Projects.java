package com.bagstrap.dto;

import com.bagstrap.entity.ProjectsEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Projects {

    private String projectName;
    private String managingDepartment;
    private String managingDepartCountry;
    private String startYear;
    private String startMonth;
    private String endYear;
    private String endMonth;
    private Boolean currentlyParticipating;
    private String role;

    public ProjectsEntity toEntity(){
        return new ProjectsEntity(projectName, managingDepartment, managingDepartCountry
        , startYear, startMonth, endYear, endMonth, currentlyParticipating, role);
    }
}
