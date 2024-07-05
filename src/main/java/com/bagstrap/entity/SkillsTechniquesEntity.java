package com.bagstrap.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SkillsTechniquesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @OneToOne
    @JoinColumn(name = "personal_information_id")
    private PersonalInformationEntity personalInformationEntity;

    public SkillsTechniquesEntity(String content){
        this.content = content;
    }
}
