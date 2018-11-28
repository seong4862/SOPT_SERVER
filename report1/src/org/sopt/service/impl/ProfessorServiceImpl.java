package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessonBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {
    @Override
    public Professor getByProfessorIdx(int ProfessorIdx) {
        final ProfessonBuilder professorBuilder = new ProfessonBuilder();
        final Professor professor = professorBuilder.build();
        return professor;
    }
}
