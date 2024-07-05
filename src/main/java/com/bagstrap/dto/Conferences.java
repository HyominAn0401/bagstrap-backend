package com.bagstrap.dto;

import com.bagstrap.entity.ConferencesEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Conferences {

    private String conferenceTitle;
    private String conference;
    private String authors;
    private String attendYear;
    private String attendMonth;
    private String conferenceCountry;
    private String conferenceCity;
    private String attendType;

    public ConferencesEntity toEntity(){
        return new ConferencesEntity(conferenceTitle, conference, authors, attendYear, attendMonth,
                conferenceCountry, conferenceCity, attendType);
    }
}
