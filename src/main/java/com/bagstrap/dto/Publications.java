package com.bagstrap.dto;

import com.bagstrap.entity.PublicationsEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Publications {

    private String paperTitle;
    private String paperJournal;
    private String authors;
    private String publicationYear;
    private String publicationMonth;
    private String DOI;

    public PublicationsEntity toEntity(){
        return new PublicationsEntity(paperTitle, paperJournal,
                authors, publicationYear, publicationMonth, DOI);
    }
}
