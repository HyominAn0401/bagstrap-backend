package com.bagstrap.dto;


import com.bagstrap.entity.AwardsHonorsEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AwardsHonors {

    private String awardsName;
    private String managingDepartment;
    private String managingCountry;
    private String awardYear;
    private String awardMonth;
    private Boolean markOnCV;

    public AwardsHonorsEntity toEntity(){
        return new AwardsHonorsEntity(awardsName, managingDepartment,
                managingCountry, awardYear, awardMonth, markOnCV);
    }
}
