package com.bagstrap.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AwardsHonorsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String awardsName;
    private String managingDepartment;
    private String managingCountry;
    private String awardYear;
    private String awardMonth;
    private Boolean markOnCV;

    @OneToOne
    @JoinColumn(name = "personal_information_id")
    private PersonalInformationEntity personalInformationEntity;

    public AwardsHonorsEntity(String awardsName, String managingDepartment, String managingCountry, String awardYear,
                              String awardMonth, Boolean markOnCV){
        this.awardsName = awardsName;
        this.managingDepartment = managingDepartment;
        this.managingCountry = managingCountry;
        this.awardYear = awardYear;
        this.awardMonth = awardMonth;
        this.markOnCV = markOnCV;
    }
}
