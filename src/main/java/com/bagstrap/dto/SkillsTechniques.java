package com.bagstrap.dto;

import com.bagstrap.entity.SkillsTechniquesEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class SkillsTechniques {

    private String content;

    public SkillsTechniquesEntity toEntity(){
        return new SkillsTechniquesEntity(content);
    }
}
