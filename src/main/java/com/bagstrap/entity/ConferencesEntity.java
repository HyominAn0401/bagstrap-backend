package com.bagstrap.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ConferencesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String conferenceTitle;
    private String conference;
    private String authors;
    private String attendYear;
    private String attendMonth;
    private String conferenceCountry;
    private String conferenceCity;
    private String attendType;

    @OneToOne
    @JoinColumn(name = "personal_information_id")
    private PersonalInformationEntity personalInformationEntity;

    public ConferencesEntity(String conferenceTitle, String conference, String authors,
                             String attendYear, String attendMonth, String conferenceCountry,
                             String conferenceCity, String attendType){
        this.conferenceTitle = conferenceTitle;
        this.conference = conference;
        this.authors = authors;
        this.attendYear = attendYear;
        this.attendMonth = attendMonth;
        this.conferenceCountry = conferenceCountry;
        this.conferenceCity = conferenceCity;
        this.attendType = attendType;
    }
}
