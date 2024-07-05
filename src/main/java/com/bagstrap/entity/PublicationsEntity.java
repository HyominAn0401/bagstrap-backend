package com.bagstrap.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PublicationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paperTitle;
    private String paperJournal;
    private String authors;
    private String publicationYear;
    private String publicationMonth;
    private String DOI;

    @OneToOne
    @JoinColumn(name = "personal_information_id")
    private PersonalInformationEntity personalInformationEntity;

    public PublicationsEntity(String paperTitle, String paperJournal, String authors, String publicationYear,
                              String publicationMonth, String DOI){
        this.paperTitle = paperTitle;
        this.paperJournal = paperJournal;
        this.authors = authors;
        this.publicationYear = publicationYear;
        this.publicationMonth = publicationMonth;
        this.DOI = DOI;
    }
}
